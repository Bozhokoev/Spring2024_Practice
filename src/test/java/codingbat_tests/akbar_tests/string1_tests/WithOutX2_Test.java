package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.WithOutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithOutX2_Test {
    WithOutX2 withOutX2 = new WithOutX2();

    @DataProvider(name = "withOutX2")
    public Object[][] dpWithOutX2 (){
        return new Object[][]{
                {"xHi","Hi"},
                {"Hxi","Hi"},
                {"xx",""},
                {"",""},
                {"xHxllo","Hxllo"},
        };
    }

    @Test(description = "Verify WithOutX2 function",dataProvider = "withOutX2")
        public void withOutX2Test(String s, String exp){
        Assert.assertEquals(withOutX2.withoutX2(s),exp);
    }
}
