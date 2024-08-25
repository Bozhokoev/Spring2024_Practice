package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.ArrayFront9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayFront9_Test {
    ArrayFront9 arrayFront9 = new ArrayFront9();

    @DataProvider(name = "arrayFront9")
    public Object[][] dpArrayFront9(){
        return new Object[][]{
                {new int []{1, 2, 9, 3, 4}, true},
                {new int []{1, 2, 3, 4, 9}, false},
                {new int []{}, false},
                {new int []{1,  9}, true},

      };
    }

    @Test(description = "Verify ArrayFront9 function", dataProvider = "arrayFront9")
    public void arrayFront9Test(int [] nums, boolean exp){
        Assert.assertEquals(arrayFront9.arrayFront9(nums),exp);
    }
}
