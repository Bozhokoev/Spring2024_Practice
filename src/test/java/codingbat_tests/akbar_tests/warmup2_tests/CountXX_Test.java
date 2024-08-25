package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {
    CountXX countXX = new CountXX();

    @DataProvider(name = "countXX")
    public Object[][] dpCountXX(){
        return new Object[][]{
                {"abcxx",1},
                {"xxx",2},
                {"abc", 0},
                {"", 0},
                {"Kittensxxx",2},
        };
    }

    @Test(description = "Verify CountXX function", dataProvider = "countXX")
    public void CountXXTestd(String str, int exp){
        Assert.assertEquals(countXX.countXX(str),exp);
    }
}
