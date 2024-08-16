package codingbat_tests.amir_tests.warmup1_tests;
import codingbat.amir.warmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MonkeyTroubleTest {

    @DataProvider(name = "monkeyTroubleData")
    public Object[][] createData() {
        return new Object[][] {
                { true, true, true },
                { false, false, true },
                { true, false, false },
                { false, true, false }
        };
    }

    @Test(dataProvider = "monkeyTroubleData")
    public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
        MonkeyTrouble monkeyTrouble = new MonkeyTrouble();
        assertEquals(monkeyTrouble.monkeyTrouble(aSmile, bSmile), expected);
    }
}
