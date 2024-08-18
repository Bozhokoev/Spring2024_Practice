package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.In3050;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class In3050_Test {
    In3050 in3050 = new In3050();

    @DataProvider (name = "In3050")
    public Object [][] dpIn3050(){
        return new Object[][]{
                {30,31,true},
                {40,51,false},
                {49,48,true},
                {50,51,false}
        };
    }
    @Test (description = "Verify In3050 Test", dataProvider = "In3050")
    public void in3050Test(int a, int b, boolean res){
        Assert.assertEquals(in3050.in3050(a,b),res);
    }
}
