package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.Front3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3_Test {
    Front3 front3_t = new Front3();

    @DataProvider(name = "Front3")
    public Object[][] dpFront3(){
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"a", "aaa"}
        };
    }

    @Test(description = "Verify Front3 Function", dataProvider = "Front3")
    public void front3Test(String a, String exp){
        Assert.assertEquals(front3_t.front3(a), exp);
    }
}
