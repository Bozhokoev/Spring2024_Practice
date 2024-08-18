package codingbat_tests.dana_test_warmup1_tests;

import codingbat.dana.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTrouble_test {
    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "parrotTrouble")
    public Object [][] dpParrotTrouble(){
        return new Object[][]{
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 21, false},
                {false, 20, false},
                {true, 23,true},
                {false, 23,false},
                {true, 20,false},
                {false, 12,false}
        };
    }

    @Test(description = "Verify Parrot Trouble", dataProvider = "parrotTrouble")
    public void parrotTroubleTest(boolean a, int b, boolean res){
        Assert.assertEquals(parrotTrouble.parrotTrouble(a, b), res);
    }
}
