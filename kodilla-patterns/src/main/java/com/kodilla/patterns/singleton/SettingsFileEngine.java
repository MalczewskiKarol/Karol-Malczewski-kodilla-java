package com.kodilla.patterns.singleton;

public final class SettingsFileEngine {
    private String fileName = " ";

    public SettingsFileEngine() {

    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening the settings file");
    }

    public void close() {
        this.fileName = " ";
        System.out.println("Closing the settings file");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings from the file");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings to the file");
        return true;
    }
}