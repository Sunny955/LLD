package org.lld_practice.logger;

public class Debug extends Logger {
    public Debug(LogLevel logLevel) {
        super(logLevel);
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: " + message);
    }
}
