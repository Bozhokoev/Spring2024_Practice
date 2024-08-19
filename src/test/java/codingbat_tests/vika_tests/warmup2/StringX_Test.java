package codingbat_tests.vika_tests.warmup2;

import codingbat.vika.warmup2.StringX;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StringX_Test {
    StringX stringX = new StringX();

    @DataProvider(name = "string_x")
    public Object[][] dpStringX() {
        return new Object[][] {
                {"xxHxix", "xHix"},
                {"abxxxcd", "abcd"},
                {"xKittenx", "xKittenx"},
                {"Hello", "Hello"},
                {"xx", "xx"}
        };
    }

    @Test(description = "Verify String XFunction", dataProvider = "string_x")
    public void stringXTest (String str, String exp) {
        Assert.assertEquals(stringX.stringX(str), exp);
    }
}
