package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {
    CountXX count_xx = new CountXX();

    @DataProvider(name = "count_xx")
    public Object[][] dpCountXX(){
        return new Object[][]{
                {"abcxx", 1},
                {"xxx", 2},
                {"Hello there", 0},
                {"Hexxo thxxe", 2},
                {"", 0}
        };
    }

    @Test(description = "Verify countxx function", dataProvider = "count_xx")
    public void countXXTest(String str, int expected){
        Assert.assertEquals(count_xx.countXX(str), expected);
    }
}
