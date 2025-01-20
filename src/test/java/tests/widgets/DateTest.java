package tests.widgets;

import pages.widgets.DatePickerMenuPage;
import tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.JsonUtils;

public class DateTest extends BaseTest {

    @Test
    public void testSelectingDate() {
        String month = JsonUtils.getPostData().getMonth();
        String monthNumber = JsonUtils.getPostData().getMonthNumber();
        String day = JsonUtils.getPostData().getDay();
        String year = JsonUtils.getPostData().getYear();
        DatePickerMenuPage datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual and Expected Dates Do Not Match" +
                "\n Actual Date: " + actualDate +
                "\n Expected Date: " + expectedDate);
    }
}
