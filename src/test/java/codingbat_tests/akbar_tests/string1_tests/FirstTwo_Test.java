package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.FirstTwo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTwo_Test {
    FirstTwo firstTwo = new FirstTwo();

    @DataProvider(name = "firstTwo")
    public Object[][] dpFirstTwo(){
        return new Object[][]{
                {"Hello","He"},
                {"abcdefg","ab"},
                {"", ""},
                {"hiya","hi"},
        };
    }

    @Test(description = "Verify firstTwo function",dataProvider = "firstTwo")
    public void firstTwo (String s, String exp){
        Assert.assertEquals(firstTwo.firstTwo(s),exp);
    }
}
