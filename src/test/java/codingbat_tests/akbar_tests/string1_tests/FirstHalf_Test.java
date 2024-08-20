package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.FirstHalf;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstHalf_Test {
    FirstHalf firstHalf = new FirstHalf();

    @DataProvider(name = "firstHalf")
    public Object[][] dpFirstHalf(){
        return new Object[][]{
                {"WooHoo","Woo"},
                {"ab","a"},
                {"",""},
                {"0123456789", "01234"},
        };
    }

    @Test(description = "Verify firstHalf function",dataProvider = "firstHalf")
    public void firstHalfTest(String str,String exp){
        Assert.assertEquals(firstHalf.firstHalf(str),exp);
    }
}
