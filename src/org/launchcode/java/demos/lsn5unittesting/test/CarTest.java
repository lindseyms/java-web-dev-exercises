package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10, .001);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTankA(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }

    @Test
    public void testInitialGasTankB(){
        Assert.assertFalse(test_car.getGasTankLevel()==0);
    }

    @Test
    public void testInitialGasTankC(){
        Assert.assertTrue(test_car.getGasTankLevel()==10);
    }

    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankAfterDriving(){
        //arrange
        //act
        test_car.drive(50);
        //assert
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }

    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        //arrange
        //act
        test_car.drive(1000);
        //assert
        assertEquals(0, test_car.getGasTankLevel(), .001);
    }

    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in the thank the size of the tank");
    }


}
