package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-707));
        System.out.println(isPerfectNumber(29));
        System.out.println(numberToWords(123));

    }

    public static boolean isPalindrome(int number) {

        if (number < 0) number = Math.abs(number);

        String numStr = String.valueOf(number);

        int length = numStr.length();
        double limit = (double) length / 2;
        int lastInd = length - 1;
        boolean result = true;

        for (int i = 0; i < limit; i++) {
            if (numStr.charAt(i) != numStr.charAt(lastInd)) {
                result = false;
                break;
            }
            lastInd--;
        }
        return result;
    }

    public static boolean isPerfectNumber(int number) {

        int result = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                result += i;
            }
        }

        return result == number;
    }

    public static String numberToWords(int number) {

        if (number < 0) return "Invalid Value";

        String[] valuesStr = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numStr = String.valueOf(number);
        String [] strArr = numStr.split("");

        StringBuilder result = new StringBuilder();

        for (String say: strArr) {
            result.append(" ").append(valuesStr[Integer.parseInt(say)]);
        }

        return result.toString().trim();
    }
}

