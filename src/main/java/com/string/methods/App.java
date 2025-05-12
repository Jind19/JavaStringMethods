package com.string.methods;

public class App {

    // Method to check if the input is a palindrome (case-insensitive)
    public static boolean isPalindrome(String input){

        String lowerInput = input.toLowerCase();  // make it case-insensitive
        lowerInput = lowerInput.replaceAll("\\s+", ""); //Remove all spaces

        //Reverse the string and compare to original
        StringBuilder sb = new StringBuilder(lowerInput);
        String reverse = sb.reverse().toString();

        return (lowerInput.equals(reverse));
    }

    // Method to replace vowels with asterisk (*)
    public static String replaceVowelsWithAstrix(String input){
        return input.replaceAll("[aeiouAEIOU]", "*");
    }

    //Capitalizes the first letter of each word in the sentence.
    public static String capitalizeWords(String sentence){
        //If the input is null or an empty string, we return it immediately.
        // This avoids exceptions.
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        //Split by spaces
        //Example: "java is fun" becomes ["java", "is", "fun"]
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words){
            if(!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        //Convert the StringBuilder to a string and use trim() to remove the last extra space.
        return sb.toString().trim();
    }

    public static int countWordOccurrences(String sentence, String word){
        if (sentence == null || word == null || sentence.isEmpty() || word.isEmpty()) {
            return 0;
        }

        // Step 1: Normalize both to lowercase (case-insensitive)
        String normalizedSentence = sentence.toLowerCase();
        String normalizedWord = word.toLowerCase();

        // Step 2: Split sentence into words
        String[] words = normalizedSentence.split(" ");

        // Step 3: Count exact matches
        int count = 0;
        for (String w : words) {
            if (w.equals(normalizedWord)) {
                count++;
            }
        }

        return count;
    }




    public static void main(String[] args) {
        System.out.println("racecar is palindrome? " + isPalindrome("racecar"));
        System.out.println("Nurses Run is palindrome? " + isPalindrome("Nurses Run"));
        System.out.println("apple is palindrome? " + isPalindrome("apple"));


        System.out.println(replaceVowelsWithAstrix("Apple"));
        System.out.println(replaceVowelsWithAstrix("I am damn cool!"));

        System.out.println(capitalizeWords("java is fUn"));

        String sentence = "Java is fun and java is powerful";
        String word = "java";
        System.out.println(countWordOccurrences(sentence, word));
    }
}
