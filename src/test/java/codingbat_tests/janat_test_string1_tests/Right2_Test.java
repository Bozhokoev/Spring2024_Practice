package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.Right2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Right2_Test {
    Right2 right2 = new Right2();

    @DataProvider(name = "right_2")
    public Object[][] dpRight2(){
        return new Object[][]{
                {"Hello", "loHel"},
                {"java", "vaja"},
                {"Hi", "Hi"},
                {"code", "deco"},
                {"cat", "atc"},
        };
    }
    @Test(description = "Verify Right2 Function", dataProvider = "right_2")
    public void right2Test(String str, String exp){
        Assert.assertEquals(right2.right2(str), exp);
    }
}
