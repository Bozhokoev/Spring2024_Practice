package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.Without2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Without2_Test {

    Without2 without2 = new Without2();
    @DataProvider(name = "Without2")
    public Object [][] dpWithout2(){
        return new Object[][]{
                {"HelloHe","lloHe"},
                {"xx",""},
                {"",""},
                {"Fruits","Fruits"}
        };
    }
    @Test(description = "Verify Without2 Test", dataProvider = "Without2")
    public void without2Test(String str, String res){
        Assert.assertEquals(without2.without2(str),res);
    }
}
