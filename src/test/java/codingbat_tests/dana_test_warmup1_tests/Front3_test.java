package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3_test {

    Front3 front3 = new Front3();

    @DataProvider(name = "front3")
    public Object[][] dpFront3(){
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"ab", "ababab"},
                {"a", "aaa"},
                {"", ""}
        };
    }
    @Test(description = "Verify Front3", dataProvider = "front3")
    public void front3_test(String str, String res){
        Assert.assertEquals(front3.front3(str), res);
    }
}
