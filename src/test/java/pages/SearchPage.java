package pages;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//Page Object Design
public class SearchPage extends DriverFactory {

    //Hello Brother
    //How you doing?

    @FindBy(xpath = "//button[@id='explicit-consent-prompt-accept']")
    private WebElement cookie;
    @FindBy(xpath = "//input[@id='searchTerm']")
    private WebElement searchBox;
    @FindBy(xpath = "//span[@class='_1gqeQ']")
    private WebElement searchBar;
    @FindBy(css = "div[data-el='search-title'] h1")
    private WebElement nikeText;

    public void setCookie()
    {
        cookie.click();
    }
    public void setSearchBox(String product)
    {
        searchBox.sendKeys(product);
    }
    public void setSearchBar()
    {
        searchBar.click();
    }
    public String getText()
    {
        return nikeText.getText();
    }
    public String getUrl()
    {
        return driver.getCurrentUrl();
    }

}
