package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050_Test {
    In3050 in3050_t = new In3050();

    @DataProvider(name = "In3050")
    public Object[][] dpIn3050(){
        return new Object[][]{
                {30,31, true},
                {30,41, false},
                {40,50, true}
        };
    }

    @Test(description = "Verify In3050 Function", dataProvider = "In3050")
    public void in3050Test(int a,int b, boolean exp){
        Assert.assertEquals(in3050_t.in3050(a, b), exp);
    }
}
