package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.TheEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TheEnd_Test {

    TheEnd theEnd = new TheEnd();

    @DataProvider(name = "TheEnd")
    public Object [][]dpTheEnd(){
        return new Object[][]{
                {"Hello", true,"H"},
                {"Hello", false,"o"},
                {"x", true,"x"},
                {"x", false,"x"}
        };
    }
    @Test(description = "Verify TheEnd Test",dataProvider = "TheEnd")
    public void theEndTest(String str, boolean res,String str2){
        Assert.assertEquals(theEnd.theEnd(str,res),str2);
    }
}
