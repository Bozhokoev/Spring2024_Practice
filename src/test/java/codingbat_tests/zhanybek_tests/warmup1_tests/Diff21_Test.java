package codingbat_tests.zhanybek_tests.warmup1_tests;

import codingbat.zhanybek.warmup1.Diff21;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Diff21_Test {
    @DataProvider(name = "diff21Data")
    public Object[][] diff21Data() {
        return new Object[][]{
                {19, 2},
                {10, 11},
                {21, 0},
                {25, 8},
                {30, 18},
                {0, 21},
                {2, 19},
                {-1, 22},
                {-2, 23},
                {50, 58}
        };
    }
    @Test(dataProvider = "diff21Data")
    public void testDiff21(int n, int expected){
        Diff21 diff21 = new Diff21();
        int result = diff21.diff21(n);
        System.out.println("Running test with n: " + n + " -> Expected: " + expected + ", Result: " + result);
        Assert.assertEquals(result,expected,"The diff21 method failed for input: " +n);
    }

}
