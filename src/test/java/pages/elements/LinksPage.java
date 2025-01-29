package pages.elements;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import static utils.JavaScriptUtility.scrollToElementJS;

public class LinksPage extends BasePage {

	private final Element badRequestLink = new Element(By.id("bad-request"), "Bad Request Link");
	private final Element responseLink = new Element(By.id("linkResponse"), "Response Link");

	public void clickBadRequestLink() {
		scrollToElementJS(badRequestLink);
		badRequestLink.click();
	}

	public String getResponse() {
		return responseLink.getText();
	}
}