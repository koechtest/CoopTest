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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login/Verify - Login'), [('username') : 'sadetty', ('password') : '00000', ('OTP') : '000000'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('button - buyAirTime'))

WebUI.click(findTestObject('dropdown- AccountAirtime'))

WebUI.click(findTestObject('dropdown - DebitAcc'))

WebUI.setText(findTestObject('input - AirtimeAmount'), '2000')

WebUI.verifyTextPresent('1000', false)

WebUI.click(findTestObject('button - Buy'))

WebUI.setText(findTestObject('input - OTP Payment'), '000000')

WebUI.click(findTestObject('button - SubmitAirtime'))

WebUI.verifyTextPresent('Airtime Purchase', false)

