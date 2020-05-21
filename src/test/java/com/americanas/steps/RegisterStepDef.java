package com.americanas.steps;

import com.americanas.pages.HomePage;
import com.americanas.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class RegisterStepDef {

     HomePage homePage;
     RegisterPage registerPage;

    @Given("^I navigate to the register page$")
    public void i_navigate_to_the_register_page() {

        homePage.navigateToHomePage();
    }

    @When("^I add all information , , , , , , $")
    public void i_add_all_information(String email, String password, String cpf, String full_name,String birth_date, boolean gender, String phone) {
        registerPage.addRegisterInformation(email,password,cpf,full_name,birth_date,true,phone);
    }

    @When("^save my information$")
    public void save_my_information() {

        registerPage.clickSaveRegisterInformation();
    }

    @Then("^I must be able to view the Home Page again$")
    public void i_must_be_able_to_view_the_Home_Page_again(String message) {
        String greetingMessage = homePage.getGreetingMessage();
        assertEquals(message, greetingMessage);


    }

}
