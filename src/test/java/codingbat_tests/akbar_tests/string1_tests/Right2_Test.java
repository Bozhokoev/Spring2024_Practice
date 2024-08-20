package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2_Test {
    Right2 right2 = new Right2();

    @DataProvider(name = "right2")
    public Object[][] dpRight2(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"12345","45123"},
                {"cat","atc"},
                {"Hi", "Hi"},
        };
    }

    @Test(description = "Verify right2 function",dataProvider = "right2")
    public void right2Test(String s,String exp){
        Assert.assertEquals(right2.right2(s),exp);
    }
}
