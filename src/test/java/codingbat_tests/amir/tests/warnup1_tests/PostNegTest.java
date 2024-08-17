package codingbat_tests.amir.tests.warnup1_tests;

import codingbat.amir.warmup1.PosNeg;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostNegTest {

    @DataProvider(name = "PostNegData")
    public Object[][] postNegData() {
        return new Object[][] {
                {1, -1, false, true},
                {-1, 1, false, true},
                {-4, -5, true, true},
                // Add more test cases if needed
        };
    }

    @Test(dataProvider = "PostNegData")
    public void testPostNeg(int a, int b, boolean negative, boolean expected) {
        // Assume that the method you want to test is in another class, e.g., `SomeClass`
        PosNeg someClass = new PosNeg();
        boolean result = someClass.posNeg(a, b, negative);
        assert result == expected : "Expected " + expected + " but got " + result;
    }
}
