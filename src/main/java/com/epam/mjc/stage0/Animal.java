package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String pattern = "";
        pattern += "This animal is mostly " + color + ". ";
        if (numberOfPaws == 1) {
            pattern += "It has " + numberOfPaws + " paw and ";
        } else {
            pattern += "It has " + numberOfPaws + " paws and ";
        }
        if (hasFur) {
            pattern += "a fur.";
        } else {
            pattern += "no fur.";
        }
        return pattern;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("red", 1, false);
        System.out.println(animal.getDescription());
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
        Dog dog = new Dog();
        System.out.println(dog.getDescription());
    }
}
