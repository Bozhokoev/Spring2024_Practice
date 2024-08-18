package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Close10;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Close10_Test {
    Close10 close10 = new Close10();

    @DataProvider (name = "Close 10")
    public Object [][] dpClose10 (){
        return new Object[][]{
                {8,13,8},
                {11,10,10},
                {10,10,0},
        };
    }
    @Test(description = "Verify Close 10 Test", dataProvider = "Close 10")
    public void close10Test (int a, int b, int x){
        Assert.assertEquals(close10.close10(a,b),x);
    }
}
