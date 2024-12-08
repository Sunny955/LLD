package org.lld_practice.commandDesign.undo_redo;

import java.util.Stack;

public class CommandManager {
    private final Stack<Command> undo = new Stack<>();
    private final Stack<Command> redo = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        undo.push(command);
        redo.clear();
    }

    public void undo() {
        if(!undo.isEmpty()) {
            Command c = undo.pop();
            c.undo();
            redo.push(c);
        }
    }

    public void redo() {
        if(!redo.isEmpty()) {
            Command c = redo.pop();
            c.execute();
            undo.push(c);
        }
    }
}
