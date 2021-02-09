package solvd.shop24.gui.android.pages;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import org.openqa.selenium.WebDriver;
import solvd.shop24.gui.common.pages.HomePageBase;
import solvd.shop24.gui.desktop.constants.LocatorConstants;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class AndroidHomePage extends HomePageBase implements IMobileUtils {

    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public AndroidAuthenticationPage navigateToAuthenticationPage() {
        findExtendedWebElement(LocatorConstants.LOGIN_LINK).click();
        return new AndroidAuthenticationPage(this.driver);
    }
}
