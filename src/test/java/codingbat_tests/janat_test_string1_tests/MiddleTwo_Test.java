package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.MiddleTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MiddleTwo_Test {
    MiddleTwo middleTwo = new MiddleTwo();

    @DataProvider(name = "middle_two")
    public Object[][] dpMiddleTwo(){
        return new Object[][]{
                {"string", "ri"},
                {"code", "od"},
                {"Practice", "ct"},
                {"ab", "ab"},
                {"0123456789", "45"},
        };
    }

    @Test(description = "Verify Middle_Two Function", dataProvider = "middle_two")
    public void middleTwoTest(String str, String exp){
        Assert.assertEquals(middleTwo.middleTwo(str), exp);
    }

}
