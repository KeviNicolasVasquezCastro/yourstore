package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class loginPage {

    public static final Target MyAccount = Target.the("url de la pagina").locatedBy("//span[text()='My Account']");
    public static final Target login = Target.the("option login").locatedBy("//a[text()='Login']");
    public static final Target username = Target.the("username input").locatedBy("//input[@id='input-email']");
    public static final Target password = Target.the("password input").locatedBy("//input[@id='input-password']");
    public static final Target buttonLogin = Target.the("button login").locatedBy("//input[@value='Login']");
}
