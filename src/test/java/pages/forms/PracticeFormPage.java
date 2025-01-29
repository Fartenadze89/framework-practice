package pages.forms;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import static utils.JavaScriptUtility.scrollToElementJS;


public class PracticeFormPage extends BasePage {

	private final Element firstNameField = new Element(By.id("firstName"), "First Name Field");
	private final Element lastNameField = new Element(By.id("lastName"), "Last Name Field");
	private final Element emailField = new Element(By.id("userEmail"), "Email Field");
	private final Element maleRadioButton = new Element(By.id("gender-radio-1"), "Male Radio Button");
	private final Element femaleRadioButton = new Element(By.id("gender-radio-2"), "Female Radio Button");
	private final Element otherRadioButton = new Element(By.id("gender-radio-3"), "Other Radio Button");
	private final Element numberField = new Element(By.id("userNumber"), "Number Field");
	private final Element sportsCheckbox = new Element(By.id("hobbies-checkbox-1"), "Sports Checkbox");
	private final Element readingCheckbox = new Element(By.id("hobbies-checkbox-2"), "Reading Checkbox");
	private final Element musicCheckbox = new Element(By.id("hobbies-checkbox-3"), "Music Checkbox");

	public void clickFemaleRadioButton() {
		femaleRadioButton.click();
	}

	public boolean isFemaleSelected() {
		return femaleRadioButton.isSelected();
	}

	public void clickSportsCheckbox() {
		if (!sportsCheckbox.isSelected()) {
			scrollToElementJS(sportsCheckbox);
			sportsCheckbox.click();
		}
	}

	public void clickReadingCheckbox() {
		if (!readingCheckbox.isSelected()) {
			scrollToElementJS(readingCheckbox);
			readingCheckbox.click();
		}
	}

	public void clickMusicCheckbox() {
		if (!musicCheckbox.isSelected()) {
			scrollToElementJS(musicCheckbox);
			musicCheckbox.click();
		}
	}

	public boolean isReadingSelected() {
		return readingCheckbox.isSelected();
	}
}
