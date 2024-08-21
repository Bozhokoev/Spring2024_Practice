package codingbat_tests.asylzat.tests_warmup1_test;

import codingbat.asylzat.wapmup1.ParrotTrouble;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParrotTrouble_Test {
    ParrotTrouble parrotTrouble = new ParrotTrouble();
    @DataProvider(name = "parrotTestData")
    public Object[][] parrotTestData() {
        return new Object[][] {
                {true, 6, true},
                {true, 7, false},
                {true, 21, true},
                {true, 20, false},
                {false, 6, false},
                {false, 21, false},
        };
    }

    @Test(dataProvider = "parrotTestData")
    public void testParrot(boolean talking, int hour, boolean expected) {

        assertEquals(parrotTrouble.parrotTrouble(talking, hour), expected);
    }
}