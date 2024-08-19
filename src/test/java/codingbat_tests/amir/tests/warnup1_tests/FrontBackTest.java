package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.FrontBack;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrontBackTest {

    @DataProvider(name = "FrontBackData")
    public Object [][] frontBack(){
        return new Object[][]{
                {"code", "eodc"},
                {"a", "a"},
                {"ab", "ba"}
        };
    }

    @Test(dataProvider = "FrontBackData")
    public void testDataProvider(String str, String except) {
        FrontBack frontBack = new FrontBack();
        String result = frontBack.frontBack(str);
        assertEquals(result, except);
    }
}
