package codingbat_tests.khantenir_test_warmup1_tests;

import codingbat.khantenir.warmup1.SumDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();
    @DataProvider(name = "SumDoubleTest")
    public Object [][] sumDoubleTest(){
        return new Object[][]{
                {1, 2, 3},
                {3, 2, 5},
                {2, 2, 8}
        };
    }
    @Test(dataProvider = "SumDoubleTest")
    public void testSumDouble(int a, int b, int result) {
        int action = sumDouble.sumDouble( a,  b);
        assertEquals(action,result );
    }
}
