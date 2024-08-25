package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.WithOutEnd2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithOutEnd2_Test {
    WithOutEnd2 withOutEnd2 = new WithOutEnd2();

    @DataProvider(name = "withOutEnd2")
    public Object[][] dpWitchOutEnd2(){
        return new Object[][]{
                {"ab",""},
                {"Hello", "ell"},
                {"coldy","old"},
                {"java code","ava cod"},
        };
    }

    @Test(description = "Vefiry WithOutEnd2 function",dataProvider = "withOutEnd2")
    public void withOutEnd2Test(String s, String exp){
        Assert.assertEquals(withOutEnd2.withouEnd2(s),exp);
    }
}
