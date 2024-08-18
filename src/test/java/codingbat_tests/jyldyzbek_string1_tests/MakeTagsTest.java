package codingbat_tests.jyldyzbek_string1_tests;

import codingbat.jyldyzbek.string1.MakeTags;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeTagsTest {

    @Test
    public void testMakeTags() {
        MakeTags makeTagsInstance = new MakeTags();

        Assert.assertEquals(makeTagsInstance.makeTags("i", "Yay"), "<i>Yay</i>");
        System.out.println("Тест 'i', 'Yay': Ожидается '<i>Yay</i>', получено: " + makeTagsInstance.makeTags("i", "Yay"));

        Assert.assertEquals(makeTagsInstance.makeTags("i", "Hello"), "<i>Hello</i>");
        System.out.println("Тест 'i', 'Hello': Ожидается '<i>Hello</i>', получено: " + makeTagsInstance.makeTags("i", "Hello"));

        Assert.assertEquals(makeTagsInstance.makeTags("cite", "Yay"), "<cite>Yay</cite>");
        System.out.println("Тест 'cite', 'Yay': Ожидается '<cite>Yay</cite>', получено: " + makeTagsInstance.makeTags("cite", "Yay"));

        Assert.assertEquals(makeTagsInstance.makeTags("address", "here"), "<address>here</address>");
        System.out.println("Тест 'address', 'here': Ожидается '<address>here</address>', получено: " + makeTagsInstance.makeTags("address", "here"));

        Assert.assertEquals(makeTagsInstance.makeTags("body", "Heart"), "<body>Heart</body>");
        System.out.println("Тест 'body', 'Heart': Ожидается '<body>Heart</body>', получено: " + makeTagsInstance.makeTags("body", "Heart"));

        Assert.assertEquals(makeTagsInstance.makeTags("i", "i"), "<i>i</i>");
        System.out.println("Тест 'i', 'i': Ожидается '<i>i</i>', получено: " + makeTagsInstance.makeTags("i", "i"));

        Assert.assertEquals(makeTagsInstance.makeTags("i", ""), "<i></i>");
        System.out.println("Тест 'i', '': Ожидается '<i></i>', получено: " + makeTagsInstance.makeTags("i", ""));
    }
}
