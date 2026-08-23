package org.example.rpg;

public class Main {
    public static void main(String[] args) {
        Monster troll = new Troll("Ogli", 1000, 20);
        printAttackResult(troll);
    }

    private static void printAttackResult(Monster monster) {
        System.out.println(monster.attack());
    }
}
