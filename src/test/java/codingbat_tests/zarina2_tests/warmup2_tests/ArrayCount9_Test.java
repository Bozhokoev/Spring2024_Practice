package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.ArrayCount9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCount9_Test {
    ArrayCount9 arrayCount9 = new ArrayCount9();

    @DataProvider (name = "ArrayCount9")
    public Object [][] dpArrayCount9(){
        return new Object[][]{
                {new int[]{1,2,9},1},
                {new int[]{1,9,9,3,9},3},
                {new int[]{1,9,9},2},
                {new int[]{},0},
        };
    }
    @Test(description = "Verify ArrayCount9 function",dataProvider = "ArrayCount9")
    public void arrayCount9Test(int nums[], int n){
        Assert.assertEquals(arrayCount9.arrayCount9(nums),n);
    }
}
