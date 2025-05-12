package io.github.ferclager.animals;

import io.github.ferclager.FoodBrand;

public class Dog extends Animal {

    private FoodBrand favoriteFood;

    public void bark() {
        System.out.println("guau-guau");
    }

    public void eat() {
        System.out.println("nam nam");
    }

}
