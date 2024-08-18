package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {
    Makes10 makes10 = new Makes10();

    @DataProvider(name = "makes 10")
    public Object[][] dpMakes10(){
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false}
        };
    }

    @Test(description = "Verify makes10 function", dataProvider = "makes 10")
    public void makes10Test(int a, int b, boolean expected){
        Assert.assertEquals(makes10.makes10(a, b), expected);
    }
}
