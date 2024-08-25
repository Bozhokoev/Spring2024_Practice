package codingbat_tests.amir.tests.array1_tests;

import codingbat.amir.array1.SameFirstLast;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SameFirstLastTest {

    @DataProvider(name = "SameFirstLastData")
    public Object [][] sameLast() {
        return new Object[][] {
                {new int[] {1, 2, 3}, false},
                {new int[] {1, 2, 3, 1}, true},
                {new int[] {1, 2, 1}, true},
        };
    }

    @Test(dataProvider = "SameFirstLastData")
    public void testSameLast(int [] nums, boolean expected) {
        SameFirstLast sameFirstLast = new SameFirstLast();
        boolean result = sameFirstLast.sameFirstLast(nums);
        assertEquals(result, expected);
    }
}
