package org.lld_practice.flyweight;

public class Main {
    public static void main(String[] args) {
        ILetter obj1 = LetterFactory.createLetter('i');
        obj1.display(0,0);

        ILetter obj2 = LetterFactory.createLetter('i');
        obj2.display(9,3);

    }
}
