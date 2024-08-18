package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.Or35;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Or35Test {

    @DataProvider(name = "Or35Data")
    public Object[][] or35(){
        return new Object[][] {
                {3, true},
                {10, true},
                {8, false}
        };
    }

    @Test(dataProvider = "Or35Data")
    public void testOr35(int n, boolean except) {
        Or35 or35 = new Or35();
        boolean result = or35.or35(n);
        assertEquals(result, except);
    }
}
