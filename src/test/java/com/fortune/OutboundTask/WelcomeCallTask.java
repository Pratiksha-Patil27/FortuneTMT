package com.fortune.OutboundTask;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.fortune.base.BaseClass;
import com.fortune.pageobjects.DialerLoginPage;
import com.fortune.pageobjects.OutBoundTaskPage;
import com.fortune.pageobjects.OutboundTelecallingPage;
import com.fortune.retryanalyzer.Retry;




public class WelcomeCallTask extends BaseClass{
	 
	
	private DialerLoginPage dialerPage;
	private OutboundTelecallingPage telePage;
	private OutBoundTaskPage outboundPage;
	private int i = 1;
	private String generatedClaimID;
	private String backButtonTaskNo;
	private String hangUpTaskNo;
	private String wrongTaskNo;
	private String notInterestedTakNo;
	private String ringNotReceivedTaskNo;
	private String callBackLaterTaskNo;
	private int newTotalPoints ;
	private int newLockedPoints;
	private int newReedemablePoints;
	
	
	ExtentTest test;
	
	 public WelcomeCallTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
		public int welcomeCallMethodsCount() 
		{
			Class<?> clazz = WelcomeCallTask.class;
			// Get all the methods of the class
			Method[] methods = clazz.getDeclaredMethods();
			int testCaseCount = 0;
			for (Method method : methods) {
				if (method.isAnnotationPresent(Test.class)) {
					testCaseCount++;
				}
			}

			System.out.println("Number of test cases in class : " + clazz.getSimpleName() + ": " + testCaseCount);
			return testCaseCount;
		}

		public void runTests(TaskTypeManager manager)throws IOException, InterruptedException {
            try
            {	
			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskBtnClickable")) {

				welCallVerifyCloseTaskBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskSubmitBtnClickable")) {
				welCallVerifyCloseTaskSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskCancelBtnClickable")) {
				welCallVerifyCloseTaskCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskSubmitBreakBtnClickable")) {
				welCallVerifyCloseTaskSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskCrossIconClickable")) {
				welCallVerifyCloseTaskCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduledBtnClickable")) {
				welCallVerifyRescheduledBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduledSubmitBtnClickable")) {
				welCallVerifyRescheduledSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduledSubmitBreakBtnClickable")) {
				welCallVerifyRescheduledSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduledCancelBtnClickable")) {
				welCallVerifyRescheduledCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduledCrossIconClickable")) {
				welCallVerifyRescheduledCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCatalogMenuClickable")) {
				welCallVerifyCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCatalogProductMenuClickable")) {
				welCallVerifyCatalogProductMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyCatalogProductCrossIconClickable")) {
				welCallVerifyCatalogProductCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyPointsMenuClickable")) {
				welCallVerifyPointsMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyPointsOptionMenuClickable")) {
				welCallVerifyPointsOptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyPointsOptionCrossIconClickable")) {
				welCallVerifyPointsOptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyEscalationMenuClickable")) {
				welCallVerifyEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyEscalationListMenuClickable")) {
				welCallVerifyEscalationListMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("welCallVerifyEscalationListCrossIconClickable")) {
				welCallVerifyEscalationListCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddEscalationMenuClickable")) {
				welCallVerifyAddEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddEscalationSubmitBtnClickable")) {
				welCallVerifyAddEscalationSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddEscalationCancelBtnClickable")) {
				welCallVerifyAddEscalationCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddEscalationCrossIconClickable")) {
				welCallVerifyAddEscalationCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionMenuClickable")) {
				welCallVerifyRedemptionMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionHistoryMenuClickable")) {
				welCallVerifyRedemptionHistoryMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionHistoryCrossIconClickable")) {
				welCallVerifyRedemptionHistoryCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddRedemptionMenuClickable")) {
				welCallVerifyAddRedemptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddRedemptionSubmitBtnClickable")) {
				welCallVerifyAddRedemptionSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddRedemptionCancelBtnClickable")) {
				welCallVerifyAddRedemptionCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddRedemptionCrossIconClickable")) {
				welCallVerifyAddRedemptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimAddBtnClickable")) {
				welCallVerifyClaimAddBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimBtnClickable")) {
				welCallVerifyAddClaimBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimSubmitBtnClickable")) {
				welCallVerifyAddClaimSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimCancelBtnClickable")) {
				welCallVerifyAddClaimCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimCrossBtnClickable")) {
				welCallVerifyAddClaimCrossBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusMenuClickable")) {
				welCallVerifyClaimStatusMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusCrossIconClickable")) {
				welCallVerifyClaimStatusCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimMenuClickable")) {
				welCallVerifyClaimMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallAddEscalation")) {
				welCallAddEscalation(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifySubmitEscalationNavigation")) {
				welCallVerifySubmitEscalationNavigation(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyEscaListNameFilter")) {
				welCallVerifyEscaListNameFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimDealFieldMandatory")) {
				welCallVerifyAddClaimDealFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimCustNameFieldMandatory")) {
				welCallVerifyAddClaimCustNameFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimCustContactFieldMandatory")) {
				welCallVerifyAddClaimCustContactFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimAddressFieldMandatory")) {
				welCallVerifyAddClaimAddressFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimProductFieldMandatory")) {
				welCallVerifyAddClaimProductFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimPointsFieldMandatory")) {
				welCallVerifyAddClaimPointsFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddClaimQtyFieldMandatory")) {
				welCallVerifyAddClaimQtyFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyProductNotSelectClickOnAddBtnForAddClaim")) {
				welCallVerifyProductNotSelectClickOnAddBtnForAddClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallProductNotSelectClickOnDeleteBtnForAddClaim")) {
				welCallProductNotSelectClickOnDeleteBtnForAddClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallEnterClaimData")) {
				// Fetch data from DataProvider
				Object[][] data = customerDetails();

				for (Object[] dataSet : data) {
					// Assuming the first HashMap has the keys "productCode" and "productQty"
					HashMap<String, String> customerData = (HashMap<String, String>) dataSet[0];

					String dealerCode = customerData.get("dealerCode"); // Use the key to access the value
					String invNo = customerData.get("invNo"); // Use the key to access the value
					String invoiceDate = customerData.get("invoiceDate");
					String customerName = customerData.get("customerName");
					String customerContact = customerData.get("customerContact");
					String customerAddress = customerData.get("customerAddress");
					String filePath = customerData.get("filePath");

					welCallEnterClaimData(manager,dealerCode, invNo, invoiceDate, customerName, customerContact,
							customerAddress, filePath);
				}

			}

			if (!TestCaseTracker.isExecuted("welCallAddClaimProducts")) {
				// Fetch data from DataProvider
				Object[][] data = productData();

				for (Object[] dataSet : data) {
					// Assuming the first HashMap has the keys "productCode" and "productQty"
					HashMap<String, String> productData = (HashMap<String, String>) dataSet[0];

					String productCodeValue = productData.get("productCode"); // Use the key to access the value
					String productQty = productData.get("productQty"); // Use the key to access the value
					welCallAddClaimProducts(manager,productCodeValue, productQty);
				}
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimTotalPoints")) {
				welCallVerifyClaimTotalPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallSubmitClaim")) {
				welCallSubmitClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifySubmitClaimNavigateToClaimStatus")) {
				welCallVerifySubmitClaimNavigateToClaimStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAddedClaimOnClaimStatusMenu")) {
				welCallVerifyAddedClaimOnClaimStatusMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallOpenClaimStatusPDF")) {
				welCallOpenClaimStatusPDF(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusPDFCrossIconClickable")) {
				welCallVerifyClaimStatusPDFCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusNameFilter")) {
				welCallVerifyClaimStatusNameFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusFilterIconClickable")) {
				welCallVerifyClaimStatusFilterIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyClaimStatusFilterCrossIconClickable")) {
				welCallVerifyClaimStatusFilterCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionGiftMandatoryField")) {
				welCallVerifyRedemptionGiftMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionQtyMandatoryField")) {
				welCallVerifyRedemptionQtyMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionLockedPoints")) {
				welCallVerifyRedemptionLockedPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionRedeemablePoints")) {
				welCallVerifyRedemptionRedeemablePoints(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionTotalPoints")) {
				welCallVerifyRedemptionTotalPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionHistoryDateFilterClickable")) {
				welCallVerifyRedemptionHistoryDateFilterClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("welCallVerifyRedemptionHistoryDateFilterCrossIconClickable")) {
				welCallVerifyRedemptionHistoryDateFilterCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyMilestoneOptionClickable")) {
				welCallVerifyMilestoneOptionClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyAchivementsMenuClickable")) {
				welCallVerifyAchivementsMenuClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyAchivementsMenuCrossIconClickable")) {
				welCallVerifyAchivementsMenuCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyMilestoneCatalogMenuClickable")) {
				welCallVerifyMilestoneCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyMilestoneCatalogMenuCrossIconClickable")) {
				welCallVerifyMilestoneCatalogMenuCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRedial")) {
				welCallVerifyRedial(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyBackBtn")) {
				welCallVerifyBackBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyBackTaskStatus")) {
				welCallVerifyBackTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyBackButtonDialNext")) {
				welCallVerifyBackButtonDialNext(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyHangUp")) {
				welCallVerifyHangUp(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending")) {
				welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending")) {
				welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyCountOfPendingClaim")) {
				welCallVerifyCountOfPendingClaim(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimVerifyBtnClickable")) {
				welCallVerifyClaimVerifyBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimVerificationSubmitBtnClickable")) {
				welCallVerifyClaimVerificationSubmitBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimCancelBtnClickable")) {
				welCallVerifyClaimCancelBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimCrossIconClickable")) {
				welCallVerifyClaimCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimedPointsOfClaimVerification")) {
				welCallVerifyClaimedPointsOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty")) {
				welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef")) {
				welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf")) {
				welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus")) {
				welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus(manager);
			}	
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimWithoutSelectClaimVefRejectReason")) {
				welCallVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}	
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimIdAndTaskNoOfClaimVerification")) {
				welCallVerifyClaimIdAndTaskNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimDateOfClaimVerification")) {
				welCallVerifyClaimDateOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyCustomerNameOfClaimVerification")) {
				welCallVerifyCustomerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyStatusOfClaimVerification")) {
				welCallVerifyStatusOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyInfluencerNameOfClaimVerification")) {
				welCallVerifyInfluencerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyInfluencerMobileNoOfClaimVerification")) {
				welCallVerifyInfluencerMobileNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyTotalRecordsOfClaimVerification")) {
				welCallVerifyTotalRecordsOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimWithoutSelectClaimVefRejectReason")) {
				welCallVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}
				
			if (!TestCaseTracker.isExecuted("welCallVerifyClaimByEqualQtyApproveStatus")) {
				welCallVerifyClaimByEqualQtyApproveStatus(manager);
			}
				
			if (!TestCaseTracker.isExecuted("welCallVerifyCloseTaskBySubmitBreakBtn")) {
				welCallVerifyCloseTaskBySubmitBreakBtn(manager);
			}
/*
			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleNotInterestedBySubmitBreakBtn")) {
				welCallVerifyRescheduleNotInterestedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleNotInterestedTaskStatus")) {
				welCallVerifyRescheduleNotInterestedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleNotInterestedBySubmitBtn")) {
				welCallVerifyRescheduleNotInterestedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn")) {
				welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleRingNotReceivedTaskStatus")) {
				welCallVerifyRescheduleRingNotReceivedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleRingNotReceivedBySubmitBtn")) {
				welCallVerifyRescheduleRingNotReceivedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn")) {
				welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleCallBackLaterTaskStatus")) {
				welCallVerifyRescheduleCallBackLaterTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleCallBackLaterBySubmitBtn")) {
				welCallVerifyRescheduleCallBackLaterBySubmitBtn(manager);
			}
*/
			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleWrongNoBySubmitBreakBtn")) {
				welCallVerifyRescheduleWrongNoBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleWrongNoTaskStatus")) {
				welCallVerifyRescheduleWrongNoTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyNameFilter")) {
				outboundTaskPageVerifyNameFilter(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageOpenTaskActivity")) {
				outboundTaskPageOpenTaskActivity(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyFilterIconClickable")) {
				outboundTaskPageVerifyFilterIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("outboundTaskPageVerifyFilterCrossIconClickable")) {
				outboundTaskPageVerifyFilterCrossIconClickable(manager);
			}
			
			
			if (!TestCaseTracker.isExecuted("welCallVerifyRescheduleWrongNoBySubmitBtn")) {
				welCallVerifyRescheduleWrongNoBySubmitBtn(manager);
			}

            }catch (Exception e) {
                System.err.println("Exception during test execution: " + e.getMessage());
        	}
		}
	
		
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void welCallVerifyCloseTaskBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskBtnClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyCloseTaskBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(), "Close Task Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskBtnClickable");
	}
	
	@Test(priority = 2)
	public void welCallVerifyCloseTaskSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskSubmitBtnClickable");
		logTestMethod(driver, methodTest, manager,"welCallVerifyCloseTaskSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTasksubmitButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskSubmitBtnClickable");

	}

	@Test(priority = 3)
	public void welCallVerifyCloseTaskCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskCancelBtnClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyCloseTaskCancelBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			boolean status = true;
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTaskCancelButton();
			try {
				By closeTaskLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement closeTaskLableElement = driver.findElement(closeTaskLableLocator);
				if (closeTaskLableElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Close Task cancel button not clickable");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskCancelBtnClickable");
	}

	@Test(priority = 4)
	public void welCallVerifyCloseTaskSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest, manager,"welCallVerifyCloseTaskSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			telePage.clickOnCloseTasksubmitBreakButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit Break button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskSubmitBreakBtnClickable");

	}

	@Test(priority = 5)
	public void welCallVerifyCloseTaskCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyCloseTaskCrossIconClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			boolean status = true;
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTaskCrossIcon();
			try {
				By closeTaskLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement closeTaskLableElementElement = driver.findElement(closeTaskLableLocator);
				if (closeTaskLableElementElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Close Task Cross button not clickable");
			}
			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskCrossIconClickable");
	}

	@Test(priority = 6)
	public void welCallVerifyRescheduledBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyRescheduledBtnClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyRescheduledBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Reschedule Call");
			softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(), "Reschedule Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyRescheduledBtnClickable");

	}

	@Test(priority = 7)
	public void welCallVerifyRescheduledSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyRescheduledSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyRescheduledSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitButton();

			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("welCallVerifyRescheduledSubmitBtnClickable");
	}

	@Test(priority = 8)
	public void welCallVerifyRescheduledSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyRescheduledSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest, manager,"welCallVerifyRescheduledSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitBreakButton();
			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit & Break button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("welCallVerifyRescheduledSubmitBreakBtnClickable");
	}

	@Test(priority = 9)
	public void welCallVerifyRescheduledCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRescheduledCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRescheduledCancelBtnClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRescheduleCallCancelButton();
		try
		{
		By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement rescheduleLabelElement=driver.findElement(rescheduleLableLocator);
		if(rescheduleLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Reschedule cancel button not clickable");
		 }
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("welCallVerifyRescheduledCancelBtnClickable");
		
	}
	
	@Test(priority = 10)
	public void welCallVerifyRescheduledCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRescheduledCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRescheduledCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Reschedule Call");
		telePage.clickOnRescheduleCallCrossIcon();
		try
		{
		By rescheduleLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement rescheduleLabelElement=driver.findElement(rescheduleLableLocator);
		if(rescheduleLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Reschedule Cross button not clickable");
		 }
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("welCallVerifyRescheduledCrossIconClickable");
	}
	
	@Test(priority = 11)
	public void welCallVerifyCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyCatalogMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Catalog");
		softAssert.assertTrue(telePage.verifyCatalogOptionsDisplay(),"Catalogue button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("welCallVerifyCatalogMenuClickable");
		
	}
	
	@Test(priority = 12)
	public void welCallVerifyCatalogProductMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyCatalogProductMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyCatalogProductMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnProductCatalog();	
		softAssert.assertTrue(telePage.verifyProductCatalogLableDisplay(),"Catalogue Products button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyCatalogProductMenuClickable");
		
	}
	
	@Test(priority = 13)
	public void welCallVerifyCatalogProductCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyCatalogProductCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyCatalogProductCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnProductCatalogCrossIcon();
		try
		{
		By productCatalogueLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement productCatalogueLableElement=driver.findElement(productCatalogueLableLocator);
		if(productCatalogueLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Product Catalogue Cross button not clickable");
		 }
        softAssert.assertAll();
       
		
		
        });
        TestCaseTracker.markAsExecuted("welCallVerifyCatalogProductCrossIconClickable");

	}
	
	@Test(priority = 14)
	public void welCallVerifyPointsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyPointsMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyPointsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		softAssert.assertTrue(telePage.verifyPointsOptionsDisplay(),"Points button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyPointsMenuClickable");
	}
	
	@Test(priority = 15)
	public void welCallVerifyPointsOptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyPointsOptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyPointsOptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnPointsOption();
		softAssert.assertTrue(telePage.verifyPointsLableDisplay(),"Points Dropdown option button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyPointsOptionMenuClickable");
	}
	
	@Test(priority = 16)
	public void welCallVerifyPointsOptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyPointsOptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyPointsOptionCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnPointsMenuCrossIcon();
		try
		{
		By pointsLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement pointsLableElement=driver.findElement(pointsLableLocator);
		if(pointsLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Points page Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void welCallVerifyEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyEscalationMenuClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");	
		softAssert.assertTrue(telePage.verifyEscalationListMenuDisplay(),"Escalation button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyEscalationMenuClickable");
		
	}
	
	@Test(priority = 18)
	public void welCallVerifyEscalationListMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyEscalationListMenuClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyEscalationListMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnEscalationListMenu();
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(),"Escalation list button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyEscalationListMenuClickable");
	}
	
	@Test(priority = 19)
	public void welCallVerifyEscalationListCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyEscalationListCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyEscalationListCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnEscalationListCrossIcon();
		try
		{
		By escalationListLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement escalationListLableElement=driver.findElement(escalationListLableLocator);
		if(escalationListLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Escalation List Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void welCallVerifyAddEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddEscalationMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		softAssert.assertTrue(telePage.verifyAddEscalationMenuLableDisplay(),"Add Escalation button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddEscalationMenuClickable");
		
		
	}
	
	@Test(priority = 21)
	public void welCallVerifyAddEscalationSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddEscalationSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddEscalationSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddEscalationMenuSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddEscalationSelectTagWarningMsgDisplay(),"Add Escalation Submit button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("welCallVerifyAddEscalationSubmitBtnClickable");
		

		
	}
	
	@Test(priority = 22)
	public void welCallVerifyAddEscalationCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddEscalationCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddEscalationCancelBtnClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddEscalationMenuCancelBtn();
		try
		{
		By addEscalationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addEscalationLableElement=driver.findElement(addEscalationLableLocator);
		if(addEscalationLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("AddEscalation Cancel button not clickable");
		 }
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallVerifyAddEscalationCancelBtnClickable");
	}
	
	@Test(priority = 23)
	public void welCallVerifyAddEscalationCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddEscalationCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddEscalationCrossIconClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		boolean status=true;
		telePage.clickOnAddEscalationMenuCrossIcon();
		try
		{
		By addEscalationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addEscalationLableElement=driver.findElement(addEscalationLableLocator);
		if(addEscalationLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Escalation Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void welCallVerifyRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionMenuClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuDisplay(),"Redemption button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionMenuClickable");
	}
	
	@Test(priority = 25)
	public void welCallVerifyRedemptionHistoryMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionHistoryMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionHistoryMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedemptionHistoryMenu();
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"Redemption History button not clickable");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionHistoryMenuClickable");
	}
	
	@Test(priority = 26)
	public void welCallVerifyRedemptionHistoryCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionHistoryCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyRedemptionHistoryCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedemptionHistoryCrossIcon();
		try
		{
		By redemptionHistoryLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement redemptionHistoryLableElement=driver.findElement(redemptionHistoryLableLocator);
		if(redemptionHistoryLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Redemption History Cross button not clickable");
		 }
        softAssert.assertAll();
       
        });
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void welCallVerifyAddRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddRedemptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		softAssert.assertTrue(telePage.verifyAddRedemptionMenuLableDisplay(),"Add Redemption button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddRedemptionMenuClickable");
		
	}
	
	@Test(priority = 28)
	public void welCallVerifyAddRedemptionSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddRedemptionSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddRedemptionSubmitBtnClickable", () -> {		
        SoftAssert softAssert = new SoftAssert();
        telePage = new OutboundTelecallingPage(driver);
        telePage.clickOnAddRedemptionSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Add Redemption Submit button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddRedemptionSubmitBtnClickable");
		
	}
	
	@Test(priority = 29)
	public void welCallVerifyAddRedemptionCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddRedemptionCancelBtnClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyAddRedemptionCancelBtnClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddRedemptionCancelBtn();
		try
		{
		By addRedemptionLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addRedemptionLableElement=driver.findElement(addRedemptionLableLocator);
		if(addRedemptionLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Redemption Cancel button not clickable");
		 }
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallVerifyAddRedemptionCancelBtnClickable");
		
	}
	
	@Test(priority = 30)
	public void welCallVerifyAddRedemptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddRedemptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddRedemptionCrossIconClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		boolean status=true;
		telePage.clickOnAddRedemptionCrossIcon();
		try
		{
		By addRedemptionLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addRedemptionLableElement=driver.findElement(addRedemptionLableLocator);
		if(addRedemptionLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Add Redemption Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddRedemptionCrossIconClickable");
		
	}

	@Test(priority = 31)
	public void welCallVerifyClaimAddBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("welCallVerifyClaimAddBtnClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyClaimAddBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		softAssert.assertTrue(telePage.verifyAddClaimMenuDisplay(),"Claim Add button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimAddBtnClickable");
	}

	@Test(priority = 32)
	public void welCallVerifyAddClaimBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimBtnClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyAddClaimBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimMenu();
		softAssert.assertTrue(telePage.verifyAddClaimMenuLableDisplay(),"Add Claim button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimBtnClickable");

	}
	
	@Test(priority = 33)
	public void welCallVerifyAddClaimSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimSubmitBtnClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyAddClaimSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealerFieldWarningMsgDisplay(),"Add Claim Submit button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimSubmitBtnClickable");
		
	}
	
	@Test(priority = 34)
	public void welCallVerifyAddClaimCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimCancelBtnClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimCancelBtn();
		try
		{
		By addClaimLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement addClaimLableElement=driver.findElement(addClaimLableLocator);
		if(addClaimLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
		
		}
		 if(!status)
		 {
			 softAssert.fail("Add Claim Cancel button not clickable");
		 }
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimCancelBtnClickable");
	}
	
	@Test(priority = 35)
	public void welCallVerifyAddClaimCrossBtnClickable(TaskTypeManager manager) throws IOException 
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimCrossBtnClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimCrossBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		boolean status = true;
		telePage.clickOnAddClaimCrossIcon();
		try
		{
			By addClaimLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
			WebElement addClaimLableElement=driver.findElement(addClaimLableLocator);
			if(addClaimLableElement.isDisplayed())
			{
				status=false;
			}
			}catch(Exception e)
			{
				
			}
			 if(!status)
			 {
				 softAssert.fail("Add Claim Cross button not clickable");
			 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimCrossBtnClickable");
	}
	
	@Test(priority = 36)
	public void welCallVerifyClaimStatusMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyClaimStatusMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(),"Claim Status button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusMenuClickable");
	}
	
	@Test(priority = 37)
	public void welCallVerifyClaimStatusCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyClaimStatusCrossIconClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		boolean status = true;
		telePage.clickOnClaimStatusCrossIcon();
		try
		{
			By claimStatusLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
			WebElement claimStatusLableElement=driver.findElement(claimStatusLableLocator);
			if(claimStatusLableElement.isDisplayed())
			{
				status=false;
			}
			}catch(Exception e)
			{
				
			}
			 if(!status)
			 {
				 softAssert.fail("Claim Status Cross button not clickable");
			 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusCrossIconClickable");
	
	}
	
	@Test(priority = 38)
	public void welCallVerifyClaimMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyClaimMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnVerifyClaimMenu();
		softAssert.assertTrue(telePage.verifyVerifyClaimMenuLableDisplay(),"Verify Claim button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimMenuClickable");
	}
	
  
	@Test(priority = 39)
	public void welCallAddEscalation(TaskTypeManager manager) throws IOException   
	{
		ExtentTest methodTest = test.createNode("welCallAddEscalation");
        logTestMethod(driver,methodTest, manager,"welCallAddEscalation", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		telePage.selectEscalationDropdownOption("ESC005"); 
		telePage.enterEscalationRemark("Escalation Added");
		telePage.clickOnAddEscalationMenuSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddEscalationSuccessPopUpDisplay(),"Escalation Not Getting Submit");
		telePage.clickOnAddEscalationSuccessPopUpOkBtn();
	    softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("welCallAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void welCallVerifySubmitEscalationNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifySubmitEscalationNavigation");
        logTestMethod(driver,methodTest,manager, "welCallVerifySubmitEscalationNavigation", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(), "Not navigate to Escalation List page");
		softAssert.assertAll();	
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifySubmitEscalationNavigation");
		
	} 
	
	
	@Test(priority = 41)
	public void welCallVerifyEscaListNameFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyEscaListNameFilter");
        logTestMethod(driver,methodTest,manager, "welCallVerifyEscaListNameFilter", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnEscalationListMenu();
		telePage.enterTextInEscalationSerachFilter("Escalation");		
		softAssert.assertTrue(telePage.verifyEscalationListNoRecordsLableDisplay(),"Escalation Filter Name not working");	
		softAssert.assertAll();
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyEscaListNameFilter");
		
	}
		
	@Test(priority = 42)
	public void welCallVerifyAddClaimDealFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimDealFieldMandatory");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimDealFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimDealFieldMandatory");
		
		
	}
	
	@Test(priority = 43)
	public void welCallVerifyAddClaimCustNameFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimCustNameFieldMandatory");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimCustNameFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNameFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimCustNameFieldMandatory");
	}
	
	@Test(priority = 44)
	public void welCallVerifyAddClaimCustContactFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimCustContactFieldMandatory");
        logTestMethod(driver,methodTest, manager,"welCallVerifyAddClaimCustContactFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNumberFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimCustContactFieldMandatory");
	}
	
	@Test(priority = 45)
	public void welCallVerifyAddClaimAddressFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimAddressFieldMandatory");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimAddressFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimCustAddressFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimAddressFieldMandatory");
		
	}
	
	@Test(priority = 46)
	public void welCallVerifyAddClaimProductFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimProductFieldMandatory");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimProductFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimProductFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimProductFieldMandatory");
		
	}
	
	@Test(priority = 47)
	public void welCallVerifyAddClaimPointsFieldMandatory(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimPointsFieldMandatory");
		logTestMethod(driver, methodTest,manager, "welCallVerifyAddClaimPointsFieldMandatory", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnTransactionButton("Claim/Add");
			telePage.clickOnAddClaimMenu();
			telePage.clickOnAddClaimSubmitBtn();
			softAssert.assertTrue(telePage.verifyAddClaimPointsFieldWarningMsgDisplay(),
					"Error message should be displayed for mandatory field.");
			softAssert.assertAll();
		});
		telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddClaimPointsFieldMandatory");

	}
	
	@Test(priority = 48)
	public void welCallVerifyAddClaimQtyFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAddClaimQtyFieldMandatory");
       logTestMethod(driver,methodTest,manager, "welCallVerifyAddClaimQtyFieldMandatory", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Claim/Add");
	telePage.clickOnAddClaimMenu();
	telePage.clickOnAddClaimSubmitBtn();		
	softAssert.assertTrue(telePage.verifyAddClaimQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
    softAssert.assertAll();
        });
       telePage.clickOnAddClaimCrossIcon();
	TestCaseTracker.markAsExecuted("welCallVerifyAddClaimQtyFieldMandatory");
		
	}	
	
	@Test(priority = 49)
	public void welCallVerifyProductNotSelectClickOnAddBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyProductNotSelectClickOnAddBtnForAddClaim");
        logTestMethod(driver,methodTest,manager, "welCallVerifyProductNotSelectClickOnAddBtnForAddClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimPlusBtn();		
		softAssert.assertTrue(telePage.verifyAddClaimErrorToastForPlusBtnDisplay(),"If product field is blank & still added new product Error message should be displayed .");	
		softAssert.assertAll();
		telePage.waitInvisibilityOfAddClaimErrorToastForPlusBtn();  
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyProductNotSelectClickOnAddBtnForAddClaim");
		
	}
	
	@Test(priority = 50)
	public void welCallProductNotSelectClickOnDeleteBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallProductNotSelectClickOnDeleteBtnForAddClaim");
        logTestMethod(driver,methodTest,manager, "welCallProductNotSelectClickOnDeleteBtnForAddClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimDeleteBtn();		
		softAssert.assertTrue(telePage.verifyAddClaimErrorToastForDeleteBtnDisplay(),"While Delete Product atlist one product should be added..");	
		softAssert.assertAll();
		telePage.waitInvisibilityOfAddClaimErrorToastForDeleteBtn();    
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("welCallProductNotSelectClickOnDeleteBtnForAddClaim");
		
	}
		
	@Test(priority = 51, dataProvider = "customerData")
	public void welCallEnterClaimData(TaskTypeManager manager,String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException, IOException 

	{
		ExtentTest methodTest = test.createNode("welCallEnterClaimData");
        logTestMethod(driver,methodTest, manager,"welCallEnterClaimData", () -> {
        SoftAssert softAssert = new SoftAssert();
        telePage = new OutboundTelecallingPage(driver);
    	telePage.clickOnTransactionButton("Claim/Add");
    	telePage.clickOnAddClaimMenu();
		try {
			telePage.enterAddClaimCustomerDetails(dealerCode, invNo, invoiceDate, customerName, customerContact, customerAddress,
					filePath);
		} catch (InterruptedException e) {
			softAssert.fail("Customer Details not getting added successfully");
			e.printStackTrace();
		}
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallEnterClaimData");

	}
	
	@Test(priority = 52, dataProvider = "productData")
	public void welCallAddClaimProducts(TaskTypeManager manager,String productCodeValue, String productQty) throws InterruptedException, IOException   {

		ExtentTest methodTest = test.createNode("welCallAddClaimProducts");
        logTestMethod(driver,methodTest, manager,"welCallAddClaimProducts", () -> {
        	 SoftAssert softAssert = new SoftAssert();
        	telePage = new OutboundTelecallingPage(driver);
		try {
			telePage.selectAddClaimProducts(productCodeValue, productQty);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			softAssert.fail("Customer Details not getting added successfully");
			e.printStackTrace();
		}
		// Click on + button to add another product
		if (i < productData().length) {
			telePage.clickOnAddClaimPlusBtn();
			i++;
		}
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallAddClaimProducts");
	}
	
	

	@Test(priority = 53)
	public void welCallVerifyClaimTotalPoints(TaskTypeManager manager) throws IOException 
	{ 
		ExtentTest methodTest = test.createNode("welCallVerifyClaimTotalPoints");
        logTestMethod(driver,methodTest,manager, "welCallVerifyClaimTotalPoints", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
        //Get Count of rows
		int totalProductCount=telePage.getCountOfTotalRowsOnAddClaimPage();
		for(int i=1; i<totalProductCount; i++)
		{
			int points=telePage.getPointsValueOnAddClaim(i);
			System.out.println("Add Claim Points :" + points);
		
			int qty=telePage.getQtyValueOnAddClaim(i);
			System.out.println("Add Claim Qty :"+ qty);
			
 			 
 			double pointsAndQty= (points*qty);
 			System.out.println("points * Qty :"+pointsAndQty);
 			
 			double decimalTotalPoints= pointsAndQty/1000;
 			System.out.println("decimalClaimedPoints :"+decimalTotalPoints);
 			
 			int expectedTotalPoints =(int) Math.round(decimalTotalPoints);
 			System.out.println(" Expected Total Points  :" +expectedTotalPoints);
			
			int actualTotalPoints =telePage.getTotalPointsValueOnAddClaim(i);
			System.out.println("Actual Total Points :" +actualTotalPoints);
			softAssert.assertEquals(actualTotalPoints,expectedTotalPoints,"Total Points are incorrect");
		}
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void welCallSubmitClaim(TaskTypeManager manager) throws IOException

	{
		ExtentTest methodTest = test.createNode("welCallSubmitClaim");
        logTestMethod(driver,methodTest, manager,"welCallSubmitClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();
		generatedClaimID =telePage.getClaimIDOfAddedClaim();
		System.out.println("generatedClaimID :"+ generatedClaimID);
		softAssert.assertTrue(telePage.verifyAddedClaimSuccessDialogBoxDisplay(),"Claim Not getting Submit");
		telePage.clickOnAddClaimSuccessDialogOkBtn();
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void welCallVerifySubmitClaimNavigateToClaimStatus(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifySubmitClaimNavigateToClaimStatus");
        logTestMethod(driver,methodTest, manager,"welCallVerifySubmitClaimNavigateToClaimStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(), "Not Navigate to Claim Status Page");
		softAssert.assertAll();	
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifySubmitClaimNavigateToClaimStatus");	
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void welCallVerifyAddedClaimOnClaimStatusMenu(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyAddedClaimOnClaimStatusMenu");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAddedClaimOnClaimStatusMenu", () -> {
		// Verify added claim in claim Status Details
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyAddClaimIdDisplayOnClaimStatusPage(generatedClaimID),
					" Added claim not showing on claim status");
		
		softAssert.assertAll();
		
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyAddedClaimOnClaimStatusMenu");
	}
	
	@Test(priority = 57, alwaysRun = true)
	public void welCallOpenClaimStatusPDF(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("welCallOpenClaimStatusPDF");
        logTestMethod(driver,methodTest, manager,"welCallOpenClaimStatusPDF", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusViewPDF();
		softAssert.assertTrue(telePage.verifyClaimStatusPDFLableDisplay(),"View Claim Status PDF not Geeting Open");	
		softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("welCallOpenClaimStatusPDF");
		
		
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void welCallVerifyClaimStatusPDFCrossIconClickable(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusPDFCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyClaimStatusPDFCrossIconClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		boolean status=true;
		telePage.clickOnClaimStatusPDFCrossIcon();
		try
		{
			By claimStatusPDFLable=By.xpath("//label[text()=\"Claim Status PDF\"]");
		WebElement claimStatusPDFLableElement=driver.findElement(claimStatusPDFLable);
		if(claimStatusPDFLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Status PDF Cross button not clickable");
		 }
        softAssert.assertAll();
        
	});
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusPDFCrossIconClickable");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void welCallVerifyClaimStatusNameFilter(TaskTypeManager manager) throws IOException
	{	
		
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusNameFilter");
        logTestMethod(driver,methodTest, manager,"welCallVerifyClaimStatusNameFilter", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.enterTextInEscalationSerachFilter("Claim Status");
		softAssert.assertTrue(telePage.verifyClaimStatusNoRecordsLableDisplay(),"Claim Status Filter Name not working");
		softAssert.assertAll();
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void welCallVerifyClaimStatusFilterIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusFilterIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyClaimStatusFilterIconClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusDateFilterIcon();
		softAssert.assertTrue(telePage.verifyClaimStatusDateFilterLableDisplay()," Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusFilterIconClickable");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void welCallVerifyClaimStatusFilterCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyClaimStatusFilterCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyClaimStatusFilterCrossIconClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		boolean status=true;
		telePage.clickOnClaimStatusDateFilterCrossIcon();
		try
		{
			By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
		   WebElement filterLableElement=driver.findElement(filterLableLocator);
		if(filterLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Filter  Cross button not clickable");
		 }
        softAssert.assertAll();
        
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimStatusFilterCrossIconClickable");
		
	}

	
	@Test(priority = 62, alwaysRun = true)
	public void welCallVerifyRedemptionGiftMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionGiftMandatoryField");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionGiftMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void welCallVerifyRedemptionQtyMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionQtyMandatoryField");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionQtyMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionQtyMandatoryField");
	}	
	
	@Test(priority = 64, alwaysRun = true)
	public void welCallVerifyRedemptionLockedPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionLockedPoints");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionLockedPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedLockedPoints=0;	
		//get  new locked points
		newLockedPoints =telePage.getRedemptionLockedPoints();
		 System.out.println(" New Locked Points : " + newLockedPoints);
		 softAssert.assertEquals(newLockedPoints,newExpectedLockedPoints,"Locked Points are incorrect.");
	     softAssert.assertAll(); 
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("welCallVerifyRedemptionLockedPoints");	
	}
	
	@Test(priority = 65, alwaysRun = true)
	public void welCallVerifyRedemptionRedeemablePoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionRedeemablePoints");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionRedeemablePoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedReedemablePoints=0;
		System.out.println("Expected Reedemable Points : " +newExpectedReedemablePoints);
		//get Reedemable points 
		newReedemablePoints =telePage.getRedemptionReedemablePoints();
		System.out.println("New Reedemable Points : " + newReedemablePoints);
		softAssert.assertEquals(newReedemablePoints,newExpectedReedemablePoints,"Reedamable Points are incorrect.");
	    softAssert.assertAll();   
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("welCallVerifyRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 66, alwaysRun = true)
	public void welCallVerifyRedemptionTotalPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionTotalPoints");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionTotalPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedTotalPoints=0;
		System.out.println("Expected Total Points : " +newExpectedTotalPoints);
		//get Total points  
		newTotalPoints=telePage.getRedemptionTotalPoints();
		System.out.println("New Total Points : " + newTotalPoints);
		softAssert.assertEquals(newTotalPoints,newExpectedTotalPoints,"Total Points are incorrect.");
	    softAssert.assertAll();   
        });
        telePage.clickOnAddRedemptionCrossIcon();
	 	TestCaseTracker.markAsExecuted("welCallVerifyRedemptionTotalPoints");
		
	}	

	@Test(priority = 67, alwaysRun = true)
	public void welCallVerifyRedemptionHistoryDateFilterClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionHistoryDateFilterClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedemptionHistoryDateFilterClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnRedemptionHistoryMenu();
		telePage.clickOnRedHistoryDateFilterIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDateFilterLableDisplay()," Date Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionHistoryDateFilterClickable");
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void welCallVerifyRedemptionHistoryDateFilterCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyRedemptionHistoryDateFilterCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "welCallVerifyRedemptionHistoryDateFilterCrossIconClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			boolean status = true;
			telePage.clickOnRedHistoryDateFilterCrossIcon();
			try {
				By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
				WebElement filterLableElement = driver.findElement(filterLableLocator);
				if (filterLableElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Filter  Cross button not clickable");
			}
			softAssert.assertAll();

		});
		telePage.clickOnRedemptionHistoryCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyRedemptionHistoryDateFilterCrossIconClickable");

	}
	
	@Test(priority = 69, alwaysRun = true)
	public void welCallVerifyMilestoneOptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyMilestoneOptionClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyMilestoneOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		softAssert.assertTrue(telePage.verifyMilestoneOptionsDisplay(),"Milestone button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("welCallVerifyMilestoneOptionClickable");
	}
	
	
	@Test(priority = 70, alwaysRun = true)
	public void welCallVerifyAchivementsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAchivementsMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyAchivementsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAchivementsMenu();	
		softAssert.assertTrue(telePage.verifyAchivementsLableDisplay(),"Achivement Menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyAchivementsMenuClickable");
	}
	
	@Test(priority = 71, alwaysRun = true)
	public void welCallVerifyAchivementsMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyAchivementsMenuCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyAchivementsMenuCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAchivementsMenuCrossIcon();
		try
		{
		By achivementLableLocator=By.xpath("//label[text()='Achivements']");
		WebElement achivementLableElement=driver.findElement(achivementLableLocator);
		if(achivementLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Achivements Cross button not clickable");
		 }
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyAchivementsMenuCrossIconClickable");

	}
	
	@Test(priority = 72, alwaysRun = true)
	public void welCallVerifyMilestoneCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyMilestoneCatalogMenuClickable");
        logTestMethod(driver,methodTest,manager, "welCallVerifyMilestoneCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		telePage.clickOnMilestoneCatalogMenu();	
		softAssert.assertTrue(telePage.verifyMilestoneCatalogLableDisplay(),"Milestone catalog menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("welCallVerifyMilestoneCatalogMenuClickable");
	}
	
	@Test(priority = 73, alwaysRun = true)
	public void welCallVerifyMilestoneCatalogMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyMilestoneCatalogMenuCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"welCallVerifyMilestoneCatalogMenuCrossIconClickable", () -> {
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnMilestoneCatalogMenuCrossIcon();
		try
		{
		By milestoneCatalogueLableLocator=By.xpath("//label[text()='Catalog']");
		WebElement milestoneCatalogueLableElement=driver.findElement(milestoneCatalogueLableLocator);
		if(milestoneCatalogueLableElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Milestone Catalogue Cross button not clickable");
		 }
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("welCallVerifyMilestoneCatalogMenuCrossIconClickable");

	}
	
	
	
	@Test(priority = 74, alwaysRun = true)
	public void welCallVerifyRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("welCallVerifyRedial");
        logTestMethod(driver,methodTest,manager, "welCallVerifyRedial", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		String oldTaskNo = telePage.getTelePageTaskNo();
		// click on Redial button
		telePage.clickOnCallActionButton("Redial");
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		String newTaskNo =telePage.getTelePageTaskNo();
		softAssert.assertEquals(newTaskNo, oldTaskNo, "Test Failed : Redial button not working properly");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyRedial");
	}
	
	
	
	@Test(priority = 75, alwaysRun = true)
	public void welCallVerifyBackBtn(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("welCallVerifyBackBtn");
        logTestMethod(driver,methodTest, manager,"welCallVerifyBackBtn", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		backButtonTaskNo= telePage.getTelePageTaskNo();
		System.out.println("backButtonTaskNo :"+ backButtonTaskNo);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		telePage.clickOnCallActionButton("Back");
		//verify Dial Next button display or not
		softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay()," Back Button Not working proper");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("welCallVerifyBackBtn");
		 
	}
	
	@Test(priority = 76, alwaysRun = true)
	public void welCallVerifyBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("welCallVerifyBackTaskStatus");
        logTestMethod(driver,methodTest, manager,"welCallVerifyBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status for Back Button : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", "Back Button status Should be show as pending.");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("welCallVerifyBackTaskStatus");
		
		}
		
	
	@Test(priority = 77, alwaysRun = true)
	public void welCallVerifyBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("welCallVerifyBackButtonDialNext");
        logTestMethod(driver,methodTest,  manager,"welCallVerifyBackButtonDialNext", () ->{ 
		dialerPage=new DialerLoginPage(driver);
		//Verify after back task when click on dial next then same task should be open
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		outboundPage.clickOnDialNextButton();
		try {
			dialerPage.checkErrorToast();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	 
		String newTaskNo=telePage.getTelePageTaskNo();
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"incorrect call connect");
		
		softAssert.assertAll();
        });
	   TestCaseTracker.markAsExecuted("welCallVerifyBackButtonDialNext");
		
	}
	
	@Test(priority = 78, alwaysRun = true)
	public void welCallVerifyHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("welCallVerifyHangUp");
        logTestMethod(driver,methodTest, manager, "welCallVerifyHangUp", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		 hangUpTaskNo=telePage.getTelePageTaskNo();
		 telePage.clickOnCallActionButton("Hangup");
		 String loaderMsg= telePage.getLoaderMsg();
		 System.out.println("Loader Msg : "+loaderMsg);
		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Hang Up Button not working proper");
		telePage.waitInVisibilityOfLoader();
		softAssert.assertAll();
        });
        try
        {
        	outboundPage.clickOnDialNextButton();
        }catch(Exception e)
        {
        	
        }
		 TestCaseTracker.markAsExecuted("welCallVerifyHangUp");
				
	}
	
	@Test(priority = 79, alwaysRun = true)
	public void welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest, manager, "welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");

			String claimStatus = telePage.getClaimStatusOnCloseTask();
			System.out.println("Claim Status : " + claimStatus);

			telePage.enterCloseTaskRemark("Close Task");

			telePage.clickOnCloseTasksubmitButton();

			if (claimStatus.equals("Pending")) {
				softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),
						"User should not be closed Task if claim status is pending");

			}
			telePage.clickOnCloseTaskDialogBoxOkBtn();

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");

	}

	@Test(priority = 80, alwaysRun = true)
	public void welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {

		ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest, manager, "welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");

			String claimStatus = telePage.getClaimStatusOnCloseTask();
			System.out.println("Claim Status : " + claimStatus);

			telePage.enterCloseTaskRemark("Close Task");

			telePage.clickOnCloseTasksubmitBreakButton();

			if (claimStatus.equals("Pending")) {
				softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),
						"User should not be closed Task if claim status is pending");
			}
			telePage.clickOnCloseTaskDialogBoxOkBtn();

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");

	}

	@Test(priority = 81, alwaysRun = true)
	public void welCallVerifyCountOfPendingClaim(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCountOfPendingClaim");
		logTestMethod(driver, methodTest, manager, "welCallVerifyCountOfPendingClaim", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnTransactionButton("Claim/Add");	
			telePage.clickOnVerifyClaimMenu();
			int expectedPendingClaimCount = telePage.getRowCountOfPendingClaim();
			System.out.println(" Expected Pending Claim Count : " + expectedPendingClaimCount);

			String stringPendingClaims = telePage.getTextOfPendingClaimCount();
			System.out.println("stringPendingClaims :" + stringPendingClaims);
			String[] stringParts = stringPendingClaims.split(":");
			String claimCountPart = stringParts[1].trim();
			int actualPendingClaimCount = Integer.parseInt(claimCountPart);
			System.out.println("Actual Pending Claim Count : " + actualPendingClaimCount);

			softAssert.assertEquals(actualPendingClaimCount, expectedPendingClaimCount,
					"Pending Claim Count showing incorrect.");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyCountOfPendingClaim");

	}

	@Test(priority = 82, alwaysRun = true)
	public void welCallVerifyClaimVerifyBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimVerifyBtnClickable");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyClaimVerifyBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();

			softAssert.assertTrue(telePage.verifyClaimVerificationLabelDisplay(), "Claim Verify button not clickable");

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyClaimVerifyBtnClickable");

	}

	@Test(priority = 83, alwaysRun = true)
	public void welCallVerifyClaimVerificationSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimVerificationSubmitBtnClickable");
		logTestMethod(driver, methodTest, manager, "welCallVerifyClaimVerificationSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
			softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimStatusFieldDisplay(),
					"Claim Verification Submit button not clickable");

			softAssert.assertAll();
			telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyClaimVerificationSubmitBtnClickable");
	}

	@Test(priority = 84, alwaysRun = true)
	public void welCallVerifyClaimCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimCancelBtnClickable");
		logTestMethod(driver, methodTest, manager, "welCallVerifyClaimCancelBtnClickable", () -> {
			boolean status = true;
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationCancelBtn();
			try {
				By claimVerificationLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement claimVerifLabelElement = driver.findElement(claimVerificationLableLocator);
				if (claimVerifLabelElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Claim Verification cancel button not clickable");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyClaimCancelBtnClickable");

	}

	@Test(priority = 85, alwaysRun = true)
	public void welCallVerifyClaimCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimCrossIconClickable");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyClaimCrossIconClickable", () -> {
			boolean status = true;
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			telePage.clickOnClaimVerificationCrossIcon();
			try {
				By claimVerifLableLocator = By.xpath("//h6[@class=\"my-0\"]/label");
				WebElement claimVerifLabelElement = driver.findElement(claimVerifLableLocator);
				if (claimVerifLabelElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("Claim Verification Cross button not clickable");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyClaimCrossIconClickable");
	}

	@Test(priority = 86, alwaysRun = true)
	public void welCallVerifyClaimedPointsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimedPointsOfClaimVerification");
		logTestMethod(driver, methodTest, manager, "welCallVerifyClaimedPointsOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
				int points = telePage.getPointsValueOfClaimVerification(i);
				System.out.println("Claim Verification Points :" + points);

				int claimedQty = telePage.getClaimedQtyOfClaimVerification(i);
				System.out.println("Claim Verification Claimed Qty  :" + claimedQty);

				double pointsAndQty = (points * claimedQty);
				System.out.println("points * Qty :" + pointsAndQty);
				double decimalClaimedPoints = pointsAndQty / 1000;

				System.out.println("decimalClaimedPoints :" + decimalClaimedPoints);
				int expectedClaimedPoints = (int) Math.round(decimalClaimedPoints);
				System.out.println("Claim Verification Expected Claimed Points  :" + expectedClaimedPoints);

				int actualClaimedPoints = telePage.getClaimedPointsOfClaimVerification(i);
				System.out.println("Claim Verification Actual Claimed Points  :" + actualClaimedPoints);
				softAssert.assertEquals(actualClaimedPoints, expectedClaimedPoints, "Claimed Points are incorrect");

				softAssert.assertAll();
			}	
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimedPointsOfClaimVerification");

	}

	@Test(priority = 87, alwaysRun = true)
	public void welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
		logTestMethod(driver, methodTest, manager, "welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();

			for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
				int claimedQty = telePage.getClaimedQtyOfClaimVerification(i);
				System.out.println("Claim Verification Claimed Qty  :" + claimedQty);

				int verifyQty = claimedQty + 1;
				String strVerifyQty = String.valueOf(verifyQty);
				System.out.println("Enter Max Verify Qty : " + strVerifyQty);

				telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i, strVerifyQty);

			}
			telePage.clickOnClaimVerificationSubmitBtn();
			softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimMaxQtyDisplay(),
					"If Enter Qty more than Claimed Qty then error msg should be show");
			telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimMaxQty();
			
			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("welCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty");

	}

	@Test(priority = 88, alwaysRun = true)
	public void welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef(TaskTypeManager manager) throws InterruptedException, IOException {
		// If we select claim status approve then Rejected Reason field should not be show
		ExtentTest methodTest = test.createNode("welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef");
		logTestMethod(driver, methodTest, manager, "welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

				try {
					telePage.selectClaimVerificationStatus(i, "Ok");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				try {
					softAssert.assertFalse(telePage.verifyClaimVerificationSelectReasonFieldDisplay(i),
							"If claim Status is 'OK' the Reason Field should be not be show");
				} catch (Exception e) {
				}
			}
			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("welCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef");

	}

	@Test(priority = 89, alwaysRun = true)
	public void welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(TaskTypeManager manager)throws InterruptedException, IOException {
		// If we select claim status Reject then Rejected Reason field should be show
		ExtentTest methodTest = test.createNode("welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

				try {
					telePage.selectClaimVerificationStatus(i, "Not ok");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				softAssert.assertTrue(telePage.verifyClaimVerificationSelectReasonFieldDisplay(i),
						"If claim Status is \"Not OK\" the Reason Field should be  be show");

			}
			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("welCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");

	}

	@Test(priority = 90, alwaysRun = true)
	public void welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus");
		logTestMethod(driver, methodTest, manager, "welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus", () -> {
        // If we select Claim Status Reject then Verify Qty & Points should be show "0".
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

				try {
					telePage.selectClaimVerificationStatus(i, "Not ok");
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				String expectedQtyValue = "0";

				String actualQtyValue = telePage.getVerifyQtyOfClaimVerification(i);
				System.out.println("verify Qty  : " + actualQtyValue);

				softAssert.assertEquals(actualQtyValue, expectedQtyValue,
						"After Select Claim Status \"Not OK\" Qty should be show 0.");

				String expectedPointsValue = "0";

				String actualPointsValue = telePage.getTotalVerifyPointsOfClaimVerification(i);
				System.out.println("verify Points : " + actualPointsValue);

				softAssert.assertEquals(actualPointsValue, expectedPointsValue,
						"After Select Claim Status \"Not OK\" Points should be show 0.");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyQtyAndPointsForClaimVerificationNotOkStatus");

	}

	@Test(priority = 91, alwaysRun = true)
	public void welCallVerifyClaimWithoutSelectClaimVefRejectReason(TaskTypeManager manager) throws IOException {
       // If we select Claim Status Reject & if Reason field Blank then Error pop-up should be display
		ExtentTest methodTest = test.createNode("welCallVerifyClaimWithoutSelectClaimVefRejectReason");
		logTestMethod(driver, methodTest, manager, "welCallVerifyClaimWithoutSelectClaimVefRejectReason", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
			softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForReasonFieldDisplay(),
					"If select Claim Status Reject & Keep Reject Reason Blank and submit claim then error msg should be show");

			telePage.waitInvisibilityOfErrorToastMsgForClaimVefReasonField();
			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimWithoutSelectClaimVefRejectReason");

	}

	@Test(priority = 92, alwaysRun = true)
	public void welCallVerifyClaimIdAndTaskNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimIdAndTaskNoOfClaimVerification");
		logTestMethod(driver, methodTest, manager, "welCallVerifyClaimIdAndTaskNoOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String expectedClaimIdAndTaskNo = telePage.getClaimVefDetailsClaimIdAndTaskNo(1);
			System.out.println("expectedClaimIdAndTaskNo : " + expectedClaimIdAndTaskNo);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String actualClaimIdAndTaskNo = telePage.getClaimVerificationClaimIdAndTaskNo();
			System.out.println("actualClaimIdAndTaskNo : " + actualClaimIdAndTaskNo);
			softAssert.assertEquals(actualClaimIdAndTaskNo, expectedClaimIdAndTaskNo,
					"Claim Id & Task No of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimIdAndTaskNoOfClaimVerification");
	}

	@Test(priority = 93, alwaysRun = true)
	public void welCallVerifyClaimDateOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyClaimDateOfClaimVerification");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyClaimDateOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String expectedClaimDate = telePage.getClaimVefDetailsClaimDate(1);
			System.out.println("expectedClaimDate : " + expectedClaimDate);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String actualClaimDate = telePage.getClaimVerificationClaimDate();
			System.out.println("actualClaimDate : " + actualClaimDate);
			softAssert.assertEquals(actualClaimDate, expectedClaimDate,
					"Claim Date of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyClaimDateOfClaimVerification");
	}

	@Test(priority = 94, alwaysRun = true)
	public void welCallVerifyCustomerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyCustomerNameOfClaimVerification");
		logTestMethod(driver, methodTest, manager, "welCallVerifyCustomerNameOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String expectedCustomerName = telePage.getClaimVefDetailsCustomerName(1);
			System.out.println("expectedCustomerName : " + expectedCustomerName);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String actualCustomerName = telePage.getClaimVerificationCustomerName();
			System.out.println("actualCustomerName : " + actualCustomerName);
			softAssert.assertEquals(actualCustomerName.toLowerCase(), expectedCustomerName.toLowerCase(),
					"Customer Name of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyCustomerNameOfClaimVerification");
	}

	@Test(priority = 95, alwaysRun = true)
	public void welCallVerifyStatusOfClaimVerification(TaskTypeManager manager) throws IOException {
        //Claim Status Should be show Pending
		ExtentTest methodTest = test.createNode("welCallVerifyStatusOfClaimVerification");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyStatusOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			for (int i = 1; i <= telePage.getRowCountOfPendingClaim(); i++) {
				String actualClaimStatus = telePage.getClaimVefDetailsClaimStatus(i);
				System.out.println("actualClaimStatus : " + actualClaimStatus);
				softAssert.assertEquals(actualClaimStatus, "Pending", " Claim Verification Status should be Pending.");
			}
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("welCallVerifyStatusOfClaimVerification");

	}

	@Test(priority = 96, alwaysRun = true)
	public void welCallVerifyInfluencerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyInfluencerNameOfClaimVerification");
		logTestMethod(driver, methodTest, manager, "welCallVerifyInfluencerNameOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String expectedInfluencerName = telePage.getOpenedTaskInfluencerName();
			System.out.println("expectedInfluencerName : " + expectedInfluencerName);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String actualInfluencerName = telePage.getClaimVerificationInfluencerName();
			System.out.println("actualInfluencerName : " + actualInfluencerName);
			softAssert.assertEquals(actualInfluencerName.toLowerCase(), expectedInfluencerName.toLowerCase(),
					"Influencer Name of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyInfluencerNameOfClaimVerification");
	}

	@Test(priority = 97, alwaysRun = true)
	public void welCallVerifyInfluencerMobileNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyInfluencerMobileNoOfClaimVerification");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyInfluencerMobileNoOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String expectedInfluencerMobileNo = telePage.getOpenedTaskInfluencerMobileNo();
			System.out.println("expectedInfluencerMobileNo : " + expectedInfluencerMobileNo);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String actualInfluencerMobileNo = telePage.getClaimVerificationInfluencerMobileNo();
			System.out.println("actualInfluencerMobileNo : " + actualInfluencerMobileNo);
			softAssert.assertEquals(actualInfluencerMobileNo, expectedInfluencerMobileNo,
					"Influencer Mobile No. of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyInfluencerMobileNoOfClaimVerification");
	}

	@Test(priority = 98, alwaysRun = true)
	public void welCallVerifyTotalRecordsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("welCallVerifyTotalRecordsOfClaimVerification");
		logTestMethod(driver, methodTest,  manager,"welCallVerifyTotalRecordsOfClaimVerification", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();
			String stringCount = telePage.getClaimVerificationTotalRecordsCount();
			int actualCount = Integer.parseInt(stringCount);
			System.out.println("actualCount : " + actualCount);
			int expectedCount = telePage.getRowsCountOfSpecificClaim();
			System.out.println("expectedCount : " + expectedCount);
			softAssert.assertEquals(actualCount, expectedCount, "Total Records of Claim Verification is incorrect.");

			softAssert.assertAll();
		});
		telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("welCallVerifyTotalRecordsOfClaimVerification");
	}

	@Test(priority = 99, alwaysRun = true)
	public void welCallVerifyClaimByEqualQtyApproveStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {

			ExtentTest methodTest = test.createNode("welCallVerifyClaimByEqualQtyApproveStatus");
			logTestMethod(driver, methodTest, manager, "welCallVerifyClaimByEqualQtyApproveStatus", () -> {
				
				for (int i = rowsCount; i >= 1; i--) {
					telePage.clickOnVerifyButtonOfClaimVerification(i);

					for (int j = 1; j <= telePage.getRowsCountOfSpecificClaim(); j++) {

						telePage.getTotalVerifyPointsOfClaimVerification(j);
						try {
							telePage.selectClaimVerificationStatus(j, "Ok");
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(j),
								"Total Verify Points of Claim Verification is Incorrect.");
					}
					telePage.clickOnClaimVerificationSubmitBtn();
					softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),
							"Claim Verification not getting submit.");
					telePage.clickOnClaimVerificationSuccessPopupOkBtn();
				}
				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("welCallVerifyClaimByEqualQtyApproveStatus");
			telePage.clickOnClaimVerificationCancelBtn();
		} else {
			System.out.println("Records not available for Claim verification");
		}
	}
	
	    @Test(priority = 100, alwaysRun = true)
		public void welCallVerifyCloseTaskBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			outboundPage=new OutBoundTaskPage(driver);
				ExtentTest methodTest = test.createNode("welCallVerifyCloseTaskBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyCloseTaskBySubmitBreakBtn", () -> {
					String closeTaskTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No For Close Task By Submit & Break Button  : " + closeTaskTaskNo);
					telePage.clickOnCallActionButton("Close Task");
					telePage.enterCloseTaskRemark("Close Task");
					// click on submit & break button
					telePage.clickOnCloseTasksubmitBreakButton();
					// click on "Ok" button
					telePage.clickOnCloseTaskDialogBoxOkBtn();
					telePage.waitInVisibilityOfLoader();
					String taskStatus = outboundPage.getOutboundPageTaskStatus(closeTaskTaskNo);
					System.out.println("Dashboard Task Status Close Task :" + taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", "If we close task then status should be show as closed");
					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("welCallVerifyCloseTaskBySubmitBreakBtn");
		}
	    
		
		@Test(priority = 101, alwaysRun = true)
		public void welCallVerifyRescheduleNotInterestedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleNotInterestedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleNotInterestedBySubmitBreakBtn", () -> {
					notInterestedTakNo = telePage.getTelePageTaskNo();
					System.out.println("Task No - Reschedule-Not Interested -Submit & break button : "
							+ notInterestedTakNo);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Not interested");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");
					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleNotInterestedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Welcome Call");
				manager.executeTask();
			}

		}

		@Test(priority = 102, alwaysRun = true)
		public void welCallVerifyRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("welCallVerifyRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleNotInterestedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
				String taskStatus = outboundPage.getOutboundPageTaskStatus(notInterestedTakNo);
				System.out.println("Dashboard Task status - Rechedule- Not Interested : "
						+ notInterestedTakNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Not Interested then task should be closed.");

				softAssert.assertAll();
			});

			TestCaseTracker.markAsExecuted("welCallVerifyRescheduleNotInterestedTaskStatus");

		}
		
		@Test(priority = 103, alwaysRun = true)
		public void welCallVerifyRescheduleNotInterestedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleNotInterestedBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleNotInterestedBySubmitBtn", () -> {
					String taskNoNotInterestedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of -Reschedule-Not Interested-Submit button : "
							+ taskNoNotInterestedSubmit);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Not interested");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet. ");
					}

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleNotInterestedBySubmitBtn");
			} else {
				System.out.println("Task type is not Welcome Call");
				manager.executeTask();
			}

		}

		@Test(priority = 104, alwaysRun = true)
		public void welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn", () -> {
					ringNotReceivedTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No- Reschedule-Ringing Not Received -Submit & break button : "
							+ ringNotReceivedTaskNo);
					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Ringing not received");
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Ring Not Received");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");

					softAssert.assertAll();

				});

				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Welcome Call");
				manager.executeTask();
			}

		}
		
		
		@Test(priority = 105, alwaysRun = true)
		public void welCallVerifyRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("welCallVerifyRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest,  manager,"welCallVerifyRescheduleRingNotReceivedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);

				String taskStatus = outboundPage.getOutboundPageTaskStatus(ringNotReceivedTaskNo);
				System.out.println("Dashboard Task status - Rechedule- Ringing Not Received : "
						+ ringNotReceivedTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Ringing Not Received then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("welCallVerifyRescheduleRingNotReceivedTaskStatus");

		}
			
		@Test(priority = 106, alwaysRun = true)
		public void welCallVerifyRescheduleRingNotReceivedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleRingNotReceivedBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleRingNotReceivedBySubmitBtn", () -> {
					String taskNoRigNotReceivedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of - Reschedule-Ring Not Received -Submit button : "
							+ taskNoRigNotReceivedSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Ringing not received");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Not interested");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet. ");
					}

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleRingNotReceivedBySubmitBtn");
			} else {
				System.out.println("Task type is not Welcome Call.");
				manager.executeTask();
			}

		}
	 		
		
		@Test(priority = 107, alwaysRun = true)
		public void welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn");
				logTestMethod(driver, methodTest,  manager,"welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn", () -> {

					callBackLaterTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No Reschedule-Call Back Later -Submit & break button : "
							+ callBackLaterTaskNo);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					// Click on Schedule time (+15 min)--Based On button index we can change time
					telePage.clickOnCallBackLaterTime(3);

					telePage.enterRescheduleRemark("Remark : Call Back Later");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reschedule call by submit & break button then call should be paused.");

					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleCallBackLaterBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Welcome Call.");
				manager.executeTask();
			}

		}
		
		@Test(priority = 108, alwaysRun = true)
		public void welCallVerifyRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("welCallVerifyRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleCallBackLaterTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);

				String taskStatus = outboundPage.getOutboundPageTaskStatus(callBackLaterTaskNo);

				System.out.println("Dashboard Task status Rechedule- Call Back Later : "
						+ callBackLaterTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Call Back Later then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("welCallVerifyRescheduleCallBackLaterTaskStatus");

		}
		
		
		@Test(priority = 109, alwaysRun = true)
		public void welCallVerifyRescheduleCallBackLaterBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleCallBackLaterBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleCallBackLaterBySubmitBtn", () -> {
					
					String taskNoCallBackLaterSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Reschedule  -Call Back Later -Submit button : "
							+ taskNoCallBackLaterSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Call Back Later");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

					telePage.clickOnCallBackLaterTime(3);

					telePage.enterRescheduleRemark("Remark : Call Back Later");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Reschedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleCallBackLaterBySubmitBtn");
			}

			else {
				System.out.println("Task type is not Welcome Call.");
				manager.executeTask();
			}

		}
		
		
		
		@Test(priority = 110, alwaysRun = true)
		public void welCallVerifyRescheduleWrongNoBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleWrongNoBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleWrongNoBySubmitBreakBtn", () -> {
					wrongTaskNo = telePage.getTelePageTaskNo();
					System.out.println(
							"Task No Reschedule- Wrong no-Submit & break button : " + wrongTaskNo);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reshedule call by submit & break button then call should be paused.");

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("welCallVerifyRescheduleWrongNoBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Welcome Call.");
				manager.executeTask();
			}

		}
		
		@Test(priority = 111, alwaysRun = true)
		public void welCallVerifyRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {

			ExtentTest methodTest = test.createNode("welCallVerifyRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest,  manager,"welCallVerifyRescheduleWrongNoTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
	
				String taskStatus = outboundPage.getOutboundPageTaskStatus(wrongTaskNo);

				System.out.println(
						"Dashboard Task status Rechedule-Wrong No : " + wrongTaskNo + "- " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Wrong then task should be closed.");

				softAssert.assertAll();

			});

			TestCaseTracker.markAsExecuted("welCallVerifyRescheduleWrongNoTaskStatus");

		}
		
		@Test(priority = 112, alwaysRun = true)
		public void outboundTaskPageVerifyNameFilter(TaskTypeManager manager) throws InterruptedException, IOException
		{	
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyNameFilter");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyNameFilter", () ->{ 
			SoftAssert softAssert = new SoftAssert(); 
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.enterTextInOutboundtaskPageSerachFilter("Outbound Task");
			softAssert.assertTrue(outboundPage.verifyOutboundPageNoRecordsLableDisplay(),"Outbound Task Name filter not working");
			driver.navigate().refresh();
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyNameFilter");

		}
		
		@Test(priority = 113, alwaysRun = true)
		public void outboundTaskPageOpenTaskActivity(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("outboundTaskPageOpenTaskActivity");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageOpenTaskActivity", () ->{ 
			SoftAssert softAssert = new SoftAssert(); 
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.clickOnOutboundTaskPageTaskNo();
			softAssert.assertTrue(outboundPage.verifyOutboundPageTaskAcivityLableDisplay(),"Task Activity Not open.");
			softAssert.assertAll();
	        });
	        outboundPage.clickOnOutboundTaskPageTaskActivityCrossIcon();
			TestCaseTracker.markAsExecuted("outboundTaskPageOpenTaskActivity");
		}
		
		@Test(priority = 114, alwaysRun = true)
		public void outboundTaskPageVerifyFilterIconClickable(TaskTypeManager manager) throws IOException
		{
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyFilterIconClickable");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyFilterIconClickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			outboundPage.clickOnOutboundTaskPageDateFilterIcon();
			softAssert.assertTrue(outboundPage.verifyOutbundTaskPageDateFilterLableDisplay()," Filter Icon not working");
			softAssert.assertAll();
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyFilterIconClickable");
		}
		
		@Test(priority = 115, alwaysRun = true)
		public void outboundTaskPageVerifyFilterCrossIconClickable(TaskTypeManager manager) throws IOException
		{
			ExtentTest methodTest = test.createNode("outboundTaskPageVerifyFilterCrossIconClickable");
	        logTestMethod(driver,methodTest,manager, "outboundTaskPageVerifyFilterCrossIconClickable", () ->{ 
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			boolean status=true;
			outboundPage.clickOnOutboundTaskPageDatefilterCrossIcon();
			try
			{
				By filterLableLocator = By.xpath("//span[text()=\"Filter\"]");
			   WebElement filterLableElement=driver.findElement(filterLableLocator);
			if(filterLableElement.isDisplayed())
			{
				status=false;
			}
			}catch(Exception e)
			{
				
			}
			 if(!status)
			 {
				 softAssert.fail("Filter  Cross button not clickable");
			 }
	        softAssert.assertAll();
	        
	        });
			TestCaseTracker.markAsExecuted("outboundTaskPageVerifyFilterCrossIconClickable");
	
		}
	
		@Test(priority = 116, alwaysRun = true)
		public void welCallVerifyRescheduleWrongNoBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Welcome Call")) {
				ExtentTest methodTest = test.createNode("welCallVerifyRescheduleWrongNoBySubmitBtn");
				logTestMethod(driver, methodTest, manager, "welCallVerifyRescheduleWrongNoBySubmitBtn", () -> {
					String taskNoWrongNoSubmit = telePage.getTelePageTaskNo();
					System.out
							.println("Task no. of Reschedule-Wrong no-Submit button : " + taskNoWrongNoSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number");
					telePage.clickOnRescheduleCallSubmitButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();
					try {
						if (outboundPage.nextDialText().isDisplayed()) {
							System.out.println("No calls are scheduled");
						}

					} catch (Exception e) {

						softAssert.assertTrue(telePage.taskNameAndNoPopUp().isDisplayed(),
								"If Recshedule task by Submit button then next call should be connet.");
					}

					softAssert.assertAll();
				});

				// TestCaseTracker.markAsExecuted("welCallVerifyRescheduleWrongNoBySubmitBtn");
			} else {
				System.out.println("Task type is not Welcome Call.");
				manager.executeTask();
			}

		}
	 		
	
	@DataProvider(name = "productData")
	public Object[][] productData() {
		// call method to read & enter json data
		Object[][] dataArray = readJsonData(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\fortune\\jsondata\\AddClaimProducts.json");

		return dataArray;
	};

	@DataProvider(name = "customerData")
	public Object[][] customerDetails() {

		// call method to read & enter json data
		Object[][] dataArray = readJsonData(System.getProperty("user.dir")
				+ "\\src\\test\\resource\\com\\fortune\\jsondata\\CustomerClaimDetails.json");
		
		return dataArray;


	};
	


}
