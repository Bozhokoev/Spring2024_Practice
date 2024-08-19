package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.DoubleX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleX_Test {
    DoubleX doubleX = new DoubleX();

    @DataProvider(name = "double_x")
    public Object[][] dpDoubleX() {
        return new Object[][] {
                {"axxbb", true},
                {"axaxax", false},
                {"", false},
                {"abc", false}
        };
    }

    @Test(description = "Verify Double X Function", dataProvider = "double_x")
    public void doubleXTest (String str, boolean exp) {
        Assert.assertEquals(doubleX.doubleX(str), exp);
    }
}
