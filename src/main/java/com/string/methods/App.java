package com.string.methods;

public class App {

    public static void main(String[] args) {
        System.out.println("racecar is palindrome? " + Palindrome.isPalindrome("racecar"));
        System.out.println("mom is palindrome? " + Palindrome.isPalindrome("moM"));
        System.out.println("mom is palindrome? " + Palindrome.isPalindrome("apple"));


        System.out.println(ReplaceVowels.replaceVowelsWithAstrix("Apple"));
        System.out.println(ReplaceVowels.replaceVowelsWithAstrix("I am damn cool!"));
    }
}
