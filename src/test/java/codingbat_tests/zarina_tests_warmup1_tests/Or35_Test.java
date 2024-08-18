package codingbat_tests.zarina_tests_warmup1_tests;

import codingbat.zarina.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_Test {
    Or35 or35 = new Or35();

    @DataProvider (name = "Or35")
    public Object [][] dpOr35(){
        return new Object[][]{
                {3,true},
                {8,false},
                {21,true},
                {101,false},
        };
    }

    @Test (description = "Verify Or35 Test Function",dataProvider = "Or35")
    public void or35Test (int n, boolean exp){
        Assert.assertEquals(or35.or35(n),exp);
    }
}
