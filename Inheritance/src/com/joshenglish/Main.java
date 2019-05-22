package com.joshenglish;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("animal", 1, 1, 5, 5);

	    Dog dog = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "long silky");
	    dog.eat();
	    dog.walk();
	    dog.run();

	    System.out.println();
	    Fish fish = new Fish("trout", 2, 10, 4, 2, 3);
	    fish.swim(4);
	    fish.rest();
    }
}
