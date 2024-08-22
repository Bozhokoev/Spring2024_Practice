package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwo_Test {
    FirstTwo firstTwo = new FirstTwo();

    @DataProvider(name = "first_two")
    public Object[][] dpFirstTwo(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
        };
    }
    @Test(description = "Verify First_Two Function", dataProvider = "first_two")
    public void firstTwoTest(String str, String exp){
        Assert.assertEquals(firstTwo.firstTwo(str), exp);
    }
}
