package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.DoubleX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleX_Test {
    DoubleX doubleX = new DoubleX();

    @DataProvider(name = "doubleX")
    public Object[][] dpFrontTimes(){
        return new Object[][]{
                {"axxbb",true},
                {"", false},
                {"xxxxx", true},
                {"x",false},
                {"xaxx", false},
        };
    }

    @Test(description = "Verify DoubleX function", dataProvider = "doubleX")
    public void doubleX_Test(String s, boolean exp){
        Assert.assertEquals(doubleX.doubleX(s),exp);
    }
}
