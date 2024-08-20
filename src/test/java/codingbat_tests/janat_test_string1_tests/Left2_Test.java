package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.Left2;
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
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
        };
    }

    @Test(description = "Verify Left2 Function", dataProvider = "left_2")
    public void left2Test(String str, String exp){
        Assert.assertEquals(left2.left2(str), exp);
    }
}
