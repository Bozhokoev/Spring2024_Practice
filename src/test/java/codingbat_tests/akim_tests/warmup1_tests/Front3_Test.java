package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3_Test {
    Front3 front3 = new Front3();

    @DataProvider(name = "Front3")
    public Object[][] dpFrong3(){
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"", ""},
        };
    }

    @Test(description = "Verify front3 function", dataProvider = "Front3")
    public void front3(String str, String expected){
        Assert.assertEquals(front3.front3(str), expected);
    }
}
