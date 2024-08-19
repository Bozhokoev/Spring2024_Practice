package codingbat_tests.asylzat.tests_warmup1_test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Makes10Test {

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    @DataProvider
            (name = "makes10TestData")
    public Object [][] makes10TestData() {
        return new Object [][] {
                {9, 1, true},
                {10, 5, true},
                {3, 10, true},
                {1, 2, false},
                {10, 10, true}
        };
    }

   @Test
            (dataProvider = "makes10TestData",dataProviderClass = Makes10Test.class)
    public void testMakes10(int a, int b, boolean expected) {
        assert (makes10(a,b) == expected);
    }
}
