package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.NearHundred;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NearHundred_Test {
    @DataProvider(name = "NearHundred")
    public Object[][] NearHundredDataTest() {
        return new Object[][]{
                {93, true},
                {90, true},
                {89, false},
        };

    }
    @Test(dataProvider = "NearHundred")
    public void testParrotTrouble(int a, boolean expect){
       NearHundred nearHundred = new NearHundred();
        boolean result = nearHundred.nearHundred(a);
        assertEquals(result,expect);
    }
}
