package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.Array123;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array123_Test {
    Array123 array123 = new Array123();

    @DataProvider(name = "array_123")
    public Object[][] dpArray123(){
        return new Object[][]{
                {new int[]{1, 1, 2, 3, 1}, true},
                {new int[]{1, 1, 2, 4, 1}, false},
                {new int[]{1, 1, 2, 1, 2, 3}, true},
                {new int[]{1, 1, 2, 1, 2, 1}, false},
                {new int[]{1, 1, 1}, false},
                {new int[]{}, false}
        };
    }

    @Test(description = "Verify array123 function", dataProvider = "array_123")
    public void array123Test(int [] num, boolean expected){
        Assert.assertEquals(array123.array123(num), expected);
    }
}
