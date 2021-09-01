package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy (xpath = "//a[@class='dropdown-toggle']")
    public WebElement  logout1;

    @FindBy (xpath = "//a[@class='no-hash']")
    public WebElement logout2;

    @FindBy(xpath = "//div[contains(text(),\"Invalid\")]")
    public WebElement invalid;


    public void login(String userNameStr, String passwordStr) {
//        userName.clear(); //Joseph:I had add this
        userName.sendKeys(userNameStr);
//        password.clear(); //Joseph:I had add this
        password.sendKeys(passwordStr);
//        System.out.println(password.getAttribute("type").equals("password"));
        submit.click();
        // verification that we logged
    }

}
