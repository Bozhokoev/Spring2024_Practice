package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.WithoutX2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutX2_Test {

    WithoutX2 withoutX2 = new WithoutX2();
    @DataProvider(name = "WithoutX2")
    public Object[][] dpWithoutX2(){
        return new Object[][]{
                {"xHi","Hi"},
                {"xx",""},
                {"Hi","Hi"},
        };
    }
    @Test(description = "Verify WithoutX2 Test",dataProvider = "WithoutX2")
    public void withoutX2Test(String str, String res){
        Assert.assertEquals(withoutX2.withoutX2(str),res);
    }

}
