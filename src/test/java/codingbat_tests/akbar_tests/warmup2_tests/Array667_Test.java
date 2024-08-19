package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.Array667;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array667_Test {
    Array667 array667 = new Array667();

    @DataProvider(name = "array667")
    public Object [][] dpArray667(){
        return new Object[][]{
                {new int []{6, 6, 2}, 1},
                {new int []{},0},
                {new int []{6,1}, 0},
                {new int []{3, 6, 6, 7}, 2},
        };
    }

    @Test(description = "Verify Array667 function", dataProvider = "array667")
    public void array667Test(int [] nums, int exp){
        Assert.assertEquals(array667.array667(nums),exp);
    }
}
