package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.SumDouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumDouble_Test {
    SumDouble sumDouble = new SumDouble();
        @DataProvider(name = "sumDoubleDataProvider")
        public Object[][] sumDoubleDataProvider() {
            return new Object[][]{
                    {1, 2, 3},     // Пример, где a != b, возвращает a + b
                    {3, 3, 12},    // Пример, где a == b, возвращает (a + b) * 2
                    {0, 0, 0},     // Пример, где a == b и a + b == 0, возвращает 0
                    {-1, -1, -4},  // Пример, где a == b и a + b == -2, возвращает -4
                    {2, -2, 0},    // Пример, где a != b, возвращает 0
            };
        }
        @Test(dataProvider = "sumDoubleDataProvider")
        public void testSumDouble(int a, int b, int expectedSum) {
            assertEquals(sumDouble.sumDouble(a, b), expectedSum);
        }
    }
