package org.lld_practice.commandDesign.ac;

import org.lld_practice.commandDesign.ac.Command;

import java.util.Stack;

public class RemoteControl {
    Stack<Command> commandHistory = new Stack<>();

    Command command;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        commandHistory.add(command);
    }

    public void undo() {
        if(!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
