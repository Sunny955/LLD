package org.lld_practice.LoggerFramework;

import java.io.FileWriter;

public class FileDestination implements LogDestination {
    private String fileName;
    public FileDestination(String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void writeLog(String message) {
        try(FileWriter fileWriter = new FileWriter(fileName,true)) {
            fileWriter.write(message+"\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

