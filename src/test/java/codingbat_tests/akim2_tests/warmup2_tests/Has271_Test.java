package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.Has271;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Has271_Test {
    Has271 has271 = new Has271();

    @DataProvider(name = "has_271")
    public Object[][] dpHas271(){
        return new Object[][]{
                {new int[]{1, 2, 7, 1}, true},
                {new int[]{2, 7, 4}, false},
                {new int[]{4, 5, 3, 8, 0}, true},
                {new int[]{2, 7, 5, 10, 1}, false},
                {new int[]{1, 1, 4, 9, 4, 9, 2}, true}
        };
    }

    @Test(description = "Verify has271 function", dataProvider = "has_271")
    public void has271Test(int [] nums, boolean expected){
        Assert.assertEquals(has271.has271(nums), expected);
    }
}
