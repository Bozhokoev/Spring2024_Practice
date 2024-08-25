package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {
    PosNeg posNeg = new PosNeg();

    @DataProvider(name = "posneg")
    public Object[][] dpposneg(){
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
        };
    }

    @Test(description = "Verify posNeg fuction",dataProvider = "posneg")
    public void posNegTest(int a,int b ,boolean c, boolean res){
        Assert.assertEquals(posNeg.posNeg(a,b,c),res);
    }
}
