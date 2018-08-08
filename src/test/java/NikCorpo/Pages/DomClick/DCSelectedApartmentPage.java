package NikCorpo.Pages.DomClick;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.sbtqa.tag.pagefactory.WebPage;
import ru.sbtqa.tag.pagefactory.annotations.ElementTitle;
import ru.sbtqa.tag.pagefactory.utils.ExpectedConditionsUtils;

public class DCSelectedApartmentPage extends WebPage {

    @FindBy(xpath = "//*[@id=\"offerMap\"]/ymaps/ymaps/ymaps/ymaps[1]")
    public WebElement map;

    @ElementTitle("Отправить квартиру на одобрение")
    @FindBy(xpath = "//*[@id=\"content\"]/div/main/div/div[2]/div/div/aside/div/button/span")
    public WebElement approveButton;

    public DCSelectedApartmentPage(WebDriver driver) {
        super(driver);
        ExpectedConditionsUtils.waitUntilElementPresent(map);
    }
}
