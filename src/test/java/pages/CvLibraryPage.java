package pages;

import driverFactory.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CvLibraryPage extends DriverFactory {


    @FindBy(xpath = "//div[@class='action-buttons top-bottom right-column ng-star-inserted']/button[2]/span/div")
    private WebElement cookies;
    @FindBy(xpath = "//div[@class='hps-jobtitle hps-transition']/input")
    private WebElement searchBox;
    @FindBy(xpath = "//div[@class='hps-distance hps-transition']/select")
    private WebElement location;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    private WebElement magGlass;
    @FindBy(xpath = "//div[@class='search-header__left']")
    private WebElement jobText;
    @FindBy(id = "nav-signup")
    private WebElement registerButton;
    @FindBy(xpath = "//input[@data-qa='email-address']")
    private WebElement emailBox;
    @FindBy(xpath = "//div[@class='InputPassword_inputContainer__042fE']/input")
    private WebElement passwordBox;
    @FindBy(xpath = "//button[@class='Page1_submitButton__mKtFH Button_primary__dnBee Button_btn__Xel2B Button_medium__7d_4n']")
    private WebElement confirmRegisterButton;
    @FindBy(xpath = "//div[@class='page-main']/section[3]/h2")
    private WebElement errorMessage;



    public void setCookies(){
        driver.switchTo().frame(1);
        cookies.click();

    }
    public void setSearchBox(String job)
    {
        searchBox.sendKeys(job);
    }

    public void setLocationViaDropDown()
    {
        Select drop=new Select(location);
        drop.selectByIndex(5);

    }
    public void setMagGlass()
    {
        magGlass.click();
    }
    public String getJobText()
    {
        return jobText.getText();
    }
    public String getJobUrl(){
        return driver.getCurrentUrl();
    }
    public void setRegisterButton(){
        registerButton.click();
    }
    public void setEmailBox(String email){
        emailBox.sendKeys(email);
    }
    public void setPasswordBox(String password){
        passwordBox.sendKeys(password);
    }
    public void setConfirmRegisterButton(){
        confirmRegisterButton.click();
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }

}
