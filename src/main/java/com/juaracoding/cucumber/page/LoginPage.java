package com.juaracoding.cucumber.page;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='primary']//li[1]")
    WebElement txtInvalidLogin;

    @FindBy(xpath = "//*[@id='customer_login']/div[1]/h2")
    WebElement txtTitleLogin;

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//*[@id='customer_login']/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "//*[@id='post-8']/div/div/div/p[1]/strong[1]")
    WebElement txtAkunName;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtMyaccount;

    public String getErrorLogin(){
        return this.txtInvalidLogin.getText();
    }

    public String getTxtMyAccount(){
        return txtMyaccount.getText();
    }

    public String getAkunName(){
        return txtAkunName.getText();
    }

    public void login (String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }

    public String getLoginTitle(){
       return txtTitleLogin.getText();
    }

    public void inputUsername(String username){
        this.username.sendKeys(username);
    }
    public void inputPassword(String password){
        this.password.sendKeys(password);
    }
}
