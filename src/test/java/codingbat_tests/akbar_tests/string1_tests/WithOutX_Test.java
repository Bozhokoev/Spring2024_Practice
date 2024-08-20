package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.WithOutX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithOutX_Test {
    WithOutX withOutX = new WithOutX();

    @DataProvider(name = "withOutX")
    public Object[][] dpWithOutX(){
        return new Object[][]{
                {"xHix","Hi"},
                {"Hxix","Hxi"},
                {"Hi","Hi"},
                {"x",""},
                {"",""},
        };
    }

    @Test(description = "Verify WithOutX function",dataProvider = "withOutX")
    public void withOutX(String str,String exp){
        Assert.assertEquals(withOutX.withoutX(str),exp);
    }
}
