package codingbat_tests.zarina2_tests.warmup2_tests;

import codingbat.zarina2_warmup2.CountXX;
import codingbat.zarina2_warmup2.DoubleXX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DoubleXX_Test {
DoubleXX doubleXX = new DoubleXX();

@DataProvider (name = "DoubleXX")
    public Object [][] dpDoubleXX(){
    return new Object[][]{
            {"axxbb", true},
            {"xxxxx", true},
            {"xx", true},
            {"xaxx", false},
    };
}
@Test (description = "Verify DoubleXX function",dataProvider = "DoubleXX")
    public void doubleXXTest(String str,boolean res){
    Assert.assertEquals(doubleXX.doubleX(str),res);
}

}
