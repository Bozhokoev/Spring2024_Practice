package codingbat_tests.amir.tests.warnup1_tests;
import codingbat.amir.warmup1.NotString;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class NotStringTest {

    @DataProvider(name = "NotStringData")
    public Object [][] notString(){
        return new Object[][] {
                {"candy", "not candy"},
                {"x", "not x"},
                {"not bad", "not bad"}
        };
    }

    @Test(dataProvider = "NotStringData")
    public void notStringTest(String input, String expected) {
        NotString notString = new NotString();
        String result = notString.notString(input);
        assertEquals(result, expected);
    }
}
