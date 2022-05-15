package Class01Review;

import org.testng.annotations.*;

public class BasicAnnotations {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method");
    }
    @Test
    public void test1(){
        System.out.println("I am test 1");
    }
    @Test
    public  void test2(){
        System.out.println("I am a test2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("I am before after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("I am before test method");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("I am after test method");
    }

}
