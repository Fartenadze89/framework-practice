package pages;

import org.openqa.selenium.By;
import pages.base.BasePage;
import pages.base.Element;
import pages.elements.ElementsPage;
import pages.forms.FormsPage;
import pages.widgets.WidgetsPage;

public class HomePage extends BasePage {
	private final Element formsCard = new Element(By.xpath("//div[@id='app']//h5[text()='Forms']"), "Forms Card");
	private final Element elementsCard = new Element(By.xpath("//div[@id='app']//h5[text()='Elements']"), "Elements Card");
	private final Element widgetsCard = new Element(By.xpath("//div[@id='app']//h5[text()='Widgets']"), "Widgets Card");

	public FormsPage goToForms() {
		formsCard.click();
		return new FormsPage();
	}

	public ElementsPage goToElements() {
		elementsCard.click();
		return new ElementsPage();
	}

	public WidgetsPage goToWidgets() {
		widgetsCard.click();
		return new WidgetsPage();
	}
}
