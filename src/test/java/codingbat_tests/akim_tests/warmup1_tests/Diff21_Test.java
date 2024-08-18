package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21_Test {
    Diff21 diff21 = new Diff21();

    @DataProvider(name = "diff21")
    public Object[][] dpDiff21(){
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0},
                {22, 2},
                {25, 8},
                {0, 21},
        };
    }

    @Test(description = "Verify diff21 function", dataProvider = "diff21")
    public void diff21Test(int a, int expected){
        Assert.assertEquals(diff21.diff21(a), expected);
    }
}
