package pages;

import helpers.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import tests.BaseTest;

public class OlxWelcomePage extends BaseHelper


{


    @FindBy(id="searchinput")
    WebElement searchField;
    @FindBy(className="btn-mainsearch")
    WebElement searchButton;

    WebDriver driver;
    public OlxWelcomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    private void navigateToHomepage(String url)
    {

     driver.get(url);

    }

    private void enterSearchTerm(String searchTerm)


    {
    wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("searchinput")));
    searchField.sendKeys(searchTerm);

    }

    private void clickOnSearchButton()

    {

        wdWait.until(ExpectedConditions.presenceOfElementLocated(By.className("btn-mainsearch")));
        searchButton.click();

    }


   public void searchOlx(String url,String term)

   {

       navigateToHomepage(url);
       enterSearchTerm(term);
       clickOnSearchButton();




   }




}
