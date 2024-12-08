package org.lld_practice.commandDesign.undo_redo;


// Receiver
public class TextEditor {
    private StringBuilder content;

    public TextEditor(StringBuilder content) {
        this.content = content;
    }

    public void addText(String text, int position) {
        content.insert(position,text);
    }

    public void removeText(int position, int length) {
        content.delete(position,position+length);
    }

    public String getContent() {
        return content.toString();
    }
}
