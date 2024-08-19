package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.Array667;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array667_test {

    Array667 array667 = new Array667();

    @DataProvider(name = "array667")
    public Object[][] dpArray667(){
        return new Object[][]{
                {new int[]{6, 6, 2}, 1},
                {new int[]{6, 6, 2, 6}, 1},
                {new int[]{6, 7, 2, 6}, 1},
                {new int[]{6, 6, 2, 6, 7}, 2},
                {new int[]{1, 6, 3}, 0},
                {new int[]{6, 1}, 0},
                {new int[]{}, 0},
                {new int[]{3, 6, 7, 6}, 1},
                {new int[]{3, 6, 6, 7}, 2},
                {new int[]{6, 3, 6, 6}, 1},
                {new int[]{6, 7, 6, 6}, 2},
                {new int[]{1, 2, 3, 5, 6}, 0},
                {new int[]{1, 2, 3, 6, 6}, 1}
        };
    }

    @Test(description = "Verify Array667 Functional", dataProvider = "array667")
    public void array667_test(int nums[], int res){
        Assert.assertEquals(array667.array667(nums), res);
    }
}
