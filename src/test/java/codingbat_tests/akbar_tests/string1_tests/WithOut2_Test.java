package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.WithOut2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithOut2_Test {
    WithOut2 withOut2 = new WithOut2();

    @DataProvider(name = "withOut2")
    public Object[][] dpWithOut2(){
        return new Object[][]{
                {"HelloHe","lloHe"},
                {"HelloHi","HelloHi"},
                {"Hi",""},
                {"",""},
        };
    }

    @Test(description = "Verify WithOut2 function",dataProvider = "withOut2")
    public void withOut2Test(String str,String exp){
        Assert.assertEquals(withOut2.without2(str),exp);
    }
}
