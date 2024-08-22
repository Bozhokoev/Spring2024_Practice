package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {

    CountXX countXX = new CountXX();

    @DataProvider(name = "count_xx")
    public Object[][] dpCountXX(){
        return new Object[][]{
                {"abcxx", 1},
                {"xxx", 2},
                {"xxxx", 3},
                {"abc", 0},
                {"Hello there", 0},
        };
    }
    @Test(description = "Verify Count_XX Function", dataProvider = "count_xx")
    public void countXXTest(String str, int n){
        Assert.assertEquals(countXX.countXX(str), n);
    }
}
