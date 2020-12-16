package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.Farmer;
import hbcu.stay.ready.baronsfarm.Rideable;
import hbcu.stay.ready.baronsfarm.animals.Animal;
import hbcu.stay.ready.baronsfarm.food.Edible;

public class Horse implements Animal, Rideable {

    @Override
    public String makeNoise() {
        return "Hee Haw";
    }

      @Override
    public void mount(Farmer farmer) {

    }

    @Override
    public String dismount() {
        return null;
    }

    @Override
    public void eat(Edible food, int count) {

    }
}
