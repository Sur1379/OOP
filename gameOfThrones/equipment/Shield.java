package com.company.gameOfThrones.equipment;

public abstract class Shield extends Equipment {
    private int shieldHealth;

    public int getShieldHealth() {
        return shieldHealth;
    }

    public void setShieldHealth(int shieldHealth) {
        if(shieldHealth < 0){
            this.shieldHealth = 0;
        }
        this.shieldHealth = shieldHealth;
    }

    public int takeDamage(int damage){
        setShieldHealth(getShieldHealth() - damage);
        return damage / 3;
    }

}
