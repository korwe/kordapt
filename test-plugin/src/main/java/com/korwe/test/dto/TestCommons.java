package com.korwe.test.dto;

import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by tjad on 2015/05/21.
 */
public class TestCommons {
    public static void main(String[] args) throws IOException {
        TarArchiveInputStream tais = new TarArchiveInputStream(new FileInputStream("/home/tjad/api-definition.tar"));
        TarArchiveEntry entry = tais.getNextTarEntry();
    }
}
