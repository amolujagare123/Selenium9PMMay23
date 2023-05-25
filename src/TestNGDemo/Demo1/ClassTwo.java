package TestNGDemo.Demo1;

import org.testng.annotations.*;

public class ClassTwo {


    @BeforeTest
    public void vanita()
    {
        System.out.println("vanita beforeMyTest1");
    }

    @AfterTest
    public void afterMyTest1()
    {
        System.out.println("afterMyTest1");
    }




    @BeforeMethod
    public void beforeMyMethod()
    {
        System.out.println("beforeMyMethod");
    }

    @AfterMethod
    public void afterMyMethod()
    {
        System.out.println("afterMyMethod");
    }


    @BeforeClass
    public void beforeMyClass()
    {
        System.out.println("beforeMyClass");
    }

    @AfterClass
    public void afterMyClass()
    {
        System.out.println("afterMyClass");
    }



    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }

    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }

    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
