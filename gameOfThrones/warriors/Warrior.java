package com.company.gameOfThrones.warriors;


public abstract class Warrior {
    private int health = 100;
    private int damage;
    private String name;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract void attack(Warrior warrior, Warrior opponent);

    public abstract void takeDamage(Warrior warrior, Warrior opponent);
}
