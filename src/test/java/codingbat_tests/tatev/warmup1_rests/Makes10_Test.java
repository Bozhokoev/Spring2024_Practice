package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Makes10_Test {
    @DataProvider(name = "Makes10")
    public Object[][] Makes10DataTest() {
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},

        };
    }
    @Test(dataProvider = "Makes10")
public void makes10(int a, int b, boolean expect){
        Makes10 makes10 = new Makes10();
        boolean result = makes10.makes10(a,b);
        assertEquals(result,expect);
    }
}
