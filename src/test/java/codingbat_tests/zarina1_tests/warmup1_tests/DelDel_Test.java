package codingbat_tests.zarina1_tests.warmup1_tests;

import codingbat.zarina1.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel = new DelDel();

    @DataProvider(name = "delDel")
    public Object[][] dpDelDel() {
        return new Object[][]{
                {"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"adedbc", "adedbc"},
                {"abcdel", "abcdel"},
                {"add", "add"},
                {"ad", "ad"},
                {"a", "a"},
                {"", ""},
                {"del", "del"},
                {"adel", "a"},
                {"aadelbb", "aadelbb"}
        };
    }

    @Test(description = "Verify Del Del Functional", dataProvider = "delDel")
    public void delDel_test(String str, String res) {
        Assert.assertEquals(delDel.delDel(str), res);
    }

}
