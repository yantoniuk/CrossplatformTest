package solvd.shop24.gui.desktop.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import solvd.shop24.gui.common.pages.AuthenticationPageBase;
import solvd.shop24.gui.common.pages.ProfilePageBase;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ProfilePageBase.class)
public class DesktopProfilePage extends ProfilePageBase {

    @FindBy(xpath = "//dt[text() = 'Имя:']/following::dd[1]")
    private ExtendedWebElement nameField;

    @FindBy(xpath = "//dt[text() = 'Мобильный телефон:']/following::dd[1]")
    private ExtendedWebElement phoneNumberField;

    @FindBy(xpath = "//dt[text() = 'E-mail:']/following::dd[1]")
    private ExtendedWebElement emailField;

    public DesktopProfilePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getName() {
        return nameField.getText();
    }

    @Override
    public String getEmail() {
        return emailField.getText();
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumberField.getText();
    }
}

