package solvd.shop24;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import solvd.shop24.gui.common.pages.AuthenticationPageBase;
import solvd.shop24.gui.common.pages.HomePageBase;
import solvd.shop24.gui.common.pages.ProfilePageBase;

public class CrossPlatformTest extends AbstractTest implements IMobileUtils {

    @Test
    public void successAuthenticationTest() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.assertPageOpened();
        Assert.assertTrue(homePage.isPageOpened(), "Home page wasn't opened!");

        AuthenticationPageBase authenticationPage = homePage.navigateToAuthenticationPage();
        authenticationPage.assertPageOpened();

        ProfilePageBase profilePage = authenticationPage.authentication(R.TESTDATA.
                get("account.authPhoneNumber"), R.TESTDATA.get("account.password"));
        profilePage.assertPageOpened();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(profilePage.getName(), R.TESTDATA.get("account.name"), "Invalid name!");
        softAssert.assertEquals(profilePage.getEmail(), R.TESTDATA.get("account.email"), "Invalid email!");
        softAssert.assertEquals(profilePage.getPhoneNumber(), R.TESTDATA.get("account.phoneNumber"),
                "Invalid phone number!");
        softAssert.assertAll();
    }
}
