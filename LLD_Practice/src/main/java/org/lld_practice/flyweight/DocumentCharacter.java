package org.lld_practice.flyweight;

public class DocumentCharacter implements ILetter {
    private char character;
    private String fontType;
    private int size;

    public DocumentCharacter(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int row, int column) {
        System.out.println("Writing the character "+ character + " in at :"+row+ " , "+column);
    }
}
