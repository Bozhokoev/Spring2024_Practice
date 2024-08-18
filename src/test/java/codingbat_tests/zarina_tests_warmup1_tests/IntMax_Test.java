package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMax_Test {
    IntMax intMax = new IntMax();

    @DataProvider (name = "Int Max")
    public Object [][] dpIntMax (){
        return new Object[][]{
                {1,2,3,3},
                {3,3,9,9},
                {5,2,6,6},
        };
    }
@Test(description = "Verify Int Max Test", dataProvider = "Int Max")
    public void intMaxTest (int a, int b, int c, int x){
    Assert.assertEquals(intMax.intMax(a,b,c),x);
}
}
