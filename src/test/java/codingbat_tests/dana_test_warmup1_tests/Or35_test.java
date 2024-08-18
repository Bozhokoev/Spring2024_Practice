package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_test {

    Or35 or35 = new Or35();

    @DataProvider(name = "or35")
    public Object[][] dpOr35(){
        return new Object[][]{
                {3, true},
                {10, true},
                {8, false},
                {15, true},
                {5, true},
                {9, true},
                {4, false},
                {7, false}
        };
    }
    @Test(description = "Verify Or35 Function", dataProvider = "or35")
    public void or35_test(int a, boolean res){
        Assert.assertEquals(or35.or35(a), res);
    }
}
