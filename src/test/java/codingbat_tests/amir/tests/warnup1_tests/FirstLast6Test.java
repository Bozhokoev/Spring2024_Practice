package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.array1.FirstLast6;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FirstLast6Test {

    @DataProvider(name = "FirstLast6Data")
    public Object[][] firstLast() {
        return new Object[][] {
                {new int [] {1, 2, 6}, true},
                {new int [] {6, 1, 2, 3}, true},
                {new int [] {13, 6, 1, 2, 3}, false}
        };
    }

    @Test(dataProvider = "FirstLast6Data")
    public void testFirstLast6(int [] nums, boolean expected) {
        FirstLast6 firstLast6 = new FirstLast6();
        boolean result = firstLast6.firstLast6(nums);
        assertEquals(result, expected);
    }
}
