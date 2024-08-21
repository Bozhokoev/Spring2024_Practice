package codingbat_tests.dana_test_string1_tests;

import codingbat.dana.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloName_test {

    HelloName helloName = new HelloName();

    @DataProvider(name = "helloName")
    public Object[][] dpHelloName(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"},
                {"Dolly", "Hello Dolly!"},
                {"Alpha", "Hello Alpha!"},
                {"Omega", "Hello Omega!"},
                {"ho ho ho", "Hello ho ho ho!"},
                {"xyz!", "Hello xyz!!"}
        };
    }

    @Test(description = "Verify HelloName Functional", dataProvider = "helloName")
    public void helloName_test(String str, String res){
        Assert.assertEquals(helloName.helloName(str), res);
    }
}
