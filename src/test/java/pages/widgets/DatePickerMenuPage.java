package pages.widgets;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

import static utils.DropDownUtility.selectByVisibleText;

public class DatePickerMenuPage extends BasePage {

	private final Element selectDateField = new Element(By.id("datePickerMonthYearInput"), "Select Date Field");
	private final Element monthDropDown = new Element(By.className("react-datepicker__month-select"), "Month DropDown");
	private final Element yearDropDown = new Element(By.cssSelector(".react-datepicker__year-select"), "Year DropDown");

	private Element dayValue(String day) {
		return new Element(By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']"), "Day Value");
	}

	public void clickDay(String day) {
		dayValue(day).click();
	}

	public void clickSelectDate() {
		selectDateField.click();
	}

	public String getDate() {
		return selectDateField.getAttribute("value");
	}

	public void selectMonth(String month) {
		selectByVisibleText(monthDropDown, month);
	}

	public void selectYear(String year) {
		selectByVisibleText(yearDropDown, year);
	}
}