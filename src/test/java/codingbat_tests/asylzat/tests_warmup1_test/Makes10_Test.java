package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.Makes10;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Makes10_Test {

    Makes10 makes10 = new Makes10();

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
            (dataProvider = "makes10TestData",dataProviderClass = Makes10_Test.class)
    public void testMakes10(int a, int b, boolean expected) {
        assert (makes10.makes10(a,b) == expected);
    }
}
