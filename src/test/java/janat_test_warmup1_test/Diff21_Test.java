package janat_test_warmup1_test;

import codingbat.akim.warmup1.Diff21;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Diff21_Test {

    @DataProvider(name = "diff21Data")
    public Object[][] diff21Data() {
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0},
                {22, 2},
                {25, 8},
                {30, 18},
                {0, 21},
                {1, 20},
                {2, 19},
                {-1, 22},
                {-2, 23},
                {50, 58}
        };
    }

    @Test(dataProvider = "diff21Data")
    public void testDiff21(int n, int expected) {
        Diff21 diff21 = new Diff21();
        int result = diff21.diff21(n);
        System.out.println("Running test with n: " + n + " -> Expected: " + expected + ", Result: " + result);
        assertEquals(result, expected, "The diff21 method failed for input: " + n);
    }
}
