package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeenTest {

    HasTeen hasTeen = new HasTeen();

    @DataProvider(name = "has_teen")
    public Object[][] dpHasTeen(){
        return new Object[][]{
                {13, 20, 10, true},
                {20, 19, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {19, 20, 12, true},
        };
    }

    @Test(description = "Verify Has_Teen Function", dataProvider = "has_teen")
    public void hasTeenTest(int a, int b, int c, boolean exp){
        Assert.assertEquals(hasTeen.hasTeen(a, b, c), exp);
    }
}
