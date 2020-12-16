package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.crops.Crop;
import hbcu.stay.ready.baronsfarm.food.Edible;

public class Farmer extends Person implements Eater, Rideable, Botanist{
    int totalFoodCount;
    int count;
    String name;


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
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
    public void eat(Edible food,int count) {
        totalFoodCount += count;
    }
    public int getTotalFoodCount(){
        return totalFoodCount;
    }
}
