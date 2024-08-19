package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.Array123;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array123_Test {
    Array123 array123 = new Array123();

    @DataProvider(name = "array123")
    public Object[][] dpArray123() {
        return new Object[][]{
                {new int[]{1, 1, 2, 3, 1}, true},
                {new int[]{}, false},
                {new int[]{1, 1, 1}, false},
                {new int[]{1}, false},
        };
    }

    @Test(description = "Verify Array123 function", dataProvider = "array123")
    public void array123Test(int num [], boolean exp){
        Assert.assertEquals(array123.array123(num),exp);
    }
}
