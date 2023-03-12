package com.juaracoding.cucumber.page;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    private WebDriver driver;

    public OrderPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='woocommerce-thankyou-order-received']")
    WebElement txtSuccesOrder;

    @FindBy(xpath = "//button[@id='place_order']")
    WebElement btnPlaceOrder;
    @FindBy(xpath = "//input[@id='terms']")
    WebElement clickAgreement;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement inputPhoneNumber;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement inputPostCode;

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement defaultProvince;
    @FindBy(xpath = "//span[@id='select2-billing_state-container']")
    WebElement addProvince;

    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement inputCity;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement inputStreet;

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement defaultCountry;
    @FindBy(xpath = "//span[@id='select2-billing_country-container']")
    WebElement addCountry;

    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement inputCompany;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement inputLastName;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement inputFirstName;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
    WebElement btnCheckout;
    @FindBy(linkText = "ToolsQA Demo Site")
    WebElement btnLinkToHome;

    @FindBy(xpath = "//*[@id='noo-site']/div[2]/div[3]/div/div[2]/div/div/div/div[1]/h3/span")
    WebElement txtJudulMenu;

    @FindBy(xpath = "//*[@id='product-1497']/div[1]/div[2]/h1")
    WebElement txtNamaBaju;

    @FindBy(xpath = "//*[@id='noo-site']/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/h3")
    WebElement btnPilihBaju;

    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement addColor;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement addSize;

    @FindBy(xpath = "//*[@id='product-1497']/div[1]/div[2]/form/div/div[2]/button")
    WebElement btnFixOrder;

    @FindBy(className = "woocommerce-message")
    WebElement txtPesanBerhasilMasukKeranjang;

    @FindBy(className = "cart-button")
    WebElement btnCart;

    @FindBy(className = "page-title")
    WebElement txtCart;

    @FindBy(linkText = "My Account")
    WebElement btnMyaccount;

    @FindBy(linkText = "Logout")
    WebElement btnLogout;

    @FindBy(xpath = "//h1[@class='page-title']")
    WebElement txtMyaccount;

    @FindBy(linkText = "Dismiss")
    WebElement btnDismisBanner;

    public String getMessageSuccesOrder(){
        return txtSuccesOrder.getText();
    }

    public void setBtnPlaceOrder(){
        btnPlaceOrder.click();
    }

    public void setClickAgreement(){
        clickAgreement.click();
    }
    public void setInputPhoneNumber(String phoneNumber){
        this.inputPhoneNumber.sendKeys(phoneNumber);
    }
    public void inputPostCode(String postCode){
        this.inputPostCode.sendKeys(postCode);
    }
    public void setAddProvince(String province){
        addProvince.click();
        this.defaultProvince.clear();
        this.defaultProvince.sendKeys(province);

    }
    public void inputCity(String city){
        this.inputCity.sendKeys(city);
    }
    public void inputStreetAddres(String addres){
        this.inputStreet.sendKeys(addres);
    }

    public void setAddCountry(String country){
        addCountry.click();
        this.defaultCountry.clear();
        this.defaultCountry.sendKeys(country);

    }
    public void setInputCompany(String companyName){
        this.inputCompany.sendKeys(companyName);
    }

    public void inputFirstNameAndLastName(String firstName, String lastName){
        this.inputFirstName.sendKeys(firstName);
        this.inputLastName.sendKeys(lastName);
    }

    public void clickButtonCheckout(){
        btnCheckout.click();
    }

    public void setCloseBanner(){
        btnDismisBanner.click();
    }

    public String getTxtPageMyAccount(){
        return txtMyaccount.getText();
    }
    public void setBtnMyaccount(){
        btnMyaccount.click();
    }

    public void  setBtnLogout(){
        btnLogout.click();
    }

    public String getTxtChart(){
        return txtCart.getText();
    }

    public void clickBtnCart(){
        btnCart.click();
    }

    public void addDataBaju(){
        addColor.sendKeys("pink");
        addSize.sendKeys("37");
    }

    public String pesanMasukKeranjang(){
        return txtPesanBerhasilMasukKeranjang.getText();
    }

    public void clickFixOrder(){
        btnFixOrder.click();
    }
//    public String getTxtSizeBaju(){
//        return txtSize.getText();
//    }

//    public String getSizeBaju(){
//        Select select2 = new Select(txtSize);
//        select2.selectByIndex(2);
//        return txtSize.getText();
//    }

//    public String getTxtColorBaju(){
//        return txtColor.getText();
//    }

//    public String getColorBaju(){
//        Select select = new Select(txtColor);
//        select.selectByIndex(1);
//        return txtColor.getText();
//    }

    public void clickBaju(){
        btnPilihBaju.click();
    }

    public String getNamaBaju(){
        return txtNamaBaju.getText();
    }

    public String getJudul(){
        return txtJudulMenu.getText();
    }


    public void clickToHome(){
        btnLinkToHome.click();
    }
}
