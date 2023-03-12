package com.juaracoding.cucumber.stepdefinition;

import com.juaracoding.cucumber.page.LoginPage;
import com.juaracoding.cucumber.page.OrderPage;
import com.juaracoding.cucumber.util.Constants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestInvalidLogin {

    public static WebDriver driver;
    public static LoginPage loginPage = new LoginPage();

    public static OrderPage orderPage = new OrderPage();


    public TestInvalidLogin(){
        driver = Hooks.driver;
    }

    @When("User click button logout")
    public void User_click_button_logout(){
        System.out.println("User click button logout");

        //stepaction
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,-550)");
        orderPage.setCloseBanner();

        //stepaction logout
        orderPage.setBtnMyaccount();
        System.out.println("Direct to my account");

        //verify
        Assert.assertEquals(orderPage.getTxtPageMyAccount(),"MY ACCOUNT");
        js.executeScript("window, scroll(0,450)");

        //stepaction logout
        orderPage.setBtnLogout();
        System.out.println("Logout from shop demoqa");
        Hooks.delay(Constants.DETIK);

        //step verify Logout
        Assert.assertEquals(loginPage.getLoginTitle(),"LOGIN");
    }

    @And("User enter valid username")
    public void user_enter_valid_username(){
        System.out.println("User enter valid username");
        loginPage.inputUsername("riswanda22");
        Hooks.delay(Constants.DETIK);
    }

    @And("User enter invalid password")
    public void user_enter_invalid_password(){
        System.out.println("User enter invalid password");
        loginPage.inputPassword("ngasalajayaahh");
        Hooks.delay(Constants.DETIK);
    }

    @And("User click button login")
    public void user_click_button_login(){
        System.out.println("User click button login");
        loginPage.clickBtnLogin();
    }

    @Then("User get massage invalid login")
    public void user_get_massage_invalid_login(){
        System.out.println("User get massage invalid login");
        Assert.assertEquals(loginPage.getErrorLogin(),"ERROR: The username or password you entered is incorrect. Lost your password?");
    }

}
