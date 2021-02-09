package solvd.shop24.gui.common.pages;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class ProfilePageBase extends AbstractPage {

    public ProfilePageBase(WebDriver driver) {
        super(driver);
        setPageURL("/cabinet/settings/");
    }

    public abstract String getName();
    public abstract String getPhoneNumber();
    public abstract String getEmail();
}
