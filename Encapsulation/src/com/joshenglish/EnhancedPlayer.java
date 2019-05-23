package com.joshenglish;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // perform health parameter range check
        this.health = (health > 0 && health <= 100) ? health : 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return health;
    }
}
