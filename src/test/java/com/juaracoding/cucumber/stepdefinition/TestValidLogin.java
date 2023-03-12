package com.juaracoding.cucumber.stepdefinition;

import com.juaracoding.cucumber.page.LoginPage;
import com.juaracoding.cucumber.util.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestValidLogin {

    public static WebDriver driver;

    public LoginPage loginPage = new LoginPage();



    public TestValidLogin(){
        driver = Hooks.driver;
    }

    @Given("User open Browser and Url")
    public void user_open_browser_and_url(){
        System.out.println("User open Browser and Url");
        //stepaction
        driver.get(Constants.URL);

    }

    @When("User input valid username and password")
    public void user_input_valid_username_and_password(){
        System.out.println("User input valid username and password");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,450)");
        //step action
        loginPage.login("riswanda22","Ciwan220399");
    }

    @And("User click button Login")
    public void user_click_button_login(){
        System.out.println("User click button Login");

        //stepaction
        loginPage.clickBtnLogin();
        Hooks.delay(Constants.DETIK);
    }

    @Then("User go to page MyAccount")
    public void user_go_to_page_myaccount(){
        System.out.println("User go to page MyAccount");

        //step verify
        Assert.assertEquals(loginPage.getAkunName(),"riswanda22");
        System.out.println(loginPage.getAkunName()+" Berhasil Login");
    }

}
