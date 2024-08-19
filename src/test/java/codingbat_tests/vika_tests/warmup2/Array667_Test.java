package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.Array667;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array667_Test {
    Array667 array667 = new Array667();

    @DataProvider(name = "array_667")
    public Object[][] dpArray667() {
        return new Object[][] {
                {new int[] {6, 6, 2}, 1},
                {new int[] {6, 7, 2, 6}, 1},
                {new int[] {1, 6, 3}, 0},
                {new int[] {}, 0},
                {new int[] {3, 6, 7, 6}, 1}
        };
    }

    @Test(description = "Verify Array 667 Function", dataProvider = "array_667")
    public void array667Test (int nums[], int exp) {
        Assert.assertEquals(array667.array667(nums), exp);
    }
}
