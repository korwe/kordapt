package com.korwe.kordapt.api.bean;

/**
 * @author <a href="mailto:tjad.clark@korwe.com">Tjad Clark</a>
 * @author <a href="mailto:dario.matonicki@korwe.com">Dario Matonicki</a>
 */
public class KordaptConfig {
    private String defaultPackageName;
    private String servicePackagePath;
    private String serviceAdapterPackagePath;
    private String serviceImplPackagePath;
    private String serviceClientPackagePath;
    private String apiPath;
    private String typePackagePath;
    private String apiServicesPath;
    private String apiTypesPath;
    private String mainPath;
    private String mainJavaPath;
    private String testJavaPath;
    private String defaultTypePackageName;

    public String getApiServicesPath() {
        return apiServicesPath;
    }

    public void setApiServicesPath(String apiServicesPath) {
        this.apiServicesPath = apiServicesPath;
    }

    public String getApiTypesPath() {
        return apiTypesPath;
    }

    public void setApiTypesPath(String apiTypesPath) {
        this.apiTypesPath = apiTypesPath;
    }

    public String getServicePackagePath() {
        return servicePackagePath;
    }

    public void setServicePackagePath(String servicePackagePath) {
        this.servicePackagePath = servicePackagePath;
    }

    public String getServiceAdapterPackagePath() {
        return serviceAdapterPackagePath;
    }

    public void setServiceAdapterPackagePath(String serviceAdapterPackagePath) {
        this.serviceAdapterPackagePath = serviceAdapterPackagePath;
    }

    public String getServiceImplPackagePath() {
        return serviceImplPackagePath;
    }

    public void setServiceImplPackagePath(String serviceImplPackagePath) {
        this.serviceImplPackagePath = serviceImplPackagePath;
    }

    public String getServiceClientPackagePath() {
        return serviceClientPackagePath;
    }

    public void setServiceClientPackagePath(String serviceClientPackagePath) {
        this.serviceClientPackagePath = serviceClientPackagePath;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getTypePackagePath() {
        return typePackagePath;
    }

    public void setTypePackagePath(String typePackagePath) {
        this.typePackagePath = typePackagePath;
    }

    public String getMainPath() {
        return mainPath;
    }

    public void setMainPath(String mainPath) {
        this.mainPath = mainPath;
    }

    public String getMainJavaPath() {
        return mainJavaPath;
    }

    public void setMainJavaPath(String mainJavaPath) {
        this.mainJavaPath = mainJavaPath;
    }

    public String getTestJavaPath() {
        return testJavaPath;
    }

    public void setTestJavaPath(String testJavaPath) {
        this.testJavaPath = testJavaPath;
    }

    public String getDefaultPackageName() {
        return defaultPackageName;
    }

    public void setDefaultPackageName(String defaultPackageName) {
        this.defaultPackageName = defaultPackageName;
    }

    public String getDefaultTypePackageName() {
        return defaultTypePackageName;
    }

    public void setDefaultTypePackageName(String defaultTypePackageName) {
        this.defaultTypePackageName = defaultTypePackageName;
    }
}
