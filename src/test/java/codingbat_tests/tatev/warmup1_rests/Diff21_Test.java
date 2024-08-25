package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Diff21_Test {
    @DataProvider(name = "Diff21Data")
    public Object[][] Diff21TestData() {
        return new Object[][]{
                {19,2},
                {10, 11},
                {21, 0}
};
        }
        @Test(dataProvider = "Diff21Data")
    public void testDiff21 (int a, int except) {
            Diff21 diff21 = new Diff21();
            int result = diff21.diff21(a);
            assertEquals(result, except);
        }

    }


