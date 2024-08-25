package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.Array123;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array123_test {

    Array123 array123 = new Array123();

    @DataProvider(name = "array123")
    public Object[][] dpArray123(){
        return new Object[][]{
                {new int []{1, 1, 2, 3, 1}, true},
                {new int []{1, 1, 2, 4, 1}, false},
                {new int []{1, 1, 2, 1, 2, 3}, true},
                {new int []{1, 1, 2, 1, 2, 1}, false},
                {new int []{1, 2, 3, 1, 2, 3}, true},
                {new int []{1, 2, 3}, true},
                {new int []{1, 1, 1}, false},
                {new int []{1, 2}, false},
                {new int []{1}, false},
                {new int []{}, false}
        };
    }
    @Test(description = "Verify Array123 Functional", dataProvider = "array123")
    public void array123_test(int nums [], boolean res){
        Assert.assertEquals(array123.array123(nums), res);
    }
}
