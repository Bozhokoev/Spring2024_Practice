package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.Has271;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Has271_test {

    Has271 has271 = new Has271();

    @DataProvider(name = "has271")
    public Object[][] dpHas271(){
        return new Object[][]{
                {new int[]{1, 2, 7, 1}, true},
                {new int[]{1, 2, 8, 1}, false},
                {new int[]{2, 7, 1}, true},
                {new int[]{3, 8, 2}, true},
                {new int[]{2, 7, 3}, true},
                {new int[]{2, 7, 4}, false},
                {new int[]{2, 7, -1}, true},
                {new int[]{2, 7, -2}, false},
                {new int[]{4, 5, 3, 8, 0}, true},
                {new int[]{2, 7, 5, 10, 4}, true},
                {new int[]{2, 7, -2, 4, 9, 3}, true},
                {new int[]{2, 7, 5, 10, 1}, false},
                {new int[]{2, 7, -2, 4, 10, 2}, false},
                {new int[]{1, 1, 4, 9, 0}, false},
                {new int[]{1, 1, 4, 9, 4, 9, 2}, true}
        };
    }

    @Test(description = "Verify Has271 Functional", dataProvider = "has271")
    public void has271_test(int nums[], boolean res){
        Assert.assertEquals(has271.has271(nums), res);
    }
}
