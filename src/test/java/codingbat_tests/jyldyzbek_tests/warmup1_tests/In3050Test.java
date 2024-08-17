package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050Test {

    @DataProvider(name = "in3050DataProvider")
    public Object[][] in3050DataProvider() {
        return new Object[][]{
                {30, 31, true},
                {30, 41, false},
                {40, 50, true},
                {40, 51, false},
                {39, 50, false},
                {50, 39, false},
                {40, 39, true},
                {49, 48, true},
                {50, 40, true},
                {50, 51, false},
                {35, 36, true},
                {35, 45, false}
        };
    }

    @Test(dataProvider = "in3050DataProvider")
    public void testIn3050(int a, int b, boolean expected) {
        In3050 in3050 = new In3050();
        Assert.assertEquals(
                in3050.in3050(a, b),
                expected);
    }
}
