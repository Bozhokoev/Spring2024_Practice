package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.DelDel;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DelDelTest {

    @DataProvider(name = "delDelDataProvider")
    public Object[][] delDelDataProvider() {
        return new Object[][] {
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

    @Test(dataProvider = "delDelDataProvider")
    public void testDelDel(String input, String expected) {
        DelDel delDel = new DelDel();
        Assert.assertEquals(
                delDel.delDel(input),
                expected);
    }
}
