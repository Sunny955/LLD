package org.lld_practice.LoggerFramework;

public class ConsoleDestination implements LogDestination {
    public void writeLog(String message) {
        System.out.println(message);
    }
}
