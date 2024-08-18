package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.StringEe;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringEe_Test {

    StringEe stringE = new StringEe();

    @DataProvider(name = "StringE")
    public Object [][] dpStringE(){
        return new Object[][]{
                {"Hello", true},
                {"Heelle",true},
                {"Heelele",false},
                {"",false},
        };
    }
    @Test(description = "Verify StringE Test",dataProvider = "StringE")
    public void stringETest (String str, boolean res){
        Assert.assertEquals(stringE.stringE(str), res);
    }
}

