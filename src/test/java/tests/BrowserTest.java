package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.GoogleHomePage;
import pages.YahooHomePage;

public class BrowserTest extends BaseTest
{

    @Test
    public void googleSearchTest() throws InterruptedException
    {
        String term = "QA Revealed";
        GoogleHomePage homepage = new GoogleHomePage(driver);
        homepage.googleSearch(term);

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("search")));
        WebElement searchResults = driver.findElement(By.id("search"));

        Assert.assertTrue(searchResults.getText().contains(term));


        Thread.sleep(3000);
    }

    @Test
    public void yahooSearchTest() throws InterruptedException {

        String searchTerm = "QA Revealed";


        YahooHomePage homePage = new YahooHomePage(driver);
        homePage.searchResults(searchTerm);



        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("results")));
        WebElement finalPage = driver.findElement(By.id("results"));
        finalPage.click();

    Assert.assertTrue(finalPage.getText().contains(searchTerm));

                //SVE POSLE JE ZA ASSERT

        Thread.sleep(3000);






    }


}