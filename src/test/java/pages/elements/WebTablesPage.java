package pages.elements;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

public class WebTablesPage extends BasePage {

	private final Element registrationAgeField = new Element(By.id("age"), "Registration Age Field");
	private final Element submitBtn = new Element(By.id("submit"), "Submit Button");

	public void clickEdit(String email) {
		Element edit = new Element(By.xpath("//div[text()='" + email + "']//following::span[@title='Edit']"), "Edit Button");
		edit.click();
	}

	public void setAge(String age) {
		registrationAgeField.set(age);
	}

	public void clickSubmitBtn() {
		submitBtn.click();
	}

	public String getTableAge(String email) {
		Element tableAge = new Element(By.xpath("//div[text()='" + email + "']//preceding::div[1]"), "Table Age");
		return tableAge.getText();
	}
}