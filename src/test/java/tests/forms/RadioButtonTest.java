package tests.forms;

import pages.forms.PracticeFormPage;
import tests.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickFemaleRadioButton();

        boolean isFemaleRadioButtonSelected = practiceFormPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected, "\nFemale Radio Button is not selected \n");

    }
}
