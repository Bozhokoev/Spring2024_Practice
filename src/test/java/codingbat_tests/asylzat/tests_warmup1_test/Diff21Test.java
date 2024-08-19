package codingbat_tests.asylzat.tests_warmup1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Diff21Test {
    public int diff21(int n){
        return n <= 21? 21 - n : 2 * (n - 21);
    }
    @DataProvider(name = "diff21Data")
    public  Object[][] diff21Data() {
        return new Object[][]{
                {19,2},
                {10,11},
                {21,0},
                {25,8},
                {30,18}
        };
    }
    @Test(dataProvider = "diff21Data")
    public void testDiff21(int n, int expected) {

        assertEquals(diff21(n),expected);
    }
    }

