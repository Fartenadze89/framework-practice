package tests.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.forms.PracticeFormPage;
import tests.base.BaseTest;

public class CheckboxTest extends BaseTest {
	@Test
	public void testCheckbox() {
		PracticeFormPage practiceFormPage = homePage.goToForms().clickPracticeForm();
		practiceFormPage.clickSportsCheckbox();
		practiceFormPage.clickReadingCheckbox();
		practiceFormPage.clickMusicCheckbox();
		practiceFormPage.clickReadingCheckbox();

		boolean isReadingCheckboxSelected = practiceFormPage.isReadingSelected();

		Assert.assertFalse(isReadingCheckboxSelected, "\n Reading Checkbox is Selected \n");
	}
}
