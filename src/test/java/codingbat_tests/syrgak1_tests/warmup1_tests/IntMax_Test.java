package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_Test {
    IntMax intMax_t = new IntMax();

    @DataProvider(name = "IntMax")
    public Object[][] dpIntMax(){
        return new Object[][]{
                {1,2,3,3},
                {1,3,2,3},
                {9,3,3,9}
        };
    }

    @Test(description = "Verify IntMax Function", dataProvider = "IntMax")
    public void intMaxTest(int a, int b, int c, int exp){
        Assert.assertEquals(intMax_t.intMax(a,b,c), exp);
    }
}
