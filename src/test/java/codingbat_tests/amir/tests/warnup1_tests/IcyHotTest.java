package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.IcyHot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class IcyHotTest {

    @DataProvider(name = "IcyHotData")
    public Object [][] icyHot() {
        return new Object[][] {
                {120, -1, true},
                {-1, 120, true},
                {2, 120, false}
        };
    }

    @Test(dataProvider = "IcyHotData")
    public void testIcyHot(int a, int b, boolean expected) {
        IcyHot icyHot = new IcyHot();
        boolean result = icyHot.IcyHot(a, b);
        assertEquals(result, expected);
    }
}
