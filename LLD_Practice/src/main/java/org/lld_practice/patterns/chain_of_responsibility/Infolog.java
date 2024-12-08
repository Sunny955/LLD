package org.lld_practice.patterns.chain_of_responsibility;

public class Infolog extends LogProcessor {
    Infolog(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel == INFO) {
            System.out.println("INFO: " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
