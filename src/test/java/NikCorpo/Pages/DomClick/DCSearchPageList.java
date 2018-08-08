package NikCorpo.Pages.DomClick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.annotations.PageEntry;
import ru.sbtqa.tag.pagefactory.utils.ExpectedConditionsUtils;

@PageEntry(title = "Страница поиска - список")
public class DCSearchPageList extends WebPage {

    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div/div[2]/div[1]/div[2]")
    public WebElement offersList;

    @ElementTitle("Первый элемент списка")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div/div[2]/div[1]/div[2]/a[1]")
    public WebElement firstElement;

    public DCSearchPageList(WebDriver driver) {
        super(driver);
        ExpectedConditionsUtils.waitUntilElementPresent(offersList);
    }
}