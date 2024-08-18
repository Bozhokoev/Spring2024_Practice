package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel = new DelDel();

    @DataProvider(name = "del_del")
    public Object[][] dpDelDel(){
        return new Object[][]{
                {"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"ad", "ad"},
                {"a", "a"},
                {"", ""},
                {"del", "del"}
        };
    }

    @Test(description = "Verify deldel function", dataProvider = "del_del")
    public void delDelTest(String str, String expected){
        Assert.assertEquals(delDel.delDel(str), expected);
    }
}
