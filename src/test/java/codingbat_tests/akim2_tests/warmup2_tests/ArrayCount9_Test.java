package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.ArrayCount9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCount9_Test {
    ArrayCount9 arrayCount9 = new ArrayCount9();

    @DataProvider(name = "array_count_9")
    public Object[][] dpArrayCount9(){
        return new Object[][]{
                {new int[]{1, 2, 9}, 1},
                {new int[]{1, 9, 9, 3, 9}, 3},
                {new int[]{4, 2, 4, 3, 1}, 0},
                {new int[]{1, 2, 3}, 0},
                {new int[]{9, 2, 4, 3, 1}, 1}
        };
    }

    @Test(description = "Verify arraycount9 function", dataProvider = "array_count_9")
    public void arrayCount9Test(int [] nums, int expected){
        Assert.assertEquals(arrayCount9.arrayCount9(nums), expected);
    }
}
