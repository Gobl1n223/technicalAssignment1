package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static StringBuilder convert(String string){

        StringBuilder stringBuilder = new StringBuilder("");
        List<Integer> characterList = new ArrayList<>();

        string.toLowerCase().chars().forEach(
                value -> {
                    if (value < 1072)
                        return;
                    stringBuilder.append(Character.toString(value)).append("  ");
                    value = value - 1071;
                    if (value == 34)
                        value = 6;
                    characterList.add(value);
                }
        );
        stringBuilder.append("\n");
        characterList.forEach(integer -> {

            stringBuilder.append(integer);
            if (integer > 9)
                stringBuilder.append(" ");
            else
                stringBuilder.append("  ");
        });
        return stringBuilder;
    }
}
