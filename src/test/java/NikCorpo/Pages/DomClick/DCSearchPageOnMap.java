package NikCorpo.Pages.DomClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.utils.ExpectedConditionsUtils;

@PageEntry(title = "Страница поиска на карте")
public class DCSearchPageOnMap extends WebPage {

    @ElementTitle("3 комнаты в квартире")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[2]/div/div/label[3]/span")
    public WebElement threeRooms;

    @ElementTitle("Минимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__gte']")
    public WebElement minPrice;

    @ElementTitle("Максимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__lte']")
    public WebElement maxPrice;

    @ElementTitle("Скидка на ставку")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[4]/div[1]/div/label[1]/span")
    public WebElement DiscountOnTheBet;

    @ElementTitle("Общая площадь от")
    @FindBy(id = "squareTotalFrom")
    public WebElement squareTotalFrom;

    @ElementTitle("Общая площадь до")
    @FindBy(id = "squareTotalTo")
    public WebElement squareTotalTo;

    @ElementTitle("Площадь кухни от")
    @FindBy(id = "squareKitchenFrom")
    public WebElement squareKitchenFrom;

    @ElementTitle("Площадь кухни до")
    @FindBy(id = "squareKitchenTo")
    public WebElement squareKitchenTo;

    @ElementTitle("Не первый этаж")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[4]/div[3]/div[1]/label[1]/span")
    public WebElement notFirstFlour;

    @ElementTitle("Не последний этаж")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[4]/div[3]/div[1]/label[2]/span")
    public WebElement notLastFlour;

    @ElementTitle("Этаж от")
    @FindBy(id = "floorFrom")
    public WebElement floorFrom;

    @ElementTitle("Этаж до")
    @FindBy(id = "floorTo")
    public WebElement floorTo;

    @ElementTitle("Этажность от")
    @FindBy(id = "floorsFrom")
    // //input[contains(text(), 'Этажность')]
    public WebElement numberOfStoreysFrom;

    @ElementTitle("Этажность до")
    @FindBy(id = "floorsTo")
    public WebElement numberOfStoreysTo;

    @ElementTitle("Раздельный санузел")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[4]/div[5]/div/label[2]/span")
    public WebElement separatedWC;

    @ElementTitle("Балкон/Лоджия")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[2]/div[2]/form/div/div[4]/div[6]/div/label[2]/span")
    public WebElement balcony;

    @ElementTitle("Показать списком")
    @FindBy(xpath = "//*[@id='content']/div/main/div/div[3]/div/a")
    public WebElement showListView;

    public DCSearchPageOnMap(WebDriver driver) {
        super(driver);
        ExpectedConditionsUtils.waitUntilElementPresent(maxPrice);
    }
}