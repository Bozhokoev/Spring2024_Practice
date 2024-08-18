package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.EveryNth;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EveryNth_Test {

    EveryNth everyNth = new EveryNth();

    @DataProvider (name = "EveryNth")
    public Object [][] dpEveryNth(){
        return new Object[][]{
                {"Miracle", 2,"Mrce"},
                {"Chocolates", 3,"Ccas"},
                {"Chocolates", 100,"C"},
        };
    }

    @Test(description = "Verify EveryNth", dataProvider = "EveryNth")
    public void everyNthTest (String str, int n, String res){
        Assert.assertEquals(everyNth.everyNth(str,n),res);
    }
}
