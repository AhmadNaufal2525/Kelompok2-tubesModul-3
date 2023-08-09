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

'User mengklik sidebar menu "PIM"'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/a_PIM'))

'User mengklik button add'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/button_Add'))

'User mengisikan field firstname'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/input_Employee Full Name_firstName'), 
    'Ilyisium')

'User mengisikan field middlename'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/input_Employee Full Name_middleName'), 
    'Nando')

'User mengisikan field lastname'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/input_Employee Full Name_lastName'), 
    'Electra')

'User mendapatkan id'
WebUI.getText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/input_Employee Id_oxd-input oxd-input--focus'))

'User mengklik button save'
WebUI.submit(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageAdd_OrangeHRM/button_Save'))

'User kembali ke halaman menu PIM\r\n'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/a_PIM'))

