package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.ArrayFront9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayFront9_Test {
    ArrayFront9 arrayFront9 = new ArrayFront9();

    @DataProvider(name = "array_front_9")
    public Object[][] dpArrayCount9(){
        return new Object[][]{
                {new int[]{1, 2, 9, 3, 4}, true},
                {new int[]{1, 2, 3, 4, 9}, false},
                {new int[]{1, 2, 3, 4, 5}, false},
                {new int[]{1, 9, 9}, true},
                {new int[]{5, 5}, false},
                {new int[]{2}, false}
        };
    }

    @Test(description = "Verify arrayFront9 function", dataProvider = "array_front_9")
    public void arrayFront9(int [] nums, boolean expected){
        Assert.assertEquals(arrayFront9.arrayFront9(nums), expected);
    }
}
