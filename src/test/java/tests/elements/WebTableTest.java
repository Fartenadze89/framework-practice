package tests.elements;

import pages.elements.WebTablesPage;
import tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest {

    @Test(enabled = false)
    public void testWebTable() {
        String email = "alden@example.com";
        String expectedAge = "34";
        WebTablesPage webTablesPage = homePage.goToElements().clickWebTables();
        webTablesPage.clickEdit(email);
        webTablesPage.setAge("34");
        webTablesPage.clickSubmitBtn();
        String actualAge = webTablesPage.getTableAge("alden@example.com");

        Assert.assertEquals(actualAge, expectedAge, "Actual and Expected Ages Do not match");
    }
}
