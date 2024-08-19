package codingbat_tests.amir.tests.warnup1_tests;
import codingbat.amir.warmup1.DelDel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class DelDelTest {

    @DataProvider(name = "DelDelData")
    public Object [][] deldel() {
        return new Object[][] {
                {"adelbc", "abc"},
                {"adelHello", "aHello"},
                {"adedbc", "adedbc"}
        };
    }

    @Test(dataProvider = "DelDelData")
    public void testDelDel(String str, String expected) {
        DelDel delDel = new DelDel();
        String result = delDel.delDel(str);
        assertEquals(result, expected);
    }
}
