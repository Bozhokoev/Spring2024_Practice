package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.CountXX;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {

   CountXX countXX = new CountXX();
   @DataProvider (name = "CountXX")
    public Object [][] dpCountXX(){
       return new Object[][]{
               {"abcxx",1},
               {"abc",0},
               {"Kittensxxx",2},
       };
   }

   @Test (description = "Verify CountXX function", dataProvider = "CountXX")
    public void countXXTest(String str, int x){
       Assert.assertEquals(countXX.countXX(str),x);
   }
}
