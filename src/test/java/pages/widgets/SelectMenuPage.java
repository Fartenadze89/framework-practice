package pages.widgets;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import java.util.List;

import static utils.DropDownUtility.*;
import static utils.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends BasePage {

	private Element standardMultiSelect = new Element(By.id("cars"), "Standard Multi Select");


	public void selectStandardMulti(String text) {
		scrollToElementJS(standardMultiSelect);
		selectByVisibleText(standardMultiSelect, text);
	}

	public void selectStandardMulti(int index) {
		scrollToElementJS(standardMultiSelect);
		selectByIndex(standardMultiSelect, index);
	}

	public void deselectStandardMulti(String value) {
		scrollToElementJS(standardMultiSelect);
		deselectByValue(standardMultiSelect, value);
	}

	public List<String> getAllSelectedStandardMultiOptions() {
		return getAllSelectedOptions(standardMultiSelect);
	}
}
