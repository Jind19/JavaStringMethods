package com.string.methods;

public class Palindrome {

    public static boolean isPalindrome(String input){
        String lowerInput = input.toLowerCase();  // make it case-insensitive
        StringBuilder sb = new StringBuilder(lowerInput);
        String reverse = sb.reverse().toString();
        return (lowerInput.equals(reverse));
    }

    public static void main(String[] args) {
        System.out.println("racecar is palindrome? " + isPalindrome("racecar"));
        System.out.println("mom is palindrome? " + isPalindrome("moM"));
    }
}
