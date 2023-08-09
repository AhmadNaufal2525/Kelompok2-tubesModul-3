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

'User mengisikan nama yang dicari'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input'), 'Ikohw')

'User mengklik button search'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/button_Search'))

'Menunggu Alert Dialog'
WebUI.waitForAlert(2)

