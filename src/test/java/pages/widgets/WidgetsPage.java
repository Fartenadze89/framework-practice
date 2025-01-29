package pages.widgets;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import static utils.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {
	private Element selectMenuItem = new Element(By.xpath("//li[@id='item-8']/span[text()='Select Menu']"), "Select Menu Item");
	private Element datePickerMenuItem = new Element(By.xpath("//li[@id='item-2']/span[text()='Date Picker']"), "Date Picker Menu Item");

	public SelectMenuPage clickSelectMenu() {
		scrollToElementJS(selectMenuItem);
		selectMenuItem.click();
		return new SelectMenuPage();
	}

	public DatePickerMenuPage clickDatePicker() {
		scrollToElementJS(datePickerMenuItem);
		datePickerMenuItem.click();
		return new DatePickerMenuPage();
	}
}
