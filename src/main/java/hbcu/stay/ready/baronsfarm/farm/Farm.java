package hbcu.stay.ready.baronsfarm.farm;

import hbcu.stay.ready.baronsfarm.Farmer;
import hbcu.stay.ready.baronsfarm.animals.Chicken;
import hbcu.stay.ready.baronsfarm.animals.Horse;
import hbcu.stay.ready.baronsfarm.crops.*;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    ArrayList<Stable> stables;
    ArrayList<ChickenCoop> chickenCoops;
    Field field;
    Farmer baron;
    Farmer baroness;

    private static Farm instance = null;


    public Farmer getBaron() {
        return baron;
    }

    public void setBaron(Farmer baron) {
        this.baron = baron;
    }

    public Farmer getBaroness() {
        return baroness;
    }

    public void setBaroness(Farmer baroness) {
        this.baroness = baroness;
    }

    private Farm() {
        chickenCoops = new ArrayList<>();
        stables = new ArrayList<>();
        Farmer baron = new Farmer();
        Farmer baroness = new Farmer();

        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
        for (int i = 0; i < 10; i++) {
            Horse horse = new Horse();
            if (i < 4) {
                stable1.addHorse();
            } else if (i >= 4 && i < 7) {
                stable2.addHorse();
            } else {
                stable3.addHorse();
            }
        }

        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);
        chickenCoops.add(chickenCoop4);

        for (int i = 0; i < 15; i++) {
            Chicken chicken = new Chicken();
            if (i < 4) {
                chickenCoop1.addChicken();
            } else if (i >= 4 && i < 7) {
                chickenCoop2.addChicken();
            } else if (i >= 7 && i < 11) {
                chickenCoop3.addChicken();
            } else {
                chickenCoop4.addChicken();
            }
        }

        Field field = new Field();
        ArrayList<CropRow> cropRowArrayList = new ArrayList<>();
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
        field.setCropRowList(cropRowArrayList);
        this.field = field;
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public void setStables(ArrayList<Stable> stables) {
        this.stables = stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public static void setInstance(Farm instance) {
        Farm.instance = instance;
    }

    public static Farm getInstance(){
        if (instance == null)
            instance = new Farm();
        return instance;
        }

    }







