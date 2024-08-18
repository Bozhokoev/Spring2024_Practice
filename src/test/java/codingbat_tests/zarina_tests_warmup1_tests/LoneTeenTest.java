package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.LoneTeen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoneTeenTest {
    LoneTeen loneTeen = new LoneTeen();

    @DataProvider (name = "Lone Teen")
    public Object [][] dpLoneTeen(){
        return new Object[][]{
                {13,99,true},
                {21,19,true},
                {13,13,false},
                {20,15,true},
                {16,9,true}
        };
    }

    @Test(description = "Verify Lone Teen Test", dataProvider = "Lone Teen")
            public void loneTeenTest (int a, int b, boolean exp){
        Assert.assertEquals(loneTeen.loneTeen(a,b),exp);
    }
}
