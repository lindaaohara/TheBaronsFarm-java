package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.crops.Crop;
import hbcu.stay.ready.baronsfarm.food.Edible;

public class Farmer extends Person implements Eater, Rideable, Botanist{


    @Override
    public String setName() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }




    @Override
    public void mount(Farmer farmer) {

    }

    @Override
    public String dismount(){
        return null;
    }



    @Override
    public void plant(Crop crop){

    }


    public void fertilize(){

    }

    @Override
    public void eat(Edible food) {

    }
}
