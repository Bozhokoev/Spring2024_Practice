package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_Test {
    Or35 or35 = new Or35();

    @DataProvider(name = "or_35")
    public Object[][] dpOr35(){
        return new Object[][]{
                {3, true},
                {5, true},
                {8, false},
                {7, false},
                {29, false},
                {99, true}
        };
    }

    @Test(description = "Verify or35 function", dataProvider = "or_35")
    public void or35_Test(int num, boolean expected){
        Assert.assertEquals(or35.or35(num), expected);
    }
}
