package codingbat_tests.janat_test_string1_tests;

import codingbat.janat.string1.WithoutEnd;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WithoutEnd_Test {
    WithoutEnd withoutEnd = new WithoutEnd();

    @DataProvider(name = "without_end")
    public Object[][] dpWithoutEnd(){
        return new Object[][]{
                {"Hello", "ell"},
                {"java", "av"},
                {"coding", "odin"},
                {"code", "od"},
                {"ab", ""},
        };
    }
    @Test(description = "Verify Without_End Function", dataProvider = "without_end")
    public void withoutEndTest(String str, String exp){
        Assert.assertEquals(withoutEnd.withoutEnd(str), exp);
    }
}
