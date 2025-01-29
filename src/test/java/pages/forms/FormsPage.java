package pages.forms;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import static utils.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends BasePage {
	private Element practiceFormMenuItem = new Element(By.xpath("//li[@id='item-0']/span[text()='Practice Form']"), "Practice Form Menu Item");

	public PracticeFormPage clickPracticeForm() {
		scrollToElementJS(practiceFormMenuItem);
		practiceFormMenuItem.click();
		return new PracticeFormPage();
	}
}
