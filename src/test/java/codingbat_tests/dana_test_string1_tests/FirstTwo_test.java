package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwo_test {

    FirstTwo firstTwo = new FirstTwo();

    @DataProvider(name = "firstTwo")
    public Object[][] dpFirstTwo(){
        return new Object[][]{
                {"Hello", "He"},
                {"abcdefg", "ab"},
                {"ab", "ab"},
                {"a", "a"},
                {"", ""},
                {"Kitten", "Ki"},
                {"hi", "hi"},
                {"hiya", "hi"}
        };
    }

    @Test(description = "Verify FirstTwo Functional", dataProvider = "firstTwo")
    public void firstTwo_test(String str, String res){
        Assert.assertEquals(firstTwo.firstTwo(str), res);
    }
}
