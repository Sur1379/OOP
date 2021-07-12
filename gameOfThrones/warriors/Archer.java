package com.company.gameOfThrones.warriors;

import com.company.gameOfThrones.equipment.ClassicShieldMini;
import com.company.gameOfThrones.utility.RandomUtil;


public class Archer extends Warrior {
    private final ClassicShieldMini classicShieldMini = new ClassicShieldMini();

    public Archer() {
        setDamage(15);
        setName("Archer");
    }

    @Override
    public void attack(Warrior opponent, Warrior warrior) {
        opponent.takeDamage(warrior, opponent);

    }

    @Override
    public void takeDamage(Warrior opponent, Warrior warrior) {
        int N = opponent.getDamage() + RandomUtil.random.nextInt(10) - 5;
        if (RandomUtil.random.nextInt(2) == 0 || classicShieldMini.getShieldHealth() == 0) {
            warrior.setHealth(warrior.getHealth() - N);
        } else {
            warrior.setHealth(warrior.getHealth() - classicShieldMini.takeDamage(N));
        }
        System.out.println("Mini shield health " + classicShieldMini.getShieldHealth());
    }
}

