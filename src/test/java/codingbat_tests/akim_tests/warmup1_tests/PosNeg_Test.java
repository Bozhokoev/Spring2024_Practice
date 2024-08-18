package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.collections.OneToTwoDimArrayIterator;

public class PosNeg_Test {
    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "pos_neg")
    public Object[][] dpPosNeg(){
        return new Object[][]{
                {1, -1, false, true},
                {-4, -5, true, true},
                {1, 1, false, false},
                {-5, 6, true, false},
                {1, 2, false, false},
        };
    }

    @Test(description = "Verify pos neg function", dataProvider = "pos_neg")
    public void posNeg(int a, int b, boolean negative, boolean exp){
        Assert.assertEquals(posNeg.posNeg(a, b, negative), exp);
    }

}
