package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.Array667;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array667_Test {
    Array667 array667 = new Array667();

    @DataProvider(name = "array_667")
    public Object[][] dpArray667(){
        return new Object[][]{
                {new int[]{6, 6, 2}, 1},
                {new int[]{6, 6, 2, 6}, 1},
                {new int[]{6, 6, 2, 6, 7}, 2},
                {new int[]{6, 1}, 0},
                {new int[]{3, 6, 7, 6}, 1}
        };
    }

    @Test(description = "Verify array667 function", dataProvider = "array_667")
    public void array667Test(int [] nums, int expected){
        Assert.assertEquals(array667.array667(nums), expected);
    }
}
