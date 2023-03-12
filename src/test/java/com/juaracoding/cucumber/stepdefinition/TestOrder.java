package com.juaracoding.cucumber.stepdefinition;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import com.juaracoding.cucumber.page.OrderPage;
import com.juaracoding.cucumber.page.LoginPage;
import com.juaracoding.cucumber.util.Constants;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOrder {

    public static WebDriver driver;

    public LoginPage loginPage = new LoginPage();

    public OrderPage orderPage = new OrderPage();

    public TestOrder(){
        driver = Hooks.driver;
    }

    @When("User click button ToolsQa Demo Site")
    public void user_click_button_toolsqa_demo_site(){
        System.out.println("User click button ToolsQa Demo Site");
        //step action
        orderPage.clickToHome();
        System.out.println("Masuk ke Menu Utama");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,1000)");

    }

    @And("User go to Product Page")
    public void user_go_to_product_page(){
        //step verify
        Assert.assertEquals(orderPage.getJudul(), "FOR LADIES");
        System.out.println(orderPage.getJudul()+" dipilih");
    }

    @And("User click one product")
    public void user_click_one_product(){
        System.out.println("User click one product");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,550)");

        //step action
        orderPage.clickBaju();
        orderPage.addDataBaju();
        System.out.println("Baju yang dipilih : "+orderPage.getNamaBaju());

        //step verify
        Assert.assertEquals(orderPage.getNamaBaju(),"PINK DROP SHOULDER OVERSIZED T SHIRT");

    }

    @And("User adding product to cart")
    public void user_adding_product_to_cart(){
        System.out.println("User adding product to cart");

        //step action
        orderPage.clickFixOrder();
        System.out.println("Berhasil menambahkan ke keranjang");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,-500)");
        Hooks.delay(Constants.DETIK);

        //setelah berhasil dimasukan ke chart
        //step action
        Assert.assertTrue(orderPage.pesanMasukKeranjang().contains("added to your cart"));
    }

    @And("User see the product in the cart")
    public void user_see_the_product_in_the_cart(){
        System.out.println("User see the product in the cart");
        //stepAction
        orderPage.clickBtnCart();
        System.out.println("Cart Opened");
        System.out.println("Menu sekarang : "+orderPage.getTxtChart());

        //step verify
        Assert.assertEquals(orderPage.getTxtChart(),"CART");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,600)");
        Hooks.delay(Constants.DETIK);

    }

    @And("User click button checkout")
    public void user_click_button_checkout(){
        System.out.println("User click button checkout");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,250)");
        orderPage.clickButtonCheckout();
    }

    @And("User input first name and last name")
    public void user_input_first_name_and_last_name(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,700)");
        System.out.println("User input first name and last name");
        orderPage.inputFirstNameAndLastName("Riswanda","Hasan");
    }
    @And("User input company name")
    public void user_input_company_name(){
        System.out.println("User input company name");
        orderPage.setInputCompany("Juara Coding");

    }
    @And("User add country")
    public void user_add_country(){
        System.out.println("User add country");
        orderPage.setAddCountry("Indonesia");
    }

    @And("User input street addres")
    public void User_input_street_addres(){
        System.out.println("User input street addres");
        orderPage.inputStreetAddres("Sumur");
    }

    @And("User input town or city")
    public void user_input_town_or_city(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,250)");
        System.out.println("User input town or city");
        orderPage.inputCity("Garut");
    }

    @And("User input province")
    public void user_input_province(){
        System.out.println("User input province");
        orderPage.setAddProvince("Jawa Barat");
    }

    @And("User input postcode")
    public void user_input_postcode(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,250)");
        System.out.println("User input province");
        orderPage.inputPostCode("44152");
    }
    @And("User input phone")
    public void User_input_phone(){
        System.out.println("User input phone");
        orderPage.setInputPhoneNumber("0829029393");
    }

    @And("User click agreement")
    public void user_click_agreement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window,scroll(0,-50)");
        System.out.println("User click agreement");
        orderPage.setClickAgreement();
    }

    @And("User click button placeorder")
    public void user_click_button_placeorder(){
        System.out.println("User click button placeorder");
        orderPage.setBtnPlaceOrder();
    }

    @Then("User get message succes order")
    public void User_get_message_succes_order(){
        System.out.println("User get message succes order");
        orderPage.getMessageSuccesOrder();

        //step verify
        Assert.assertEquals(orderPage.getMessageSuccesOrder(),"Thank you. Your order has been received.");
    }


}
