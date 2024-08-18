package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10_Test {
    Close10 close10 = new Close10();

    @DataProvider(name = "close10")
    public Object[][] dpClose10(){
        return new Object[][]{
                {8, 13, 8},
                {13, 7, 0},
                {13, 8, 8},
                {5, 21, 5},
                {10, 10, 0}
        };
    }

    @Test(description = "Verify close10 function", dataProvider = "close10")
    public void close10Test(int a, int b, int expected){
        Assert.assertEquals(close10.close10(a, b), expected);
    }
}
