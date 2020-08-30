package page;
import org.openqa.selenium.By;

public class AuthorizationForm extends BasePage {

    String pageURL = "https://idemo.bspb.ru/auth?response_type=code&client_id=1&redirect_uri=https%3A%2F%2Fidemo" +
            ".bspb.ru%2Flogin%2Fsuccess&prefetch_uri=https%3A%2F%2Fidemo" +
            ".bspb.ru%2Flogin%2Fprefetch&force_new_session=true";
    By username = By.xpath("//input[@placeholder='Логин']");
    By password = By.xpath("//input[@placeholder='Пароль']");
    By enter = By.className("btn btn-primary");

    public void open() {
        goTo(pageURL);


    }

    public void usernameEnter(String text) {
        fillInTheField(text, username);

    }

    public void passwordEnter(String text) {
        fillInTheField(text, password);
    }

    public void clickButtonEnter() {
        click(enter);
    }
}
