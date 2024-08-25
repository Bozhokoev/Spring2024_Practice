package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.BackAround;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BackAroundTest {

    @DataProvider(name = "BackAroundData")
    public Object [][] backAround() {
        return new Object[][]{
                {"cat", "tcatt"},
                {"Hello", "oHelloo"},
                {"a", "aaa"}
        };
    }

    @Test(dataProvider = "BackAroundData")
    public void testBackArount(String str, String except) {
        BackAround backAround = new BackAround();
        String result = backAround.backAround(str);
        assertEquals(result, except);
    }
}
