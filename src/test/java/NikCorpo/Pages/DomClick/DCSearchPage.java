package NikCorpo.Pages.DomClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;

@PageEntry(title = "Страница поиска")
public class DCSearchPage extends WebPage {

    @ElementTitle("Минимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__gte']")
    public WebElement minPrice;

    @ElementTitle("Максимальная цена")
    @FindBy(xpath = "//div[contains(@class, 'double-inputs')]/input[@name='price__lte']")
    public WebElement maxPrice;

    public DCSearchPage(WebDriver driver) {super(driver);
    }

}