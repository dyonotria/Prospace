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
check_UI()
WebUI.closeBrowser()


private check_UI() {
	WebUI.waitForElementPresent(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), 3)
	
	//Verify input field visibility
	WebUI.verifyElementVisible(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	//Verify input field's text
	String actual_text = WebUI.getAttribute(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), 'placeholder')
	WebUI.comment actual_text
	String expected_text = 'Enter an integer'
	WebUI.verifyEqual(actual_text, expected_text, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
		
	//Verify title text
	String actual_title = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Home_Title'))
	WebUI.comment actual_title
	String expected_title = 'Prospace factorial calculator'
	WebUI.verifyEqual(actual_title, expected_title, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	//Verify button text
	String actual_button = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	WebUI.comment actual_button
	String expected_button = 'Calculate!'
	WebUI.verifyEqual(actual_button, expected_button, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	//Verify terms and conditions visibility
	WebUI.verifyElementVisible(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Term_and_Condition'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	//Verify privacy visibility
	WebUI.verifyElementVisible(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Privacy'), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
		
}