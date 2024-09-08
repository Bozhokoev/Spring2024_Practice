package codingbat_tests.amir.tests.string1;

import codingbat.amir.string1.Without2;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Without2Test {

    @DataProvider(name = "Without2Data")
    public Object [][] without2Data(){
        return new Object[][] {
                {"HelloHe", "lloHe"},
                {"HelloHi", "HelloHi"},
                {"Hi", ""}
        };
    }
    @Test(dataProvider = "Without2Data")
    public void without2Test(String str, String expected) {
        Without2 without2 = new Without2();
        String result = without2.without2(str);
        assertEquals(result, expected);
    }
}
