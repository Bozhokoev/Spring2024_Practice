package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.IntMax;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IntMaxTest {

    @DataProvider(name = "intMaxDataProvider")
    public Object[][] intMaxDataProvider() {
        return new Object[][]{
                {1, 2, 3, 3},
                {1, 3, 2, 3},
                {3, 2, 1, 3},
                {9, 3, 3, 9},
                {3, 9, 3, 9},
                {3, 3, 9, 9},
                {8, 2, 3, 8},
                {-3, -1, -2, -1},
                {6, 2, 5, 6},
                {5, 6, 2, 6},
                {5, 2, 6, 6}
        };
    }

    @Test(dataProvider = "intMaxDataProvider")
    public void testIntMax(int a, int b, int c, int expected) {
        IntMax intMax = new IntMax();
        Assert.assertEquals(
                intMax.intMax(a, b, c),
                expected);
    }
}
