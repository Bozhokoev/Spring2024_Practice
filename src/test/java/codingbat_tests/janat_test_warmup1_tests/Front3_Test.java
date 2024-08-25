package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.Front3;
import codingbat.janat.warmup1.FrontBack;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Front3_Test {

   Front3 front3 = new Front3();

    @DataProvider(name = "front_3")
    public Object[][] dpFront3(){
        return new Object[][]{
                {"Java", "JavJavJav"},
                {"Chocolate", "ChoChoCho"},
                {"abc", "abcabcabc"},
                {"abcXYZ", "abcabcabc"},
                {"ab", "ababab"},
        };
    }
    @Test(description = "Verify Front3 Function", dataProvider = "front_3")
    public void front3Test(String str, String exp){
        Assert.assertEquals(front3.front3(str), exp);
    }
}
