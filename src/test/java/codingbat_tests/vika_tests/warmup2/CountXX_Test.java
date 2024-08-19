package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {
    CountXX countXX = new CountXX();

    @DataProvider(name = "count_xx")
    public Object[][] dpCountXX() {
        return new Object[][] {
                {"abcxx", 1},
                {"xxx", 2},
                {"Kittens", 0},
        };
    }

    @Test(description = "Verify Count XX Function", dataProvider = "count_xx")
    public void countXXTest (String str, int exp) {
        Assert.assertEquals(countXX.countXX(str), exp);
    }
}
