package org.example;

public enum Weapon {
    SWORD,
    BOW,
    AXE;

    private int damage;
    private double attackSpeed;

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}

