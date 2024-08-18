package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.IcyHot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IcyHot_Test {
    IcyHot icyHot = new IcyHot();

    @DataProvider(name = "isyHot")
    public Object[][] dpIsyHot() {
        return new Object[][]{
                {120, -1, true},
                {-2, -2, false},
                {120, 120, false},
                {-1, 100, false},
                {2, 120, false},
        };
    }

    @Test(description = "Verify IsyHot function", dataProvider = "isyHot")
    public void isyHotTest(int a, int b, boolean exp){
        Assert.assertEquals(icyHot.icyHot(a,b),exp);
    }
}
