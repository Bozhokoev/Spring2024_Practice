package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHot_Test {
    IcyHot icyHot = new IcyHot();

    @DataProvider (name = "Icy Hot")
    public Object [][] dpIcyHot(){
        return new Object[][]{
                {120, -1, true},
                {-1, 120, true},
                {2,120, false},
                {-2,-2, false},
        };
    }

    @Test (description = "Verify IcyHot Test", dataProvider = "Icy Hot")
    public void icyHotTest(int a, int b,boolean exp){
        Assert.assertEquals(icyHot.icyHot(a,b),exp);
    }
}
