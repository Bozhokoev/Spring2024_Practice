package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_Test {
    Or35 or35_t = new Or35();

    @DataProvider(name = "Or35")
    public Object[][] dpOr35() {
        return new Object[][]{
                {3, true},
                {10, true},
                {8, false},
                {4, false}
        };
    }

    @Test(description = "Verify Or35 Function", dataProvider = "Or35")
    public void or35Test(int a, boolean exp){
        Assert.assertEquals(or35_t.or35(a), exp);
    }
}

