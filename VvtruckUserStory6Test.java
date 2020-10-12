package com.cybertek.tests.FreeWorkingTime;

import com.cybertek.pages.CreateVehicleCostPage;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.pages.VehicleCostPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Set;

public class VvtruckUserStory6Test extends TestBase {
@Test
    public void testCase1(){
    extentLogger=report.createTest("Vehicle Cost Page See");
    LoginPage loginPage=new LoginPage();

    extentLogger.info("Login the page as a Sales manager");
    loginPage.loginAsSalesManager();

    extentLogger.info("Go to Fleet menu-->Vehicle Cost");
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.navigateToModule("Fleet","Vehicle Costs");
    dashboardPage.waitUntilLoaderScreenDisappear();

    extentLogger.info("Verifying Vehicle Cost Page");
    String actualPageTitle=driver.getCurrentUrl();
    System.out.println(actualPageTitle);
    Assert.assertEquals(actualPageTitle,"https://qa3.vytrack.com/entity/Extend_Entity_VehicleCosts","Verifying Web Page title");


    extentLogger.pass("PASSED");
}
@Test
    public void testCase2() throws IOException, InterruptedException {

    /*

    1-Go to Fleet menu on the top menus.User should see Fleet menu options open otomaticlly.
	2-On the Fleet menu go down to Vehicle Cost and click it.User should able to click to Vehicle cost menu section.
	3.After clicking the option Vehicle Cost page open. User should see the Vehicle Cost Page.
	4.User hover over the mouse on the "Create Vehicle Cost" button and click it.
	5.in the "Create Vehicle Cost" page user fill out the data.
	6.after filling the data User hover over the mouse on the "Save and Close" button and click it.
	7.after clicking the button, should see  "Entity saved" message on the top of the page.

     */

    extentLogger=report.createTest("Create Vehicle Cost Page");
    LoginPage loginPage=new LoginPage();

    extentLogger.info("Login the page as a Sales manager");
    loginPage.loginAsSalesManager();

    extentLogger.info("Go to Fleet menu-->Vehicle Cost");
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.navigateToModule("Fleet","Vehicle Costs");
    dashboardPage.waitUntilLoaderScreenDisappear();

    extentLogger.info("User hover over the mouse on the Create Vehicle Cost button and click it.");
    VehicleCostPage vehicleCostPage=new VehicleCostPage();

    Thread.sleep(2000);
    vehicleCostPage.createCostButton.click();

    extentLogger.info("in the Create Vehicle Cost page filling out the data than click Save and Close button");
    CreateVehicleCostPage createVehicleCostPage=new CreateVehicleCostPage();
    createVehicleCostPage.totalPrice.sendKeys("300");
    createVehicleCostPage.costDescription.sendKeys("Repair cost");
    createVehicleCostPage.saveAndClose.click();
    Thread.sleep(3000);

}
@Test
    public void testCase3() throws InterruptedException {
    extentLogger=report.createTest("Create Vehicle Cost Page");
    LoginPage loginPage=new LoginPage();

    extentLogger.info("Login the page as a Sales manager");
    loginPage.loginAsSalesManager();

    extentLogger.info("Go to Fleet menu-->Vehicle Cost");
    DashboardPage dashboardPage=new DashboardPage();
    dashboardPage.navigateToModule("Fleet","Vehicle Costs");
    dashboardPage.waitUntilLoaderScreenDisappear();

    extentLogger.info("User hover over the mouse on the Create Vehicle Cost button and click it.");
    VehicleCostPage vehicleCostPage=new VehicleCostPage();

    Thread.sleep(2000);
    vehicleCostPage.createCostButton.click();

    extentLogger.info("in the Create Vehicle Cost page filling out the data than click Save and Close button");
    CreateVehicleCostPage createVehicleCostPage=new CreateVehicleCostPage();
    createVehicleCostPage.totalPrice.sendKeys("300");
    createVehicleCostPage.costDescription.sendKeys("Repair cost");
    createVehicleCostPage.cancel.click();
    Thread.sleep(3000);

}
@Test
public void testCase4() throws InterruptedException {
    extentLogger = report.createTest("Create Vehicle Cost Page");
    LoginPage loginPage = new LoginPage();

    extentLogger.info("Login the page as a Sales manager");
    loginPage.loginAsSalesManager();

    extentLogger.info("Go to Fleet menu-->Vehicle Cost");
    DashboardPage dashboardPage = new DashboardPage();
    dashboardPage.navigateToModule("Fleet", "Vehicle Costs");
    dashboardPage.waitUntilLoaderScreenDisappear();

    extentLogger.info("User hover over the mouse on the Create Vehicle Cost button and click it.");
    VehicleCostPage vehicleCostPage = new VehicleCostPage();

    Thread.sleep(2000);
    vehicleCostPage.createCostButton.click();

    extentLogger.info("in the Create Vehicle Cost page filling out the data than click Save and Close button");
    CreateVehicleCostPage createVehicleCostPage = new CreateVehicleCostPage();
    createVehicleCostPage.totalPrice.sendKeys("300");
    createVehicleCostPage.costDescription.sendKeys("Repair cost");
    createVehicleCostPage.saveAndClose.click();
    extentLogger.info("after saving data,hover over the mouse on the edit button and click it. ");
    dashboardPage.waitUntilLoaderScreenDisappear();
    createVehicleCostPage.editButton.click();
    Thread.sleep(3000);
}
@Test
public void testCase5() throws InterruptedException {
    extentLogger = report.createTest("Create Vehicle Cost Page");
    LoginPage loginPage = new LoginPage();

    extentLogger.info("Login the page as a Sales manager");
    loginPage.loginAsSalesManager();

    extentLogger.info("Go to Fleet menu-->Vehicle Cost");
    DashboardPage dashboardPage = new DashboardPage();
    dashboardPage.navigateToModule("Fleet", "Vehicle Costs");
    dashboardPage.waitUntilLoaderScreenDisappear();

    extentLogger.info("User hover over the mouse on the Create Vehicle Cost button and click it.");
    VehicleCostPage vehicleCostPage = new VehicleCostPage();

    Thread.sleep(2000);
    vehicleCostPage.createCostButton.click();

    extentLogger.info("in the Create Vehicle Cost page filling out the data than click Save and Close button");
    CreateVehicleCostPage createVehicleCostPage = new CreateVehicleCostPage();
    createVehicleCostPage.totalPrice.sendKeys("300");
    createVehicleCostPage.costDescription.sendKeys("Repair cost");
    createVehicleCostPage.saveAndClose.click();
    dashboardPage.waitUntilLoaderScreenDisappear();
    extentLogger.info("after saving data,hover over the mouse on the delete button and click it. ");
    createVehicleCostPage.deleteButton.click();
    extentLogger.info("confirming the delete  click it yes button ");
    createVehicleCostPage.deleteConfirmButton.click();
    Thread.sleep(3000);
}


}
