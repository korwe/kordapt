package com.korwe.kordapt.util;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author <a href="mailto:tjad.clark@korwe.com>Tjad Clark</a>
 */
public class CompressionUtil {

    public static File tarGzip(File directory, File output){
        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directory.toPath());
            TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(
                                                                new GZIPOutputStream(
                                                                      new FileOutputStream(output)))){
            for(Path path : directoryStream){
                addToTar(tarArchiveOutputStream, path.toFile(), ".");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    private static void addToTar(TarArchiveOutputStream tarArchiveOutputStream, File file, String dir) throws IOException {
        String tarEntryDir = dir + File.separator + file.getName();
        tarArchiveOutputStream.putArchiveEntry(new TarArchiveEntry(file, tarEntryDir));
        if (file.isFile()) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            IOUtils.copy(bis, tarArchiveOutputStream);
            tarArchiveOutputStream.closeArchiveEntry();
            bis.close();
        }
        else if (file.isDirectory()) {
            tarArchiveOutputStream.closeArchiveEntry();

            for (File f : file.listFiles()) {
                addToTar(tarArchiveOutputStream, f, tarEntryDir);
            }
        }
    }

    public static void untarGzip(final File tarFile, final File outputDir){
        try(FileInputStream tarFileInputStream = new FileInputStream(tarFile)){
            untarGzip(tarFileInputStream, outputDir );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void untarGzip(final InputStream inputStream, final File outputDir){
        try(TarArchiveInputStream tarArchiveInputStream = new TarArchiveInputStream(
                new GZIPInputStream(
                        inputStream))){
            TarArchiveEntry entry;
            while((entry = tarArchiveInputStream.getNextTarEntry()) != null){
                final File outputFile = new File(outputDir, entry.getName());
                if(entry.isFile()){
                    final OutputStream outputStream = new FileOutputStream(outputFile);
                    IOUtils.copy(tarArchiveInputStream, outputStream);
                    outputStream.close();
                }
                else if (entry.isDirectory()){
                    if(!outputFile.exists()){
                        outputFile.mkdirs();
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
