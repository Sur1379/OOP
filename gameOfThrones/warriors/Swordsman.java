package com.company.gameOfThrones.warriors;

import com.company.gameOfThrones.equipment.ClassicShield;
import com.company.gameOfThrones.utility.RandomUtil;

public class Swordsman extends Warrior {

    private final ClassicShield classicShield = new ClassicShield();

    public Swordsman() {
        setDamage(20);
        setName("Swordsman");
    }

    @Override
    public void attack(Warrior opponent, Warrior warrior) {
        opponent.takeDamage(warrior, opponent);
    }

    @Override
    public void takeDamage(Warrior opponent, Warrior warrior) {
        int approximateDamage = opponent.getDamage() + RandomUtil.random.nextInt(10) - 5;
        if (RandomUtil.random.nextInt(2) == 0 || classicShield.getShieldHealth() == 0) {
            warrior.setHealth(warrior.getHealth() - approximateDamage);
        } else {
            warrior.setHealth(warrior.getHealth() - classicShield.takeDamage(approximateDamage));
        }
        System.out.println("Shield health " + classicShield.getShieldHealth());
    }
}
