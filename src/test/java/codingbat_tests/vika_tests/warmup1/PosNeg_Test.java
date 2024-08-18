package codingbat_tests.vika_tests.warmup1;

import codingbat.vika.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {
    PosNeg poseNeg = new PosNeg();

    @DataProvider(name = "pos_neg")
    public Object[][] dpPosNeg() {
        return new Object[][] {
                {1, -1, false, true},
                {-4, -5, true, true},
                {1, 1, false, false},
                {-5, 6, true, false},
                {1, 2, false, false}
        };
    }

    @Test(description = "Verify Pos Neg Trouble Function", dataProvider = "pos_neg")
    public void posNegTest (int a, int b, boolean negative, boolean exp) {
        Assert.assertEquals(poseNeg.posNeg(a, b, negative), exp);
    }
}
