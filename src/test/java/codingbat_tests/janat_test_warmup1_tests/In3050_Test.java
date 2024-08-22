package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050_Test {
    In3050 in3050 = new In3050();

    @DataProvider(name = "in_30_50")
    public Object[][] dpIn3050(){
        return new Object[][]{
                {30, 31, true},
                {30, 41, false},
                {40, 50, true},
                {40, 51, false},
                {39, 50, false},
        };
    }

    @Test(description = "Verify In3050 Function", dataProvider = "in_30_50")
    public void in3050Test(int a, int b, boolean exp){
        Assert.assertEquals(in3050.in3050(a, b), exp);
    }
}
