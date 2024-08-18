package codingbat_tests.jyldyzbek_string1_tests;

import codingbat.jyldyzbek.string1.MakeAbba;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MakeAbbaTest {

    @Test
    public void testMakeAbba() {
        MakeAbba makeAbbaInstance = new MakeAbba();

        Assert.assertEquals(makeAbbaInstance.makeAbba("Hi", "Bye"), "HiByeByeHi");
        System.out.println("Тест 'Hi', 'Bye': Ожидается 'HiByeByeHi', получено: " + makeAbbaInstance.makeAbba("Hi", "Bye"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("Yo", "Alice"), "YoAliceAliceYo");
        System.out.println("Тест 'Yo', 'Alice': Ожидается 'YoAliceAliceYo', получено: " + makeAbbaInstance.makeAbba("Yo", "Alice"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("What", "Up"), "WhatUpUpWhat");
        System.out.println("Тест 'What', 'Up': Ожидается 'WhatUpUpWhat', получено: " + makeAbbaInstance.makeAbba("What", "Up"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("aaa", "bbb"), "aaabbbbbbaaa");
        System.out.println("Тест 'aaa', 'bbb': Ожидается 'aaabbbbbbaaa', получено: " + makeAbbaInstance.makeAbba("aaa", "bbb"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("x", "y"), "xyyx");
        System.out.println("Тест 'x', 'y': Ожидается 'xyyx', получено: " + makeAbbaInstance.makeAbba("x", "y"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("x", ""), "xx");
        System.out.println("Тест 'x', '': Ожидается 'xx', получено: " + makeAbbaInstance.makeAbba("x", ""));

        Assert.assertEquals(makeAbbaInstance.makeAbba("", "y"), "yy");
        System.out.println("Тест '', 'y': Ожидается 'yy', получено: " + makeAbbaInstance.makeAbba("", "y"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("Bo", "Ya"), "BoYaYaBo");
        System.out.println("Тест 'Bo', 'Ya': Ожидается 'BoYaYaBo', получено: " + makeAbbaInstance.makeAbba("Bo", "Ya"));

        Assert.assertEquals(makeAbbaInstance.makeAbba("Ya", "Ya"), "YaYaYaYa");
        System.out.println("Тест 'Ya', 'Ya': Ожидается 'YaYaYaYa', получено: " + makeAbbaInstance.makeAbba("Ya", "Ya"));
    }
}
