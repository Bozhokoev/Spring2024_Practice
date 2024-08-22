package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEnd_Test {
   ExtraEnd extraEnd = new ExtraEnd();

   @DataProvider(name = "extra_end")
    public Object[][] dpExtraEnd(){
       return new Object[][]{
               {"Hello", "lololo"},
               {"ab", "ababab"},
               {"Hi", "HiHiHi"},
               {"Candy", "dydydy"},
               {"Code", "dedede"},
       };
   }

   @Test(description = "Verify Extra_End Function", dataProvider = "extra_end")
    public void extraEndTest(String str, String exp){
       Assert.assertEquals(extraEnd.extraEnd(str), exp);
   }
}
