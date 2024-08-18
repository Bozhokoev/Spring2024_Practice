package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.StartHi;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class StartHiTest {

    @DataProvider(name = "StartHiData")
    public Object [][] startHiData(){
        return new Object[][] {
                {"hi there", true},
                {"hi", true},
                {"hello hi", false}
        };
    }

    @Test(dataProvider = "StartHiData")
    public void testStartHi(String str, boolean expected) {
        StartHi startHi = new StartHi();
        boolean result = startHi.startHi(str);
        assertEquals(result, expected);

    }
}
