package hbcu.stay.ready.baronsfarm;

import hbcu.stay.ready.baronsfarm.farm.Farm;
import org.junit.Assert;
import org.junit.Test;

public class TestFarm {

    @Test
    public void testConstructor(){
        //Given
        Farm farm = Farm.getInstance();

        Assert.assertEquals(4, farm.getChickenCoops().size());
    }
}
