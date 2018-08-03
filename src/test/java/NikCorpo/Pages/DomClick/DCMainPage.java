package NikCorpo.Pages.DomClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "ДомКлик — cервис для поиска и покупки недвижимости в ипотеку")
public class DCMainPage extends WebPage {

    @ElementTitle("Вторичка")
    @FindBy(xpath = "//div[contains(@class, 'region-select__dropdown')]")
    public WebElement btnSecondary;

    @ElementTitle("Кнопка начать подбор")
    @FindBy(xpath = "//div[contains(@class, 'search-form__item')]//button")
    public WebElement btnStart;

    @ElementTitle("Строка поиска")
    @FindBy(xpath = "//div[@class='b-input-clear__wrap']//input")
    public WebElement searchString;

    public DCMainPage(WebDriver driver) {
        super(driver);
    }
}
