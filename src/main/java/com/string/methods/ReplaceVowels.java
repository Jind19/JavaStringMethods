package com.string.methods;

public class ReplaceVowels {

    public static String replaceVowelsWithAstrix(String input){

        String inputWithoutVowels = input.replaceAll("[aeiouAEIOU]", "*");

        return inputWithoutVowels;
    }
}
