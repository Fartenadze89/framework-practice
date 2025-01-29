package pages.base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

public class Element extends RemoteWebElement {
	private static final Logger logger = LogManager.getLogger(Element.class);

	private By locator;
	private String elementName;

	public Element(By locator, String elementName) {
		this.locator = locator;
		this.elementName = elementName;
	}

	protected WebElement find() {
		return BasePage.driver.findElement(locator);
	}

	public void click() {
		try {
			WebElement element = find();
			element.click();
			logger.info("Clicked on element: {}", elementName);
		} catch (Exception e) {
			logger.error("Failed to click on element: {}", elementName, e);
		}
	}

	public void set(String text) {
		try {
			WebElement element = find();
			element.clear();
			element.sendKeys(text);
			logger.info("Set text '{}' in element: {}", text, elementName);
		} catch (Exception e) {
			logger.error("Failed to set text in element: {}", elementName, e);
		}
	}

	public String getText() {
		try {
			WebElement element = find();
			String text = element.getText();
			logger.info("Got text '{}' from element: {}", text, elementName);
			return text;
		} catch (Exception e) {
			logger.error("Failed to get text from element: {}", elementName, e);
			return "";
		}
	}
}

