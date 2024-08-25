package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.NoTriples;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NoTriples_Test {
    NoTriples noTriples = new NoTriples();

    @DataProvider(name = "NoTripples")
    public Object[][] dpNoTriples(){
        return new Object[][]{
                {new int[]{1,1,2,2,1},true},
                {new int[]{1,1,2,2,2,1},false},
                {new int[]{1,2,1},true},
                {new int[]{},true},
                {new int[]{1,1,1},false},

        };
    }
    @Test(description = "Verify NoTripples Function",dataProvider = "NoTripples")
    public void noTripples(int[]nums,boolean res){
        Assert.assertEquals(noTriples.noTriples(nums),res);
    }
}
