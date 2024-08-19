package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.elbrus.warmup2.CountXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountXX_Test {

    CountXX countXX = new CountXX();
    @DataProvider (name = "CountXX")
    public Object [][] dpCountXX(){
        return new Object[][]{
                {"abcxx",1},
                {"xxxx",3},
                {"",0},
        };
    }

    @Test(description = "Verify CountXX function", dataProvider = "CountXX")
    public void countXXTest(String str,int x){
        Assert.assertEquals(countXX.countXX(str),x);
    }
}
