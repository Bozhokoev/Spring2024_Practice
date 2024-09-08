package codingbat_tests.amir.tests.string1;

import codingbat.dana.string1.ExtraFront;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ExtraFrontTest {

    @DataProvider(name = "ExtraFrontData")
    public Object [] [] extraFront() {
        return new Object[][]{
                {"Hello", "HeHeHe"},
                {"ab", "ababab"},
                {"H", "HHH"}
        };
    }
    @Test(dataProvider = "ExtraFrontData")
    public void extraFrontTest(String str, String expected) {
        ExtraFront extraFront = new ExtraFront();
        String result = extraFront.extraFront(str);
        assertEquals(result, expected);
    }
}
