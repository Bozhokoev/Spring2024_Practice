package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.CatDog;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CatDog_Test {
    CatDog catDog = new CatDog();

    @DataProvider(name = "cat_dog")
    public Object[][] dpCatDog(){
        return new Object[][]{
                {"catdog", true},
                {"catxxdogxxxdog", false},
                {"dogdogcat", false},
                {"1cat1cadodog", true}
        };
    }

    @Test(description = "Verify catdog function", dataProvider = "cat_dog")
    public void catDogTest(String str, boolean expected){
        Assert.assertEquals(catDog.catDog(str), expected);
    }
}
