package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.Eater;
import hbcu.stay.ready.baronsfarm.food.Edible;
import hbcu.stay.ready.baronsfarm.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {
    private String name;

    public Animal(String name) {
        this.name = name;

    }
    public abstract String setName();

    public abstract String getName();

    public abstract String makeNoise();


    public void eat(Edible food){

    }
}
