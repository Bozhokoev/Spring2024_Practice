package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.ArrayFront9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayFront9_Test {
    ArrayFront9 arrayFront9 = new ArrayFront9();

    @DataProvider(name = "ArrayFront9")
    public Object [][] dpArrayFront9(){
        return new Object[][]{
                {new int[]{1, 2, 9, 3, 4},true},
                {new int[]{1,2,3,4,5},false},
                {new int[]{1,9,9},true},
                {new int[]{2},false},
        };
    }
@Test (description = "Verify ArrayFront9 Function", dataProvider = "ArrayFront9")
    public void arrayFront9Test(int nums [],boolean res){
    Assert.assertEquals(arrayFront9.arrayFront9(nums),res);
}
}
