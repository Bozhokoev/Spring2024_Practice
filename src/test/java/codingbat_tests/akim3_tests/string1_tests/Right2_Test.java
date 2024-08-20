package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2_Test {
    Right2 right2 = new Right2();

    @DataProvider(name = "right_2")
    public Object[][] dpRight2(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"Hi", "Hi"},
                {"cat", "atc"},
                {"12345", "45123"}
        };
    }

    @Test(description = "Verify right2 function", dataProvider = "right_2")
    public void right2Test(String str, String expected){
        Assert.assertEquals(right2.right2(str), expected);
    }
}
