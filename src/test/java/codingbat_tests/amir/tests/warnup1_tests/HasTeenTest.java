package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.HasTeen;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.print.attribute.standard.MediaSize;

import static org.testng.AssertJUnit.assertEquals;

public class HasTeenTest {

    @DataProvider(name = "HasTeenData")
    public Object [][] hasTeen() {
        return new Object[][] {
                {13, 20, 10, true},
                {20, 19, 10, true},
                {20, 10, 13, true}
        };
    }
    @Test(dataProvider = "HasTeenData")
    public void testHasTeen(int a, int b, int c, boolean excepted) {
        HasTeen hasTeen = new HasTeen();
        boolean result = hasTeen.hasTeen(a, b, c);
        assertEquals(result, excepted);
    }
}
