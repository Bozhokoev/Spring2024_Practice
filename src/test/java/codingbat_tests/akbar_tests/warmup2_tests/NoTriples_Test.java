package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_Test {
    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "noTriples")
    public Object[][] dpNoTriples() {
        return new Object[][]{
                {new int[]{1, 1, 2, 2, 1}, true},
                {new int[]{1, 2, 1}, true},
                {new int[]{1, 1,  1}, false},
                {new int[]{1, 1, 1, 2, 2, 2, 1}, false},
        };
    }

    @Test(description = "Verify NoTriples function",dataProvider = "noTriples")
    public void noTriplesTest(int [] nums, boolean exp){
        Assert.assertEquals(noTriples.noTriples(nums),exp);
    }

}
