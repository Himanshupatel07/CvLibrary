package hook;

//Call two methods from DriverFactory class

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    //Object creation for calling method at the class level
    DriverFactory driverFactory=new DriverFactory();

    @Before
    public void openBrowser()
    {
        driverFactory.openUp();
    }

    @After
    public void tearDown()
    {
        driverFactory.close();
    }

    /*Cucumber support hook and before the step defination method will execute special block of the code
    driverFactory.openUp(); @Before Annotation executed And After the step defination method executed
    special block of the code driverFactory.close(); @After Annotation will execute this is the hook
     */
}
