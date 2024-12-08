package org.lld_practice.commandDesign.undo_redo;

public class AddText implements Command{
    private final TextEditor editor;
    private final String text;
    private final int position;

    public AddText(TextEditor editor, String text, int position) {
        this.editor = editor;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        editor.addText(text,position);
    }

    @Override
    public void undo() {
        editor.removeText(position,text.length());
    }
}
