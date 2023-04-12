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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.betika.com/en-ke/login')

WebUI.setText(findTestObject('Object Repository/Page_Betika  Best Online Sports Betting in Kenya/input_Phone Number_input'), 
    '254735 638271')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Betika  Best Online Sports Betting in Kenya/input_Forgot Your Password_input'), 
    '5KJcuytkTQo=')

WebUI.click(findTestObject('Object Repository/Page_Betika  Best Online Sports Betting in Kenya/span_Login'))

WebUI.click(findTestObject('Object Repository/Page_Betika  Best Online Sports Betting in Kenya/span_Soccer'))

WebUI.click(findTestObject('Object Repository/Page_Soccer Betting  Football Betting Odds  Betika/span_2.80'))

WebUI.click(findTestObject('Object Repository/Page_Soccer Betting  Football Betting Odds  Betika/span_3.95'))

WebUI.click(findTestObject('Object Repository/Page_Soccer Betting  Football Betting Odds  Betika/span_Place Bet for KES100'))

