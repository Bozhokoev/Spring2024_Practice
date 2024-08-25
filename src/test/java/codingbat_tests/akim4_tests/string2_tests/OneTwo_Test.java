package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.OneTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OneTwo_Test {
    OneTwo oneTwo = new OneTwo();

    @DataProvider(name = "one_two")
    public Object[][] dpOneTwo(){
        return new Object[][]{
                {"abc", "bca"},
                {"1234567890", "231564897"},
                {"xabxabxabxabxabxabxab", "abxabxabxabxabxabxabx"},
                {"abcdefxyz", "bcaefdyzx"},
                {"xy", ""}
        };
    }

    @Test(description = "Verify one two function", dataProvider = "one_two")
    public void oneTwoTest(String str, String expected){
        Assert.assertEquals(oneTwo.oneTwo(str), expected);
    }
}
