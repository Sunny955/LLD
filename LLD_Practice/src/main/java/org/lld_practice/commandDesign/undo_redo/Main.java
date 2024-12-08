package org.lld_practice.commandDesign.undo_redo;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new StringBuilder("Dalli gym jaun hun!"));
        CommandManager commandManager = new CommandManager();

        // Add text
        Command addCommand = new AddText(editor, "Hello, World!", 0);
        commandManager.executeCommand(addCommand);
        System.out.println("After adding text: " + editor.getContent());

        // Remove text
        Command removeCommand = new RemoveText(editor, 7, 6);
        commandManager.executeCommand(removeCommand);
        System.out.println("After removing text: " + editor.getContent());

        // Undo
        commandManager.undo();
        System.out.println("After undo: " + editor.getContent());

        // Redo
        commandManager.redo();
        System.out.println("After redo: " + editor.getContent());
    }
}
