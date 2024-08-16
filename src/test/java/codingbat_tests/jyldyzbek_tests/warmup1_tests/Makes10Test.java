package codingbat_tests.jyldyzbek_tests.warmup1_tests;

import codingbat.jyldyzbek.warmup1.Makes10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Makes10Test {

    @DataProvider(name = "makes10Data")
    public Object[][] makes10Data() {
        return new Object[][]{
                {9, 10, true},
                {9, 9, false},
                {1, 9, true},
                {10, 1, true},
                {10, 10, true},
                {8, 2, true},
                {8, 3, false},
                {10, 42, true},
                {12, -2, true}
        };
    }

    @Test(dataProvider = "makes10Data")
    public void testMakes10(int a, int b, boolean expected) {
        Makes10 makes10 = new Makes10();
        boolean result = makes10.makes10(a, b);
        System.out.println("Running test with a: " + a + ", b: " + b + " -> Expected: " + expected + ", Result: " + result);
        Assert.assertEquals(result, expected, "The makes10 method failed for input: a=" + a + ", b=" + b);
    }
}
