import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser("http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/")
check_term_and_conditions_and_privacy()
WebUI.closeBrowser()

private check_term_and_conditions_and_privacy() {
	
//Check the href of Terms and Conditions
	String actual_href_term = WebUI.getAttribute(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Term_and_Condition'), 'href')
	WebUI.comment actual_href_term
	String expected_href_term = 'http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/term.html'
	WebUI.verifyEqual(actual_href_term, expected_href_term, FailureHandling.CONTINUE_ON_FAILURE)


	//Check Terms and Conditions content
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Term_and_Condition'))
	WebUI.delay(2)
		if (WebUI.waitForElementPresent(findTestObject('Object Repository/Prospace/Page_/Term_Content_Actual'), 2)) {
			WebUI.comment('This is an inappropriate content')
			}
		else {
			WebUI.comment('Check the content')
		}
	WebUI.takeScreenshot()
	WebUI.back()

	
	//Check the href of Privacy
	String actual_href_privacy = WebUI.getAttribute(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Privacy'), 'href')
	WebUI.comment actual_href_privacy
	String expected_href_privacy = 'http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/privacy.html'
	WebUI.verifyEqual(actual_href_privacy, expected_href_privacy, FailureHandling.CONTINUE_ON_FAILURE)


	//Check Terms and Conditions content
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Privacy'))
	WebUI.delay(2)
		if (WebUI.waitForElementPresent(findTestObject('Object Repository/Prospace/Page_/Privacy_Actual'), 2)) {
			WebUI.comment('This is an inappropriate content')
			}
		else {
			WebUI.comment('Check the content')
			}
	WebUI.takeScreenshot()
}

