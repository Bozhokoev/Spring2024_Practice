package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2_Test {

    Left2 left2 = new Left2();

    @DataProvider (name = "Left2")
    public Object[][] dpLeft2(){
        return new Object[][]{
                {"Hello", "lloHe"},
                {"Hi", "Hi"},
                {"Java", "vaJa"}
        };
    }

    @Test(description = "Verify Left2 Test", dataProvider = "Left2")
    public void left2Test(String str1, String res){
        Assert.assertEquals(left2.left2(str1),res);
    }
}
