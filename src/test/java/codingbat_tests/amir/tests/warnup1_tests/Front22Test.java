package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.Front22;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Front22Test {

    @DataProvider(name = "Front22Data")
    public Object [][] front22() {
        return new Object[][] {
                {"kitten", "kikittenki"},
                {"Ha", "HaHaHa"},
                {"abc", "ababcab"}
        };
    }

    @Test(dataProvider = "Front22Data")
    private void testFront22(String str, String except) {
        Front22 front22 = new Front22();
        String result = front22.front22(str);
        assertEquals(result, except);
    }
}
