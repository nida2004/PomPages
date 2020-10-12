package com.cybertek.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateVehicleCostPage extends BasePage {
    @FindBy(css = ".btn.back.icons-holder-text ")
    public WebElement cancel;
    @FindBy(css = ".btn.btn-success.action-button")
    public WebElement saveAndClose;

    @FindBy(css = ".select2-choice.select2-default")
    public WebElement valueDropdown;

    @FindBy(id = "custom_entity_type_TotalPrice-uid-5f7a34c89f057")
    public WebElement totalPrice;

    @FindBy(css = ".ui-datepicker-current.ui-state-default.ui-priority-secondary.ui-corner-all")
    public WebElement dateTodayButton;

    @FindBy(id = "custom_entity_type_CostDescriptions-uid-5f7a34c89f22d")
    public WebElement costDescription;






}
