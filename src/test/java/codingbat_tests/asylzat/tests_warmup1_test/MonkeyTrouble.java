package codingbat_tests.asylzat.tests_warmup1_test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTrouble {
        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            return aSmile == bSmile;
        }

        @DataProvider(name = "monkeyData")
        public Object[][] createData() {
            return new Object[][]{
                    {true, true, true},    // Оба улыбаются - проблемы
                    {false, false, true},  // Оба не улыбаются - проблемы
                    {true, false, false},  // Один улыбается, другой нет - нет проблем
                    {false, true, false}   // Один улыбается, другой нет - нет проблем
            };
        }

        @Test(dataProvider = "monkeyData")
        public void testMonkeyTrouble(boolean aSmile, boolean bSmile, boolean expected) {
            assert monkeyTrouble(aSmile, bSmile) == expected;
        }
    }


