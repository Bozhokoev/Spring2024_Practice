package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalf_Test {

    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "FirstHalf")
    public Object[][] dpFirstHalf(){
        return new Object[][]{
                {"WooHoo", "Woo"},
                {"ab", "a"},
                {"0123456789", "01234"},
        };
    }
    @Test(description = "Verify FirstHalf Test",dataProvider = "FirstHalf")
    public void firstHalfTest(String str, String res){
       Assert.assertEquals(firstHalf.firstHalf(str),res);
    }
}
