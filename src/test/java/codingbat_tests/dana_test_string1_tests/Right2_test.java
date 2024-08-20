package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2_test {

    Right2 right2 = new Right2();

    @DataProvider(name = "right2")
    public Object[][] dpRight2(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"	},
                {"cat", "atc"},
                {"12345", "45123"}
        };
    }

    @Test(description = "Verify Right2 Functional", dataProvider = "right2")
    public void right2_test(String str, String res){
        Assert.assertEquals(right2.right2(str), res);
    }
}
