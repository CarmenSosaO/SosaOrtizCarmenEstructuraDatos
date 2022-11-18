package com.mycompany.frecuenciacaracteres;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class FrecuenciaCaracteres {

    public static void main(String[] args) throws IOException, URISyntaxException {
        URL textResource = FrecuenciaCaracteres.class.getClassLoader().getResource("el_quijote.txt");
        String text = Files.readString(Paths.get(textResource.toURI()));
        char[] textChars = text.toCharArray();
        long[] frecuencyChars = new long[(int) Math.pow(2, Character.SIZE)];
        HashMap<Character, Long> frecuencyCharsMap = new HashMap<>();
//        for(byte asciiChar: frecuencyChars) {
//            System.out.println("ascii byte" + asciiChar);
//      }

        for (int i = 0; i < textChars.length; i++) {
            char textChar = textChars[i];
            // using arrays
            frecuencyChars[textChars[i]] += 1;

            // using HashMap
            if (frecuencyCharsMap.containsKey(textChar)) {
                long charFrecuency = frecuencyCharsMap.get(textChar);
                frecuencyCharsMap.put(textChar, charFrecuency + 1);
            } else {
                frecuencyCharsMap.put(textChar, 1l);
            }
        }
        frecuencyCharsMap.forEach((key, value) -> {
            System.out.println("Char: " + key + " Frecuency: " + value);
        });
        System.out.println("-------------------------------------------");
        for (int j = 0; j < frecuencyChars.length; j++) {
            if (frecuencyChars[j] != 0) {
                System.out.println("With Array Char: " + Character.toString(j) + " Frecuency: " + frecuencyChars[j]);
            }
        }
    }
}
