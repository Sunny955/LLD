package org.lld_practice.commandDesign.undo_redo;

public class RemoveText implements Command{
    private final TextEditor editor;
    private final String text;
    private final int position;

    public RemoveText(TextEditor editor, int position,int length) {
        this.editor = editor;
        this.position = position;
        this.text = editor.getContent().substring(position,position+length);
    }

    @Override
    public void execute() {
        editor.removeText(position,text.length());
    }

    @Override
    public void undo() {
        editor.addText(text,position);
    }
}
