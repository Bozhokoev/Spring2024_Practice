package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.DoubleX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleX_Test {

    DoubleX doubleX = new DoubleX();

    @DataProvider(name = "double_x")
    public Object[][] dpDoubleX(){
        return new Object[][]{
                {"axxbb", true},
                {"axaxax", false},
                {"xxxxx", true},
                {"xaxxx", false},
                {"aaaax", false},
        };
    }

    @Test(description = "Verify Double_X Function", dataProvider = "double_x")
    public void doubleXTest(String str, boolean exp){
        Assert.assertEquals(doubleX.doubleX(str), exp);
    }
}
