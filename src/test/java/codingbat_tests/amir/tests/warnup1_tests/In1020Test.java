package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.In1020;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class In1020Test {

    @DataProvider(name = "In1020Data")
    public Object [][] in1020() {
        return new Object[][] {
                {12, 99, true},
                {21, 12, true},
                {8, 99, false}
        };
    }

    @Test(dataProvider = "In1020Data")
    public void testIn1020(int a, int b, boolean expected) {
        In1020 in1020 = new In1020();
        boolean result = in1020.in1020(a, b);
        assertEquals(result, expected);
    }
}
