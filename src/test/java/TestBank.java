import org.testng.annotations.Test;
import page.AuthorizationForm;

public class TestBank {
    AuthorizationForm authorizationForm;


    @Test
    public void positiveAuthorizationTest(){
        authorizationForm.open();
        authorizationForm.usernameEnter("demo");
        authorizationForm.passwordEnter("demo");
        authorizationForm.clickButtonEnter();

    }


//    @BeforeMethod
//    public void prologue() {
//        authorizationForm.open();
//    }
//
//    @AfterMethod
//    public void ending() {
//        DriverSingleton.quit();
//    }
//
//    @Test
//    public void positiveAuthorizationTest() {
//        authorizationForm.usernameEnter("demo");
//        authorizationForm.passwordEnter("demo");
//        authorizationForm.clickButtonEnter();
//
//    }


}
