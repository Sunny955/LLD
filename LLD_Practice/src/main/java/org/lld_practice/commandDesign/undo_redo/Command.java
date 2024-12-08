package org.lld_practice.commandDesign.undo_redo;

public interface Command {
    void execute();
    void undo();
}
