package Steps;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {
    @Before
    public static void preConditions(){
        openBrowserAndLaunchApplication();
    }


    @After
    public static void postConditions(){

        // take screenshot
         closeBrowser();
    }
}
