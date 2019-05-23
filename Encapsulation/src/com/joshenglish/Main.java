package com.joshenglish;

public class Main {

    public static void main(String[] args) {
//	    Player player1 = new Player();
//	    player1.name = "Josh";
//	    player1.health = 20;
//	    player1.weapon = "Sword";
//
//	    int damage = 10;
//	    player1.loseHealth(damage);
//	    System.out.println("Remaining health = " + player1.healthRemaining());
//
//    	damage = 11;
//    	// access field in unauthorized way
//    	player1.health = 200;
//		player1.loseHealth(damage);
//		System.out.println("Remaining health = " + player1.healthRemaining());

		// much better implementation
		EnhancedPlayer player = new EnhancedPlayer("Josh", 200, "Mace");
		System.out.println("Initial health is " + player.getHealth());
    }
}
