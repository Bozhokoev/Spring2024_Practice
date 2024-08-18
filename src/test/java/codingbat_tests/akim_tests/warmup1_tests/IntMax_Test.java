package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_Test {
    IntMax intMax = new IntMax();

    @DataProvider(name = "int_max")
    public Object[][] dpIntMax(){
        return new Object[][]{
                {1, 2, 3, 3},
                {9, 3, 3, 9},
                {8, 2, 3, 8},
                {-3, -1, -2, -1},
                {5, 2, 6, 6}
        };
    }

    @Test(description = "Verify intMax function", dataProvider = "int_max")
    public void intMaxTest(int a, int b, int c, int max){
        Assert.assertEquals(intMax.intMax(a, b, c), max);
    }
}
