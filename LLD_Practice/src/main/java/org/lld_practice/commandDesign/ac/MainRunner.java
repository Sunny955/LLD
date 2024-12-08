package org.lld_practice.commandDesign.ac;

public class MainRunner {
    public static void main(String[] args) {
        AirConditioner ac =new AirConditioner();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new TurnOnACCommand(ac));
        remote.pressButton();

        remote.undo();
    }
}
