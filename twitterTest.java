package com.cybertek.tests.FreeWorkingTime;

import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.TwitterLogin;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

public class twitterTest extends TestBase {


    @Test
    public void test1() throws InterruptedException {

        TwitterLogin twitterLogin = new TwitterLogin();

        twitterLogin.loginAsTwitterUser();

        ExcelUtil tweetAc = new ExcelUtil("src/test/resources/twitterAc.xlsx", "tweetAc");
        int tweetCount = tweetAc.rowCount();

        for(int i=1;i<10;i++) {

            String tweetAdress = tweetAc.getCellData(i, 1);

            twitterLogin.tweetSendBox.sendKeys("Whith your Support we will be reached many people " + tweetAdress + " Thanks.");

            twitterLogin.tweetSendButton.click();
            DashboardPage dashboardPage = new DashboardPage();
            dashboardPage.waitUntilLoaderScreenDisappear();


        }

    }

}
