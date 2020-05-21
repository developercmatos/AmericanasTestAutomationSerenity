package com.americanas.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webelements.Checkbox;

public class RegisterPage  extends PageObject {

    private static final String REGISTER_TITLE = "//*[@id=\"root\"]//span[contains(text(), 'Cadastre-se')]";

    //FORM
    private static final String EMAIL = "//*[@id=\"email-input\"]";
    private static final String PASSWORD = "//*[@id=\"password-input\"]";
    private static final String CPF = "//*[@id=\"cpf-input\"]";
    private static final String FULL_NAME= "//*[@id=\"name-input\"]";
    private static final String BIRTH_DATE= "//*[@id=\"birthday-input\"]";
    private static final String GENDER = "//*[@id=\"gender\"]";
    private static final String PHONE = "//*[@id=\"phone-input\"]";
    private static final String CREATE_REGISTER_BUTTON= "//*[@id=\"root\"]/div/div[2]/form/button";

    public RegisterPage addRegisterInformation(String email, String password, String cpf, String full_name,
                                               String birth_date, boolean gender,String phone) {

        waitForTextToAppear(REGISTER_TITLE);
        $(EMAIL).type(email);
        $(PASSWORD).type(password);
        $(CPF).type(cpf);
        $(FULL_NAME).type(full_name);
        $(BIRTH_DATE).type(birth_date);

        Checkbox myListCheckBox = new Checkbox( $(GENDER ) );

        myListCheckBox.setChecked(gender);

        $(PHONE).type(phone);

        return this;

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
