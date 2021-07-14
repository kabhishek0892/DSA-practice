package selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGTest {

   @BeforeTest
    public void launchBrowser(){
        System.out.println("Before Test");
    }
    @Test(groups = {"sanity"})
    public void test3(){
        System.out.println(" No Priorty Test");
    }
   // @Test(priority = 0,groups = {"sanity","smoke"},dependsOnGroups = {"sanity"})
  //  public void test1(){
    //    System.out.println("Test - priority 0");
    //}

    @Test(enabled = false,invocationCount=2)
    public void test(){
        System.out.println("Test");
    }


    @Test(threadPoolSize = 3,invocationCount = 10,timeOut = 1000 ,successPercentage = 50) //the method will be run a total of 10 times using 3 threads
    public void testa(){
        System.out.println("Test threadpool size");
    }

    @Test(priority = -1)
    public void netest1(){
        System.out.println("Test - priority -1");
    }
    @Test(priority = -1)
    @Parameters("param")
    public void netest11(String paramValue){
        System.out.println("Test - priority -1 again");
        System.out.println("Value of parameter is "+paramValue);
    }

    @DataProvider(name="provider")
    public Object[][] dataProvider(){
       return new Object[][]
               { {"Abhishek","Kumar","Gaya",123},{"Abhishek","Prasad","Patna",456}};
       }
    @Test(dataProvider = "provider")
    public void usingDatProvider(String fname,String lname,String city,int mob){
        System.out.println(fname +" "+ lname + city+ mob);
    }

   @BeforeClass
   public void method1(){
       System.out.println("method1");
   }

    @BeforeTest
    public void method2(){
        System.out.println("method2");
    }

    @Test
    public void method3(){
        System.out.println("method3");
    }

    @BeforeSuite
    public void method4(){
        System.out.println("method4");
    }

    @BeforeMethod
    public void method5(){
        System.out.println("method5");
    }

    @Test(alwaysRun = true,enabled = true)
    void softAssertionTest()
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.fail();
        System.out.println("Failing");
        softAssert.assertEquals(2,4);
        System.out.println("Moving ahead after failure in soft assert");
        softAssert.assertAll("Final Result");
    }

    }

