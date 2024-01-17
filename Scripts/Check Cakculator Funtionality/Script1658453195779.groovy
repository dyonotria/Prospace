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
import java.math.BigInteger


//Factorial function
BigInteger fact(long n){
	def fact = 1G
		while(n > 0){
		fact *= n--
		}
		return fact
	}
	
WebUI.openBrowser("http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/")
check_calculator_functionality()
WebUI.closeBrowser()

private check_calculator_functionality() {
	
	//Verify error text with alphabet characters
	WebUI.setText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), 'a')
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	
	String actual_error = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Error_Text'))
	WebUI.comment actual_error
	String expected_error = 'Please enter an integer'
	WebUI.verifyEqual(actual_error, expected_error, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	
	//Verify error text with alphabet characters
	WebUI.clearText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'))
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	
	String actual_blank = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Error_Text'))
	WebUI.comment actual_blank
	String expected_blank = 'Please enter an integer'
	WebUI.verifyEqual(actual_blank, expected_blank, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	
	//Verify functionality 1 digit factorial
	String one_digit = '9'
	WebUI.setText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), one_digit)
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	
	String result_1_digit = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Result_Text'))
	WebUI.comment result_1_digit
	String expected_1_digit = fact(9)
	String expected_result_1_digit = WebUI.comment('The factorial of ' + one_digit + " is: " + expected_1_digit)
	WebUI.verifyEqual(result_1_digit, expected_result_1_digit, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	
	//Verify functionality 2 digit factorial
	String two_digit = '19'
	WebUI.setText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), two_digit)
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	
	String result_2_digit = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Result_Text'))
	WebUI.comment result_2_digit
	String expected_2_digit = fact(19)
	String expected_result_2_digit = WebUI.comment('The factorial of ' + two_digit + " is: " + expected_2_digit)
	WebUI.verifyEqual(result_2_digit, expected_result_2_digit, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
	
	
	//Verify functionality 3 digit factorial
	String three_digit = '171'
	WebUI.setText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Input_Field'), three_digit)
	WebUI.click(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Button_Calculate'))
	
	String result_3_digit = WebUI.getText(findTestObject('Object Repository/Prospace/Page_Prospace factorial/Result_Text'))
	WebUI.comment result_3_digit
	String expected_3_digit = fact(171)
	WebUI.delay(5)
	String expected_result_3_digit = WebUI.comment('The factorial of ' + three_digit + " is: " + expected_3_digit)
	WebUI.verifyEqual(result_3_digit, expected_result_3_digit, FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.takeScreenshot()
		
}
		