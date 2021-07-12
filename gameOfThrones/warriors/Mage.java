package com.company.gameOfThrones.warriors;


import com.company.gameOfThrones.utility.RandomUtil;

public class Mage extends Warrior {

    public Mage() {
        setDamage(25);
        setName("Mage");
    }

    @Override
    public void attack(Warrior opponent, Warrior warrior) {
        opponent.takeDamage(warrior, opponent);
    }

    @Override
    public void takeDamage(Warrior opponent, Warrior warrior) {
        int N = opponent.getDamage() + RandomUtil.random.nextInt(11) - 5;
        warrior.setHealth(warrior.getHealth() - N);
    }
}
