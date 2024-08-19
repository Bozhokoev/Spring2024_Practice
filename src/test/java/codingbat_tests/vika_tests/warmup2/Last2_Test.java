package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.Last2;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Last2_Test {
    Last2 last2 = new Last2();

    @DataProvider(name = "last_2")
    public Object[][] dpLast2() {
        return new Object[][] {
                {"hixxhi", 1},
                {"xaxaxaxx", 0},
                {"xxxx", 2},
                {"13121312", 1},
                {"hi", 0}
        };
    }

    @Test(description = "Verify Last 2 Function", dataProvider = "last_2")
    public void last2Test (String str, int exp) {
        Assert.assertEquals(last2.last2(str), exp);
    }
}
