package codingbat_tests.akim4_tests.string2_tests;

import codingbat.akim4.string2.RepeatFront;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RepeatFront_Test {
    RepeatFront repeatFront = new RepeatFront();

    @DataProvider(name = "repeat_front")
    public Object[][] dpRepeatFront(){
        return new Object[][]{
                {"Chocolate", 4, "ChocChoChC"},
                {"Ice Cream", 2, "IcI"},
                {"Ice Cream", 0, ""},
                {"Java", 4, "JavaJavJaJ"}
        };
    }

    @Test(description = "Verify repeat front function", dataProvider = "repeat_front")
    public void repeatFrontTest(String str, int index, String expected){
        Assert.assertEquals(repeatFront.repeatFront(str, index), expected);
    }
}
