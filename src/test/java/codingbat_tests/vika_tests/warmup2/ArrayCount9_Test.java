package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.ArrayCount9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCount9_Test {
    ArrayCount9 arrayCount9 = new ArrayCount9();

    @DataProvider(name = "array_count_9")
    public Object[][] dparrayCount() {
        return new Object[][] {
                {new int[] {1, 2, 9}, 1},
                {new int[] {1, 9, 9, 3, 9}, 3},
                {new int[] {4, 2, 4, 3, 1} ,0},
                {new int[] {}, 0},
                {new int[] {9, 2, 4, 3, 1}, 1}
        };
    }

    @Test(description = "Verify Array Count 9 Function", dataProvider = "array_count_9")
    public void arrayCount9Test (int nums[], int exp) {
        Assert.assertEquals(arrayCount9.arrayCount9(nums), exp);
    }
}
