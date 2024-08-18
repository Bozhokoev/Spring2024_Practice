package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.NearHundred;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NearHundredTest {

    @DataProvider(name = "NearHundredData")
    public Object [] [] nearHundredData(){
        return new Object[][] {
                {93, true},
                {90, true},
                {89, false}
        };
    }

    @Test(dataProvider = "NearHundredData")
    public void testNearHundred(int n, boolean except) {
        NearHundred nearHundred = new NearHundred();
        boolean result = nearHundred.nearHundred(n);
        assertEquals(result, except);

    }
}
