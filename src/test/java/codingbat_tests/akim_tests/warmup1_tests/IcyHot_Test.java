package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHot_Test {
    IcyHot icyHot = new IcyHot();

    @DataProvider(name = "icy_hot")
    public Object[][] dpIcyHot(){
        return new Object[][]{
                {120, -1, true},
                {-1, 120, true},
                {2, 120, false},
                {-1, 100, false},
                {-2, -2, false},
                {120, 120, false}
        };
    }

    @Test(description = "Verify icy_hot function", dataProvider = "icy_hot")
    public void icyHotTest(int a, int b, boolean expected){
        Assert.assertEquals(icyHot.icyHot(a, b), expected);
    }
}
