package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2_Test {

    Right2 right2 = new Right2();

    @DataProvider(name = "Right2")
    public Object[][] dpRight2(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"code", "deco"},
        };
    }
    @Test(description = "Verify Right2 Test", dataProvider = "Right2")
    public void right2Test(String str, String res){
        Assert.assertEquals(right2.right2(str),res);
    }
}
