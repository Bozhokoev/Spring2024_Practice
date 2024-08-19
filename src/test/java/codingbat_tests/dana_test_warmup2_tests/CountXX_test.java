package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_test {

    CountXX countXX = new CountXX();

    @DataProvider(name = "countXX")
    public Object[][] dpCountXX(){
        return new Object[][]{
                {"abcxx", 1},
                {"xxx", 2},
                {"xxxx", 3},
                {"abc", 0},
                {"Hello there", 0},
                {"Hexxo thxxe", 2},
                {"", 0},
                {"Kittens", 0},
                {"Kittensxxx", 2}
        };
    }

    @Test(description = "Verify CountXX Functional", dataProvider = "countXX")
    public void countXX_test(String str, int res){
        Assert.assertEquals(countXX.countXX(str), res);
    }
}
