package com.americanas.pages;


import net.serenitybdd.core.pages.PageObject;

public class RegisterPage  extends PageObject {

    private static final String REGISTER_TITLE = "//*[@id=\"root\"]//span[contains(text(),'Cadastre-se')]";

    //FORM
    private static final String EMAIL = "//*[@id=\"email-input\"]";
    private static final String PASSWORD = "//*[@id=\"password-input\"]";
    private static final String CPF = "//*[@id=\"cpf-input\"]";
    private static final String FULL_NAME= "//*[@id=\"name-input\"]";
    private static final String BIRTH_DATE= "//*[@id=\"birthday-input\"]";
    private static final String GENDER_M ="//*[@id=\"gender\"]/div[1]/label";
    private static final String GENDER_F ="//*[@id=\"gender\"]/div[2]/label";
    private static final String PHONE = "//*[@id=\"phone-input\"]";
    private static final String CREATE_REGISTER_BUTTON= "//*[@id=\"root\"]/div/div[2]/form/button";


    public RegisterPage addRegisterInformation(String email, String password, String cpf, String full_name,
                                               String birth_date,String gender,String phone) {

        waitFor(REGISTER_TITLE);
        waitFor(EMAIL).$(EMAIL).type(email);
        waitFor(PASSWORD).$(PASSWORD).type(password);
        waitFor(CPF).$(CPF).type(cpf);
        waitFor(FULL_NAME).$(FULL_NAME).type(full_name);
        waitFor(BIRTH_DATE).$(BIRTH_DATE).type(birth_date);

        switch (gender){
            case "Male":
                $(GENDER_M).click();
                return this.switchToPage(RegisterPage.class);
            case "Female":
                $(GENDER_F).click();
                return this.switchToPage(RegisterPage.class);

            default:
                break;
        }
        waitFor(PHONE).$(PHONE).type(phone);
        return null;
    }

    /**
     * Saving register information
     *
     * @return
     */
    public HomePage clickSaveRegisterInformation(){
        waitFor(CREATE_REGISTER_BUTTON).$(CREATE_REGISTER_BUTTON).click();

        return this.switchToPage(HomePage.class);
    }

}
