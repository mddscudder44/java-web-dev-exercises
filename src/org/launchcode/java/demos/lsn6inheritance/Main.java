package org.launchcode.java.demos.lsn6inheritance;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());
        System.out.println(spike.noise());

        Cat whiskers = new Cat(8.6);
        HouseCat cheshire = new HouseCat("Cheshire", 14);
        System.out.println(whiskers.noise());
        System.out.println(cheshire.noise());

    }
}
