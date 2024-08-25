package codingbat_tests.dana_test_warmup2_tests;

import codingbat.dana.warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_test {

    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "noTriples")
    public Object[][] dpNoTriples(){
        return new Object[][]{
                {new int[]{1, 1, 2, 2, 1}, true},
                {new int[]{1, 1, 2, 2, 2, 1}, false},
                {new int[]{1, 1, 1, 2, 2, 2, 1}, false},
                {new int[]{1, 1, 2, 2, 1, 2, 1}, true},
                {new int[]{1, 2, 1}, true},
                {new int[]{1, 1, 1}, false},
                {new int[]{1, 1}, true},
                {new int[]{1}, true},
                {new int[]{}, true}
        };
    }

    @Test(description = "Verify NoTriples Functional", dataProvider = "noTriples")
    public void noTriples_test(int nums[], boolean res){
        Assert.assertEquals(noTriples.noTriples(nums), res);
    }
}
