package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true, 7) ? "yes" : "no");
        System.out.println(hasTeen(12, 20, 15) ? "yes" : "no");
        System.out.println(isCatPlaying(true, 30) ? "yes" : "no");
        System.out.println(area(7, 10));
        System.out.println(area(1));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (isBarking) {
            if (clock < 0 || clock > 23) {
                return false;
            } else return clock < 8 || clock > 20;
        } else {
            return false;
        }

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge >= 13 && firstAge <= 19) {
            return true;
        } else if (secondAge >= 13 && secondAge <= 19) {
            return true;
        } else return thirdAge >= 13 && thirdAge <= 19;

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp <= 45 && temp >= 25;
        } else return temp <= 35 && temp >= 25;

    }

    public static double area(double width, double height) {
        if (width <= 0 || height < 0) {
            return -1;
        }

        return width * height;
    }

    public static double area(double radius) {
        if (radius <= 0) {
            return -1;
        }

        return Math.pow(radius, 2) * Math.PI;

    }


}


