package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.food.Edible;

public class Rider extends Person implements Rideable{

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void eat(Edible food, int count) {

    }

    @Override
    public void mount(Farmer farmer) {

    }

    @Override
    public String dismount() {
        return null;
    }
}
