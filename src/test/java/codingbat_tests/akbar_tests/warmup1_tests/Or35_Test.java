package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_Test {
    Or35 or35 = new Or35();

    @DataProvider(name = "or35")
    public Object[][] dpOr35() {
        return new Object[][]{
                {3, true},
                {10, true},
                {15, true},
                {9, true},
                {6, true},
                {8, false},
                {17, false},
                {22, false}
        };
    }

    @Test(description = "Verify Or35 function", dataProvider = "or35")
    public void or35Test(int n, boolean exp) {
        Assert.assertEquals(or35.or35(n), exp);
    }
}
