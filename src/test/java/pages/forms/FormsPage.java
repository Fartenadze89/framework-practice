package pages.forms;

import pages.HomePage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {
    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
