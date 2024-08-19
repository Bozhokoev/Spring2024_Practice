package codingbat_tests.aidar_tests.warmup1_tests;

import codingbat.aidar.warmup1.ParrotTrouble;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ParrotTrouble_test {
    @DataProvider (name = "parrotTrouble")
    public Object [][] dpparrotTrouble (){
            return new  Object[][] {
                    {true, 6, true},
                    {true, 7, false},
                    {false, 6, false},
                    {false, 21, false},
                    {false, 20, false},
                    {true, 23, true},
                    {false, 23, false},
                    {true,20, false},
                    {false,12, false}


        };
    }
    @Test (description = "parrotTrouble_data", dataProvider = "parrotTrouble" )
    public void testparrotTrouble (boolean talking, int hour, boolean except) {
        ParrotTrouble parrotTrouble = new ParrotTrouble();
        boolean res = parrotTrouble.parrotTrouble(talking, hour);
        Assert.assertEquals(res, except);
    }


}
