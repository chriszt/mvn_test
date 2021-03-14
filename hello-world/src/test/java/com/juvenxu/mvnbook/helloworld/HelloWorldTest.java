package com.juvenxu.mvnbook.helloworld;

import org.junit.*;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @BeforeClass
    public static void beforeClass () {
        System.out.println("beforeClass()");
    }

    @AfterClass
    public static void afterClass () {
        System.out.println("afterClass()");
    }

    @Before
    public void before () {
        System.out.println("before()");
    }

    @Test
    public void testSayHello () {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello Maven", result);
    }

    @Test
    public void testsayGoodBye () {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayGoodBye();
        assertEquals("GoodBye Maven", result);
    }

    @After
    public void after () {
        System.out.println("after()");
    }

}
