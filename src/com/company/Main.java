package com.company;

public class Main {

    public static void main(String[] args) {
	DishWasher washer = new DishWasher(true);
    System.out.println(washer.isClean());
    washer.addDirty();
    System.out.println(washer.isClean());
    washer.cleanDishes();
    System.out.println(washer.isClean());




    Goalie fred = new Goalie(1.5);
    System.out.println(fred.shotSaved(30));
    fred.trainGoalie();
    System.out.println(fred.shotSaved(30));




    Boat bayliner = new Boat("bayliner", 6, 14, 60);
    System.out.println(bayliner);
    bayliner.addPassenger();
    System.out.println(bayliner);
    System.out.println(bayliner.takesHowLong(120));



    }
}
