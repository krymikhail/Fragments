package com.geeks.fragments;

import java.io.Serializable;

public class Warrior implements Serializable {
    private String name;
    private int health;
    private int attack;

    public Warrior(String name, int health, int attack) {
        this.name = name;
        this.health = health;
        this.attack = attack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }

    public void attackEnemy(Warrior enemy) {
        enemy.takeDamage(this.attack);
    }
}