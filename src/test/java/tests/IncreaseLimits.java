package tests;

import io.github.cdimascio.dotenv.Dotenv;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.IncreaseLimitsPage;

import static helpers.Capabilities.getAndroidDriver;
import static helpers.Capabilities.getAppiumDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IncreaseLimits {

    private static IncreaseLimitsPage increaseLimitsPage;
    private final Dotenv dotenv = Dotenv.load();

    @Before
    public void setup(){
        if (System.getenv("DEVICEFARM_DEVICE_NAME") == null){
            increaseLimitsPage = new IncreaseLimitsPage(getAndroidDriver());
        }else{
            increaseLimitsPage = new IncreaseLimitsPage(getAppiumDriver());
        }
    }

    @Test
    public void applyForLimitIncrease(){
        switch (increaseLimitsPage.checkCurrentLimit()){
            case 1:
                assertTrue(increaseLimitsPage.applyForLimit2());
                break;
            case 2:
                assertTrue(increaseLimitsPage.applyForLimit3());
                break;
            default:
                assertEquals(3, increaseLimitsPage.checkCurrentLimit());
        }
    }
/*
    @Test
    public void pseudoLimit3(){
        assertTrue(increaseLimitsPage.pseudoLimit3());
    }*/



    @After
    public void tearDown(){
        increaseLimitsPage.afterTests();
    }
}
