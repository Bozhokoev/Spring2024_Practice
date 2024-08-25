package codingbat_tests.akbar_tests.string1_tests;

import codingbat.akbar.string1.Concat;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Concat_Test {
    Concat concat = new Concat();

    @DataProvider(name = "concat")
    public Object[][] dpConcat(){
        return new Object[][]{
                {"abc", "cat","abcat"},
                {"pig", "doggy", "pigdoggy"},
                {"", "cat","cat"},
                {"abc", "","abc"},
        };
    }

    @Test(description = "Verify Concat function",dataProvider = "concat")
    public void concatTest(String a, String b, String exp){
        Assert.assertEquals(concat.conCat(a,b),exp);
    }
}
