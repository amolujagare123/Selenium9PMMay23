package TestNGDemo.Demo1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassOne {

    @BeforeTest
    public void lavnya()
    {
        System.out.println("lavnya beforeMyTest2");
    }

    @AfterTest
    public void afterMyTest2()
    {
        System.out.println("afterMyTest2");
    }

    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }

    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }

    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
