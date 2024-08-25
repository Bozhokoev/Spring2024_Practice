package codingbat_tests.amir.tests.warnup1_tests;
import codingbat.amir.warmup1.LoneTeen;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class LoneTeenTest {

    @DataProvider(name = "LoneTeenData")
    public Object [][] loneTeen(){
        return new Object[][] {
                {13, 99, true},
                {21, 19, true},
                {13, 13, false}
        };
    }

    @Test(dataProvider = "LoneTeenData")
    public void testLoneTeen(int a, int b, boolean excepted) {
        LoneTeen loneTeen = new LoneTeen();
        boolean result = loneTeen.loneTeen(a, b);
        assertEquals(result, excepted);
    }
}
