package codingbat_tests.janat_test_warmup2_tests;

import codingbat.janat.warmup2.Has271;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Has271_Test {
    Has271 has271 = new Has271();

    @DataProvider(name = "has_271")
    public Object[][] dpHas271(){
        return new Object[][]{
                {new int[] {1, 2, 7, 1}, true},
                {new int[] {1, 2, 8, 1}, false},
                {new int[] {2, 7, 1}, true},
                {new int[] {3, 8, 2}, true},
                {new int[] {2, 7, 3}, true},
        };
    }
    @Test(description = "Verify Has271  Function", dataProvider = "has_271")
    public void has271(int [] a, boolean exp){
        Assert.assertEquals(has271.has271(a), exp);
    }
}
