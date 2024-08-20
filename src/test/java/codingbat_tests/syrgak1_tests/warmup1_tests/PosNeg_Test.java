package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {
    PosNeg posNeg_t = new PosNeg();

    @DataProvider(name = "PosNeg")
    public Object[][] dpPosNeg(){
        return new Object[][]{
                {1, -1, false, true},
                {-1, 1, false, true},
                {-4, -5, true, true},
                {1, -1, true, false}
        };
    }

    @Test(description = "Verify PosNeg Function", dataProvider = "PosNeg")
    public void posNegTest(int num, int num2, boolean a, boolean exp){
        Assert.assertEquals(posNeg_t.posNeg(num, num2, a), exp);
    }
}
