package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.base.Element;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility {
	private static Select getDropDown(Element element) {
		return new Select(element);
	}

	public static void selectByVisibleText(Element element, String text) {
		getDropDown(element).selectByVisibleText(text);
	}

	public static void selectByIndex(Element element, int index) {
		getDropDown(element).selectByIndex(index);
	}

	public static void selectByValue(Element element, String value) {
		getDropDown(element).selectByValue(value);
	}

	public static void deselectByValue(Element element, String value) {
		getDropDown(element).deselectByValue(value);
	}

	public static List<String> getAllSelectedOptions(Element element) {
		List<WebElement> allSelectedOptions = getDropDown(element).getAllSelectedOptions();
		return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
	}

}
