package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHot_Test {

    IcyHot icyHot = new IcyHot();

    @DataProvider(name = "icyHot")
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
    @Test(description = "Verify Icy Hot Functional", dataProvider = "icyHot")
    public void icyHot_test(int a, int b, boolean res){
        Assert.assertEquals(icyHot.icyHot(a, b), res);
    }
}
