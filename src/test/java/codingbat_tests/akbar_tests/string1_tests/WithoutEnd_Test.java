package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd_Test {
    WithoutEnd withoutEnd = new WithoutEnd();

    @DataProvider(name = "withoutEnd")
    public Object[][] dpWithoutEnd() {
        return new Object[][]{
                {"Hello", "ell"},
                {"ab", ""},
                {"kitten", "itte"},
                {"woohoo", "ooho"},
        };
    }

    @Test(description = "Verify withOutEnd function",dataProvider = "withoutEnd")
    public void withOutEndTest(String s,String exp){
        Assert.assertEquals(withoutEnd.withoutEnd(s),exp);
    }
}
