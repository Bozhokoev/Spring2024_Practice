package codingbat_tests.jyldyzbek_string1_tests;

import codingbat.jyldyzbek.string1.HelloName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloNameTest {

    @Test
    public void testHelloName() {
        HelloName helloName = new HelloName();
        Assert.assertEquals(helloName.helloName("Bob"), "Hello Bob!");
        System.out.println("Тест 'Bob': Ожидается 'Hello Bob!', получено: " + helloName.helloName("Bob"));

        Assert.assertEquals(helloName.helloName("Alice"), "Hello Alice!");
        System.out.println("Тест 'Alice': Ожидается 'Hello Alice!', получено: " + helloName.helloName("Alice"));

        Assert.assertEquals(helloName.helloName("X"), "Hello X!");
        System.out.println("Тест 'X': Ожидается 'Hello X!', получено: " + helloName.helloName("X"));

        Assert.assertEquals(helloName.helloName("Dolly"), "Hello Dolly!");
        System.out.println("Тест 'Dolly': Ожидается 'Hello Dolly!', получено: " + helloName.helloName("Dolly"));

        Assert.assertEquals(helloName.helloName("Alpha"), "Hello Alpha!");
        System.out.println("Тест 'Alpha': Ожидается 'Hello Alpha!', получено: " + helloName.helloName("Alpha"));

        Assert.assertEquals(helloName.helloName("Omega"), "Hello Omega!");
        System.out.println("Тест 'Omega': Ожидается 'Hello Omega!', получено: " + helloName.helloName("Omega"));

        Assert.assertEquals(helloName.helloName("Goodbye"), "Hello Goodbye!");
        System.out.println("Тест 'Goodbye': Ожидается 'Hello Goodbye!', получено: " + helloName.helloName("Goodbye"));

        Assert.assertEquals(helloName.helloName("ho ho ho"), "Hello ho ho ho!");
        System.out.println("Тест 'ho ho ho': Ожидается 'Hello ho ho ho!', получено: " + helloName.helloName("ho ho ho"));

        Assert.assertEquals(helloName.helloName("xyz!"), "Hello xyz!!");
        System.out.println("Тест 'xyz!': Ожидается 'Hello xyz!!', получено: " + helloName.helloName("xyz!"));

        Assert.assertEquals(helloName.helloName("Hello"), "Hello Hello!");
        System.out.println("Тест 'Hello': Ожидается 'Hello Hello!', получено: " + helloName.helloName("Hello"));
    }
}
