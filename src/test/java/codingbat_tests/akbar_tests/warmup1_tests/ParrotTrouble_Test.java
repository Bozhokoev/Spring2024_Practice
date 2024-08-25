package codingbat_tests.akbar_tests.warmup1_tests;

import codingbat.akbar.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTrouble_Test {
    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "parrotTrouble")
    public Object[][] parrot_trouble() {
        return new Object[][]{
                {true, 6, true}, {true, 7, false}, {false, 6, false}, {true, 21, true},
                {false, 21, false}, {false, 20, false}, {true, 23,true}, {false, 23,false},
                {true, 20,false}, {false, 12,false}
        };
    }

    @Test(description = "Verify Parrot Trouble",dataProvider = "parrotTrouble")
    public void ParrotTroubleTest(boolean is, int num,boolean res){
        Assert.assertEquals(parrotTrouble.parrotTrouble(is,num),res);
    }
}
