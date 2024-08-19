package codingbat_tests.amir.tests.warnup1_tests;
import codingbat.amir.warmup1.MixStart;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class MixStartTest {

    @DataProvider(name = "MixStartData")
    public Object [][] mixStar() {
        return new Object[][] {
                {"mix snacks", true},
                {"pix snacks", true},
                {"piz snacks", false}
        };
    }

    @Test(dataProvider = "MixStartData")
    public void testMixStart(String str, boolean expected) {
        MixStart mixStart = new MixStart();
        boolean result = mixStart.mixStart(str);
        assertEquals(result, expected);
    }
}
