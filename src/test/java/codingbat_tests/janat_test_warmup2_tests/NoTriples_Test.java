package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_Test {
    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "no_triples")
    public Object[][] dpNoTriples(){
        return new Object[][]{
                {new int[] {1, 1, 2, 2, 1}, true},
                {new int[] {1, 1, 2, 2, 2, 1}, false},
                {new int[] {1, 1, 1, 2, 2, 2, 1}, false},
                {new int[] {1, 1, 2, 2, 1, 2, 1}, true},
                {new int[] {1, 2, 1}, true},
        };
    }

    @Test(description = "Verify No_Triples Function", dataProvider = "no_triples")
    public void noTriplesTest(int[] a, boolean exp){
        Assert.assertEquals(noTriples.noTriples(a), exp);
    }
}
