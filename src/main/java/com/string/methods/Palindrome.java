package com.string.methods;

public class Palindrome {

    public static boolean isPalindrome(String input){
        String lowerInput = input.toLowerCase();  // make it case-insensitive
        StringBuilder sb = new StringBuilder(lowerInput);
        String reverse = sb.reverse().toString();
        return (lowerInput.equals(reverse));
    }

}
