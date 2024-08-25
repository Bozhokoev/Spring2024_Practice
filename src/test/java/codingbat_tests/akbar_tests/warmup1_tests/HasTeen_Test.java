package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeen_Test {
    HasTeen hasTeen = new HasTeen();

    @DataProvider(name = "hasTeen")
    public Object[][] dpHasTeen(){
        return new Object[][]{
                {13, 20, 10, true},
                {20, 10, 13, true},
                {1, 20, 12, false},
                {11, 22, 22, false},
                {4, 2, 20,false},
                {12, 18, 20,true},
                {12, 9, 20, false},
        };
    }

    @Test(description = "Verify HasTeen function", dataProvider = "hasTeen")
    public void hasTeenTest(int a, int b, int c, boolean exp){
        Assert.assertEquals(hasTeen.hasTeen(a,b,c),exp);
    }
}
