package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleCostPage extends BasePage{

    @FindBy(xpath = "//a[@title='Create Vehicle Costs']")
    public WebElement createCostButton;
}
