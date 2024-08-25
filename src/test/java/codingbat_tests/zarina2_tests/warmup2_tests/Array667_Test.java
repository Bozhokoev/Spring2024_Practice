package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.Array667;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array667_Test {

    Array667 array667 = new Array667();

    @DataProvider (name = "Array667")
    public Object[][] dpArray667(){
        return new Object[][]{
                {new int[]{6,6,2},1},
                {new int[]{6,6,2,6,7},2},
                {new int[]{},0},
                {new int[]{1,6,3},0},
        };
    }
    @Test(description = "Verify Array667 Function", dataProvider = "Array667")
    public void array667Test(int nums[],int res){
        Assert.assertEquals(array667.array667(nums),res);
    }
}
