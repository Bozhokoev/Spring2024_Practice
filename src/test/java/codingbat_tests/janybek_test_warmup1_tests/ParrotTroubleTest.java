package codingbat_tests.janybek_test_warmup1_tests;

import codingbat.janybek.warmup1.ParrotTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParrotTroubleTest {
    @DataProvider(name = "ParrotTroubleTestData")
    public Object [][] parrotData(){
        return new Object[][] {
                {true, 6, true},
                {true, 7, false},
                {false, 6, false}
        };
    }

    @Test(dataProvider = "ParrotTroubleTestData")
    public void testParrotTroubleData(boolean talking, int hour, boolean except) {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        boolean result = parrotTrouble.parrotTrouble(talking, hour);
        assertEquals(result, except);

    }

}
