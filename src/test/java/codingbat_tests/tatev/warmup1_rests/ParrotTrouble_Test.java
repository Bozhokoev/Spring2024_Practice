package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.ParrotTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParrotTrouble_Test {
    @DataProvider(name = "ParrotTrouble")
    public Object[][] ParrotTroubleDataTest() {
        return new Object[][]{
                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
        };

    }
    @Test(dataProvider = "ParrotTrouble")
    public void testParrotTrouble(boolean a,int b, boolean except){
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        boolean result = parrotTrouble.parrotTrouble(a,b);
        assertEquals(result,except);
    }
}
