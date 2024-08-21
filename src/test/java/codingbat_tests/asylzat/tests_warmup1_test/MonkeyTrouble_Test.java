package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.MonkeyTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MonkeyTrouble_Test {
     MonkeyTrouble monkeyTrouble = new MonkeyTrouble();

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
            assert monkeyTrouble.monkeyTrouble(aSmile, bSmile) == expected;
        }
    }


