package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel_t = new DelDel();

    @DataProvider(name = "DelDel")
    public Object[][] dpDelDel(){
        return new Object[][]{
                {"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"abcdel", "abcdel"}
        };
    }

    @Test(description = "Verify DelDel Function", dataProvider = "DelDel")
    public void delDelTest(String a, String exp){
        Assert.assertEquals(delDel_t.delDel(a), exp);
    }
}
