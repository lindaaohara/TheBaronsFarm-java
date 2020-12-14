package hbcu.stay.ready.baronsfarm.animals;

import hbcu.stay.ready.baronsfarm.animals.Animal;
import hbcu.stay.ready.baronsfarm.crops.Produce;
import hbcu.stay.ready.baronsfarm.food.Edible;

public class Chicken extends Produce implements Animal {




    @Override
    public String makeNoise() {
        return "Cluck, Cluck";
    }

    private boolean hasBeenFertilized = false;

    public Edible yield(){
        return null;

    }
    public void fertilizeEgg(){

    }

    @Override
    public void eat(Edible food) {

    }
}
