package utils;

import org.openqa.selenium.JavascriptExecutor;
import pages.base.Element;

public class JavaScriptUtility extends Utility {


	public static void scrollToElementJS(Element element) {
		String jsScript = "arguments[0].scrollIntoView();";
		((JavascriptExecutor) driver).executeScript(jsScript, element);
	}

	public static void clickJS(Element element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
