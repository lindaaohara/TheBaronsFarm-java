package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.Rideable;
import hbcu.stay.ready.baronsfarm.animals.Animal;

public class Horse extends Animal implements Rideable {

    public Horse(String name){
        super(name);
    }

    @Override
    public String setName() {
        return name;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void mount(String name) {

    }

    @Override
    public String dismount() {
        return null;
    }
}
