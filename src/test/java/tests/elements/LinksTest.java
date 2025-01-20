package tests.elements;

import pages.elements.LinksPage;
import tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinksTest extends BaseTest {

    @Test
    public void testLinks() {
        LinksPage linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        String actualResponse = linksPage.getResponse();

        Assert.assertTrue(actualResponse.contains("400") && actualResponse.contains("Bad Request"), "\n Actual Response (" + actualResponse + ") \n Does Not Contain '400' and 'Bad Request'");
    }

}
