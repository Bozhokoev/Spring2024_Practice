package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_test {

    IntMax intMax = new IntMax();

    @DataProvider(name = "intMax")
    public Object[][] dpIntMax(){
        return new Object[][]{
                {1, 2, 3, 3},
                {1, 3, 2, 3},
                {3, 2, 1, 3},
                {9, 3, 3, 9},
                {3, 9, 3, 9},
                {3, 3, 9, 9},
                {8, 2, 3, 8},
                {-3, -1, -2, -1},
                {6, 2, 5, 6},
                {5, 6, 2, 6},
                {5, 2, 6, 6}
        };
    }

    @Test(description = "Verify IntMax Functional", dataProvider = "intMax")
    public void intMax_test(int a, int b, int c, int res){
        Assert.assertEquals(intMax.intMax(a, b, c), res);
    }
}
