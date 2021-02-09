package solvd.shop24.gui.android.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import io.appium.java_client.MobileElement;
import javassist.compiler.ast.Keyword;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import solvd.shop24.gui.common.pages.AuthenticationPageBase;

import javax.swing.*;
import java.security.Key;
import java.util.concurrent.TimeUnit;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AuthenticationPageBase.class)
public class AndroidAuthenticationPage extends AuthenticationPageBase implements IMobileUtils {

    @FindBy(xpath = "//input[@type='submit']")
    protected ExtendedWebElement submitButton;

    @FindBy(xpath = "//input[@type='tel']")
    protected ExtendedWebElement phoneNumberField;

    @FindBy(xpath = "//input[@type='password']")
    protected ExtendedWebElement passField;

    public AndroidAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AndroidProfilePage authentication(String phoneNumber, String password) {
        typePhoneNumber(phoneNumber);
        typePassword(password);
        submitButton.click();
        return new AndroidProfilePage(this.driver);
    }

    @Override
    public void typePassword(String pass) {
        passField.type(pass);
        hideKeyboard();
    }

    @Override
    public void typePhoneNumber(String phoneNumber) {
        //phoneNumberField.type(phoneNumber);
        for (char ch: phoneNumber.toCharArray()) {
            phoneNumberField.getElement().sendKeys(String.valueOf(ch));
        }
        hideKeyboard();
    }
}
