package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2_Test {
    Left2 left2 = new Left2();

    @DataProvider(name = "left2")
    public Object[][] dpLeft2(){
        return new Object[][]{
                {"Hello","lloHe"},
                {"Hi", "Hi"},
                {"cat","tca"},
                {"Chocolate","ocolateCh"},
        };
    }

    @Test(description = "Verify left2 function",dataProvider = "left2")
    public void left2Test(String str, String exp){
        Assert.assertEquals(left2.left2(str),exp);
    }
}
