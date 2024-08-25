package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.ArrayCount9;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArrayCount9_Test {
    ArrayCount9 arrayCount9 = new ArrayCount9();

    @DataProvider(name = "array_count_9")
    public Object[][] dpArrayCount9(){
        return new Object[][]{
                {new int[] {1, 2, 9}, 1},
                {new int[] {1, 9, 9}, 2},
                {new int[] {1, 9, 9, 3, 9}, 3},
                {new int[] {1, 2, 3}, 0},
                {new int[] {}, 0},

        };
    }

    @Test(description = "Verify Array_Count_9", dataProvider = "array_count_9")
    public void arrayCount9Test(int[] a, int exp){
        Assert.assertEquals(arrayCount9.arrayCount9(a),exp);
    }



}
