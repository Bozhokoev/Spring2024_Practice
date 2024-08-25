package codingbat_tests.janat_test_warmup1_tests;

import codingbat.janat.warmup1.Or35;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Or35_Test {

    Or35 or35 = new Or35();

    @DataProvider(name = "or_35")
    public Object[][] dpOr35(){
        return new Object[][]{
                {3, true},
                {10, true},
                {8, false},
                {15, true},
                {5, true},
        };
    }

    @Test(description = "Verify Or35 Function", dataProvider = "or_35")
    public void or35Test(int a, boolean exp){
        Assert.assertEquals(or35.or35(a), exp);
    }
}
