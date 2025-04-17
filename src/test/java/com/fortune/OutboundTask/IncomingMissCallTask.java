package com.fortune.OutboundTask;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.fortune.base.OutboundTaskBaseClass;
import com.fortune.pageobjects.DialerLoginPage;
import com.fortune.pageobjects.OutBoundTaskPage;
import com.fortune.pageobjects.OutboundTelecallingPage;
import com.fortune.retryanalyzer.Retry;




public class IncomingMissCallTask extends OutboundTaskBaseClass{
	 
	
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
	private int expectedRedemptionPoints;
	private int oldLockedPoints;
	private int oldReedemablePoints;
	private int oldTotalPoints;
	private int newTotalPoints ;
	private int newLockedPoints;
	private int newReedemablePoints;
	private String addedRedemptionNumber;
	
	
	ExtentTest test;
	
	 public IncomingMissCallTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
		public int missCallMethodsCount()

		{
			Class<?> clazz = IncomingMissCallTask.class;

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
	
		public void runTests(TaskTypeManager manager) throws IOException, InterruptedException {

			try
			{
				
				
			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskBtnClickable")) {

				missCallVerifyCloseTaskBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskSubmitBtnClickable")) {
				missCallVerifyCloseTaskSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskCancelBtnClickable")) {
				missCallVerifyCloseTaskCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskSubmitBreakBtnClickable")) {
				missCallVerifyCloseTaskSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskCrossIconClickable")) {
				missCallVerifyCloseTaskCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduledBtnClickable")) {
				missCallVerifyRescheduledBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduledSubmitBtnClickable")) {
				missCallVerifyRescheduledSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduledSubmitBreakBtnClickable")) {
				missCallVerifyRescheduledSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduledCancelBtnClickable")) {
				missCallVerifyRescheduledCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduledCrossIconClickable")) {
				missCallVerifyRescheduledCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCatalogMenuClickable")) {
				missCallVerifyCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCatalogProductMenuClickable")) {
				missCallVerifyCatalogProductMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyCatalogProductCrossIconClickable")) {
				missCallVerifyCatalogProductCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyPointsMenuClickable")) {
				missCallVerifyPointsMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyPointsOptionMenuClickable")) {
				missCallVerifyPointsOptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyPointsOptionCrossIconClickable")) {
				missCallVerifyPointsOptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyEscalationMenuClickable")) {
				missCallVerifyEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyEscalationListMenuClickable")) {
				missCallVerifyEscalationListMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyEscalationListCrossIconClickable")) {
				missCallVerifyEscalationListCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddEscalationMenuClickable")) {
				missCallVerifyAddEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddEscalationSubmitBtnClickable")) {
				missCallVerifyAddEscalationSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddEscalationCancelBtnClickable")) {
				missCallVerifyAddEscalationCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddEscalationCrossIconClickable")) {
				missCallVerifyAddEscalationCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionMenuClickable")) {
				missCallVerifyRedemptionMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryMenuClickable")) {
				missCallVerifyRedemptionHistoryMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryCrossIconClickable")) {
				missCallVerifyRedemptionHistoryCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddRedemptionMenuClickable")) {
				missCallVerifyAddRedemptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddRedemptionSubmitBtnClickable")) {
				missCallVerifyAddRedemptionSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddRedemptionCancelBtnClickable")) {
				missCallVerifyAddRedemptionCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddRedemptionCrossIconClickable")) {
				missCallVerifyAddRedemptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimAddBtnClickable")) {
				missCallVerifyClaimAddBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimBtnClickable")) {
				missCallVerifyAddClaimBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimSubmitBtnClickable")) {
				missCallVerifyAddClaimSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimCancelBtnClickable")) {
				missCallVerifyAddClaimCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimCrossBtnClickable")) {
				missCallVerifyAddClaimCrossBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusMenuClickable")) {
				missCallVerifyClaimStatusMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusCrossIconClickable")) {
				missCallVerifyClaimStatusCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimMenuClickable")) {
				missCallVerifyClaimMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallAddEscalation")) {
				missCallAddEscalation(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifySubmitEscalationNavigation")) {
				missCallVerifySubmitEscalationNavigation(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyEscaListNameFilter")) {
				missCallVerifyEscaListNameFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimDealFieldMandatory")) {
				missCallVerifyAddClaimDealFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimCustNameFieldMandatory")) {
				missCallVerifyAddClaimCustNameFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimCustContactFieldMandatory")) {
				missCallVerifyAddClaimCustContactFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimAddressFieldMandatory")) {
				missCallVerifyAddClaimAddressFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimProductFieldMandatory")) {
				missCallVerifyAddClaimProductFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimPointsFieldMandatory")) {
				missCallVerifyAddClaimPointsFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddClaimQtyFieldMandatory")) {
				missCallVerifyAddClaimQtyFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyProductNotSelectClickOnAddBtnForAddClaim")) {
				missCallVerifyProductNotSelectClickOnAddBtnForAddClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallProductNotSelectClickOnDeleteBtnForAddClaim")) {
				missCallProductNotSelectClickOnDeleteBtnForAddClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallEnterClaimData")) {
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

					missCallEnterClaimData(manager,dealerCode, invNo, invoiceDate, customerName, customerContact,
							customerAddress, filePath);
				}

			}

			if (!TestCaseTracker.isExecuted("missCallAddClaimProducts")) {
				// Fetch data from DataProvider
				Object[][] data = productData();

				for (Object[] dataSet : data) {
					// Assuming the first HashMap has the keys "productCode" and "productQty"
					HashMap<String, String> productData = (HashMap<String, String>) dataSet[0];

					String productCodeValue = productData.get("productCode"); // Use the key to access the value
					String productQty = productData.get("productQty"); // Use the key to access the value
					missCallAddClaimProducts(manager,productCodeValue, productQty);
				}
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimTotalPoints")) {
				missCallVerifyClaimTotalPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallSubmitClaim")) {
				missCallSubmitClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifySubmitClaimNavigateToClaimStatus")) {
				missCallVerifySubmitClaimNavigateToClaimStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddedClaimOnClaimStatusMenu")) {
				missCallVerifyAddedClaimOnClaimStatusMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallOpenClaimStatusPDF")) {
				missCallOpenClaimStatusPDF(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusPDFCrossIconClickable")) {
				missCallVerifyClaimStatusPDFCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusNameFilter")) {
				missCallVerifyClaimStatusNameFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusFilterIconClickable")) {
				missCallVerifyClaimStatusFilterIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClaimStatusFilterCrossIconClickable")) {
				missCallVerifyClaimStatusFilterCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionGiftMandatoryField")) {
				missCallVerifyRedemptionGiftMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionQtyMandatoryField")) {
				missCallVerifyRedemptionQtyMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionPoints")) {
				// Fetch data from DataProvider
				Object[][] data = redemptionDetails();

				for (Object[] dataSet : data) {

					HashMap<String, String> redemptionData = (HashMap<String, String>) dataSet[0];

					String rewardCode = redemptionData.get("GiftName"); // Use the key to access the value
					String rewardQty = redemptionData.get("RewardQty"); // Use the key to access the value

					missCallVerifyRedemptionPoints(manager,rewardCode, rewardQty);
				}
			}

			if (!TestCaseTracker.isExecuted("missCallSubmitRedemption")) {
				missCallSubmitRedemption(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionSubmitNavigation")) {
				missCallVerifyRedemptionSubmitNavigation(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAddedRemptionInRedemptionHistory")) {
				missCallVerifyAddedRemptionInRedemptionHistory(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyNameFilterOfRedemptionHistory")) {
				missCallVerifyNameFilterOfRedemptionHistory(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryViewDetailsClickable")) {
				missCallVerifyRedemptionHistoryViewDetailsClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable")) {
				missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryViewPDFClickable")) {
				missCallVerifyRedemptionHistoryViewPDFClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryViewPDFCrossIconClickable")) {
				missCallVerifyRedemptionHistoryViewPDFCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryDateFilterClickable")) {
				missCallVerifyRedemptionHistoryDateFilterClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryDateFilterCrossIconClickable")) {
				missCallVerifyRedemptionHistoryDateFilterCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionHistoryStatusFilter")) {
				missCallVerifyRedemptionHistoryStatusFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionLockedPoints")) {
				missCallVerifyRedemptionLockedPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionRedeemablePoints")) {
				missCallVerifyRedemptionRedeemablePoints(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedemptionTotalPoints")) {
				missCallVerifyRedemptionTotalPoints(manager);
			}

//			if (!TestCaseTracker.isExecuted("missCallVerifyEarnPointsOfPointsMenu")) {
//				missCallVerifyEarnPointsOfPointsMenu(manager);
//			}

			if (!TestCaseTracker.isExecuted("missCallVerifyClosingPointsOfPointsMenu")) {
				missCallVerifyClosingPointsOfPointsMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyLockPointsOfPointsMenu")) {
				missCallVerifyLockPointsOfPointsMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedeemablePointsOfPointsMenu")) {
				missCallVerifyRedeemablePointsOfPointsMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyMilestoneOptionClickable")) {
				missCallVerifyMilestoneOptionClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyAchivementsMenuClickable")) {
				missCallVerifyAchivementsMenuClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyAchivementsMenuCrossIconClickable")) {
				missCallVerifyAchivementsMenuCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyMilestoneCatalogMenuClickable")) {
				missCallVerifyMilestoneCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyMilestoneCatalogMenuCrossIconClickable")) {
				missCallVerifyMilestoneCatalogMenuCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRedial")) {
				missCallVerifyRedial(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyBackBtn")) {
				missCallVerifyBackBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyBackTaskStatus")) {
				missCallVerifyBackTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyBackButtonDialNext")) {
				missCallVerifyBackButtonDialNext(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyHangUp")) {
				missCallVerifyHangUp(manager);
			}
				
			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending")) {
				missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending")) {
				missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyCountOfPendingClaim")) {
				missCallVerifyCountOfPendingClaim(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimVerifyBtnClickable")) {
				missCallVerifyClaimVerifyBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimVerificationSubmitBtnClickable")) {
				missCallVerifyClaimVerificationSubmitBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimCancelBtnClickable")) {
				missCallVerifyClaimCancelBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimCrossIconClickable")) {
				missCallVerifyClaimCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimedPointsOfClaimVerification")) {
				missCallVerifyClaimedPointsOfClaimVerification(manager);
			}
			
			
			if (!TestCaseTracker.isExecuted("missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty")) {
				missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef")) {
				missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf")) {
				missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus")) {
				missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus(manager);
			}	
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimWithoutSelectClaimVefRejectReason")) {
				missCallVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}	
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimIdAndTaskNoOfClaimVerification")) {
				missCallVerifyClaimIdAndTaskNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimDateOfClaimVerification")) {
				missCallVerifyClaimDateOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyCustomerNameOfClaimVerification")) {
				missCallVerifyCustomerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyStatusOfClaimVerification")) {
				missCallVerifyStatusOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyInfluencerNameOfClaimVerification")) {
				missCallVerifyInfluencerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyInfluencerMobileNoOfClaimVerification")) {
				missCallVerifyInfluencerMobileNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyTotalRecordsOfClaimVerification")) {
				missCallVerifyTotalRecordsOfClaimVerification(manager);
			}
				
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimWithoutSelectClaimVefRejectReason")) {
				missCallVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimByEqualQtyRejectStatus")) {
				missCallVerifyClaimByEqualQtyRejectStatus(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimByApproveAndRejectStatus")) {
				missCallVerifyClaimByApproveAndRejectStatus(manager);
			}
			
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimByLessQtyApproveStatus")) {
				missCallVerifyClaimByLessQtyApproveStatus(manager);
			}
				
			if (!TestCaseTracker.isExecuted("missCallVerifyClaimByEqualQtyApproveStatus")) {
				missCallVerifyClaimByEqualQtyApproveStatus(manager);
			}
		
			if (!TestCaseTracker.isExecuted("missCallVerifyCloseTaskBySubmitBreakBtn")) {
				missCallVerifyCloseTaskBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleNotInterestedBySubmitBreakBtn")) {
				missCallVerifyRescheduleNotInterestedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleNotInterestedTaskStatus")) {
				missCallVerifyRescheduleNotInterestedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleNotInterestedBySubmitBtn")) {
				missCallVerifyRescheduleNotInterestedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn")) {
				missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleRingNotReceivedTaskStatus")) {
				missCallVerifyRescheduleRingNotReceivedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleRingNotReceivedBySubmitBtn")) {
				missCallVerifyRescheduleRingNotReceivedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn")) {
				missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleCallBackLaterTaskStatus")) {
				missCallVerifyRescheduleCallBackLaterTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleCallBackLaterBySubmitBtn")) {
				missCallVerifyRescheduleCallBackLaterBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleWrongNoBySubmitBreakBtn")) {
				missCallVerifyRescheduleWrongNoBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleWrongNoTaskStatus")) {
				missCallVerifyRescheduleWrongNoTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("missCallVerifyRescheduleWrongNoBySubmitBtn")) {
				missCallVerifyRescheduleWrongNoBySubmitBtn(manager);
			}else
			{
				missCallVerifyRescheduleWrongNoBySubmitBtn(manager);
			}
			

		}catch (Exception e) {
	        System.err.println("Exception during test execution: " + e.getMessage());
		}
		}
	
		@Test(priority = 1, retryAnalyzer = Retry.class)
		public void missCallVerifyCloseTaskBtnClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskBtnClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskBtnClickable", () -> {
				SoftAssert softAssert = new SoftAssert();
				telePage = new OutboundTelecallingPage(driver);
				telePage.clickOnCallActionButton("Close Task");
				softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(), "Close Task Button not clickable");
				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskBtnClickable");
		}

		@Test(priority = 2)
		public void missCallVerifyCloseTaskSubmitBtnClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskSubmitBtnClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskSubmitBtnClickable", () -> {
				SoftAssert softAssert = new SoftAssert();
				telePage = new OutboundTelecallingPage(driver);
				telePage.clickOnCloseTasksubmitButton();
				softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
						"Close Task Submit button not clickable");
				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskSubmitBtnClickable");

		}

		@Test(priority = 3)
		public void missCallVerifyCloseTaskCancelBtnClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskCancelBtnClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskCancelBtnClickable", () -> {
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
			TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskCancelBtnClickable");
		}

		@Test(priority = 4)
		public void missCallVerifyCloseTaskSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskSubmitBreakBtnClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskSubmitBreakBtnClickable", () -> {
				SoftAssert softAssert = new SoftAssert();
				telePage = new OutboundTelecallingPage(driver);
				telePage.clickOnCallActionButton("Close Task");
				telePage.clickOnCloseTasksubmitBreakButton();
				softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
						"Close Task Submit Break button not clickable");
				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskSubmitBreakBtnClickable");

		}

		@Test(priority = 5)
		public void missCallVerifyCloseTaskCrossIconClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskCrossIconClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskCrossIconClickable", () -> {
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
			TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskCrossIconClickable");
		}

		@Test(priority = 6)
		public void missCallVerifyRescheduledBtnClickable(TaskTypeManager manager) throws IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyRescheduledBtnClickable");
			logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduledBtnClickable", () -> {
				SoftAssert softAssert = new SoftAssert();
				telePage = new OutboundTelecallingPage(driver);
				telePage.clickOnCallActionButton("Reschedule Call");
				softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(), "Reschedule Button not clickable");
				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("missCallVerifyRescheduledBtnClickable");

		}

	@Test(priority = 7)
	public void missCallVerifyRescheduledSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyRescheduledSubmitBtnClickable");
		logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduledSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitButton();

			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("missCallVerifyRescheduledSubmitBtnClickable");
	}

	@Test(priority = 8)
	public void missCallVerifyRescheduledSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyRescheduledSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduledSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitBreakButton();
			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit & Break button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("missCallVerifyRescheduledSubmitBreakBtnClickable");
	}

	@Test(priority = 9)
	public void missCallVerifyRescheduledCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRescheduledCancelBtnClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyRescheduledCancelBtnClickable", () -> {
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
        TestCaseTracker.markAsExecuted("missCallVerifyRescheduledCancelBtnClickable");
		
	}
	
	@Test(priority = 10)
	public void missCallVerifyRescheduledCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRescheduledCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRescheduledCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("missCallVerifyRescheduledCrossIconClickable");
	}
	
	@Test(priority = 11)
	public void missCallVerifyCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyCatalogMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Catalog");
		softAssert.assertTrue(telePage.verifyCatalogOptionsDisplay(),"Catalogue button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("missCallVerifyCatalogMenuClickable");
		
	}
	
	@Test(priority = 12)
	public void missCallVerifyCatalogProductMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyCatalogProductMenuClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyCatalogProductMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnProductCatalog();	
		softAssert.assertTrue(telePage.verifyProductCatalogLableDisplay(),"Catalogue Products button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("missCallVerifyCatalogProductMenuClickable");
		
	}
	
	@Test(priority = 13)
	public void missCallVerifyCatalogProductCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyCatalogProductCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyCatalogProductCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("missCallVerifyCatalogProductCrossIconClickable");

	}
	
	@Test(priority = 14)
	public void missCallVerifyPointsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyPointsMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyPointsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		softAssert.assertTrue(telePage.verifyPointsOptionsDisplay(),"Points button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("missCallVerifyPointsMenuClickable");
	}
	
	@Test(priority = 15)
	public void missCallVerifyPointsOptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyPointsOptionMenuClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyPointsOptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnPointsOption();
		softAssert.assertTrue(telePage.verifyPointsLableDisplay(),"Points Dropdown option button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("missCallVerifyPointsOptionMenuClickable");
	}
	
	@Test(priority = 16)
	public void missCallVerifyPointsOptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyPointsOptionCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyPointsOptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void missCallVerifyEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyEscalationMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");	
		softAssert.assertTrue(telePage.verifyEscalationListMenuDisplay(),"Escalation button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyEscalationMenuClickable");
		
	}
	
	@Test(priority = 18)
	public void missCallVerifyEscalationListMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyEscalationListMenuClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyEscalationListMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnEscalationListMenu();
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(),"Escalation list button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyEscalationListMenuClickable");
	}
	
	@Test(priority = 19)
	public void missCallVerifyEscalationListCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyEscalationListCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyEscalationListCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void missCallVerifyAddEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddEscalationMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		softAssert.assertTrue(telePage.verifyAddEscalationMenuLableDisplay(),"Add Escalation button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyAddEscalationMenuClickable");
		
		
	}
	
	@Test(priority = 21)
	public void missCallVerifyAddEscalationSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddEscalationSubmitBtnClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddEscalationSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddEscalationMenuSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddEscalationSelectTagWarningMsgDisplay(),"Add Escalation Submit button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("missCallVerifyAddEscalationSubmitBtnClickable");
		

		
	}
	
	@Test(priority = 22)
	public void missCallVerifyAddEscalationCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddEscalationCancelBtnClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddEscalationCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("missCallVerifyAddEscalationCancelBtnClickable");
	}
	
	@Test(priority = 23)
	public void missCallVerifyAddEscalationCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddEscalationCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddEscalationCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void missCallVerifyRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuDisplay(),"Redemption button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionMenuClickable");
	}
	
	@Test(priority = 25)
	public void missCallVerifyRedemptionHistoryMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionHistoryMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedemptionHistoryMenu();
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"Redemption History button not clickable");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryMenuClickable");
	}
	
	@Test(priority = 26)
	public void missCallVerifyRedemptionHistoryCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionHistoryCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void missCallVerifyAddRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddRedemptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		softAssert.assertTrue(telePage.verifyAddRedemptionMenuLableDisplay(),"Add Redemption button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyAddRedemptionMenuClickable");
		
	}
	
	@Test(priority = 28)
	public void missCallVerifyAddRedemptionSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddRedemptionSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddRedemptionSubmitBtnClickable", () -> {		
        SoftAssert softAssert = new SoftAssert();
        telePage = new OutboundTelecallingPage(driver);
        telePage.clickOnAddRedemptionSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Add Redemption Submit button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyAddRedemptionSubmitBtnClickable");
		
	}
	
	@Test(priority = 29)
	public void missCallVerifyAddRedemptionCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddRedemptionCancelBtnClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddRedemptionCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("missCallVerifyAddRedemptionCancelBtnClickable");
		
	}
	
	@Test(priority = 30)
	public void missCallVerifyAddRedemptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddRedemptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddRedemptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyAddRedemptionCrossIconClickable");
		
	}

	@Test(priority = 31)
	public void missCallVerifyClaimAddBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("missCallVerifyClaimAddBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimAddBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		softAssert.assertTrue(telePage.verifyAddClaimMenuDisplay(),"Claim Add button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyClaimAddBtnClickable");
	}

	@Test(priority = 32)
	public void missCallVerifyAddClaimBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimMenu();
		softAssert.assertTrue(telePage.verifyAddClaimMenuLableDisplay(),"Add Claim button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimBtnClickable");

	}
	
	@Test(priority = 33)
	public void missCallVerifyAddClaimSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealerFieldWarningMsgDisplay(),"Add Claim Submit button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimSubmitBtnClickable");
		
	}
	
	@Test(priority = 34)
	public void missCallVerifyAddClaimCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimCancelBtnClickable");
	}
	
	@Test(priority = 35)
	public void missCallVerifyAddClaimCrossBtnClickable(TaskTypeManager manager) throws IOException 
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimCrossBtnClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimCrossBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimCrossBtnClickable");
	}
	
	@Test(priority = 36)
	public void missCallVerifyClaimStatusMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimStatusMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(),"Claim Status button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusMenuClickable");
	}
	
	@Test(priority = 37)
	public void missCallVerifyClaimStatusCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyClaimStatusCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusCrossIconClickable");
	
	}
	
	@Test(priority = 38)
	public void missCallVerifyClaimMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnVerifyClaimMenu();
		softAssert.assertTrue(telePage.verifyVerifyClaimMenuLableDisplay(),"Verify Claim button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyClaimMenuClickable");
	}
	
  
	@Test(priority = 39)
	public void missCallAddEscalation(TaskTypeManager manager) throws IOException   
	{
		ExtentTest methodTest = test.createNode("missCallAddEscalation");
        logTestMethod(driver,methodTest,manager, "missCallAddEscalation", () -> {
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
		TestCaseTracker.markAsExecuted("missCallAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void missCallVerifySubmitEscalationNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifySubmitEscalationNavigation");
        logTestMethod(driver,methodTest,manager, "missCallVerifySubmitEscalationNavigation", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(), "Not navigate to Escalation List page");
		softAssert.assertAll();	
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifySubmitEscalationNavigation");
		
	} 
	
	
	@Test(priority = 41)
	public void missCallVerifyEscaListNameFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyEscaListNameFilter");
        logTestMethod(driver,methodTest, manager,"missCallVerifyEscaListNameFilter", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnEscalationListMenu();
		telePage.enterTextInEscalationSerachFilter("Escalation");		
		softAssert.assertTrue(telePage.verifyEscalationListNoRecordsLableDisplay(),"Escalation Filter Name not working");	
		softAssert.assertAll();
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyEscaListNameFilter");
		
	}
	
	
	@Test(priority = 42)
	public void missCallVerifyAddClaimDealFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimDealFieldMandatory");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddClaimDealFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimDealFieldMandatory");
		
		
	}
	
	@Test(priority = 43)
	public void missCallVerifyAddClaimCustNameFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimCustNameFieldMandatory");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddClaimCustNameFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNameFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimCustNameFieldMandatory");
	}
	
	@Test(priority = 44)
	public void missCallVerifyAddClaimCustContactFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimCustContactFieldMandatory");
        logTestMethod(driver,methodTest, manager,"missCallVerifyAddClaimCustContactFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNumberFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimCustContactFieldMandatory");
	}
	
	@Test(priority = 45)
	public void missCallVerifyAddClaimAddressFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimAddressFieldMandatory");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimAddressFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimCustAddressFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimAddressFieldMandatory");
		
	}
	
	@Test(priority = 46)
	public void missCallVerifyAddClaimProductFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimProductFieldMandatory");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimProductFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimProductFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimProductFieldMandatory");
		
	}
	
	@Test(priority = 47)
	public void missCallVerifyAddClaimPointsFieldMandatory(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimPointsFieldMandatory");
		logTestMethod(driver, methodTest,manager, "missCallVerifyAddClaimPointsFieldMandatory", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyAddClaimPointsFieldMandatory");

	}
	
	@Test(priority = 48)
	public void missCallVerifyAddClaimQtyFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddClaimQtyFieldMandatory");
       logTestMethod(driver,methodTest,manager, "missCallVerifyAddClaimQtyFieldMandatory", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Claim/Add");
	telePage.clickOnAddClaimMenu();
	telePage.clickOnAddClaimSubmitBtn();		
	softAssert.assertTrue(telePage.verifyAddClaimQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
    softAssert.assertAll();
        });
       telePage.clickOnAddClaimCrossIcon();
	TestCaseTracker.markAsExecuted("missCallVerifyAddClaimQtyFieldMandatory");
		
	}
	
	
	
	@Test(priority = 49)
	public void missCallVerifyProductNotSelectClickOnAddBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyProductNotSelectClickOnAddBtnForAddClaim");
        logTestMethod(driver,methodTest, manager,"missCallVerifyProductNotSelectClickOnAddBtnForAddClaim", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyProductNotSelectClickOnAddBtnForAddClaim");
		
	}
	
	@Test(priority = 50)
	public void missCallProductNotSelectClickOnDeleteBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallProductNotSelectClickOnDeleteBtnForAddClaim");
        logTestMethod(driver,methodTest,manager, "missCallProductNotSelectClickOnDeleteBtnForAddClaim", () -> {
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
		TestCaseTracker.markAsExecuted("missCallProductNotSelectClickOnDeleteBtnForAddClaim");
		
	}
	
	
	
	
	@Test(priority = 51, dataProvider = "customerData")
	public void missCallEnterClaimData(TaskTypeManager manager,String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException, IOException 

	{
		ExtentTest methodTest = test.createNode("missCallEnterClaimData");
        logTestMethod(driver,methodTest,manager, "missCallEnterClaimData", () -> {
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
		TestCaseTracker.markAsExecuted("missCallEnterClaimData");

	}
	
	@Test(priority = 52, dataProvider = "productData")
	public void missCallAddClaimProducts(TaskTypeManager manager,String productCodeValue, String productQty) throws InterruptedException, IOException   {

		ExtentTest methodTest = test.createNode("missCallAddClaimProducts");
        logTestMethod(driver,methodTest,manager, "missCallAddClaimProducts", () -> {
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
		TestCaseTracker.markAsExecuted("missCallAddClaimProducts");
	}
	
	

	@Test(priority = 53)
	public void missCallVerifyClaimTotalPoints(TaskTypeManager manager) throws IOException 
	{ 
		ExtentTest methodTest = test.createNode("missCallVerifyClaimTotalPoints");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimTotalPoints", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void missCallSubmitClaim(TaskTypeManager manager) throws IOException

	{
		ExtentTest methodTest = test.createNode("missCallSubmitClaim");
        logTestMethod(driver,methodTest,manager, "missCallSubmitClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();
		generatedClaimID =telePage.getClaimIDOfAddedClaim();
		System.out.println("generatedClaimID :"+ generatedClaimID);
		softAssert.assertTrue(telePage.verifyAddedClaimSuccessDialogBoxDisplay(),"Claim Not getting Submit");
		telePage.clickOnAddClaimSuccessDialogOkBtn();
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void missCallVerifySubmitClaimNavigateToClaimStatus(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifySubmitClaimNavigateToClaimStatus");
        logTestMethod(driver,methodTest, manager,"missCallVerifySubmitClaimNavigateToClaimStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(), "Not Navigate to Claim Status Page");
		softAssert.assertAll();	
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifySubmitClaimNavigateToClaimStatus");	
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void missCallVerifyAddedClaimOnClaimStatusMenu(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyAddedClaimOnClaimStatusMenu");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddedClaimOnClaimStatusMenu", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyAddedClaimOnClaimStatusMenu");
	}
	
	
	
	
	@Test(priority = 57, alwaysRun = true)
	public void missCallOpenClaimStatusPDF(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("missCallOpenClaimStatusPDF");
        logTestMethod(driver,methodTest,manager, "missCallOpenClaimStatusPDF", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusViewPDF();
		softAssert.assertTrue(telePage.verifyClaimStatusPDFLableDisplay(),"View Claim Status PDF not Geeting Open");	
		softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("missCallOpenClaimStatusPDF");
		
		
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void missCallVerifyClaimStatusPDFCrossIconClickable(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusPDFCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimStatusPDFCrossIconClickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusPDFCrossIconClickable");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void missCallVerifyClaimStatusNameFilter(TaskTypeManager manager) throws IOException
	{	
		
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusNameFilter");
        logTestMethod(driver,methodTest,manager, "missCallVerifyClaimStatusNameFilter", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.enterTextInEscalationSerachFilter("Claim Status");
		softAssert.assertTrue(telePage.verifyClaimStatusNoRecordsLableDisplay(),"Claim Status Filter Name not working");
		softAssert.assertAll();
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void missCallVerifyClaimStatusFilterIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusFilterIconClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyClaimStatusFilterIconClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusDateFilterIcon();
		softAssert.assertTrue(telePage.verifyClaimStatusDateFilterLableDisplay()," Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusFilterIconClickable");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void missCallVerifyClaimStatusFilterCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyClaimStatusFilterCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyClaimStatusFilterCrossIconClickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimStatusFilterCrossIconClickable");
		
	}

	
	@Test(priority = 62, alwaysRun = true)
	public void missCallVerifyRedemptionGiftMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionGiftMandatoryField");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionGiftMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void missCallVerifyRedemptionQtyMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionQtyMandatoryField");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionQtyMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionQtyMandatoryField");
	}	
	
	
	
	
	@Test(priority = 64, dataProvider="redemptionData", alwaysRun = true)
	public void missCallVerifyRedemptionPoints(TaskTypeManager manager,String rewardCode, String rewardQty) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionPoints");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.selectRedemptionGiftDropdownOption(rewardCode);
		telePage.enterRewardQtyOfAddRedemption(rewardQty);
		int qty = Integer.parseInt(rewardQty);
		System.out.println("Reward Qty : " + qty);	
		//Get Reward Points value
		String stringRewardPoints=telePage.getRedemptionRewardPoints();
		 String[] parts = stringRewardPoints.split(":");
	     String digitPart = parts[1].trim();
		int rewardPoints = Integer.parseInt(digitPart);
		System.out.println("Reward Points : " + rewardPoints);
		//Redemption Points=Qty * rewardPoints
		 expectedRedemptionPoints= qty * rewardPoints;
		System.out.println("Expected Redemption Points : " + expectedRedemptionPoints);
		//Get Redemption Points
		String redemptionPointsValue=telePage.getRedemptionPoints();
		int actualRedemptionPoints = Integer.parseInt(redemptionPointsValue);
		System.out.println("Actual Redemption Points : " + actualRedemptionPoints);
		
		softAssert.assertEquals(actualRedemptionPoints,expectedRedemptionPoints,"Redemption Points showing Incorrect.");
         
        //get locked points  
		oldLockedPoints=telePage.getRedemptionLockedPoints();  
		System.out.println(" Old Locked Points : " + oldLockedPoints);
		
		//get Reedemable points  
		oldReedemablePoints=telePage.getRedemptionReedemablePoints();	 
		System.out.println(" Old Reedemable Points : " + oldReedemablePoints);
		
		//get Total points  
		oldTotalPoints=telePage.getRedemptionTotalPoints();
		System.out.println(" Old Total Points : " + oldTotalPoints);
		softAssert.assertAll();
        });
		
        TestCaseTracker.markAsExecuted("missCallVerifyRedemptionPoints");
	
		
	}
	
	
	@Test(priority = 65, alwaysRun = true)
	public void missCallSubmitRedemption(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallSubmitRedemption");
        logTestMethod(driver,methodTest, manager,"missCallSubmitRedemption", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddRedemptionSubmitBtn();
	    addedRedemptionNumber=telePage.getAddedRedemptionCode();
	    System.out.println("Submitted Redemption Number : "+ addedRedemptionNumber);
        softAssert.assertTrue(telePage.verifyAddRedemptionSuccessPopUpDisplay(),"Redemption Not getting submit.");
        softAssert.assertAll();
        telePage.clickOnAddRedemptionSuccessPopUpOkBtn();
        });		
        TestCaseTracker.markAsExecuted("missCallSubmitRedemption");
		
		
	}
	
	
	@Test(priority = 66, alwaysRun = true)
	public void missCallVerifyRedemptionSubmitNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionSubmitNavigation");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionSubmitNavigation", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"After Submit Redemption navigate to history page");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("missCallVerifyRedemptionSubmitNavigation");
	}
	
	@Test(priority = 67, alwaysRun = true)
	public void missCallVerifyAddedRemptionInRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAddedRemptionInRedemptionHistory");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAddedRemptionInRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyAddedRedemptionNoDisplayOnRedemptionHistory(addedRedemptionNumber),"Added Redemption not showing in Redemption History");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("missCallVerifyAddedRemptionInRedemptionHistory");
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void missCallVerifyNameFilterOfRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyNameFilterOfRedemptionHistory");
        logTestMethod(driver,methodTest,manager, "missCallVerifyNameFilterOfRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.enterTextInRedHistorySerachFilter("Redemption History");
		softAssert.assertTrue(telePage.verifyRedHistoryNoRecordsLableDisplay(),"Redemption History Name Filter  not working");
		softAssert.assertAll();
        });
        telePage.clickOnRedemptionHistoryCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyNameFilterOfRedemptionHistory");
	}
	
	@Test(priority = 69, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryViewDetailsClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryViewDetailsClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyRedemptionHistoryViewDetailsClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnRedemptionHistoryMenu();
		telePage.clickOnRedHistoryViewDetailsIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDetailsLableDisplay(),"Redemption History View Details Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryViewDetailsClickable");
		
	}

	@Test(priority = 70, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable", () -> {
			boolean status = true;
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRedHistoryViewDetailsCrossIcon();
			try {
				By viewDetailsLableLocator = By.xpath("//label[text()=\"Redemption History Details\"]");
				WebElement viewDetailsLableElement = driver.findElement(viewDetailsLableLocator);
				if (viewDetailsLableElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("View Details Cross button not clickable");
			}
			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryViewDetailsCrossIconClickable");

	}
	
	@Test(priority = 71, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryViewPDFClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryViewPDFClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionHistoryViewPDFClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryViewPdfIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryPdfLableDisplay(),"Redemption History PDF Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryViewPDFClickable");
		
	}
	
	@Test(priority = 72, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryViewPDFCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryViewPDFCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyRedemptionHistoryViewPDFCrossIconClickable", () -> {
			boolean status = true;
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRedHistoryPdfCrossIcon();
			try {
				By viewPdfLableLocator = By.xpath("//label[text()=\"Redemption Histoty PDF\"]");
				WebElement viewPdfLabelElement = driver.findElement(viewPdfLableLocator);
				if (viewPdfLabelElement.isDisplayed()) {
					status = false;
				}
			} catch (Exception e) {

			}
			if (!status) {
				softAssert.fail("View PDF Cross button not clickable");
			}
			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryViewPDFCrossIconClickable");

	}

	@Test(priority = 73, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryDateFilterClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryDateFilterClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionHistoryDateFilterClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryDateFilterIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDateFilterLableDisplay()," Date Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryDateFilterClickable");
	}
	
	@Test(priority = 74, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryDateFilterCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryDateFilterCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyRedemptionHistoryDateFilterCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryDateFilterCrossIconClickable");

	}
	
	@Test(priority = 75, alwaysRun = true)
	public void missCallVerifyRedemptionHistoryStatusFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionHistoryStatusFilter");
        logTestMethod(driver,methodTest, manager,"missCallVerifyRedemptionHistoryStatusFilter", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryDateFilterIcon();
		telePage.clickOnRedHistoryStatusDropdownField();
		telePage.selectRedHistoryStatusDropdownOption("Pending");
		telePage.clickOnRedHistoryApplyFilterBtn();
		softAssert.assertEquals(telePage.verifyStatusColumnOnRedHistory(),"Pending","Status Filter not working");
		softAssert.assertAll();
        });
        
        telePage.clickOnRedemptionHistoryCrossIcon();
		TestCaseTracker.markAsExecuted("missCallVerifyRedemptionHistoryStatusFilter");
		
	}
	
	@Test(priority = 76, alwaysRun = true)
	public void missCallVerifyRedemptionLockedPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionLockedPoints");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionLockedPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedLockedPoints=oldLockedPoints + expectedRedemptionPoints;
		System.out.println("Expected Locked Points : " +newExpectedLockedPoints);	
		//get  new locked points
		newLockedPoints=telePage.getRedemptionLockedPoints();
		 System.out.println(" New Locked Points : " + newLockedPoints);
		 softAssert.assertEquals(newLockedPoints,newExpectedLockedPoints,"Locked Points are incorrect.");
	     softAssert.assertAll(); 
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("missCallVerifyRedemptionLockedPoints");	
	}
	
	@Test(priority = 77, alwaysRun = true)
	public void missCallVerifyRedemptionRedeemablePoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionRedeemablePoints");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionRedeemablePoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedReedemablePoints=oldReedemablePoints-expectedRedemptionPoints;
		System.out.println("Expected Reedemable Points : " +newExpectedReedemablePoints);
		//get Reedemable points 
		newReedemablePoints=telePage.getRedemptionReedemablePoints();
		System.out.println("New Reedemable Points : " + newReedemablePoints);
		softAssert.assertEquals(newReedemablePoints,newExpectedReedemablePoints,"Reedamable Points are incorrect.");
	    softAssert.assertAll();   
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("missCallVerifyRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 78, alwaysRun = true)
	public void missCallVerifyRedemptionTotalPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedemptionTotalPoints");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedemptionTotalPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedTotalPoints=newLockedPoints+newReedemablePoints;
		System.out.println("Expected Total Points : " +newExpectedTotalPoints);
		//get Total points  
		newTotalPoints=telePage.getRedemptionTotalPoints();
		System.out.println("New Total Points : " + newTotalPoints);
		softAssert.assertEquals(newTotalPoints,newExpectedTotalPoints,"Total Points are incorrect.");
	    softAssert.assertAll();   
        });
        telePage.clickOnAddRedemptionCrossIcon();
	 	TestCaseTracker.markAsExecuted("missCallVerifyRedemptionTotalPoints");
		
	}	
	
	
	//@Test(priority = 79, alwaysRun = true)
	public void missCallVerifyEarnPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyEarnPointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "missCallVerifyEarnPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		telePage.clickOnPointsOption();
		String stringEarnPoints=telePage.getPointsMenuEarnPoints();
		int actualEarnPoints = Integer.parseInt(stringEarnPoints);
		int closingPoints = telePage.getPointsMenuClosingPoints();
		int lockPoints =telePage.getPointsMenuLockPoints();
		int expectedEarnPoints=closingPoints+lockPoints;
		
		System.out.println("Expected Earn Points : " + expectedEarnPoints);
		softAssert.assertEquals(actualEarnPoints,expectedEarnPoints,"Earn points are incorrect.");
        softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("missCallVerifyEarnPointsOfPointsMenu");
	}
	
	
	@Test(priority = 80, alwaysRun = true)
	public void missCallVerifyClosingPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
	ExtentTest methodTest = test.createNode("missCallVerifyClosingPointsOfPointsMenu");
    logTestMethod(driver,methodTest, manager,"missCallVerifyClosingPointsOfPointsMenu", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Points");
	telePage.clickOnPointsOption();
	int actualClosingPoints = telePage.getPointsMenuClosingPoints();
	int expectedClosingPoints=newTotalPoints;
	System.out.println("Expected Closing Points : " + expectedClosingPoints);
	softAssert.assertEquals(actualClosingPoints,expectedClosingPoints,"Closing points are incorrect.");
    softAssert.assertAll();
    });
    TestCaseTracker.markAsExecuted("missCallVerifyClosingPointsOfPointsMenu");
		
	}
	
	@Test(priority = 81, alwaysRun = true)
	public void missCallVerifyLockPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyLockPointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "missCallVerifyLockPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualLockPoints =telePage.getPointsMenuLockPoints();
		int expectedLockPoints=newLockedPoints;
		System.out.println("Expected Lock Points : " + expectedLockPoints);
		softAssert.assertEquals(actualLockPoints,expectedLockPoints,"Lock points are incorrect.");
	    softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("missCallVerifyLockPointsOfPointsMenu");
	}
	
	@Test(priority = 82, alwaysRun = true)
	public void missCallVerifyRedeemablePointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyRedeemablePointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "missCallVerifyRedeemablePointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualRedeemablePoints =telePage.getPointsMenuRedeemablePoints();
		int expectedRedeemablePoints=newReedemablePoints;
		System.out.println("Expected Redeemable Points : " + expectedRedeemablePoints);
		softAssert.assertEquals(actualRedeemablePoints,expectedRedeemablePoints,"Redeemable points are incorrect.");
	    softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("missCallVerifyRedeemablePointsOfPointsMenu");
	}
	
	
	@Test(priority = 83, alwaysRun = true)
	public void missCallVerifyMilestoneOptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyMilestoneOptionClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyMilestoneOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		softAssert.assertTrue(telePage.verifyMilestoneOptionsDisplay(),"Milestone button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("missCallVerifyMilestoneOptionClickable");
	}
	
	
	@Test(priority = 84, alwaysRun = true)
	public void missCallVerifyAchivementsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAchivementsMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAchivementsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAchivementsMenu();	
		softAssert.assertTrue(telePage.verifyAchivementsLableDisplay(),"Achivement Menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("missCallVerifyAchivementsMenuClickable");
	}
	
	@Test(priority = 85, alwaysRun = true)
	public void missCallVerifyAchivementsMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyAchivementsMenuCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyAchivementsMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("missCallVerifyAchivementsMenuCrossIconClickable");

	}
	
	@Test(priority = 86, alwaysRun = true)
	public void missCallVerifyMilestoneCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyMilestoneCatalogMenuClickable");
        logTestMethod(driver,methodTest,manager, "missCallVerifyMilestoneCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		telePage.clickOnMilestoneCatalogMenu();	
		softAssert.assertTrue(telePage.verifyMilestoneCatalogLableDisplay(),"Milestone catalog menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("missCallVerifyMilestoneCatalogMenuClickable");
	}
	
	@Test(priority = 87, alwaysRun = true)
	public void missCallVerifyMilestoneCatalogMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyMilestoneCatalogMenuCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"missCallVerifyMilestoneCatalogMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("missCallVerifyMilestoneCatalogMenuCrossIconClickable");

	}
	
	
	
	@Test(priority = 88, alwaysRun = true)
	public void missCallVerifyRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("missCallVerifyRedial");
        logTestMethod(driver,methodTest, manager,"missCallVerifyRedial", () ->{ 
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
		TestCaseTracker.markAsExecuted("missCallVerifyRedial");
	}
	
	
	
	@Test(priority = 89, alwaysRun = true)
	public void missCallVerifyBackBtn(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("missCallVerifyBackBtn");
        logTestMethod(driver,methodTest,manager, "missCallVerifyBackBtn", () ->{ 
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
		TestCaseTracker.markAsExecuted("missCallVerifyBackBtn");
		 
	}
	
	@Test(priority = 90, alwaysRun = true)
	public void missCallVerifyBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("missCallVerifyBackTaskStatus");
        logTestMethod(driver,methodTest,manager, "missCallVerifyBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status for Back Button : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", "Back Button status Should be show as pending.");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("missCallVerifyBackTaskStatus");
		
		}
	
	@Test(priority = 91, alwaysRun = true)
	public void missCallVerifyBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("missCallVerifyBackButtonDialNext");
        logTestMethod(driver,methodTest,manager, "missCallVerifyBackButtonDialNext", () ->{ 
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
	   TestCaseTracker.markAsExecuted("missCallVerifyBackButtonDialNext");
		
	}
	
	@Test(priority = 92, alwaysRun = true)
	public void missCallVerifyHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("missCallVerifyHangUp");
        logTestMethod(driver,methodTest,manager, "missCallVerifyHangUp", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		dialerPage=new DialerLoginPage(driver);
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
		 TestCaseTracker.markAsExecuted("missCallVerifyHangUp");
				
	}
	
	
	@Test(priority = 93, alwaysRun = true)
	public void missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");

	}

	@Test(priority = 94, alwaysRun = true)
	public void missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {

		ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");

	}

	@Test(priority = 95, alwaysRun = true)
	public void missCallVerifyCountOfPendingClaim(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyCountOfPendingClaim");
		logTestMethod(driver, methodTest,manager, "missCallVerifyCountOfPendingClaim", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyCountOfPendingClaim");

	}

	@Test(priority = 96, alwaysRun = true)
	public void missCallVerifyClaimVerifyBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimVerifyBtnClickable");
		logTestMethod(driver, methodTest, manager,"missCallVerifyClaimVerifyBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();

			softAssert.assertTrue(telePage.verifyClaimVerificationLabelDisplay(), "Claim Verify button not clickable");

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("missCallVerifyClaimVerifyBtnClickable");

	}

	@Test(priority = 97, alwaysRun = true)
	public void missCallVerifyClaimVerificationSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimVerificationSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyClaimVerificationSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
			softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimStatusFieldDisplay(),
					"Claim Verification Submit button not clickable");

			softAssert.assertAll();
			telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField();
		});
		TestCaseTracker.markAsExecuted("missCallVerifyClaimVerificationSubmitBtnClickable");
	}

	@Test(priority = 98, alwaysRun = true)
	public void missCallVerifyClaimCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimCancelBtnClickable");
		logTestMethod(driver, methodTest, manager,"missCallVerifyClaimCancelBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimCancelBtnClickable");

	}

	@Test(priority = 99, alwaysRun = true)
	public void missCallVerifyClaimCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "missCallVerifyClaimCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimCrossIconClickable");
	}

	@Test(priority = 100, alwaysRun = true)
	public void missCallVerifyClaimedPointsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimedPointsOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyClaimedPointsOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimedPointsOfClaimVerification");

	}

	@Test(priority = 101, alwaysRun = true)
	public void missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
		logTestMethod(driver, methodTest,manager, "missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyQtyFieldOfClaimVerificationByEnterMaxQty");

	}

	@Test(priority = 102, alwaysRun = true)
	public void missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef(TaskTypeManager manager) throws InterruptedException, IOException {
		// If we select claim status approve then Rejected Reason field should not be show
		ExtentTest methodTest = test.createNode("missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef");
		logTestMethod(driver, methodTest,manager, "missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyReasonFieldNotDisplayForOkStatusForClaimVef");

	}

	@Test(priority = 103, alwaysRun = true)
	public void missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(TaskTypeManager manager)throws InterruptedException, IOException {
		// If we select claim status Reject then Rejected Reason field should be show
		ExtentTest methodTest = test.createNode("missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");
		logTestMethod(driver, methodTest, manager,"missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");

	}

	@Test(priority = 104, alwaysRun = true)
	public void missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus");
		logTestMethod(driver, methodTest, manager,"missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyQtyAndPointsForClaimVerificationNotOkStatus");

	}

	@Test(priority = 105, alwaysRun = true)
	public void missCallVerifyClaimWithoutSelectClaimVefRejectReason(TaskTypeManager manager) throws IOException {
       // If we select Claim Status Reject & if Reason field Blank then Error pop-up should be display
		ExtentTest methodTest = test.createNode("missCallVerifyClaimWithoutSelectClaimVefRejectReason");
		logTestMethod(driver, methodTest, manager,"missCallVerifyClaimWithoutSelectClaimVefRejectReason", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimWithoutSelectClaimVefRejectReason");

	}

	@Test(priority = 106, alwaysRun = true)
	public void missCallVerifyClaimIdAndTaskNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimIdAndTaskNoOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyClaimIdAndTaskNoOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimIdAndTaskNoOfClaimVerification");
	}

	@Test(priority = 107, alwaysRun = true)
	public void missCallVerifyClaimDateOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyClaimDateOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyClaimDateOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyClaimDateOfClaimVerification");
	}

	@Test(priority = 108, alwaysRun = true)
	public void missCallVerifyCustomerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyCustomerNameOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyCustomerNameOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyCustomerNameOfClaimVerification");
	}

	@Test(priority = 109, alwaysRun = true)
	public void missCallVerifyStatusOfClaimVerification(TaskTypeManager manager) throws IOException {
        //Claim Status Should be show Pending
		ExtentTest methodTest = test.createNode("missCallVerifyStatusOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyStatusOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyStatusOfClaimVerification");

	}

	@Test(priority = 110, alwaysRun = true)
	public void missCallVerifyInfluencerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyInfluencerNameOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyInfluencerNameOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyInfluencerNameOfClaimVerification");
	}

	@Test(priority = 111, alwaysRun = true)
	public void missCallVerifyInfluencerMobileNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyInfluencerMobileNoOfClaimVerification");
		logTestMethod(driver, methodTest, manager,"missCallVerifyInfluencerMobileNoOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyInfluencerMobileNoOfClaimVerification");
	}

	@Test(priority = 112, alwaysRun = true)
	public void missCallVerifyTotalRecordsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("missCallVerifyTotalRecordsOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "missCallVerifyTotalRecordsOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("missCallVerifyTotalRecordsOfClaimVerification");
	}

	@Test(priority = 113, alwaysRun = true)
	public void missCallVerifyClaimByEqualQtyRejectStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("missCallVerifyClaimByEqualQtyRejectStatus");
			logTestMethod(driver, methodTest,manager, "missCallVerifyClaimByEqualQtyRejectStatus", () -> {
				
				telePage.clickOnFristRowVerifyBtnOfClaimVerification();
				for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

					telePage.getTotalVerifyPointsOfClaimVerification(i);
					try {
						telePage.selectClaimVerificationStatus(i, "Not ok");
						telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),
							"Total Verify Points of Claim Verification is Incorrect.");
				}
				telePage.clickOnClaimVerificationSubmitBtn();
				softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),
						"Claim Verification not getting submit.");
				telePage.clickOnClaimVerificationSuccessPopupOkBtn();

				softAssert.assertAll();

			});
			telePage.clickOnClaimVerificationCancelBtn();
			TestCaseTracker.markAsExecuted("missCallVerifyClaimByEqualQtyRejectStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}
	}

	@Test(priority = 114, alwaysRun = true)
	public void missCallVerifyClaimByApproveAndRejectStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("missCallVerifyClaimByApproveAndRejectStatus");
			logTestMethod(driver, methodTest, manager,"missCallVerifyClaimByApproveAndRejectStatus", () -> {
				
				telePage = new OutboundTelecallingPage(driver);
				List<String> statuses = Arrays.asList("Not ok", "Ok");
				telePage.clickOnFristRowVerifyBtnOfClaimVerification();
				for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

					try {
						String status = statuses.get(i % statuses.size()); // Alternates between "Approve" and "Reject

                       // Set the status for the claim
						telePage.selectClaimVerificationStatus(i, status);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					try {
						telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");

					}

					catch (Exception e) {
						System.out.println("Selected Claim Status is Approve.");
					}
					telePage.enterClaimVerificationRemark(i, "Claim Verification");

					telePage.getTotalVerifyPointsOfClaimVerification(i);
					softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),
							"Total Verify Points of Claim Verification is Incorrect.");
				}
				telePage.clickOnClaimVerificationSubmitBtn();
				softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),
						"Claim Verification not getting submit.");
				telePage.clickOnClaimVerificationSuccessPopupOkBtn();

				softAssert.assertAll();
			});
			telePage.clickOnClaimVerificationCancelBtn();
			TestCaseTracker.markAsExecuted("missCallVerifyClaimByApproveAndRejectStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}
	}

	@Test(priority = 115, alwaysRun = true)
	public void missCallVerifyClaimByLessQtyApproveStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("missCallVerifyClaimByLessQtyApproveStatus");
			logTestMethod(driver, methodTest, manager,"missCallVerifyClaimByLessQtyApproveStatus", () -> {
				
				telePage = new OutboundTelecallingPage(driver);
				telePage.clickOnFristRowVerifyBtnOfClaimVerification();
				for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

					int claimedQty = telePage.getClaimedQtyOfClaimVerification(i);
					System.out.println("Claim Verification Claimed Qty  :" + claimedQty);

					int verifyQty = claimedQty - 1;
					String strVerifyQty = String.valueOf(verifyQty);
					System.out.println("Enter Qty Less Than Claimed Qty : " + strVerifyQty);

					telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i, strVerifyQty);
					telePage.getTotalVerifyPointsOfClaimVerification(i);
					try {
						telePage.selectClaimVerificationStatus(i, "Ok");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),
							"Total Verify Points of Claim Verification is Incorrect.");
				}
				telePage.clickOnClaimVerificationSubmitBtn();
				softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),
						"Claim Verification not getting submit.");
				telePage.clickOnClaimVerificationSuccessPopupOkBtn();

				softAssert.assertAll();
			});
			telePage.clickOnClaimVerificationCancelBtn();
			TestCaseTracker.markAsExecuted("missCallVerifyClaimByLessQtyApproveStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}

	}

	@Test(priority = 116, alwaysRun = true)
	public void missCallVerifyClaimByEqualQtyApproveStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {

			ExtentTest methodTest = test.createNode("missCallVerifyClaimByEqualQtyApproveStatus");
			logTestMethod(driver, methodTest,manager, "missCallVerifyClaimByEqualQtyApproveStatus", () -> {
				
				telePage = new OutboundTelecallingPage(driver);
				for (int i = rowsCount; i >=1; i--) {
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
			telePage.clickOnClaimVerificationCancelBtn();
			TestCaseTracker.markAsExecuted("missCallVerifyClaimByEqualQtyApproveStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}

}
	
	    @Test(priority = 117, alwaysRun = true)
		public void missCallVerifyCloseTaskBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			outboundPage=new OutBoundTaskPage(driver);
				ExtentTest methodTest = test.createNode("missCallVerifyCloseTaskBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyCloseTaskBySubmitBreakBtn", () -> {
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
				TestCaseTracker.markAsExecuted("missCallVerifyCloseTaskBySubmitBreakBtn");
		}
	    
		
		
	    @Test(priority = 118, alwaysRun = true)
		public void missCallVerifyRescheduleNotInterestedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleNotInterestedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduleNotInterestedBySubmitBreakBtn", () -> {
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
				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleNotInterestedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not  Incoming Miss Call");
				manager.executeTask();
			}

		}

	    @Test(priority = 119, alwaysRun = true)
		public void missCallVerifyRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleNotInterestedTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("missCallVerifyRescheduleNotInterestedTaskStatus");

		}
		
		
	   @Test(priority = 120, alwaysRun = true)
		public void missCallVerifyRescheduleNotInterestedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleNotInterestedBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleNotInterestedBySubmitBtn", () -> {
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

				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleNotInterestedBySubmitBtn");
			} else {
				System.out.println("Task type is not Incoming Miss Call");
				manager.executeTask();
			}

		}

		@Test(priority = 121, alwaysRun = true)
		public void missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn", () -> {
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

				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Incoming Miss Call.");
				manager.executeTask();
			}

		}
		
		
		@Test(priority = 122, alwaysRun = true)
		public void missCallVerifyRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduleRingNotReceivedTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("missCallVerifyRescheduleRingNotReceivedTaskStatus");

		}
		
		
		@Test(priority = 123, alwaysRun = true)
		public void missCallVerifyRescheduleRingNotReceivedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleRingNotReceivedBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleRingNotReceivedBySubmitBtn", () -> {
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

				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleRingNotReceivedBySubmitBtn");
			} else {
				System.out.println("Task type is not Incoming Miss Call.");
				manager.executeTask();
			}

		}
	 		
		
		@Test(priority = 124, alwaysRun = true)
		public void missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn", () -> {

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
				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleCallBackLaterBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Incoming Miss Call.");
				manager.executeTask();
			}

		}
		
		@Test(priority = 125, alwaysRun = true)
		public void missCallVerifyRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("missCallVerifyRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleCallBackLaterTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("missCallVerifyRescheduleCallBackLaterTaskStatus");

		}
		
		
		@Test(priority = 126, alwaysRun = true)
		public void missCallVerifyRescheduleCallBackLaterBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleCallBackLaterBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleCallBackLaterBySubmitBtn", () -> {
					
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
				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleCallBackLaterBySubmitBtn");
			}

			else {
				System.out.println("Task type is not Incoming Miss Call.");
				manager.executeTask();
			}

		}
		
		
		
		@Test(priority = 127, alwaysRun = true)
		public void missCallVerifyRescheduleWrongNoBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleWrongNoBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduleWrongNoBySubmitBreakBtn", () -> {
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

				TestCaseTracker.markAsExecuted("missCallVerifyRescheduleWrongNoBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Incoming Miss Call.");
				manager.executeTask();
			}

		}
		
		@Test(priority = 128, alwaysRun = true)
		public void missCallVerifyRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {

			ExtentTest methodTest = test.createNode("missCallVerifyRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest, manager,"missCallVerifyRescheduleWrongNoTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("missCallVerifyRescheduleWrongNoTaskStatus");

		}
		
		
		@Test(priority = 129, alwaysRun = true)
		public void missCallVerifyRescheduleWrongNoBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Incoming Miss Call")) {
				ExtentTest methodTest = test.createNode("missCallVerifyRescheduleWrongNoBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "missCallVerifyRescheduleWrongNoBySubmitBtn", () -> {
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

				 TestCaseTracker.markAsExecuted("missCallVerifyRescheduleWrongNoBySubmitBtn");
			} else {
				System.out.println("Task type is not Incoming Miss Call.");
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
	
	@DataProvider(name = "redemptionData")
	public Object[][] redemptionDetails() {

		// call method to read & enter json data
		Object[][] dataArray = readJsonData(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\fortune\\jsondata\\RedemptionData.json");
		return dataArray;


	};


}
