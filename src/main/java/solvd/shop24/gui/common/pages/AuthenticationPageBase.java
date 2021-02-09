package solvd.shop24.gui.common.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class AuthenticationPageBase extends AbstractPage {

    public AuthenticationPageBase(WebDriver driver) {
        super(driver);
        setPageURL("/personal/auth.php");
    }

    public abstract ProfilePageBase authentication(String phoneNumber, String password);

    public abstract void typePassword(String password);
    public abstract void typePhoneNumber(String phoneNumber);
}
