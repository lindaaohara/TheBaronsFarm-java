package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.animals.Horse;
import hbcu.stay.ready.baronsfarm.crops.*;
import hbcu.stay.ready.baronsfarm.farm.Stable;
import hbcu.stay.ready.baronsfarm.food.Corn;
import hbcu.stay.ready.baronsfarm.food.Egg;
import hbcu.stay.ready.baronsfarm.food.Tomato;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSunday {
    private Farmer baron;
    private Farmer baroness;
    private Stable stable1;
    private Stable stable2;
    private Stable stable3;

    @Before
    public void setUpFarm(){
        baron = new Farmer();
        baroness = new Farmer();
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        for(int i = 0; i < 10; i++){
            Horse horse = new Horse("" + i);
            if(i < 4){
                stable1.addHorse();
            } else if(i >= 4 && i < 7){
                stable2.addHorse();
            } else{
                stable3.addHorse();
            }
        }
        Field field = new Field();
        ArrayList<CropRow> cropRowArrayList=new ArrayList<>();
        CropRow row1 = new CropRow(new CornStalk());
        cropRowArrayList.add(row1);
        CropRow row2 = new CropRow(new TomatoPlant());
        cropRowArrayList.add(row2);
        CropRow row3 = new CropRow(new Beans());
        cropRowArrayList.add(row3);
        CropRow row4 = new CropRow(new TomatoPlant());
        cropRowArrayList.add(row4);
        CropRow row5 = new CropRow(new TomatoPlant());
        cropRowArrayList.add(row5);
    }




    @Test
    public void testRideHorse(){
        //Given
        List<Horse> stable1List = stable1.getHorseList();
        List<Horse> stable2List = stable2.getHorseList();
        List<Horse> stable3List = stable3.getHorseList();


        for (int i = 0; i < stable1List.size(); i++){
           if(i % 2 ==0) {
               stable1List.get(i).mount(baron);
               stable1List.get(i).dismount();
               stable1List.get(i).eat(new Corn(3));

           } else {
               stable1List.get(i).mount(baroness);
               stable1List.get(i).dismount();
               stable1List.get(i).eat(new Corn(3));
           }
        }

        for (int i = 0; i < stable2List.size(); i++){
            if(i % 2 ==0) {
                stable2List.get(i).mount(baron);
                stable2List.get(i).dismount();
                stable2List.get(i).eat(new Corn(3));
            } else {
                stable2List.get(i).mount(baroness);
                stable2List.get(i).dismount();
                stable2List.get(i).eat(new Corn(3));
            }
        }

        for (int i = 0; i < stable3List.size(); i++){
            if(i % 2 ==0) {
                stable3List.get(i).mount(baron);
                stable3List.get(i).dismount();
                stable3List.get(i).eat(new Corn(3));
            } else {
                stable3List.get(i).mount(baroness);
                stable3List.get(i).dismount();
                stable3List.get(i).eat(new Corn(3));
            }
        }
    }
    @Test
    public void testBreakfast(){
        //When
        baron.eat(new Corn(1));
        baron.eat(new Tomato(2));
        baron.eat(new Egg(5));
        baroness.eat(new Corn(2));
        baroness.eat(new Tomato(1));
        baroness.eat(new Egg(2));

    }

}
