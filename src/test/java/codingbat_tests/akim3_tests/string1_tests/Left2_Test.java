package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2_Test {
    Left2 left2 = new Left2();

    @DataProvider(name = "left_2")
    public Object[][] dpLeft2(){
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"}
        };
    }

    @Test(description = "Verify left2 function", dataProvider = "left_2")
    public void left2Test(String str, String expected){
        Assert.assertEquals(left2.left2(str), expected);
    }
}
