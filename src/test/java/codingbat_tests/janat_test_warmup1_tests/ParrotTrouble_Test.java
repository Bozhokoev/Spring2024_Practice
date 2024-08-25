package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParrotTrouble_Test {

    ParrotTrouble parrotTrouble = new ParrotTrouble();

    @DataProvider(name = "parrot_trouble")
    public Object[][] dpParrotTrouble(){
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
    @Test(description = "Verify sleep in function", dataProvider = "parrot_trouble")
    public void parrot_trouble(boolean a, int b, boolean res){
        Assert.assertEquals(parrotTrouble.parrotTrouble(a, b), res);

    }
}
