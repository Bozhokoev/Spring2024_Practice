package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.DoubleX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleX_Test {
    DoubleX doubleX = new DoubleX();

    @DataProvider(name = "double_xx")
    public Object[][] dpDoubleXX(){
        return new Object[][]{
                {"axxbb", true},
                {"axaxax", false},
                {"xxxxx", true},
                {"", false},
                {"xax", false}
        };
    }

    @Test(description = "Verify doubleXX function", dataProvider = "double_xx")
    public void doubleXXTest(String str, boolean expected){
        Assert.assertEquals(doubleX.doubleX(str), expected);
    }
}
