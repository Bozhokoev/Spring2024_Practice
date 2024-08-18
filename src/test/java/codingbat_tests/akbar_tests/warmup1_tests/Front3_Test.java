package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3_Test {
    Front3 front3 = new Front3();

    @DataProvider(name = "front3")
    public Object[][] dpFront3(){
        return new Object[][]{
                {"Java","JavJavJav"},
                {"Chocolate","ChoChoCho"},
                {"abc","abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"",""},
        };
    }

    @Test(description = "Verify Front3 function",dataProvider = "front3")
    public void front3Test(String str, String exp){
        Assert.assertEquals(front3.front3(str),exp);
    }
}
