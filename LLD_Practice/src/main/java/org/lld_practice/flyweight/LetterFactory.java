package org.lld_practice.flyweight;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static final Map<Character, ILetter> map = new HashMap<>();

    public static ILetter createLetter(char charValue) {
        if(map.containsKey(charValue)) {
            return map.get(charValue);
        }
        else {
            DocumentCharacter charObj  = new DocumentCharacter(charValue,"Aerial",10);
            map.put(charValue,charObj);
            return charObj;
        }
    }
}
