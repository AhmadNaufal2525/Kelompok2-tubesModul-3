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

'Load Test Case Login'
WebUI.callTestCase(findTestCase('Login/Positive Case/TC-01 Valid Credentials'), [:], FailureHandling.STOP_ON_FAILURE)

'User mengklik sidebar menu "Recruitment"'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/a_Recruitment'))

'User mengklik button add'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/button_Add'))

'User mengisikan input firstname'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/input_Full Name_firstName'), '')

'User mengisikan input middlename'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/input_Full Name_middleName'), 'Nando')

'User mengisikan input lastname'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/input_Full Name_lastName'), '')

'User mengisikan input email'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/input_Email_oxd-input oxd-input--focus'), '')

'User mengisikan input nomor telepon\r\n'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/input_Contact Number_oxd-input oxd-input--focus'), 
    '0812134145124')

'User mengklik button save'
WebUI.submit(findTestObject('PageDashboard_OrangeHRM/PageRekrut_OrangeHRM/button_Save'))

