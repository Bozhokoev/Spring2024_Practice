package codingbat_tests.akim3_tests.string1_tests;

import codingbat.akim3.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloName_Tests {
    HelloName helloName = new HelloName();

    @DataProvider(name = "hello_name")
    public Object[][] dpHelloName(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"Alice", "Hello Alice!"},
                {"X", "Hello X!"}
        };
    }

    @Test(description = "Verify helloName function", dataProvider = "hello_name")
    public void helloNameTest(String str, String expected){
        Assert.assertEquals(helloName.helloName(str), expected);
    }
}
