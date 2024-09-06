package codingbat_tests.tatev.warmup1_rests;

import codingbat.tatev.warmup1.SumDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumDoubleTest {
    @DataProvider(name = "SumDoubleData")
public Object[][] sumDoubleData() {
    return new Object[][]{
            {1, 3, 4},   // 1 + 3 = 4
            {2, 3, 5},   // 2 + 3 = 5
            {2, 2, 8}    // 2 * (2 + 2) = 8
    };
}

    @Test(dataProvider = "SumDoubleData")
    public void testSumDouble(int a, int b, int expected) {
        SumDouble sumDouble = new SumDouble();
        int result = sumDouble.sumDouble(a,b);
        assertEquals(result, expected, "SumDouble method failed for inputs: " + a + " and " + b);
    }
}

