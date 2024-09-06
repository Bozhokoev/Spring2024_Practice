package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.PosNeg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PosNeg_Test {
    @DataProvider(name = "PosNegData")
    public Object[][] posNegData(){
        return new Object[][]{
                {1, -1, false},// true
                {-1, 1, false},// true
                {-4, -5, true} //true
        };
    }
    @Test(dataProvider = "PosNegData")
    public void testPosNeg(int a, int b,boolean expected){
        PosNeg posNeg= new PosNeg();
        boolean result = posNeg.posNeg(a,b,expected);
        assertEquals(result,expected);

    }
}
