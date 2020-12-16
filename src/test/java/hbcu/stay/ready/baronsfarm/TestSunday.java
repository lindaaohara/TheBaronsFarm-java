package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.animals.Horse;
import hbcu.stay.ready.baronsfarm.crops.*;
import hbcu.stay.ready.baronsfarm.farm.Farm;
import hbcu.stay.ready.baronsfarm.farm.Stable;
import hbcu.stay.ready.baronsfarm.food.Corn;
import hbcu.stay.ready.baronsfarm.food.Egg;
import hbcu.stay.ready.baronsfarm.food.Tomato;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSunday {

//TODO separate tests for ride and feed

    @Test
    public void testRideAndFeedHorses(){
        //Given
        Farm farm = Farm.getInstance();
        Farmer baron = farm.getBaron();
        Farmer baroness = farm.getBaroness();
        ArrayList<Stable>stables = farm.getStables();

        List<Horse> stable1List = stables.get(0).getHorseList();
        List<Horse> stable2List = stables.get(1).getHorseList();
        List<Horse> stable3List = stables.get(2).getHorseList();



        for (int i = 0; i < stable1List.size(); i++){
           if(i % 2 ==0) {
               stable1List.get(i).mount(baron);
               stable1List.get(i).dismount();
               stable1List.get(i).eat(new Corn(),3);

           } else {
               stable1List.get(i).mount(baroness);
               stable1List.get(i).dismount();
               stable1List.get(i).eat(new Corn(),3);
           }
        }

        for (int i = 0; i < stable2List.size(); i++){
            if(i % 2 ==0) {
                stable2List.get(i).mount(baron);
                stable2List.get(i).dismount();
                stable2List.get(i).eat(new Corn(),3);
            } else {
                stable2List.get(i).mount(baroness);
                stable2List.get(i).dismount();
                stable2List.get(i).eat(new Corn(),3);
            }
        }

        for (int i = 0; i < stable3List.size(); i++){
            if(i % 2 ==0) {
                stable3List.get(i).mount(baron);
                stable3List.get(i).dismount();
                stable3List.get(i).eat(new Corn(),3);
            } else {
                stable3List.get(i).mount(baroness);
                stable3List.get(i).dismount();
                stable3List.get(i).eat(new Corn(),3);
            }
        }
        //Then
        int expected = 3;
        int actual = stables.size();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testBreakfast(){
        //Given

        Farm farm = Farm.getInstance();

        Farmer baron = farm.getBaron();
        Farmer baroness = farm.getBaroness();

        //When
        baron.eat(new Corn(),1);
        baron.eat(new Tomato(),2);
        baron.eat(new Egg(),5);
        baroness.eat(new Corn(),2);
        baroness.eat(new Tomato(),1);
        baroness.eat(new Egg(),2);

        //Then
        int expected = 8;
        int actual = baron.getTotalFoodCount();
        Assert.assertEquals(expected, actual);

    }

}
//TODO probably have to add an @After to reset TotalFoodCount