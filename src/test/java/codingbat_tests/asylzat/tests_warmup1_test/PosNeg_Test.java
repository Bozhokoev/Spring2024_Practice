package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {

    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "posNegTestData")
    public Object [][] createData() {
        return new Object[][] {
                {1, -1, false,true},
                {-1, 1, false,true},
                {-4, -5, true,true},
                {1, 1, false, false},
                {-1, -1, false, false}
        };
    }
    @Test(dataProvider = "posNegTestData")
    public void testPostNeg(int a, int b, boolean negative, boolean expected) {
        Assert.assertEquals(posNeg.posNeg(a, b, negative),expected);
    }
}
