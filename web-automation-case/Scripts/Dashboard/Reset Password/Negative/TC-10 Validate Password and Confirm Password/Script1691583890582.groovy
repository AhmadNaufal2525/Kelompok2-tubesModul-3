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

'User mengklik dropdown menu dari profile'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/i_Dashboard_oxd-icon bi-caret-down-fill oxd-userdropdown-icon'))

'User mengklik Change password'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/a_Change Password'))

'User mengisikan Password Lama'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageResetPass_OrangeHRM/input_Current Password_oxd-input oxd-input--focus'), 
    'admin123')

'User mengisikan Password baru'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageResetPass_OrangeHRM/input_Password_oxd-input oxd-input--focus'), 
    'Admin123@')

'User mengisikan Konfirmasi Password'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PageResetPass_OrangeHRM/input_Confirm Password_oxd-input oxd-input--focus'), 
    'Admin111')

'Klik Button Save'
WebUI.submit(findTestObject('PageDashboard_OrangeHRM/PageResetPass_OrangeHRM/button_Save'))

