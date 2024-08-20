package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.FirstTwo;
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
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"}
        };
    }

    @Test(description = "Verify firstTwo function", dataProvider = "first_two")
    public void firstTwoTest(String str, String expected){
        Assert.assertEquals(firstTwo.firstTwo(str), expected);
    }
}
