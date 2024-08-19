package codingbat_tests.zhanybek_tests.warmup1_tests;

import codingbat.zhanybek.warmup1.PosNeg;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosNeg_Test {

    @DataProvider (name = "posNegData")
    public Object[][] posNeg(){
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
    @Test (dataProvider = "posNegData")
    public void posNegTest (int a,int b,boolean negative, boolean expected){
        PosNeg posNeg = new PosNeg();
        boolean result = posNeg.posNeg(a,b,negative);
        System.out.println("Running test with a: " + a + ", b" +b + ", -> Expected " + expected + "Result: " + result );
        Assert.assertEquals(result,expected,"The posNeg method failed for input: a=" + a + ", b=" + b + ", negative=" + negative);
    }
}
