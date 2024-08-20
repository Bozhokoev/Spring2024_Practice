package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.HasTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeen_Test {
    HasTeen hasTeen_t = new HasTeen();

    @DataProvider(name = "HasTeen")
    public Object[][] dpHasTeen(){
        return new Object[][]{
                {13,20,10, true},
                {20,19,10, true},
                {1,20,12, false},
                {12,9,20, false}
        };
    }

    @Test(description = "Verify HasTeen Function", dataProvider = "HasTeen")
    public void hasTeenTest(int num, int num2, int num3, boolean exp){
        Assert.assertEquals(hasTeen_t.hasTeen(num,num2,num3), exp);
    }
}
