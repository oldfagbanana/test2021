package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {

    @FindBy (css = "input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy (xpath = "//*[contains(@jsname, 'j93WEe')]")
    public WebElement opensk;


    @FindBy (xpath = "//*[contains(@jsname, 'qCp9A')]")
    public WebElement closesk;

    @FindBy (xpath = "//*[contains(@jsname, 'N10B9')]")
    public WebElement one;

    @FindBy (xpath = "//*[contains(@jsname, 'XSr6wc')]")
    public WebElement plus;

    @FindBy (xpath = "//*[contains(@jsname, 'lVjWed')]")
    public WebElement two;

    @FindBy (xpath = "//*[contains(@jsname, 'YovRWb')]")
    public WebElement mult;

    @FindBy (xpath = "//*[contains(@jsname, 'KN1kY')]")
    public WebElement three;

    @FindBy (xpath = "//*[contains(@jsname, 'pPHzQc')]")
    public WebElement minus;

    @FindBy (xpath = "//*[contains(@jsname, 'xAP7E')]")
    public WebElement four;

    @FindBy (xpath = "//*[contains(@jsname, 'bkEvMb')]")
    public WebElement zero;

    @FindBy (xpath = "//*[contains(@jsname, 'WxTTNd')]")
    public WebElement divi;

    @FindBy (xpath = "//*[contains(@jsname, 'Ax5wH')]")
    public WebElement five;

    @FindBy (xpath = "//*[contains(@jsname, 'abcgof')]")
    public WebElement six;

    @FindBy (xpath = "//*[contains(@jsname, 'aN1RFf')]")
    public WebElement sin;

    @FindBy (xpath = "//*[contains(@jsname, 'Pt8tGc')]")
    public WebElement eq;

    @FindBy (xpath = "//*[contains(@jsname, 'ubtiRe')]")
    public WebElement string1;

    @FindBy (xpath = "//*[contains(@jsname, 'VssY5c')]")
    public WebElement string2;

    public String getnumbers() {
        return string1.getText();
    }
    public String getresult() {
        return string2.getText();
    }

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }
    public void search (String text)
    {
        searchInput.sendKeys(text, Keys.ENTER );
    }
}
