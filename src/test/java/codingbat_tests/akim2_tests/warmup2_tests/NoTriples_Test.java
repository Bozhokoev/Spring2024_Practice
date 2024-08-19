package codingbat_tests.akim2_tests.warmup2_tests;

import codingbat.akim2.warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_Test {
    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "no_triples")
    public Object[][] dpNoTriples(){
        return new Object[][]{
                {new int[]{1, 1, 2, 2, 1}, true},
                {new int[]{1, 1, 1, 2, 2, 2, 1}, false},
                {new int[]{1, 1, 2, 2, 1, 2, 1}, true},
                {new int[]{1, 1, 1}, false},
                {new int[]{1}, true}
        };
    }

    @Test(description = "Verify notriples function", dataProvider = "no_triples")
    public void noTriplesTest(int [] nums, boolean expected){
        Assert.assertEquals(noTriples.noTriples(nums), expected);
    }
}
