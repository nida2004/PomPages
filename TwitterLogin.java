package com.cybertek.pages;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class TwitterLogin {
    public TwitterLogin(){ PageFactory.initElements(Driver.get(),this); }

    @FindBy(xpath = "//input[@name='session[username_or_email]']")
            //"//*[text()='Phone, email, or username']")
    public WebElement usernameInput;

    @FindBy(xpath ="//input[@name='session[password]']")
            //"//*[text()='Password']")session[password]
    public WebElement passwordInput;

    @FindBy(xpath = "(//*[text()='Log in'])[1]")
    public WebElement loginBtn;


    // following Webelements are belong to twitter main page

    @FindBy(id = "react-root")
    public WebElement newTweetButton;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div")
            //className = "public-DraftStyleDefault-block public-DraftStyleDefault-ltr")
    public WebElement tweetSendBox;

    @FindBy(xpath = "//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/div[2]/div[4]/div/div/div[2]/div[3]/div")
            //xpath = "//div/span/span[.='Tweet']")
    public WebElement tweetSendButton;


    public void login(String username,String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();


    }
    public void loginAsTwitterUser(){

        String username = ConfigurationReader.get("twitter_username");
        String password = ConfigurationReader.get("twitter_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }




}
