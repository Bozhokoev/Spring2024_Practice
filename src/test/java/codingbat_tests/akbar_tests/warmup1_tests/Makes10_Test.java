package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Makes10_Test {
    Makes10 makes10 = new Makes10();

    @DataProvider(name = "makes10")
    public Object[][] make10() {
        return new Object[][]{
                {9, 10, true}, {9, 9, false}, {1, 9, true}, {10, 1, true},
                {10, 10, true}, {8, 2, true}, {8, 3, false}, {10, 42, true},
                {12, -2, true},
        };
    }

    @Test(description = "Verify if makes10",dataProvider = "makes10")
    public void Makes10Test(int a , int b, boolean r){
        Assert.assertEquals(makes10.makes10(a,b),r);
    }
}
