package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwo_Test {
    MiddleTwo middleTwo = new MiddleTwo();

    @DataProvider(name = "middleTwo")
    public Object[][] dpMiddleTwo(){
        return new Object[][]{
                {"string","ri"},
                {"ab","ab"},
                {"Practice","ct"},
                {"0123456789","45"},
        };
    }

    @Test(description = "Verify middleTwo function",dataProvider = "middleTwo")
    public void middleTwoTest(String str,String exp){
        Assert.assertEquals(middleTwo.middleTwo(str),exp);
    }
}
