package FinalProject;

import java.time.Duration;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Quiz3.Util;

public class POM {
	WebDriver driver;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	Logger log = Logger.getLogger("POM");
	WebDriverWait wait;
	
	@FindBy(xpath = "//input[@name='vchLogin_Name']")
	WebElement userNameField;
	
	@FindBy(xpath = "//input[@name='vchPassword']")
	WebElement passwordField;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement loginButton;
	
	@FindBy (xpath="//iframe[@id='fra_Menu_CureMD']")
	WebElement frame1;
	
	@FindBy (xpath="//iframe[@id='fraCureMD_Body']")
	WebElement frame2;
	
	@FindBy (xpath="//a[@id='patientBtn']")
	WebElement patientButton;
	
	@FindBy (xpath="//td[@title='Add Patient']")
	WebElement addPatientButton;
	
	@FindBy (xpath="//input[@name='txtVFNAME']")
	WebElement fNameField;
	
	@FindBy (xpath="//input[@name='txtVLNAME']")
	WebElement lNameField;
	
	@FindBy (xpath="//select[@name='cmbVSEX']")
	WebElement genderDropDown;
	
	@FindBy (xpath="//input[@name='txtDDOB']")
	WebElement dobField;
	
	@FindBy (xpath="//span[@class='select2-selection__rendered']")
	WebElement locationField;
	
	@FindBy (xpath="//input[@name='txtvcity']")
	WebElement cityField;
	
	@FindBy (xpath="//input[@name='txtVZIP']")
	WebElement zipField;
	
	@FindBy (xpath="//input[@name='txtVSTATE']")
	WebElement StateField;
	
	@FindBy (xpath="//input[@name='txtVEMAIL']")
	WebElement emailField;
	
	@FindBy (xpath="//img[@id='imgpInsurance']")
	WebElement pInsuranceIcon;
	
	@FindBy (xpath="//select[@name='cmbIPLANID']")
	WebElement pPlanField;
	
	@FindBy (xpath="//select[@name='cmbPlanAdd']")
	WebElement pAddressField;
	
	@FindBy (xpath="//input[@name='txtDSIGNONFILE']")
	WebElement pSignOnFileField;
	
	@FindBy (xpath="//img[@id='imgSInsurance']")
	WebElement sInsuranceIcon;
	
	@FindBy (xpath="//select[@name='cmbSECPLANID']")
	WebElement sPlanField;
	
	@FindBy (xpath="//select[@name='cmbSecPlanAdd']")
	WebElement sAddressField;
	
	@FindBy (xpath="//input[@name='txtSecDSIGNONFILE']")
	WebElement sSignOnFileField;
	
	@FindBy (xpath="//td[@id='tdsave']")
	WebElement saveButton;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	WebElement locationSearch;
	
	@FindBy (xpath="//div[@class='col-xs-12']//child::button")
	WebElement saveAsNewButton;
	
	@FindBy (xpath="//iframe[@id='DynamicBHdialogbox']")
	WebElement frame3;
	
	@FindBy (xpath="//a[@id='Provider_Notes_anchor']")
	WebElement providerNotes;
	
	@FindBy (xpath="//a[@id='Provider_Notes_New_Case_anchor']")
	WebElement newCase;
	
	@FindBy (xpath="//input[@name='txtVCNAME']")
	WebElement newCaseNameField;
	
	@FindBy (xpath="//input[@name='txtDSTART']")
	WebElement newCaseDOB;
	
	@FindBy (xpath="//td[@id='cmdSubmit']")
	WebElement newCaseSaveButton;
	
	@FindBy (xpath="//span[@class='mid']")
	WebElement newCaseSaveConfirmation;
	
	@FindBy (xpath="//iframe[@class='fraCureMD_Patient_Menu']")
	WebElement frame4;
	
	@FindBy (xpath="//a[@id='Provider_Notes_Provider_Notes_anchor']")
	WebElement providerNotes2;
	
	@FindBy (xpath="//td[@id='SpAdd1']")
	WebElement addProviderNotes;
	
	@FindBy (xpath="//span[@id='select2-cmbProvider-container']")
	WebElement providerProviderNotes;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	WebElement providerField;
	
	@FindBy (xpath="//select[@id='cmbRTemplate']")
	WebElement notetemplateProviderNotes;
	
	@FindBy (xpath="//select[@id='txtVREASON']")
	WebElement visitReasonProviderNotes;
	
	@FindBy (xpath="//span[@id='select2-cmbLocation-container']")
	WebElement locationProviderNotes;
	
	@FindBy (xpath="//input[@class='select2-search__field']")
	WebElement locationProviderNotesField;
	
	@FindBy (xpath="//td[@id='btnSave']")
	WebElement createButton;
	
	@FindBy (xpath="//input[@id='Sdate']")
	WebElement dateProviderNotes;
	
	@FindBy (xpath="//select[@id='cmbReportType']")
	WebElement noteType;
	
	@FindBy (xpath="//span[contains(text(),'Admit Note')]")
	WebElement adminNotes;
	
	@FindBy (xpath="//a[@id='Clinical_Diagnoses_6_anchor']/child::a[@style='cursor:pointer;color:green;font-size:10px;font-family:arial']")
	WebElement addDiagnosisButton;
	
	@FindBy (xpath="//input[@id='txtKeyword']")
	WebElement diagnosisSearchField;
	
	@FindBy (xpath="//img[@id='imgMaster']")
	WebElement diagnosisSearchButton;
	
	@FindBy (xpath="//a[@id='0']")
	WebElement diagnosisSearchShown;
	
	@FindBy (xpath="//td[@id='tdSaveDiagnosis']")
	WebElement diagnosisSaveButton;
	
	@FindBy (xpath="//td[@id='tdSoapAccept']")
	WebElement diagnosisAcceptButton;
	
	@FindBy (xpath="//font[@id='Comp_Heading_Detail']//u[contains(text(),'Cholera due to Vibrio cholerae 01, biovar cholerae')]")
	WebElement diagnosisAssertion;
	
	@FindBy (xpath="//a[@id='Clinical_Lab_Order_7_anchor']")
	WebElement orderMenu;
	
	@FindBy (xpath="//a[@id='OrderResult_8_2_anchor']//child::a")
	WebElement addProcedure;
	
	@FindBy (xpath="//input[@id='txtSearch']")
	WebElement addProcedureSearchField;
	
	@FindBy (xpath="//img[@id='SearchImg']")
	WebElement addProcedureSearchButton;
	
	@FindBy (xpath="//td[@id='tdSaveDiagnosis']")
	WebElement saveAndAcceptButton;
	
	@FindBy (xpath="//ul[@id='ulSearchResultFav']//a[@title='99211 - Office or other outpatient visit for the evaluation and management of an established patient, that may not require the presence of a physician or other qualified health care professional. Usually, the']")
	WebElement addProcedureSearchFieldShown;
	
	@FindBy (xpath="//td[@id='sp_eSuperbill']")
	WebElement createSuperBillButton;
	
	@FindBy (xpath="//select[@id='cmdPatType']")
	WebElement patientSelectDropdown;
	
	@FindBy (xpath="//iframe[@id='DynamicBHdialogbox']")
	WebElement superBillFrame;
	
	@FindBy (xpath="//td[@onclick='javascript:SubmitForm()']")
	WebElement createSuperBill;
	
	@FindBy (xpath="//select[@id='ddleandm']")
	WebElement evaluationDropDown;
	
	@FindBy (xpath="//input[@name='chk99211']")
	WebElement checkboxButton;
	
	@FindBy (xpath="//input[@id='gvSuperBill_ctl02_txtDxPointer']")
	WebElement dxPointer;
	
	@FindBy (xpath="//div[@id='cntrDxPointerMapping_01']//child::input[@id='chkDxPointer_1']")
	WebElement dxPointer1;
	
	@FindBy (xpath="//input[@id='gvSuperBill_ctl02_txtAmount']")
	WebElement amountField;
	
	@FindBy (xpath="//a[@href='#']//child::span[@id='imgSave']")
	WebElement saveButtonSuperField;
	
	@FindBy (xpath="//span[@onclick='MarkInactive()']")
	WebElement createPatientAssertion;
	
	@FindBy (xpath="//iframe[@id='fraCureMD_Patient_Header']")
	WebElement createPatientFrame;
	
	@FindBy (xpath="//font[contains(text(),'Office or other outpatient visit for the evaluation and management of an established patient, that may not require the presence of a physician or other qualified health care professional. Usually, the (CPT-99211), Units: 1.')]")
	WebElement orderDiagnosisAssertion;
	
	@FindBy (xpath="//iframe[@id='fPatHeader']")
	WebElement superBillAssertionFrame;
	
	public void Login() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(userNameField));
		userNameField.sendKeys("GlobalPeriod");
		log.info("Username is entered");
		wait.until(ExpectedConditions.elementToBeClickable(passwordField));
		passwordField.sendKeys("SuPPort.2014");
		log.info("Password is entered");
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
		log.info("LoginButton is clicked");
		Util.SwitchingWindow(driver);
		log.info("Successfully shifted to the next window");
		Thread.sleep(5000);
		driver.switchTo().frame(frame1);
		log.info("Successfully shifted to the frame1 where the Patient Button is located");
		wait.until(ExpectedConditions.elementToBeClickable(patientButton));
		patientButton.click();
		log.info("paientButton is clicked");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
	}
	
	public void AddPatient() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(addPatientButton));
		addPatientButton.click();
		log.info("addPatientButton is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(fNameField));
		fNameField.sendKeys("SSAFAFAVVEVV");
		log.info("Keys Entered into fNameField");

		wait.until(ExpectedConditions.elementToBeClickable(lNameField));
		lNameField.sendKeys("VEVEFEVEFEE");
		log.info("Keys Entered into lNameField");

		wait.until(ExpectedConditions.elementToBeClickable(genderDropDown));
		Select gender = new Select(genderDropDown);
		gender.selectByValue("F");
		log.info("Female Gender Selected");

		wait.until(ExpectedConditions.elementToBeClickable(dobField));
		dobField.sendKeys("12/13/2022");
		log.info("Date of Birth Entered");

		wait.until(ExpectedConditions.elementToBeClickable(locationField));
		locationField.click();
		log.info("locationField is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(locationSearch));
		locationSearch.sendKeys("3",Keys.ENTER);
		log.info("Keys entered into the locationSearch");

		wait.until(ExpectedConditions.elementToBeClickable(cityField));
		cityField.sendKeys("New York");
		log.info("Keys entered into the cityField");

		wait.until(ExpectedConditions.elementToBeClickable(zipField));
		zipField.sendKeys("99501 ");
		log.info("Keys entered into the zipField");

		wait.until(ExpectedConditions.elementToBeClickable(StateField));
		StateField.sendKeys("Alaska");
		log.info("Keys entered into the StateField");

		wait.until(ExpectedConditions.elementToBeClickable(emailField));
		emailField.sendKeys("taimoorahmedpal1@gmail.com");
		log.info("Keys entered into the emailField");

		wait.until(ExpectedConditions.elementToBeClickable(pInsuranceIcon));
		pInsuranceIcon.click();
		log.info("pInsuranceIcon is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(pPlanField));
		Select pPlan = new Select(pPlanField);
		pPlan.selectByValue("16");
		log.info("Primary plan selected");

		wait.until(ExpectedConditions.elementToBeClickable(pAddressField));
		Thread.sleep(2000);
		Select pAddress = new Select(pAddressField);
		pAddress.selectByValue("19");
		log.info("Primary address selected");

//		LocalDate localDate = LocalDate.now();
//		pSignOnFileField.sendKeys(dtf.format(localDate));
		wait.until(ExpectedConditions.elementToBeClickable(pSignOnFileField));
		pSignOnFileField.sendKeys("12/13/2022");
		log.info("Keys entered into the pSignOnFileField");

		wait.until(ExpectedConditions.elementToBeClickable(sInsuranceIcon));
		sInsuranceIcon.click();
		log.info("sInsuranceIcon is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(sPlanField));
		Select sPlan = new Select(sPlanField);
		sPlan.selectByValue("16");
		log.info("Secondary plan selected");

		wait.until(ExpectedConditions.elementToBeClickable(sAddressField));
		Select sAddress = new Select(sAddressField);
		sAddress.selectByValue("19");
		log.info("Secondary address selected");

		wait.until(ExpectedConditions.elementToBeClickable(sSignOnFileField));
		sSignOnFileField.sendKeys("12/12/2022");
		log.info("Keys entered into the sSignOnFileField");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_UP).build().perform();	
		act.sendKeys(Keys.PAGE_UP).build().perform();		
		wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
		log.info("saveButton is clicked");
		wait.until(ExpectedConditions.visibilityOfAllElements(frame3));
		if(frame3.isDisplayed()) {
			driver.switchTo().frame(frame3);
			saveAsNewButton.click();
		}
		act.sendKeys(Keys.PAGE_UP).build().perform();	
		act.sendKeys(Keys.PAGE_UP).build().perform();	
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		Assert.assertTrue(createPatientAssertion.isDisplayed());
	}
	public void CreateCase() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(frame4);
		wait.until(ExpectedConditions.elementToBeClickable(providerNotes));
		providerNotes.click();
		log.info("providerNotes is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(newCase));
		newCase.click();
		log.info("newCase is clicked");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		wait.until(ExpectedConditions.elementToBeClickable(newCaseNameField));
		newCaseNameField.sendKeys("Hahahah");
		log.info("Keys entered into the newCaseNameField");

		wait.until(ExpectedConditions.elementToBeClickable(newCaseDOB));
		newCaseDOB.sendKeys("12/12/2022");
		log.info("Keys entered into the newCaseDOB");

		wait.until(ExpectedConditions.elementToBeClickable(newCaseSaveButton));
		newCaseSaveButton.click();
		log.info("newCaseSaveButton is clicked");
		
		wait.until(ExpectedConditions.elementToBeClickable(newCaseSaveConfirmation));
		Assert.assertTrue(newCaseSaveConfirmation.isDisplayed());
		
		
	}
	public void CreateProviderNotes() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame4);
		wait.until(ExpectedConditions.elementToBeClickable(providerNotes2));
		providerNotes2.click();
		log.info("providerNotes2 is clicked");

		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame2);
		wait.until(ExpectedConditions.elementToBeClickable(addProviderNotes));
		addProviderNotes.click();
		log.info("addProviderNotes is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(dateProviderNotes));
		dateProviderNotes.sendKeys("12/12/2022");
		log.info("Keys entered into the dateProviderNotes");

		wait.until(ExpectedConditions.elementToBeClickable(providerProviderNotes));
		providerProviderNotes.click();
		log.info("providerProviderNotes is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(providerField));
		providerField.sendKeys("a",Keys.ENTER);
		log.info("Keys entered into the providerField");

		wait.until(ExpectedConditions.elementToBeClickable(notetemplateProviderNotes));
		Select noteTemplate = new Select(notetemplateProviderNotes);
		noteTemplate.selectByValue("6");
		log.info("noteTemplate is selected");

		wait.until(ExpectedConditions.elementToBeClickable(visitReasonProviderNotes));
		Select visitReason = new Select(visitReasonProviderNotes);
		visitReason.selectByValue("60");
		log.info("visitReason is selected");

		wait.until(ExpectedConditions.elementToBeClickable(locationProviderNotes));
		locationProviderNotes.click();
		log.info("locationProviderNotes is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(locationProviderNotesField));
		locationProviderNotesField.sendKeys("3",Keys.ENTER);
		log.info("Keys entered into the locationProviderNotesField");

		wait.until(ExpectedConditions.elementToBeClickable(noteType));
		Select notetype = new Select(noteType);
		notetype.selectByValue("16");
		log.info("notetype is selected");

		wait.until(ExpectedConditions.elementToBeClickable(createButton));
		createButton.click();
		log.info("createButton is clicked");

		Thread.sleep(3000);
		Assert.assertTrue(adminNotes.isDisplayed());
		
	}
	
	public void AddDiagnosis() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		driver.switchTo().frame(frame4);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(addDiagnosisButton));
		addDiagnosisButton.click();
		log.info("addDiagnosisButton is clicked");

		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(frame3);
		wait.until(ExpectedConditions.elementToBeClickable(diagnosisSearchField));
		diagnosisSearchField.sendKeys("A00.0");
		log.info("Keys entered into the diagnosisSearchField");

		wait.until(ExpectedConditions.elementToBeClickable(diagnosisSearchButton));
		diagnosisSearchButton.click();
		log.info("diagnosisSearchButton is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(diagnosisSearchShown));
		diagnosisSearchShown.click();
		log.info("diagnosisSearchShown is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(diagnosisSaveButton));
		diagnosisSaveButton.click();
		log.info("diagnosisSaveButton is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(diagnosisAcceptButton));
		diagnosisAcceptButton.click();
		log.info("diagnosisAcceptButton is clicked");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(frame2);
		Assert.assertTrue(diagnosisAssertion.isDisplayed());
		
		
	}
	public void AddProcedure() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		driver.switchTo().frame(frame4);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(orderMenu));
		orderMenu.click();
		log.info("orderMenu is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(addProcedure));
		addProcedure.click();
		log.info("addProcedure is clicked");

		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		driver.switchTo().frame(frame3);
		wait.until(ExpectedConditions.elementToBeClickable(addProcedureSearchField));
		addProcedureSearchField.sendKeys("99211");
		log.info("Keys entered into the addProcedureSearchField");

		wait.until(ExpectedConditions.elementToBeClickable(addProcedureSearchFieldShown));
		addProcedureSearchFieldShown.click();
		log.info("addProcedureSearchFieldShown is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(addProcedureSearchButton));
		addProcedureSearchButton.click();
		log.info("addProcedureSearchButton is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(saveAndAcceptButton));
		saveAndAcceptButton.click();
		log.info("saveAndAcceptButton is clicked");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.switchTo().frame(frame2);
		Assert.assertTrue(orderDiagnosisAssertion.isDisplayed());
		
	}
	
	public void SuperBill() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(frame2);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(createSuperBillButton));
		createSuperBillButton.click();
		log.info("saveAndAcceptButton is clicked");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		driver.switchTo().frame(frame3);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(patientSelectDropdown));
		Select patient = new Select(patientSelectDropdown);
		patient.selectByValue("New");
		log.info("patient is selected");

		wait.until(ExpectedConditions.elementToBeClickable(createSuperBill));
		createSuperBill.click();
		log.info("createSuperBill is clicked");

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame(frame2);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(evaluationDropDown));
		Select evaluation = new Select(evaluationDropDown);
		evaluation.selectByValue("7");
		log.info("evaluation is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(checkboxButton));
		checkboxButton.click();
		log.info("checkboxButton is clicked");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(dxPointer));
		dxPointer.click();
		log.info("dxPointer is clicked");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(dxPointer1));
		dxPointer1.click();
		log.info("dxPointer1 is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(amountField));
		amountField.clear();
		log.info("amountField is cleared");
		Actions act = new Actions(driver);
		act.doubleClick(amountField).build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(amountField));
		amountField.sendKeys("10");
		log.info("saveAndAcceptButton is clicked");

		wait.until(ExpectedConditions.elementToBeClickable(saveButtonSuperField));
		saveButtonSuperField.click();
		log.info("saveButtonSuperField is clicked");

		Assert.assertTrue(superBillAssertionFrame.isDisplayed());
		
		
	}	
	public POM(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);

	}
}
