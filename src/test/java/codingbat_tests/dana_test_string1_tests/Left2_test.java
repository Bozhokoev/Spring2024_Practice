package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.Left2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Left2_test {

    Left2 left2 = new Left2();

    @DataProvider(name = "left2")
    public Object[][] dpLeft2(){
        return new Object[][]{
                {"Hello", "lloHe"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "tca"},
                {"12345", "34512"},
                {"Chocolate", "ocolateCh"},
                {"bricks", "icksbr"}
        };
    }

    @Test(description = "Verify Left2 Functional", dataProvider = "left2")
    public void left2_test(String str, String res){
        Assert.assertEquals(left2.left2(str), res);
    }
}
