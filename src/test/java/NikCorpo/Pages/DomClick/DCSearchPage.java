package NikCorpo.Pages.DomClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.utils.ExpectedConditionsUtils;

@PageEntry(title = "Страница поиска")
public class DCSearchPage extends WebPage {

    @ElementTitle("3 комнаты в квартире")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div[2]/div[2]/form/div/div[2]/div/div/label[3]/span")
    public WebElement threeRooms;

    @ElementTitle("Минимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__gte']")
    public WebElement minPrice;

    @ElementTitle("Максимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__lte']")
    public WebElement maxPrice;

    @ElementTitle("Скидка на ставку")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div[2]/div[2]/form/div/div[4]/div[1]/div/label[1]/span")
    public WebElement DiscountOnTheBet;

    @ElementTitle("Общая площадь от")
    @FindBy(xpath = "//*[@id=\"squareTotalFrom\"]")
    public WebElement squareTotalFrom;

    @ElementTitle("Общая площадь до")
    @FindBy(xpath = "//*[@id=\"squareTotalTo\"]")
    public WebElement squareTotalTo;

    @ElementTitle("Площадь кухни от")
    @FindBy(xpath = "//*[@id=\"squareKitchenFrom\"]")
    public WebElement squareKitchenFrom;

    @ElementTitle("Площадь кухни до")
    @FindBy(xpath = "//*[@id=\"squareKitchenTo\"]")
    public WebElement squareKitchenTo;

    @ElementTitle("Не первый этаж")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div[2]/div[2]/form/div/div[4]/div[3]/div[1]/label[1]/span")
    public WebElement notFirstFlour;

    @ElementTitle("Не последний этаж")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div[2]/div[2]/form/div/div[4]/div[3]/div[1]/label[2]/span")
    public WebElement notLastFlour;

    @ElementTitle("Этаж от")
    @FindBy(xpath = "//*[@id=\"floorFrom\"]")
    public WebElement floorFrom;

    @ElementTitle("Этаж до")
    @FindBy(xpath = "//*[@id=\"floorTo\"]")
    public WebElement floorTo;

    @ElementTitle("Этажность от")
    @FindBy(xpath = "//*[@id=\"floorsFrom\"]")
    // //input[contains(text(), 'Этажность')]
    public WebElement numberOfStoreysFrom;

    @ElementTitle("Этажность до")
    @FindBy(xpath = "//*[@id=\"floorsTo\"]")
    public WebElement numberOfStoreysTo;


    public DCSearchPage(WebDriver driver) {
        super(driver);
        ExpectedConditionsUtils.waitUntilElementPresent(maxPrice);
    }
}