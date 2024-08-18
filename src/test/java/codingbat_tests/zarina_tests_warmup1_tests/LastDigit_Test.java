package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.LastDigit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LastDigit_Test {

    LastDigit lastDigit = new LastDigit();

    @DataProvider(name = "Last Digit")
    public Object [][] dpLastDigit(){
        return new Object[][]{
                {7,17, true},
                {6,17,false},
                {114,113,false},
                {10,0,true},
        };
    }
    @Test(description = "Verify LastDigit Test",dataProvider = "Last Digit")
    public void lastDigitTest (int a,int b, boolean res){
        Assert.assertEquals(lastDigit.lastDigit(a,b), res);
    }
}
