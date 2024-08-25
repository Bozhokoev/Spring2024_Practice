package codingbat_tests.zarina3_tests.string1_tests;

import codingbat.zarina3.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HelloName_Test {
    HelloName helloName = new HelloName();

    @DataProvider(name = "HelloName")
    public Object[][] dpHelloName(){
        return new Object[][]{
                {"Bob", "Hello Bob!"},
                {"X", "Hello X!"},
                {"Hello", "Hello Hello!"},
                {"Omega", "Hello Omega!"},
        };
    }

    @Test(description = "Verify HelloName Test",dataProvider = "HelloName")
    public void hellonameTest(String str, String res){
        Assert.assertEquals(helloName.helloName(str),res);
    }
}
