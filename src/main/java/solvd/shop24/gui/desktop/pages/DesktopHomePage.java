package solvd.shop24.gui.desktop.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import solvd.shop24.gui.common.pages.HomePageBase;
import solvd.shop24.gui.desktop.constants.LocatorConstants;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class DesktopHomePage extends HomePageBase {

    public DesktopHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public DesktopAuthenticationPage navigateToAuthenticationPage() {
        findExtendedWebElement(LocatorConstants.LOGIN_LINK).click();
        return new DesktopAuthenticationPage(this.driver);
    }
}
