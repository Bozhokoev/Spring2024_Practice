<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/SumDouble_Test.java
package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.SumDouble;
=======
package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.SumDouble;
>>>>>>> origin/master:src/test/java/codingbat_tests/dana_test_warmup1_tests/SumDouble_Test.java
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDouble_Test {
<<<<<<< HEAD:src/test/java/codingbat_tests/zarina_tests_warmup1_tests/SumDouble_Test.java

    SumDouble sumDouble = new SumDouble();

    @DataProvider(name = "SumDoubleData")
    public Object [][] dpSumDouble(){
        return new Object[][]{
                {1,2,3},
                {3,2,5},
                {2,2,8},
        };
    }
    @Test (description = "SumDoubleData", dataProvider = "SumDoubleData")
    public void setSumDoubleTest (int a,int b, int expected) {
        Assert.assertEquals(sumDouble.sumDouble(a,b),expected);
    }

=======
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
>>>>>>> origin/master:src/test/java/codingbat_tests/dana_test_warmup1_tests/SumDouble_Test.java
}
