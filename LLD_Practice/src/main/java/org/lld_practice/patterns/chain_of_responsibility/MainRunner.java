package org.lld_practice.patterns.chain_of_responsibility;

public class MainRunner {
    public static void main(String[] args) {
        LogProcessor logObject = new Infolog(new Debuglog(new Errorlog(null)));

        logObject.log(LogProcessor.ERROR, "exception happens!");
        logObject.log(LogProcessor.DEBUG, "need to debug this!");
        logObject.log(LogProcessor.INFO, "info log activated!");
    }
}
