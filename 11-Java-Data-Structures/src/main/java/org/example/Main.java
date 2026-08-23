package org.example;


import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(convertDecimalToBinary(13));

    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        StringBuilder result = new StringBuilder();
        int kalan = 0;

        while (number > 0) {
            kalan = number % 2;
            result.append(String.valueOf(kalan));
            number = number / 2;
        }

        return result.reverse().toString();
    }

    public static boolean checkForPalindrome(String text) {
        String cleaned = text.replaceAll("[.,?!_\\-\\s]", "");
        cleaned = cleaned.toLowerCase(Locale.ROOT);

        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
        System.out.println(reversed);
        return cleaned.equals(reversed);

    }

    /*
        public static boolean checkPalindromeTwoPointer(String text) {
            String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();

            int left = 0;
            int right = cleaned.length() - 1;

            while (left < right) {
                if (cleaned.charAt(left) != cleaned.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    */
/*
    public static boolean checkPalindromeReverse(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
*/

/*
    public static boolean checkForPalindrome(String text) {

        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


        LinkedList<Character> charList = new LinkedList<>();
        for (char c : cleanedStr.toCharArray()) {
            charList.add(c);
        }


        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }


        return true;
    }
*/


}