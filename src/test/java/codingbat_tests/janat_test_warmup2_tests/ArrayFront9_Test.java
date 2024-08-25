package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.ArrayFront9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayFront9_Test {

    ArrayFront9 arrayFront9 = new ArrayFront9();

    @DataProvider(name = "array_front_9")
    public Object[][] dpArrayFront9(){
        return new Object[][]{
                {new int[] {1, 2, 9, 3, 4}, true},
                {new int[] {1, 2, 3, 4, 9}, false},
                {new int[] {1, 2, 3, 4, 5}, false},
                {new int[] {9, 2, 3}, true},
                {new int[] {1, 9, 9}, true},
        };
    }

    @Test(description = "Verify Array_Front_9",dataProvider = "array_front_9")
    public void arrayFront9Test(int[] a, boolean exp){
        Assert.assertEquals(arrayFront9.arrayFront9(a), exp);
    }
}
