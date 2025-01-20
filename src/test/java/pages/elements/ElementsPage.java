package pages.elements;

import pages.HomePage;
import org.openqa.selenium.By;

public class ElementsPage extends HomePage {
    private By webTablesMenuItem = By.xpath("//li['item-3']//span[text()='Web Tables']");

    private By linksMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");


    public WebTablesPage clickWebTables() {
//        scrollToElementJS(webTablesMenuItem);
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}
