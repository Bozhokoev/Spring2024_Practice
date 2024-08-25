package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.ExtraEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExtraEnd_Test {

    ExtraEnd extraEnd = new ExtraEnd();

    @DataProvider(name = "ExtraEnd")
    public Object[][] dpExtraEnd(){
        return new Object[][]{
                {"Hello", "lololo"},
                {"Hi", "HiHiHi"},
                {"Code", "dedede"},
        };
    }
    @Test(description = "Verify ExtraEnd Test",dataProvider = "ExtraEnd")
    public void extraEndTest(String str, String res){
        Assert.assertEquals(extraEnd.extraEnd(str),res);
    }
}
