package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.IcyHot;
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
        };
    }

    @Test(description = "Verify Icy_Hot Function", dataProvider = "icy_hot")
    public void icyHotTest(int temp1, int temp2, boolean exp){
        Assert.assertEquals(icyHot.icyHot(temp1, temp2), exp);
    }
}
