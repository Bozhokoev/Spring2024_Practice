package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hasTeen_Test {
    HasTeen hasTeen = new HasTeen();

    @DataProvider(name = "has_teen")
    public Object[][] dpHasTeen(){
        return new Object[][]{
                {13, 20, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {12, 9, 20, false},
                {11, 22, 22, false}
        };
    }

    @Test(description = "Verify hasTeen function", dataProvider = "has_teen")
    public void hasTeenTest(int a, int b, int c, boolean expected){
        Assert.assertEquals(hasTeen.hasTeen(a, b, c), expected);
    }
}
