package codingbat_tests.akim_tests.warmup1_tests;

import codingbat.akim.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTrouble_Test {
    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "parrot_trouble")
    public Object[][] dpParrotTrouble(){
        return new Object[][]{
                {true, 6, true},
                {true, 7, false},
                {false, 6, false},
                {true, 21, true},
                {false, 23, false},
        };
    }

    @Test(description = "Verify parrot trouble function", dataProvider = "parrot_trouble")
    public void parrotTrouble(boolean a, int b, boolean expected){
        Assert.assertEquals(parrotTrouble.parrotTrouble(a, b), expected);
    }
}
