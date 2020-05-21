package com.americanas.pages;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("https://www.americanas.com.br")
public class HomePage extends PageObject {

    private static final String LOGO_HOME = "//a[@id='brd-link']//*[local-name()='svg'][1]/*[name()='title'][1]";
    private static final String LOGO_LOGIN = "//*[@id=\"h_usr-link\"]";
    private  static final String LINK_REGISTER = "//*[@id=\"h_user\"]/span[2]/div/a[2]";
    private static final String GREETING_MSG = "//*[@id=\"h_user\"]/span[1]/div";


    public HomePage navigateToHomePage() {

        open();
        waitFor(LOGO_HOME);

        waitFor(LOGO_LOGIN);

        withAction().moveToElement( $(LOGO_LOGIN) ).build().perform();

        waitFor(LINK_REGISTER).$(LINK_REGISTER).click();


        return this.switchToPage(HomePage.class);
    }

    public String getGreetingMessage() {

        return waitFor(GREETING_MSG).$(GREETING_MSG).getText();
    }
}
