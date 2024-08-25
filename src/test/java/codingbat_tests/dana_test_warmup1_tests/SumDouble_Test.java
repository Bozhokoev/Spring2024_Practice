package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.SumDouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
 SumDouble sumDouble = new SumDouble();

 @DataProvider(name = "sum_double_data")
    public Object [][] dpSumDoubleTrue(){
     return new Object[][]{
             {1, 2, 3},
             {3, 2, 5},
             {2, 2, 8}
     };
 }
 @Test(description = "Verify sum double", dataProvider = "sum_double_data")
    public void SumDoubleTest(int a, int b, int expect){
     Assert.assertEquals(sumDouble.sumDouble(a,b), expect);
      }
}
