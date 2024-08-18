package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.HasTeen;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HasTeen_Test {
    HasTeen hasTeen = new HasTeen();

    @DataProvider (name = "Has Teen")
    public Object [][] dpHasTeen(){
        return new Object[][]{
                {13,20,10,true},
                {1,10,12,false},
                {19,20,19,true},
                {12,9,20,false},
                {11,22,20,false}
        };
    }

    @Test (description = "Verify Hast Teen Test", dataProvider = "Has Teen")
    public void hasTeenTest (int a, int b, int c, boolean exp){
        Assert.assertEquals(hasTeen.hasTeen(a,b,c),exp);
    }
}


