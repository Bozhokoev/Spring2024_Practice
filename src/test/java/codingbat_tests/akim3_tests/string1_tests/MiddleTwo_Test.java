package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwo_Test {
    MiddleTwo middleTwo = new MiddleTwo();

    @DataProvider(name = "middle_two")
    public Object[][] dpMiddleTwo(){
        return new Object[][]{
                {"string", "ri"},
                {"Practice", "ct"},
                {"0123456789", "45"}
        };
    }

    @Test(description = "Verify middleTwo function", dataProvider = "middle_two")
    public void middleTwoTest(String str, String expected){
        Assert.assertEquals(middleTwo.middleTwo(str), expected);
    }
}
