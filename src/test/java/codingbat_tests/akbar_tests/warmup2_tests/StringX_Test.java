package codingbat_tests.akbar_tests.warmup2_tests;

import codingbat.akbar.warmup2.StringX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringX_Test {
    StringX stringX = new StringX();

    @DataProvider(name = "stringX")
    public Object[][] dpStringX(){
        return new Object[][]{
                {"xxHxix","xHix"},
                {"",""},
                {"x","x"},
                {"Hello","Hello"},
        };
    }

    @Test(description = "Verify StringX function", dataProvider = "stringX")
    public void stringXTest(String s, String exp){
        Assert.assertEquals(stringX.stringX(s),exp);
    }
}
