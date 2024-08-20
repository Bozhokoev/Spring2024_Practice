package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {

    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "posNeg")
    public Object[][] dpPosNeg(){
        return new Object[][]{
                {1, -1, false, true},
                {-1, 1, false, true},
                {-4, -5, true, true},
                {-4, -5, false, false},
                {-4, 5, false, true},
                {-4, 5, true, false},
                {1, 1, false, false},
                {-1, -1, false, false},
                {1, -1, true, false},
                {-1, 1, true, false},
                {1, 1, true, false},
                {-1, -1, true, true},
                {5, -5, false, true},
                {-6, 6, false, true},
                {-5, -6, false, false},
                {-2, -1, false, false},
                {1, 2, false, false},
                {-5, 6, true, false},
                {-5, -5, true, true}
        };
    }
    @Test(description = "Verify Pos Neg", dataProvider = "posNeg")
    public void posNeg_test(int a, int b, boolean c, boolean res){
        Assert.assertEquals(posNeg.posNeg(a, b, c), res);

    }

}
