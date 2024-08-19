package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDel_Test {
    DelDel delDel = new DelDel();

    @DataProvider(name = "delDel")
    public Object[][] dpDelDel() {
        return new Object[][]{
                {"adelbc", "abc"},
                {"aadelbb", "aadelbb"},
                {"adel", "a"},
                {"del", "del"},
                {"", ""},
        };
    }

    @Test(description = "Verify DelDel function", dataProvider = "delDel")
    public void delDelTest(String s, String exp) {
        Assert.assertEquals(delDel.delDel(s), exp);
    }
}
