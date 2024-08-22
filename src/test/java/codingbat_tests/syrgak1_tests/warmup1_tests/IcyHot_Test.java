package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHot_Test {
    IcyHot icyHot_t = new IcyHot();

    @DataProvider(name = "IcyHot")
    public Object[][] dpIcyHot(){
        return new Object[][]{
                {120, -1, true},
                {-1, 120, true},
                {-1, 100, false}
        };
    }
    @Test(description = "Verify IcyHot Function", dataProvider = "IcyHot")
    public void icyHotTest(int num, int num2, boolean exp){
        Assert.assertEquals(icyHot_t.icyHot(num,num2), exp);
    }
}
