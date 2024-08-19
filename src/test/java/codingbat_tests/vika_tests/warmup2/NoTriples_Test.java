package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_Test {
    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "no_triples")
    public Object[][] dpNoTriples() {
        return new Object[][] {
                {new int[] {1, 1, 2, 2, 1}, true},
                {new int[] {1, 1, 2, 2, 2, 1}, false},
                {new int[] {1, 2, 1}, true},
                {new int[] {}, true},
                {new int[] {1}, true}
        };
    }

    @Test(description = "Verify No Triples Function", dataProvider = "no_triples")
    public void noTriplesTest (int nums[], boolean exp) {
        Assert.assertEquals(noTriples.noTriples(nums), exp);
    }
}
