package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Makes10_Test {

    @DataProvider(name = "Makes10_Data")
    public Object [][] makes10Data(){
        return new Object[][] {
                {9, 1, true},
                {9, 9, false},
                {1, 9, true}
        };
    }

    @Test(dataProvider = "Makes10_Data")
    public void testMakes10(int a, int b, boolean except) {
        Makes10 makes10 = new Makes10();
        boolean result = makes10.makes10(a, b);
        assertEquals(result, except);
    }
}
