package codingbat_tests.syrgak1_tests.warmup1_tests;

import codingbat.syrgak1.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTrouble_Test {
    ParrotTrouble parrotTrouble_t = new ParrotTrouble();

    @DataProvider(name = "ParrotTrouble")
    public Object[][] dpParrotTrouble(){
        return new Object[][]{
                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 20, false}
        };
    }

    @Test(description = "Verify ParrotTrouble Function", dataProvider = "ParrotTrouble")
    public void parrotTroubleTest(boolean a, int num, boolean exp){
        Assert.assertEquals(parrotTrouble_t.parrotTrouble(a, num), exp);
    }
}
