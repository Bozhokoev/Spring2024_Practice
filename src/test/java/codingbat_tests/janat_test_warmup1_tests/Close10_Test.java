package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10_Test {
    Close10 close10 = new Close10();

    @DataProvider(name = "close_10")
    public Object[][] dpClose10(){
        return new Object[][]{
                {8, 13, 8},
                {13, 8, 8},
                {13, 7, 0},
                {7, 13, 0},
                {9, 13, 9},
        };
    }

    @Test(description = "Verify Close10 Function", dataProvider = "close_10")
    public void close10Test(int a, int b, int exp){
        Assert.assertEquals(close10.close10(a, b), exp);
    }
}
