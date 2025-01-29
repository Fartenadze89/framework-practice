package pages.elements;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;

public class ElementsPage extends BasePage {
	private Element webTablesMenuItem = new Element(By.xpath("//li['item-3']//span[text()='Web Tables']"), "Web Tables Menu Item");
	private Element linksMenuItem = new Element(By.xpath("//li[@id='item-5']/span[text()='Links']"), "Links Menu Item");

	public WebTablesPage clickWebTables() {
		webTablesMenuItem.click();
		return new WebTablesPage();
	}

	public LinksPage clickLinks() {
		linksMenuItem.click();
		return new LinksPage();
	}
}
