package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050_Test {
    In3050 in3050 = new In3050();

    @DataProvider(name = "in3050")
    public Object[][] dpIn3050(){
        return new Object[][]{
                {30, 31, true},
                {39, 50, false},
                {49, 48, true},
                {50, 51, false},
                {35, 45, false}
        };
    }

    @Test(description = "Verify in3050 function", dataProvider = "in3050")
    public void in3050Test(int a, int b, boolean expected){
        Assert.assertEquals(in3050.in3050(a, b), expected);
    }
}
