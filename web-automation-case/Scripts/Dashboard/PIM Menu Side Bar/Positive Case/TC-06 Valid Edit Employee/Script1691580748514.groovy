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

'User menginputkan nama\r\n'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input'), 'Ilyisium Nando Electra')

'User mengklik button search'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/button_Search'))

'User mengklik button edit'
WebUI.click(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/button_Electra_oxd-icon-button oxd-table-cell-action-space (1)'))

'User mengisikan nickname'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_Nickname_oxd-input oxd-input--focus'), 
    'IlyisiummN')

'User mengisikan other id'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_Other Id_oxd-input oxd-input--focus'), 
    '2902')

'User mengisikan Drive License'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_concat(Driver, , s License Number)_oxd-input oxd-input--focus'), 
    'BN2314')

'User mengisikan License Expiry date '
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_License Expiry Date_oxd-input oxd-input--focus'), 
    '2023-09-10')

'User mengisikan SSN'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_SSN Number_oxd-input oxd-input--focus'), 
    '1241414')

'User mengisikan SIN'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_SIN Number_oxd-input oxd-input--focus'), 
    '098721')

'User mengisikan tanggal lahir'
WebUI.setText(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/input_Date of Birth_oxd-input oxd-input--active'), 
    '2002-09-10')

'User mengklik tombol save'
WebUI.submit(findTestObject('PageDashboard_OrangeHRM/PagePIM_OrangeHRM/PageEdit_OrangeHRM/button_Save'))

