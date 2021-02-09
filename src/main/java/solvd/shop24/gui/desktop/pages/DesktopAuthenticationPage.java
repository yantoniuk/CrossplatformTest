package solvd.shop24.gui.desktop.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import solvd.shop24.gui.common.pages.AuthenticationPageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = AuthenticationPageBase.class)
public class DesktopAuthenticationPage extends AuthenticationPageBase {

    @FindBy(id = "button03")
    protected ExtendedWebElement submitButton;

    @FindBy(name = "phone")
    protected ExtendedWebElement phoneNumberField;

    @FindBy(name = "USER_PASSWORD")
    protected ExtendedWebElement passField;

    public DesktopAuthenticationPage(WebDriver driver) {
        super(driver);
        setPageURL("/personal/auth.php");
    }

    @Override
    public void typePhoneNumber(String phoneNumber) {
        phoneNumberField.type(phoneNumber);;
    }

    @Override
    public void typePassword(String pass) {
        passField.type(pass);
    }

    @Override
    public DesktopProfilePage authentication(String phoneNumber, String pass) {
        typePhoneNumber(phoneNumber);
        typePassword(pass);
        submitButton.click();
        return new DesktopProfilePage(this.driver);
    }
}
