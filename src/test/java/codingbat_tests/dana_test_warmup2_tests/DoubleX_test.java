package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.DoubleX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleX_test {

    DoubleX doubleX = new DoubleX();

    @DataProvider(name = "doubleX")
    public Object[][] dpDoubleX(){
        return new Object[][]{
                {"axxbb", true},
                {"axaxax", false},
                {"xxxxx", true},
                {"xaxxx", false},
                {"aaaax", false},
                {"", false},
                {"abc", false},
                {"x", false},
                {"xx", true},
                {"xax", false},
                {"xaxx", false},
        };
    }

    @Test(description = "Verify DoubleX Functional", dataProvider = "doubleX")
    public void doubleX_test(String str, boolean res){
        Assert.assertEquals(doubleX.doubleX(str), res);
    }
}
