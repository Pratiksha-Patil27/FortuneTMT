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
import com.fortune.base.BaseClass;
import com.fortune.pageobjects.DialerLoginPage;
import com.fortune.pageobjects.OutBoundTaskPage;
import com.fortune.pageobjects.OutboundTelecallingPage;
import com.fortune.retryanalyzer.Retry;




public class ClaimVerificationTask extends BaseClass{
	 
	
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
	
	 public ClaimVerificationTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
 
		public int claimVerificationTaskMethodsCount()

		{
			Class<?> clazz = ClaimVerificationTask.class;

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
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBtnClickable")) {

				claimTaskVerifyCloseTaskBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskSubmitBtnClickable")) {
				claimTaskVerifyCloseTaskSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskCancelBtnClickable")) {
				claimTaskVerifyCloseTaskCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskSubmitBreakBtnClickable")) {
				claimTaskVerifyCloseTaskSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskCrossIconClickable")) {
				claimTaskVerifyCloseTaskCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledBtnClickable")) {
				claimTaskVerifyRescheduledBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledSubmitBtnClickable")) {
				claimTaskVerifyRescheduledSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledSubmitBreakBtnClickable")) {
				claimTaskVerifyRescheduledSubmitBreakBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledCancelBtnClickable")) {
				claimTaskVerifyRescheduledCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduledCrossIconClickable")) {
				claimTaskVerifyRescheduledCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCatalogMenuClickable")) {
				claimTaskVerifyCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCatalogProductMenuClickable")) {
				claimTaskVerifyCatalogProductMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCatalogProductCrossIconClickable")) {
				claimTaskVerifyCatalogProductCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyPointsMenuClickable")) {
				claimTaskVerifyPointsMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyPointsOptionMenuClickable")) {
				claimTaskVerifyPointsOptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyPointsOptionCrossIconClickable")) {
				claimTaskVerifyPointsOptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyEscalationMenuClickable")) {
				claimTaskVerifyEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyEscalationListMenuClickable")) {
				claimTaskVerifyEscalationListMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyEscalationListCrossIconClickable")) {
				claimTaskVerifyEscalationListCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddEscalationMenuClickable")) {
				claimTaskVerifyAddEscalationMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddEscalationSubmitBtnClickable")) {
				claimTaskVerifyAddEscalationSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddEscalationCancelBtnClickable")) {
				claimTaskVerifyAddEscalationCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddEscalationCrossIconClickable")) {
				claimTaskVerifyAddEscalationCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionMenuClickable")) {
				claimTaskVerifyRedemptionMenuClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryMenuClickable")) {
				claimTaskVerifyRedemptionHistoryMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryCrossIconClickable")) {
				claimTaskVerifyRedemptionHistoryCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddRedemptionMenuClickable")) {
				claimTaskVerifyAddRedemptionMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddRedemptionSubmitBtnClickable")) {
				claimTaskVerifyAddRedemptionSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddRedemptionCancelBtnClickable")) {
				claimTaskVerifyAddRedemptionCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddRedemptionCrossIconClickable")) {
				claimTaskVerifyAddRedemptionCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimAddBtnClickable")) {
				claimTaskVerifyClaimAddBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimBtnClickable")) {
				claimTaskVerifyAddClaimBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimSubmitBtnClickable")) {
				claimTaskVerifyAddClaimSubmitBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimCancelBtnClickable")) {
				claimTaskVerifyAddClaimCancelBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimCrossBtnClickable")) {
				claimTaskVerifyAddClaimCrossBtnClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusMenuClickable")) {
				claimTaskVerifyClaimStatusMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusCrossIconClickable")) {
				claimTaskVerifyClaimStatusCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimMenuClickable")) {
				claimTaskVerifyClaimMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskAddEscalation")) {
				claimTaskAddEscalation(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifySubmitEscalationNavigation")) {
				claimTaskVerifySubmitEscalationNavigation(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyEscaListNameFilter")) {
				claimTaskVerifyEscaListNameFilter(manager);
			}

			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimDealFieldMandatory")) {
				claimTaskVerifyAddClaimDealFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimCustNameFieldMandatory")) {
				claimTaskVerifyAddClaimCustNameFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimCustContactFieldMandatory")) {
				claimTaskVerifyAddClaimCustContactFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimAddressFieldMandatory")) {
				claimTaskVerifyAddClaimAddressFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimProductFieldMandatory")) {
				claimTaskVerifyAddClaimProductFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimPointsFieldMandatory")) {
				claimTaskVerifyAddClaimPointsFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddClaimQtyFieldMandatory")) {
				claimTaskVerifyAddClaimQtyFieldMandatory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim")) {
				claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskProductNotSelectClickOnDeleteBtnForAddClaim")) {
				claimTaskProductNotSelectClickOnDeleteBtnForAddClaim(manager);
			}
			
			

			if (!TestCaseTracker.isExecuted("claimTaskEnterClaimData")) {
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

					claimTaskEnterClaimData(manager,dealerCode, invNo, invoiceDate, customerName, customerContact,
							customerAddress, filePath);
				}

			}

			if (!TestCaseTracker.isExecuted("claimTaskAddClaimProducts")) {
				// Fetch data from DataProvider
				Object[][] data = productData();

				for (Object[] dataSet : data) {
					// Assuming the first HashMap has the keys "productCode" and "productQty"
					HashMap<String, String> productData = (HashMap<String, String>) dataSet[0];

					String productCodeValue = productData.get("productCode"); // Use the key to access the value
					String productQty = productData.get("productQty"); // Use the key to access the value
					claimTaskAddClaimProducts(manager,productCodeValue, productQty);
				}
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimTotalPoints")) {
				claimTaskVerifyClaimTotalPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskSubmitClaim")) {
				claimTaskSubmitClaim(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifySubmitClaimNavigateToClaimStatus")) {
				claimTaskVerifySubmitClaimNavigateToClaimStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddedClaimOnClaimStatusMenu")) {
				claimTaskVerifyAddedClaimOnClaimStatusMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskOpenClaimStatusPDF")) {
				claimTaskOpenClaimStatusPDF(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusPDFCrossIconClickable")) {
				claimTaskVerifyClaimStatusPDFCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusNameFilter")) {
				claimTaskVerifyClaimStatusNameFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusFilterIconClickable")) {
				claimTaskVerifyClaimStatusFilterIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimStatusFilterCrossIconClickable")) {
				claimTaskVerifyClaimStatusFilterCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionGiftMandatoryField")) {
				claimTaskVerifyRedemptionGiftMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionQtyMandatoryField")) {
				claimTaskVerifyRedemptionQtyMandatoryField(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionPoints")) {
				// Fetch data from DataProvider
				Object[][] data = redemptionDetails();

				for (Object[] dataSet : data) {

					HashMap<String, String> redemptionData = (HashMap<String, String>) dataSet[0];

					String rewardCode = redemptionData.get("GiftName"); // Use the key to access the value
					String rewardQty = redemptionData.get("RewardQty"); // Use the key to access the value

					claimTaskVerifyRedemptionPoints(manager,rewardCode, rewardQty);
				}
			}

			if (!TestCaseTracker.isExecuted("claimTaskSubmitRedemption")) {
				claimTaskSubmitRedemption(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionSubmitNavigation")) {
				claimTaskVerifyRedemptionSubmitNavigation(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAddedRemptionInRedemptionHistory")) {
				claimTaskVerifyAddedRemptionInRedemptionHistory(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyNameFilterOfRedemptionHistory")) {
				claimTaskVerifyNameFilterOfRedemptionHistory(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryViewDetailsClickable")) {
				claimTaskVerifyRedemptionHistoryViewDetailsClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable")) {
				claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryViewPDFClickable")) {
				claimTaskVerifyRedemptionHistoryViewPDFClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable")) {
				claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryDateFilterClickable")) {
				claimTaskVerifyRedemptionHistoryDateFilterClickable(manager);
			}
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable")) {
				claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionHistoryStatusFilter")) {
				claimTaskVerifyRedemptionHistoryStatusFilter(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionLockedPoints")) {
				claimTaskVerifyRedemptionLockedPoints(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionRedeemablePoints")) {
				claimTaskVerifyRedemptionRedeemablePoints(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedemptionTotalPoints")) {
				claimTaskVerifyRedemptionTotalPoints(manager);
			}

//			if (!TestCaseTracker.isExecuted("claimTaskVerifyEarnPointsOfPointsMenu")) {
//				claimTaskVerifyEarnPointsOfPointsMenu(manager);
//			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyClosingPointsOfPointsMenu")) {
				claimTaskVerifyClosingPointsOfPointsMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyLockPointsOfPointsMenu")) {
				claimTaskVerifyLockPointsOfPointsMenu(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedeemablePointsOfPointsMenu")) {
				claimTaskVerifyRedeemablePointsOfPointsMenu(manager);
			}

			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyMilestoneOptionClickable")) {
				claimTaskVerifyMilestoneOptionClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyAchivementsMenuClickable")) {
				claimTaskVerifyAchivementsMenuClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyAchivementsMenuCrossIconClickable")) {
				claimTaskVerifyAchivementsMenuCrossIconClickable(manager);
			}


			if (!TestCaseTracker.isExecuted("claimTaskVerifyMilestoneCatalogMenuClickable")) {
				claimTaskVerifyMilestoneCatalogMenuClickable(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyMilestoneCatalogMenuCrossIconClickable")) {
				claimTaskVerifyMilestoneCatalogMenuCrossIconClickable(manager);
			}

			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRedial")) {
				claimTaskVerifyRedial(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackBtn")) {
				claimTaskVerifyBackBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackTaskStatus")) {
				claimTaskVerifyBackTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyBackButtonDialNext")) {
				claimTaskVerifyBackButtonDialNext(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyHangUp")) {
				claimTaskVerifyHangUp(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending")) {
				claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending")) {
				claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCountOfPendingClaim")) {
				claimTaskVerifyCountOfPendingClaim(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimVerifyBtnClickable")) {
				claimTaskVerifyClaimVerifyBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimVerificationSubmitBtnClickable")) {
				claimTaskVerifyClaimVerificationSubmitBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimCancelBtnClickable")) {
				claimTaskVerifyClaimCancelBtnClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimCrossIconClickable")) {
				claimTaskVerifyClaimCrossIconClickable(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimedPointsOfClaimVerification")) {
				claimTaskVerifyClaimedPointsOfClaimVerification(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty")) {
				claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef")) {
				claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf")) {
				claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus")) {
				claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason")) {
				claimTaskVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimIdAndTaskNoOfClaimVerification")) {
				claimTaskVerifyClaimIdAndTaskNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimDateOfClaimVerification")) {
				claimTaskVerifyClaimDateOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyCustomerNameOfClaimVerification")) {
				claimTaskVerifyCustomerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyStatusOfClaimVerification")) {
				claimTaskVerifyStatusOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyInfluencerNameOfClaimVerification")) {
				claimTaskVerifyInfluencerNameOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyInfluencerMobileNoOfClaimVerification")) {
				claimTaskVerifyInfluencerMobileNoOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyTotalRecordsOfClaimVerification")) {
				claimTaskVerifyTotalRecordsOfClaimVerification(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason")) {
				claimTaskVerifyClaimWithoutSelectClaimVefRejectReason(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimByEqualQtyRejectStatus")) {
				claimTaskVerifyClaimByEqualQtyRejectStatus(manager);
			}
	
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimByApproveAndRejectStatus")) {
				claimTaskVerifyClaimByApproveAndRejectStatus(manager);
			}
			
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimByLessQtyApproveStatus")) {
				claimTaskVerifyClaimByLessQtyApproveStatus(manager);
			}
				
			if (!TestCaseTracker.isExecuted("claimTaskVerifyClaimByEqualQtyApproveStatus")) {
				claimTaskVerifyClaimByEqualQtyApproveStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtn")) {
				claimTaskVerifyCloseTaskBySubmitBreakBtn(manager);
			}
		
			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedTaskStatus")) {
				claimTaskVerifyRescheduleNotInterestedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBtn")) {
				claimTaskVerifyRescheduleNotInterestedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedTaskStatus")) {
				claimTaskVerifyRescheduleRingNotReceivedTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn")) {
				claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterTaskStatus")) {
				claimTaskVerifyRescheduleCallBackLaterTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn")) {
				claimTaskVerifyRescheduleCallBackLaterBySubmitBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn")) {
				claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoTaskStatus")) {
				claimTaskVerifyRescheduleWrongNoTaskStatus(manager);
			}

			if (!TestCaseTracker.isExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBtn")) {
				claimTaskVerifyRescheduleWrongNoBySubmitBtn(manager);
			}
		
			}catch (Exception e) {
		        System.err.println("Exception during test execution: " + e.getMessage());
			}
		}
		
		
		
	
	@Test(priority = 1, retryAnalyzer = Retry.class)
	public void claimTaskVerifyCloseTaskBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBtnClickable");
		logTestMethod(driver, methodTest, manager,"claimTaskVerifyCloseTaskBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(), "Close Task Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBtnClickable");
	}
	
	@Test(priority = 2)
	public void claimTaskVerifyCloseTaskSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCloseTasksubmitButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskSubmitBtnClickable");

	}

	@Test(priority = 3)
	public void claimTaskVerifyCloseTaskCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskCancelBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskCancelBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskCancelBtnClickable");
	}

	@Test(priority = 4)
	public void claimTaskVerifyCloseTaskSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Close Task");
			telePage.clickOnCloseTasksubmitBreakButton();
			softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),
					"Close Task Submit Break button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskSubmitBreakBtnClickable");

	}

	@Test(priority = 5)
	public void claimTaskVerifyCloseTaskCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyCloseTaskCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskCrossIconClickable");
	}

	@Test(priority = 6)
	public void claimTaskVerifyRescheduledBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnCallActionButton("Reschedule Call");
			softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(), "Reschedule Button not clickable");
			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledBtnClickable");

	}

	@Test(priority = 7)
	public void claimTaskVerifyRescheduledSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitButton();

			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledSubmitBtnClickable");
	}

	@Test(priority = 8)
	public void claimTaskVerifyRescheduledSubmitBreakBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledSubmitBreakBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduledSubmitBreakBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnRescheduleCallSubmitBreakButton();
			softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),
					"Reschedule Submit & Break button not clickable");

			softAssert.assertAll();

		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledSubmitBreakBtnClickable");
	}

	@Test(priority = 9)
	public void claimTaskVerifyRescheduledCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRescheduledCancelBtnClickable", () -> {
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledCancelBtnClickable");
		
	}
	
	@Test(priority = 10)
	public void claimTaskVerifyRescheduledCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduledCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRescheduledCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduledCrossIconClickable");
	}
	
	@Test(priority = 11)
	public void claimTaskVerifyCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCatalogMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Catalog");
		softAssert.assertTrue(telePage.verifyCatalogOptionsDisplay(),"Catalogue button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyCatalogMenuClickable");
		
	}
	
	@Test(priority = 12)
	public void claimTaskVerifyCatalogProductMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCatalogProductMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCatalogProductMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnProductCatalog();	
		softAssert.assertTrue(telePage.verifyProductCatalogLableDisplay(),"Catalogue Products button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyCatalogProductMenuClickable");
		
	}
	
	@Test(priority = 13)
	public void claimTaskVerifyCatalogProductCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCatalogProductCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCatalogProductCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyCatalogProductCrossIconClickable");

	}
	
	@Test(priority = 14)
	public void claimTaskVerifyPointsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyPointsMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyPointsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		softAssert.assertTrue(telePage.verifyPointsOptionsDisplay(),"Points button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyPointsMenuClickable");
	}
	
	@Test(priority = 15)
	public void claimTaskVerifyPointsOptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyPointsOptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyPointsOptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnPointsOption();
		softAssert.assertTrue(telePage.verifyPointsLableDisplay(),"Points Dropdown option button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyPointsOptionMenuClickable");
	}
	
	@Test(priority = 16)
	public void claimTaskVerifyPointsOptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyPointsOptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyPointsOptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void claimTaskVerifyEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyEscalationMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");	
		softAssert.assertTrue(telePage.verifyEscalationListMenuDisplay(),"Escalation button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyEscalationMenuClickable");
		
	}
	
	@Test(priority = 18)
	public void claimTaskVerifyEscalationListMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyEscalationListMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyEscalationListMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnEscalationListMenu();
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(),"Escalation list button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyEscalationListMenuClickable");
	}
	
	@Test(priority = 19)
	public void claimTaskVerifyEscalationListCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyEscalationListCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyEscalationListCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void claimTaskVerifyAddEscalationMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddEscalationMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddEscalationMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		softAssert.assertTrue(telePage.verifyAddEscalationMenuLableDisplay(),"Add Escalation button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddEscalationMenuClickable");	
	}
	
	@Test(priority = 21)
	public void claimTaskVerifyAddEscalationSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddEscalationSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddEscalationSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddEscalationMenuSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddEscalationSelectTagWarningMsgDisplay(),"Add Escalation Submit button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddEscalationSubmitBtnClickable");	
	}
	
	@Test(priority = 22)
	public void claimTaskVerifyAddEscalationCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddEscalationCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddEscalationCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddEscalationCancelBtnClickable");
	}
	
	@Test(priority = 23)
	public void claimTaskVerifyAddEscalationCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddEscalationCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddEscalationCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void claimTaskVerifyRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuDisplay(),"Redemption button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionMenuClickable");
	}
	
	@Test(priority = 25)
	public void claimTaskVerifyRedemptionHistoryMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionHistoryMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedemptionHistoryMenu();
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"Redemption History button not clickable");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryMenuClickable");
	}
	
	@Test(priority = 26)
	public void claimTaskVerifyRedemptionHistoryCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionHistoryCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void claimTaskVerifyAddRedemptionMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddRedemptionMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddRedemptionMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		softAssert.assertTrue(telePage.verifyAddRedemptionMenuLableDisplay(),"Add Redemption button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddRedemptionMenuClickable");
		
	}
	
	@Test(priority = 28)
	public void claimTaskVerifyAddRedemptionSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddRedemptionSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddRedemptionSubmitBtnClickable", () -> {		
        SoftAssert softAssert = new SoftAssert();
        telePage = new OutboundTelecallingPage(driver);
        telePage.clickOnAddRedemptionSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Add Redemption Submit button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddRedemptionSubmitBtnClickable");
		
	}
	
	@Test(priority = 29)
	public void claimTaskVerifyAddRedemptionCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddRedemptionCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddRedemptionCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddRedemptionCancelBtnClickable");
		
	}
	
	@Test(priority = 30)
	public void claimTaskVerifyAddRedemptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddRedemptionCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddRedemptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddRedemptionCrossIconClickable");
		
	}

	@Test(priority = 31)
	public void claimTaskVerifyClaimAddBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimAddBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimAddBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		softAssert.assertTrue(telePage.verifyAddClaimMenuDisplay(),"Claim Add button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimAddBtnClickable");
	}

	@Test(priority = 32)
	public void claimTaskVerifyAddClaimBtnClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddClaimBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimMenu();
		softAssert.assertTrue(telePage.verifyAddClaimMenuLableDisplay(),"Add Claim button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimBtnClickable");

	}
	
	@Test(priority = 33)
	public void claimTaskVerifyAddClaimSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimSubmitBtnClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddClaimSubmitBtnClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealerFieldWarningMsgDisplay(),"Add Claim Submit button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimSubmitBtnClickable");
		
	}
	
	@Test(priority = 34)
	public void claimTaskVerifyAddClaimCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddClaimCancelBtnClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimCancelBtnClickable");
	}
	
	@Test(priority = 35)
	public void claimTaskVerifyAddClaimCrossBtnClickable(TaskTypeManager manager) throws IOException 
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimCrossBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddClaimCrossBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimCrossBtnClickable");
	}
	
	@Test(priority = 36)
	public void claimTaskVerifyClaimStatusMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyClaimStatusMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(),"Claim Status button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusMenuClickable");
	}
	
	@Test(priority = 37)
	public void claimTaskVerifyClaimStatusCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimStatusCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusCrossIconClickable");
	
	}
	
	@Test(priority = 38)
	public void claimTaskVerifyClaimMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyClaimMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnVerifyClaimMenu();
		softAssert.assertTrue(telePage.verifyVerifyClaimMenuLableDisplay(),"Verify Claim button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimMenuClickable");
	}
	
  
	@Test(priority = 39)
	public void claimTaskAddEscalation(TaskTypeManager manager) throws IOException   
	{
		ExtentTest methodTest = test.createNode("claimTaskAddEscalation");
        logTestMethod(driver,methodTest,manager, "claimTaskAddEscalation", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void claimTaskVerifySubmitEscalationNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifySubmitEscalationNavigation");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifySubmitEscalationNavigation", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(), "Not navigate to Escalation List page");
		softAssert.assertAll();	
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifySubmitEscalationNavigation");	
	} 
	
	@Test(priority = 41)
	public void claimTaskVerifyEscaListNameFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyEscaListNameFilter");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyEscaListNameFilter", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnEscalationListMenu();
		telePage.enterTextInEscalationSerachFilter("Escalation");		
		softAssert.assertTrue(telePage.verifyEscalationListNoRecordsLableDisplay(),"Escalation Filter Name not working");	
		softAssert.assertAll();
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyEscaListNameFilter");	
	}
		
	@Test(priority = 42)
	public void claimTaskVerifyAddClaimDealFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimDealFieldMandatory");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddClaimDealFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimDealFieldMandatory");	
	}
	
	@Test(priority = 43)
	public void claimTaskVerifyAddClaimCustNameFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimCustNameFieldMandatory");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddClaimCustNameFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNameFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimCustNameFieldMandatory");
	}
	
	@Test(priority = 44)
	public void claimTaskVerifyAddClaimCustContactFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimCustContactFieldMandatory");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddClaimCustContactFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNumberFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimCustContactFieldMandatory");
	}
	
	@Test(priority = 45)
	public void claimTaskVerifyAddClaimAddressFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimAddressFieldMandatory");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddClaimAddressFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimCustAddressFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimAddressFieldMandatory");
		
	}
	
	@Test(priority = 46)
	public void claimTaskVerifyAddClaimProductFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimProductFieldMandatory");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddClaimProductFieldMandatory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimProductFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimProductFieldMandatory");
		
	}
	
	@Test(priority = 47)
	public void claimTaskVerifyAddClaimPointsFieldMandatory(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimPointsFieldMandatory");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyAddClaimPointsFieldMandatory", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimPointsFieldMandatory");

	}
	
	@Test(priority = 48)
	public void claimTaskVerifyAddClaimQtyFieldMandatory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddClaimQtyFieldMandatory");
       logTestMethod(driver,methodTest, manager,"claimTaskVerifyAddClaimQtyFieldMandatory", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Claim/Add");
	telePage.clickOnAddClaimMenu();
	telePage.clickOnAddClaimSubmitBtn();		
	softAssert.assertTrue(telePage.verifyAddClaimQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
    softAssert.assertAll();
        });
       telePage.clickOnAddClaimCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyAddClaimQtyFieldMandatory");
		
	}
		
	@Test(priority = 49)
	public void claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyProductNotSelectClickOnAddBtnForAddClaim");
		
	}
	
	@Test(priority = 50)
	public void claimTaskProductNotSelectClickOnDeleteBtnForAddClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskProductNotSelectClickOnDeleteBtnForAddClaim");
        logTestMethod(driver,methodTest,manager, "claimTaskProductNotSelectClickOnDeleteBtnForAddClaim", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskProductNotSelectClickOnDeleteBtnForAddClaim");
		
	}
	
	@Test(priority = 51, dataProvider = "customerData")
	public void claimTaskEnterClaimData(TaskTypeManager manager,String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException, IOException 

	{
		ExtentTest methodTest = test.createNode("claimTaskEnterClaimData");
        logTestMethod(driver,methodTest,manager, "claimTaskEnterClaimData", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskEnterClaimData");

	}
	
	@Test(priority = 52, dataProvider = "productData")
	public void claimTaskAddClaimProducts(TaskTypeManager manager,String productCodeValue, String productQty) throws InterruptedException, IOException   {

		ExtentTest methodTest = test.createNode("claimTaskAddClaimProducts");
        logTestMethod(driver,methodTest,manager, "claimTaskAddClaimProducts", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskAddClaimProducts");
	}
	
	@Test(priority = 53)
	public void claimTaskVerifyClaimTotalPoints(TaskTypeManager manager) throws IOException 
	{ 
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimTotalPoints");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimTotalPoints", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
        //Get Count of rows
		int totalProductCount=telePage.getCountOfTotalRowsOnAddClaimPage();
		System.out.println("Added Product Row Count : "+ totalProductCount);
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void claimTaskSubmitClaim(TaskTypeManager manager) throws IOException

	{
		ExtentTest methodTest = test.createNode("claimTaskSubmitClaim");
        logTestMethod(driver,methodTest,manager, "claimTaskSubmitClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();
		generatedClaimID =telePage.getClaimIDOfAddedClaim();
		System.out.println("generatedClaimID :"+ generatedClaimID);
		softAssert.assertTrue(telePage.verifyAddedClaimSuccessDialogBoxDisplay(),"Claim Not getting Submit");
		telePage.clickOnAddClaimSuccessDialogOkBtn();
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void claimTaskVerifySubmitClaimNavigateToClaimStatus(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifySubmitClaimNavigateToClaimStatus");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifySubmitClaimNavigateToClaimStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(), "Not Navigate to Claim Status Page");
		softAssert.assertAll();	
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifySubmitClaimNavigateToClaimStatus");	
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void claimTaskVerifyAddedClaimOnClaimStatusMenu(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddedClaimOnClaimStatusMenu");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddedClaimOnClaimStatusMenu", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyAddedClaimOnClaimStatusMenu");
	}
	
	
	
	
	@Test(priority = 57, alwaysRun = true)
	public void claimTaskOpenClaimStatusPDF(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskOpenClaimStatusPDF");
        logTestMethod(driver,methodTest,manager, "claimTaskOpenClaimStatusPDF", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusViewPDF();
		softAssert.assertTrue(telePage.verifyClaimStatusPDFLableDisplay(),"View Claim Status PDF not Geeting Open");	
		softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("claimTaskOpenClaimStatusPDF");	
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void claimTaskVerifyClaimStatusPDFCrossIconClickable(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusPDFCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimStatusPDFCrossIconClickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusPDFCrossIconClickable");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void claimTaskVerifyClaimStatusNameFilter(TaskTypeManager manager) throws IOException
	{	
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusNameFilter");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimStatusNameFilter", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.enterTextInEscalationSerachFilter("Claim Status");
		softAssert.assertTrue(telePage.verifyClaimStatusNoRecordsLableDisplay(),"Claim Status Filter Name not working");
		softAssert.assertAll();
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void claimTaskVerifyClaimStatusFilterIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusFilterIconClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyClaimStatusFilterIconClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusDateFilterIcon();
		softAssert.assertTrue(telePage.verifyClaimStatusDateFilterLableDisplay()," Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusFilterIconClickable");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void claimTaskVerifyClaimStatusFilterCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimStatusFilterCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimStatusFilterCrossIconClickable", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimStatusFilterCrossIconClickable");
		
	}
	
	@Test(priority = 62, alwaysRun = true)
	public void claimTaskVerifyRedemptionGiftMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionGiftMandatoryField");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionGiftMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void claimTaskVerifyRedemptionQtyMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionQtyMandatoryField");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionQtyMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionQtyMandatoryField");
	}	
	
	@Test(priority = 64, dataProvider="redemptionData", alwaysRun = true)
	public void claimTaskVerifyRedemptionPoints(TaskTypeManager manager,String rewardCode, String rewardQty) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionPoints");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionPoints", () ->{ 
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
		//Redemption Pints=Qty * rewardPoints
		 expectedRedemptionPoints= qty * rewardPoints;
		System.out.println("Expected Redemption Points : " + expectedRedemptionPoints);
		//Get Redemption Points
		String redemptionPointsValue=telePage.getRedemptionPoints();
		int actualRedemptionPoints = Integer.parseInt(redemptionPointsValue);
		System.out.println("Actual Redemption Points : " + actualRedemptionPoints);
		
			softAssert.assertEquals(actualRedemptionPoints, expectedRedemptionPoints,
					"Redemption Points showing Incorrect.");

			// get locked points
			oldLockedPoints = telePage.getRedemptionLockedPoints();
			System.out.println(" Old Locked Points : " + oldLockedPoints);

			// get Reedemable points
			oldReedemablePoints = telePage.getRedemptionReedemablePoints();
			System.out.println(" Old Reedemable Points : " + oldReedemablePoints);

			// get Total points
			oldTotalPoints = telePage.getRedemptionTotalPoints();
			System.out.println(" Old Total Points : " + oldTotalPoints);
			softAssert.assertAll();
		});
		
        TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionPoints");		
	}
		
	@Test(priority = 65, alwaysRun = true)
	public void claimTaskSubmitRedemption(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskSubmitRedemption");
        logTestMethod(driver,methodTest, manager,"claimTaskSubmitRedemption", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddRedemptionSubmitBtn();
	    addedRedemptionNumber=telePage.getAddedRedemptionCode();
	    System.out.println("Submitted Redemption Number : "+ addedRedemptionNumber);
        softAssert.assertTrue(telePage.verifyAddRedemptionSuccessPopUpDisplay(),"Redemption Not getting submit.");
        softAssert.assertAll();
        telePage.clickOnAddRedemptionSuccessPopUpOkBtn();
        });		
        TestCaseTracker.markAsExecuted("claimTaskSubmitRedemption");	
	}
	
	@Test(priority = 66, alwaysRun = true)
	public void claimTaskVerifyRedemptionSubmitNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionSubmitNavigation");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionSubmitNavigation", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"After Submit Redemption navigate to history page");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionSubmitNavigation");
	}
	
	@Test(priority = 67, alwaysRun = true)
	public void claimTaskVerifyAddedRemptionInRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAddedRemptionInRedemptionHistory");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAddedRemptionInRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyAddedRedemptionNoDisplayOnRedemptionHistory(addedRedemptionNumber),"Added Redemption not showing in Redemption History");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("claimTaskVerifyAddedRemptionInRedemptionHistory");
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void claimTaskVerifyNameFilterOfRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyNameFilterOfRedemptionHistory");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyNameFilterOfRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.enterTextInRedHistorySerachFilter("Redemption History");
		softAssert.assertTrue(telePage.verifyRedHistoryNoRecordsLableDisplay(),"Redemption History Name Filter  not working");
		softAssert.assertAll();
        });
        telePage.clickOnRedemptionHistoryCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyNameFilterOfRedemptionHistory");
	}
	
	@Test(priority = 69, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryViewDetailsClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryViewDetailsClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionHistoryViewDetailsClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnRedemptionHistoryMenu();
		telePage.clickOnRedHistoryViewDetailsIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDetailsLableDisplay(),"Redemption History View Details Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryViewDetailsClickable");
		
	}

	@Test(priority = 70, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable");
		logTestMethod(driver, methodTest, manager,"claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryViewDetailsCrossIconClickable");

	}
	
	@Test(priority = 71, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryViewPDFClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryViewPDFClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionHistoryViewPDFClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryViewPdfIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryPdfLableDisplay(),"Redemption History PDF Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryViewPDFClickable");
		
	}
	
	@Test(priority = 72, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryViewPDFCrossIconClickable");

	}

	@Test(priority = 73, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryDateFilterClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryDateFilterClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionHistoryDateFilterClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryDateFilterIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDateFilterLableDisplay()," Date Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryDateFilterClickable");
	}
	
	@Test(priority = 74, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable");
		logTestMethod(driver, methodTest, manager,"claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryDateFilterCrossIconClickable");

	}
	
	@Test(priority = 75, alwaysRun = true)
	public void claimTaskVerifyRedemptionHistoryStatusFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionHistoryStatusFilter");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionHistoryStatusFilter", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionHistoryStatusFilter");
		
	}
	
	@Test(priority = 76, alwaysRun = true)
	public void claimTaskVerifyRedemptionLockedPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionLockedPoints");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedemptionLockedPoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedLockedPoints=oldLockedPoints + expectedRedemptionPoints;
		System.out.println("Expected Locked Points : " +newExpectedLockedPoints);	
		//get  new locked points
		newLockedPoints = telePage.getRedemptionLockedPoints();
		 System.out.println(" New Locked Points : " + newLockedPoints);
		 softAssert.assertEquals(newLockedPoints,newExpectedLockedPoints,"Locked Points are incorrect.");
	     softAssert.assertAll(); 
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionLockedPoints");	
	}
	
	@Test(priority = 77, alwaysRun = true)
	public void claimTaskVerifyRedemptionRedeemablePoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionRedeemablePoints");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionRedeemablePoints", () ->{ 
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
	    TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 78, alwaysRun = true)
	public void claimTaskVerifyRedemptionTotalPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedemptionTotalPoints");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyRedemptionTotalPoints", () ->{ 
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
	 	TestCaseTracker.markAsExecuted("claimTaskVerifyRedemptionTotalPoints");	
	}	
	
	//@Test(priority = 79, alwaysRun = true)
	public void claimTaskVerifyEarnPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyEarnPointsOfPointsMenu");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyEarnPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		telePage.clickOnPointsOption();
		String stringEarnPoints=telePage.getPointsMenuEarnPoints();
		int actualEarnPoints = Integer.parseInt(stringEarnPoints);
		int closingPoints=telePage.getPointsMenuClosingPoints();
		
		int lockPoints =telePage.getPointsMenuLockPoints();
		int expectedEarnPoints=closingPoints+lockPoints;
		
		System.out.println("Expected Earn Points : " + expectedEarnPoints);
		softAssert.assertEquals(actualEarnPoints,expectedEarnPoints,"Earn points are incorrect.");
        softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("claimTaskVerifyEarnPointsOfPointsMenu");
	}
	
	
	@Test(priority = 80, alwaysRun = true)
	public void claimTaskVerifyClosingPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClosingPointsOfPointsMenu");
    logTestMethod(driver,methodTest,manager, "claimTaskVerifyClosingPointsOfPointsMenu", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Points");
	telePage.clickOnPointsOption();
	int actualClosingPoints =telePage.getPointsMenuClosingPoints();
	int expectedClosingPoints=newTotalPoints;
	System.out.println("Expected Closing Points : " + expectedClosingPoints);
	softAssert.assertEquals(actualClosingPoints,expectedClosingPoints,"Closing points are incorrect.");
    softAssert.assertAll();
    });
    TestCaseTracker.markAsExecuted("claimTaskVerifyClosingPointsOfPointsMenu");
		
	}
	
	@Test(priority = 81, alwaysRun = true)
	public void claimTaskVerifyLockPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyLockPointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyLockPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualLockPoints = telePage.getPointsMenuLockPoints();
		int expectedLockPoints=newLockedPoints;
		System.out.println("Expected Lock Points : " + expectedLockPoints);
		softAssert.assertEquals(actualLockPoints,expectedLockPoints,"Lock points are incorrect.");
	    softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyLockPointsOfPointsMenu");
	}
	
	@Test(priority = 82, alwaysRun = true)
	public void claimTaskVerifyRedeemablePointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedeemablePointsOfPointsMenu");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedeemablePointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualRedeemablePoints=telePage.getPointsMenuRedeemablePoints();
		int expectedRedeemablePoints=newReedemablePoints;
		System.out.println("Expected Redeemable Points : " + expectedRedeemablePoints);
		softAssert.assertEquals(actualRedeemablePoints,expectedRedeemablePoints,"Redeemable points are incorrect.");
	    softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("claimTaskVerifyRedeemablePointsOfPointsMenu");
	}
	
	
	@Test(priority = 83, alwaysRun = true)
	public void claimTaskVerifyMilestoneOptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyMilestoneOptionClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyMilestoneOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		softAssert.assertTrue(telePage.verifyMilestoneOptionsDisplay(),"Milestone button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyMilestoneOptionClickable");
	}
	
	
	@Test(priority = 84, alwaysRun = true)
	public void claimTaskVerifyAchivementsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAchivementsMenuClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAchivementsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAchivementsMenu();	
		softAssert.assertTrue(telePage.verifyAchivementsLableDisplay(),"Achivement Menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyAchivementsMenuClickable");
	}
	
	@Test(priority = 85, alwaysRun = true)
	public void claimTaskVerifyAchivementsMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyAchivementsMenuCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyAchivementsMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyAchivementsMenuCrossIconClickable");

	}
	
	@Test(priority = 86, alwaysRun = true)
	public void claimTaskVerifyMilestoneCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyMilestoneCatalogMenuClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyMilestoneCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		telePage.clickOnMilestoneCatalogMenu();	
		softAssert.assertTrue(telePage.verifyMilestoneCatalogLableDisplay(),"Milestone catalog menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("claimTaskVerifyMilestoneCatalogMenuClickable");
	}
	
	@Test(priority = 87, alwaysRun = true)
	public void claimTaskVerifyMilestoneCatalogMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyMilestoneCatalogMenuCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyMilestoneCatalogMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("claimTaskVerifyMilestoneCatalogMenuCrossIconClickable");

	}
	
	
	@Test(priority = 88, alwaysRun = true)
	public void claimTaskVerifyRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("claimTaskVerifyRedial");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyRedial", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyRedial");
	}
	
	
	
	@Test(priority = 89, alwaysRun = true)
	public void claimTaskVerifyBackBtn(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackBtn");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackBtn", () ->{ 
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
		TestCaseTracker.markAsExecuted("claimTaskVerifyBackBtn");
		 
	}
	
	@Test(priority = 90, alwaysRun = true)
	public void claimTaskVerifyBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackTaskStatus");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status for Back Button : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", "Back Button status Should be show as pending.");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("claimTaskVerifyBackTaskStatus");
		
		}
	
	@Test(priority = 91, alwaysRun = true)
	public void claimTaskVerifyBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("claimTaskVerifyBackButtonDialNext");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyBackButtonDialNext", () ->{ 
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
	   TestCaseTracker.markAsExecuted("claimTaskVerifyBackButtonDialNext");
		
	}
	
	@Test(priority = 92, alwaysRun = true)
	public void claimTaskVerifyHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyHangUp");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyHangUp", () ->{ 
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
        
		 TestCaseTracker.markAsExecuted("claimTaskVerifyHangUp");
				
	}
	
	@Test(priority = 93, alwaysRun = true)
	public void claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Close Task");
		
		//Check Claim Status
		String claimStatus=telePage.getClaimStatusOnCloseTask();
		System.out.println("Claim Status : "+claimStatus);
		
		//Enter close task remark
		telePage.enterCloseTaskRemark("Close Task");
		
		//click on submit button
		telePage.clickOnCloseTasksubmitButton();
		
		 if(claimStatus.equals("Pending"))
		 {
			 softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),"User should not be closed Task if claim status is pending");
		
		 }
		telePage.clickOnCloseTaskDialogBoxOkBtn();
		
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
		
		}

	@Test(priority = 94, alwaysRun = true)
	public void claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException
	{
		
		ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending", () ->{ 
        	SoftAssert softAssert = new SoftAssert();
    		outboundPage=new OutBoundTaskPage(driver);
    		telePage = new OutboundTelecallingPage(driver);
    		telePage.clickOnCallActionButton("Close Task");
    		
    		//Check Claim Status
    		String claimStatus=telePage.getClaimStatusOnCloseTask();
    		System.out.println("Claim Status : "+claimStatus);
    		
    		//Enter close task remark
    		telePage.enterCloseTaskRemark("Close Task");
    		
    		//click on submit button
    		telePage.clickOnCloseTasksubmitBreakButton();
    		
    		 if(claimStatus.equals("Pending"))
    		 {
    			 softAssert.assertTrue(telePage.verifyClosetaskWarningDialogBoxDisplay(),"User should not be closed Task if claim status is pending");
    		 }
    		telePage.clickOnCloseTaskDialogBoxOkBtn();
    		
    		softAssert.assertAll();
            });
		TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
		
		
	}
	
	@Test(priority = 95, alwaysRun = true)
	public void claimTaskVerifyCountOfPendingClaim(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyCountOfPendingClaim");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyCountOfPendingClaim", () ->{ 
        	SoftAssert softAssert = new SoftAssert();
    		outboundPage=new OutBoundTaskPage(driver);
    		telePage = new OutboundTelecallingPage(driver);
    		int expectedPendingClaimCount=telePage.getRowCountOfPendingClaim();
    		System.out.println(" Expected Pending Claim Count : " + expectedPendingClaimCount);
    		
    		 String stringPendingClaims=telePage.getTextOfPendingClaimCount();
    		 System.out.println("stringPendingClaims :"+ stringPendingClaims);
    		 String[] stringParts = stringPendingClaims.split(":");
    	     String claimCountPart = stringParts[1].trim();
    	     int actualPendingClaimCount = Integer.parseInt(claimCountPart);  
    		System.out.println("Actual Pending Claim Count : " + actualPendingClaimCount);
    		
    		softAssert.assertEquals(actualPendingClaimCount, expectedPendingClaimCount,"Pending Claim Count showing incorrect.");		
    		softAssert.assertAll();
        });
	TestCaseTracker.markAsExecuted("claimTaskVerifyCountOfPendingClaim");
	
	}
	
	@Test(priority = 96, alwaysRun = true)
	public void claimTaskVerifyClaimVerifyBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimVerifyBtnClickable");
		logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimVerifyBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();

			softAssert.assertTrue(telePage.verifyClaimVerificationLabelDisplay(), "Claim Verify button not clickable");

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimVerifyBtnClickable");

	}
	
	
	@Test(priority = 97, alwaysRun = true)
	public void claimTaskVerifyClaimVerificationSubmitBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimVerificationSubmitBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimVerificationSubmitBtnClickable", () ->{ 
        	SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
		softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimStatusFieldDisplay(),"Claim Verification Submit button not clickable");
		
        softAssert.assertAll();
        telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimVerificationSubmitBtnClickable");
	}
	
	

	@Test(priority = 98, alwaysRun = true)
	public void claimTaskVerifyClaimCancelBtnClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimCancelBtnClickable");
        logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimCancelBtnClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnClaimVerificationCancelBtn();
		try
		{
		By claimVerificationLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement claimVerifLabelElement=driver.findElement(claimVerificationLableLocator);
		if(claimVerifLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Verification cancel button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimCancelBtnClickable");
		
	}
	
	@Test(priority = 99, alwaysRun = true)
	public void claimTaskVerifyClaimCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("claimTaskVerifyClaimCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"claimTaskVerifyClaimCrossIconClickable", () ->{ 
		boolean status=true;
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		telePage.clickOnClaimVerificationCrossIcon();
		try
		{
		By claimVerifLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement claimVerifLabelElement=driver.findElement(claimVerifLableLocator);
		if(claimVerifLabelElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Claim Verification Cross button not clickable");
		 }
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimCrossIconClickable");
	}
	
	
	
	@Test(priority = 100, alwaysRun = true)
    public void claimTaskVerifyClaimedPointsOfClaimVerification(TaskTypeManager manager) throws IOException
     {
  	 ExtentTest methodTest = test.createNode("claimTaskVerifyClaimedPointsOfClaimVerification");
       logTestMethod(driver,methodTest,manager, "claimTaskVerifyClaimedPointsOfClaimVerification", () ->{ 
    	   SoftAssert softAssert = new SoftAssert();
   		outboundPage = new OutBoundTaskPage(driver);
   		telePage = new OutboundTelecallingPage(driver);
   		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		 for(int i=1; i<=telePage.getRowsCountOfSpecificClaim(); i++)
		 {
			 int points=telePage.getPointsValueOfClaimVerification(i);
			 System.out.println("Claim Verification Points :" +points);
       	 
			 int claimedQty= telePage.getClaimedQtyOfClaimVerification(i);
			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
			 
			double pointsAndQty= (points*claimedQty);
			System.out.println("points * Qty :"+pointsAndQty);
			double decimalClaimedPoints= pointsAndQty/1000;
			
			System.out.println("decimalClaimedPoints :"+decimalClaimedPoints);
			int expectedClaimedPoints =(int) Math.round(decimalClaimedPoints);
			System.out.println("Claim Verification Expected Claimed Points  :" +expectedClaimedPoints);
       	     
			int actualClaimedPoints=telePage.getClaimedPointsOfClaimVerification(i);
			System.out.println("Claim Verification Actual Claimed Points  :" +actualClaimedPoints);
			softAssert.assertEquals(actualClaimedPoints, expectedClaimedPoints,"Claimed Points are incorrect");
			
			softAssert.assertAll();
			 
		 }
       });
       telePage.clickOnClaimVerificationCrossIcon();
		TestCaseTracker.markAsExecuted("claimTaskVerifyClaimedPointsOfClaimVerification"); 
     }


   
   @Test(priority = 101, alwaysRun = true)
   public void claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty(TaskTypeManager manager) throws InterruptedException, IOException
 { 
	  ExtentTest methodTest = test.createNode("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
      logTestMethod(driver,methodTest,manager, "claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty", () ->{ 
    	  SoftAssert softAssert = new SoftAssert();
     		outboundPage = new OutBoundTaskPage(driver);
     		telePage = new OutboundTelecallingPage(driver);
     		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
   	
		 for(int i=1; i<=telePage.getRowsCountOfSpecificClaim(); i++)
		 {
		     int claimedQty=telePage.getClaimedQtyOfClaimVerification(i);
			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
		   
			 int verifyQty=claimedQty+1;
			String strVerifyQty = String.valueOf(verifyQty);
			System.out.println("Enter Max Verify Qty : "+ strVerifyQty);
			
			telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i,strVerifyQty);
	
		 }	
		 telePage.clickOnClaimVerificationSubmitBtn();
		softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimMaxQtyDisplay(), "If Enter Qty more than Claimed Qty then error msg should be show");
		telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimMaxQty();
		softAssert.assertAll();
      });
      telePage.clickOnClaimVerificationCancelBtn();
		TestCaseTracker.markAsExecuted("claimTaskVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
        	  
   }


@Test(priority = 102, alwaysRun = true)
public void claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef(TaskTypeManager manager) throws InterruptedException, IOException {
	// If we select claim status approve then Rejected Reason field should not be show

	ExtentTest methodTest = test.createNode("claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
			try {
				telePage.selectClaimVerificationStatus(i,"Ok");
			} catch (InterruptedException e) {
		
				e.printStackTrace();
			}
			try {
				softAssert.assertFalse(telePage.verifyClaimVerificationSelectReasonFieldDisplay(i),
						"If claim Status is 'OK' the Reason Field should be not be show");
			} catch (Exception e) {
				// System.out.println("Rejected Reason Field Not display due to Selected Claim
				// Status is \"Approved\" ");
			}
		}
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyReasonFieldNotDisplayForOkStatusForClaimVef");

}


@Test(priority = 103, alwaysRun = true)
public void claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(TaskTypeManager manager)
		throws InterruptedException, IOException {

	// If we select claim status Reject then Rejected Reason field should be show
	ExtentTest methodTest = test.createNode("claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
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
	TestCaseTracker.markAsExecuted("claimTaskVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");

}

@Test(priority = 104, alwaysRun = true)
public void claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus(TaskTypeManager manager) throws InterruptedException, IOException {
	ExtentTest methodTest = test.createNode("claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus", () -> {
		// If we select Claim Status Reject then Verify Qty & Points should be show "0".
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {
			// Select Claim Status
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
	TestCaseTracker.markAsExecuted("claimTaskVerifyQtyAndPointsForClaimVerificationNotOkStatus");

}



@Test(priority = 105, alwaysRun = true)
public void claimTaskVerifyClaimWithoutSelectClaimVefRejectReason(TaskTypeManager manager) throws IOException {
	// If we select Claim Status Reject & if Reason field Blank then Error pop-up should be display
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimWithoutSelectClaimVefRejectReason", () -> {
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
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimWithoutSelectClaimVefRejectReason");

}

@Test(priority = 106, alwaysRun = true)
public void claimTaskVerifyClaimIdAndTaskNoOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimIdAndTaskNoOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimIdAndTaskNoOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedClaimIdAndTaskNo=telePage.getClaimVefDetailsClaimIdAndTaskNo(1);
		System.out.println("expectedClaimIdAndTaskNo : "+expectedClaimIdAndTaskNo);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String actualClaimIdAndTaskNo=telePage.getClaimVerificationClaimIdAndTaskNo();
		System.out.println("actualClaimIdAndTaskNo : "+actualClaimIdAndTaskNo);
		softAssert.assertEquals(actualClaimIdAndTaskNo, expectedClaimIdAndTaskNo,
				"Claim Id & Task No of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimIdAndTaskNoOfClaimVerification");
}


@Test(priority = 107, alwaysRun = true)
public void claimTaskVerifyClaimDateOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimDateOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimDateOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedClaimDate=telePage.getClaimVefDetailsClaimDate(1);
		System.out.println("expectedClaimDate : "+expectedClaimDate);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String actualClaimDate=telePage.getClaimVerificationClaimDate();
		System.out.println("actualClaimDate : "+actualClaimDate);
		softAssert.assertEquals(actualClaimDate, expectedClaimDate,
				"Claim Date of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimDateOfClaimVerification");
}

@Test(priority = 108, alwaysRun = true)
public void claimTaskVerifyCustomerNameOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyCustomerNameOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyCustomerNameOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedCustomerName=telePage.getClaimVefDetailsCustomerName(1);
		System.out.println("expectedCustomerName : "+expectedCustomerName);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String actualCustomerName=telePage.getClaimVerificationCustomerName();
		System.out.println("actualCustomerName : "+actualCustomerName);
		softAssert.assertEquals(actualCustomerName.toLowerCase(), expectedCustomerName.toLowerCase(),
				"Customer Name of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyCustomerNameOfClaimVerification");
}

@Test(priority = 109, alwaysRun = true)
public void claimTaskVerifyStatusOfClaimVerification(TaskTypeManager manager) throws IOException
{
	//Claim Status Should be show Pending
	ExtentTest methodTest = test.createNode("claimTaskVerifyStatusOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyStatusOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		for(int i=1;i<=telePage.getRowCountOfPendingClaim(); i++)
		{
		String actualClaimStatus=telePage.getClaimVefDetailsClaimStatus(i);
		System.out.println("actualClaimStatus : "+actualClaimStatus);
		softAssert.assertEquals(actualClaimStatus, "Pending",
				" Claim Verification Status should be Pending.");
		}
		softAssert.assertAll();
	});
	TestCaseTracker.markAsExecuted("claimTaskVerifyStatusOfClaimVerification");
	
	
}

@Test(priority = 110, alwaysRun = true)
public void claimTaskVerifyInfluencerNameOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyInfluencerNameOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyInfluencerNameOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedInfluencerName=telePage.getOpenedTaskInfluencerName();
		System.out.println("expectedInfluencerName : "+expectedInfluencerName);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String actualInfluencerName=telePage.getClaimVerificationInfluencerName();
		System.out.println("actualInfluencerName : "+actualInfluencerName);
		softAssert.assertEquals(actualInfluencerName.toLowerCase(), expectedInfluencerName.toLowerCase(),
				"Influencer Name of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyInfluencerNameOfClaimVerification");
}

@Test(priority = 111, alwaysRun = true)
public void claimTaskVerifyInfluencerMobileNoOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyInfluencerMobileNoOfClaimVerification");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyInfluencerMobileNoOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String expectedInfluencerMobileNo=telePage.getOpenedTaskInfluencerMobileNo();
		System.out.println("expectedInfluencerMobileNo : "+expectedInfluencerMobileNo);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String actualInfluencerMobileNo=telePage.getClaimVerificationInfluencerMobileNo();
		System.out.println("actualInfluencerMobileNo : "+actualInfluencerMobileNo);
		softAssert.assertEquals(actualInfluencerMobileNo, expectedInfluencerMobileNo,
				"Influencer Mobile No. of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyInfluencerMobileNoOfClaimVerification");
}

@Test(priority = 112, alwaysRun = true)
public void claimTaskVerifyTotalRecordsOfClaimVerification(TaskTypeManager manager) throws IOException
{
	ExtentTest methodTest = test.createNode("claimTaskVerifyTotalRecordsOfClaimVerification");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyTotalRecordsOfClaimVerification", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		String stringCount=telePage.getClaimVerificationTotalRecordsCount();
		int actualCount = Integer.parseInt(stringCount);
		System.out.println("actualCount : "+actualCount);
		int expectedCount=telePage.getRowsCountOfSpecificClaim();
		System.out.println("expectedCount : "+expectedCount);
		softAssert.assertEquals(actualCount, expectedCount,
				"Total Records of Claim Verification is incorrect.");
	
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCrossIcon();
	TestCaseTracker.markAsExecuted("claimTaskVerifyTotalRecordsOfClaimVerification");
}

@Test(priority = 113, alwaysRun = true)
public void claimTaskVerifyClaimByEqualQtyRejectStatus(TaskTypeManager manager) throws IOException
{
	telePage = new OutboundTelecallingPage(driver);
	int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
	System.out.println(rowsCount);
	if(rowsCount>=1)
	{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimByEqualQtyRejectStatus");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimByEqualQtyRejectStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		 for (int i = 1; i <=telePage.getRowsCountOfSpecificClaim(); i++) {
			 
			telePage.getTotalVerifyPointsOfClaimVerification(i);
			try {
				telePage.selectClaimVerificationStatus(i,"Not ok");
				telePage.selectRejectReasonofClaimVerification(i,"Site/Product Picture not clear");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),"Total Verify Points of Claim Verification is Incorrect.");
		 }
		 telePage.clickOnClaimVerificationSubmitBtn();
		 softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),"Claim Verification not getting submit.");
		 telePage.clickOnClaimVerificationSuccessPopupOkBtn();
		
		softAssert.assertAll();
		
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimByEqualQtyRejectStatus");
	}else {
		System.out.println("Records not available for Claim verification");
	}
	}


@Test(priority = 114, alwaysRun = true)
public void claimTaskVerifyClaimByApproveAndRejectStatus(TaskTypeManager manager) throws IOException
{
	telePage = new OutboundTelecallingPage(driver);
	int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
	System.out.println(rowsCount);
	if(rowsCount>=1)
	{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimByApproveAndRejectStatus");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimByApproveAndRejectStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		List<String> statuses = Arrays.asList("Not ok","Ok");
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		    for (int i = 1; i <=telePage.getRowsCountOfSpecificClaim(); i++) {
		 
				try {
					String status = statuses.get(i % statuses.size()); // Alternates between "Approve" and "Reject

					// Set the status for the claim
					telePage.selectClaimVerificationStatus(i,status);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				try {
					telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");

				}

				catch (Exception e) {
					System.out.println("Selected Claim Status is Approve.");
				}

	   			//Enter Claim Remark
				telePage.enterClaimVerificationRemark(i,"Claim Verification");
	   			
	   			
			telePage.getTotalVerifyPointsOfClaimVerification(i);
			softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),"Total Verify Points of Claim Verification is Incorrect.");
		 }
		 telePage.clickOnClaimVerificationSubmitBtn();
		 softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),"Claim Verification not getting submit.");
		 telePage.clickOnClaimVerificationSuccessPopupOkBtn();
		
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimByApproveAndRejectStatus");
	}else {
		System.out.println("Records not available for Claim verification");
	}
}


@Test(priority = 115, alwaysRun = true)
public void claimTaskVerifyClaimByLessQtyApproveStatus(TaskTypeManager manager) throws IOException
{
	telePage = new OutboundTelecallingPage(driver);
	int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
	System.out.println(rowsCount);
	if(rowsCount>=1)
	{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimByLessQtyApproveStatus");
	logTestMethod(driver, methodTest,manager, "claimTaskVerifyClaimByLessQtyApproveStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnFristRowVerifyBtnOfClaimVerification();
		 for (int i = 1; i <=telePage.getRowsCountOfSpecificClaim(); i++) {
			 
			 int claimedQty=telePage.getClaimedQtyOfClaimVerification(i);
			 System.out.println("Claim Verification Claimed Qty  :" +claimedQty);
		   
			 int verifyQty=claimedQty-1;
			String strVerifyQty = String.valueOf(verifyQty);
			System.out.println("Enter Qty Less Than Claimed Qty : "+ strVerifyQty);
			
			telePage.enterQtyInVerifyQtyFieldOfClaimVerification(i,strVerifyQty);
			telePage.getTotalVerifyPointsOfClaimVerification(i);
			try {
				telePage.selectClaimVerificationStatus(i,"Ok");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(i),"Total Verify Points of Claim Verification is Incorrect.");
		 }
		 telePage.clickOnClaimVerificationSubmitBtn();
		 softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),"Claim Verification not getting submit.");
		 telePage.clickOnClaimVerificationSuccessPopupOkBtn();
		 
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimByLessQtyApproveStatus");
	}else {
		System.out.println("Records not available for Claim verification");
	}
		
}

@Test(priority = 116, alwaysRun = true)
public void claimTaskVerifyClaimByEqualQtyApproveStatus(TaskTypeManager manager) throws IOException
{
	telePage = new OutboundTelecallingPage(driver);
	int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
	System.out.println(rowsCount);
	if(rowsCount>=1)
	{
	ExtentTest methodTest = test.createNode("claimTaskVerifyClaimByEqualQtyApproveStatus");
	logTestMethod(driver, methodTest, manager,"claimTaskVerifyClaimByEqualQtyApproveStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		for (int i = rowsCount; i >=1; i--) {
		    telePage.clickOnVerifyButtonOfClaimVerification(i);
		    
		 for (int j = 1; j <=telePage.getRowsCountOfSpecificClaim(); j++) {
			 
			telePage.getTotalVerifyPointsOfClaimVerification(j);
			try {
				telePage.selectClaimVerificationStatus(j,"Ok");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			softAssert.assertTrue(telePage.verifyTotalVerifyPointsOfClaimVerification(j),"Total Verify Points of Claim Verification is Incorrect.");
		 }
		 telePage.clickOnClaimVerificationSubmitBtn();
		 softAssert.assertTrue(telePage.verifyClaimVerificationSuccessPopupDisplay(),"Claim Verification not getting submit.");
		 telePage.clickOnClaimVerificationSuccessPopupOkBtn();
		}
		softAssert.assertAll();
	});
	telePage.clickOnClaimVerificationCancelBtn();
	TestCaseTracker.markAsExecuted("claimTaskVerifyClaimByEqualQtyApproveStatus");
	}else {
		System.out.println("Records not available for Claim verification");
	}
	
}

@Test(priority = 117, alwaysRun = true)
		public void claimTaskVerifyCloseTaskBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			outboundPage=new OutBoundTaskPage(driver);
				ExtentTest methodTest = test.createNode("claimTaskVerifyCloseTaskBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyCloseTaskBySubmitBreakBtn", () -> {
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
				TestCaseTracker.markAsExecuted("claimTaskVerifyCloseTaskBySubmitBreakBtn");
		}
	    
		
	
        @Test(priority = 118, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn", () -> {
					notInterestedTakNo = telePage.getTelePageTaskNo();
					System.out.println("Task No. - Reschedule-Not Interested -Submit & break button : "
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
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}

        @Test(priority = 119, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleNotInterestedTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedTaskStatus");

		}
		
		
        @Test(priority = 120, alwaysRun = true)
		public void claimTaskVerifyRescheduleNotInterestedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleNotInterestedBySubmitBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleNotInterestedBySubmitBtn", () -> {
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

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleNotInterestedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}

        @Test(priority = 121, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn", () -> {
					ringNotReceivedTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No.- Reschedule-Ringing Not Received -Submit & break button : "
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

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
		
        @Test(priority = 122, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleRingNotReceivedTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedTaskStatus");

		}
		
		
        @Test(priority = 123, alwaysRun = true)
		public void claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn", () -> {
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

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleRingNotReceivedBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
	 		
		
        @Test(priority = 124, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn");
				logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn", () -> {

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
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
        @Test(priority = 125, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest, manager,"claimTaskVerifyRescheduleCallBackLaterTaskStatus", () -> {
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
			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterTaskStatus");

		}
		
		
        @Test(priority = 126, alwaysRun = true)
		public void claimTaskVerifyRescheduleCallBackLaterBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleCallBackLaterBySubmitBtn", () -> {
					
					String taskNoCallBackLaterSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Reschedule - Call Back Later- Submit button : "
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
				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleCallBackLaterBySubmitBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
			
        @Test(priority = 127, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn", () -> {
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

				TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBreakBtn");
			}

			else {
				System.out.println("Task type is not Influencer Claim Verification.");
				manager.executeTask();
			}

		}
		
        @Test(priority = 128, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {

			ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoTaskStatus", () -> {
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

			TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoTaskStatus");
		}
		
        @Test(priority = 129, alwaysRun = true)
		public void claimTaskVerifyRescheduleWrongNoBySubmitBtn(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Influencer Claim Verification")) {
				ExtentTest methodTest = test.createNode("claimTaskVerifyRescheduleWrongNoBySubmitBtn");
				logTestMethod(driver, methodTest,manager, "claimTaskVerifyRescheduleWrongNoBySubmitBtn", () -> {
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

				// TestCaseTracker.markAsExecuted("claimTaskVerifyRescheduleWrongNoBySubmitBtn");
			} else {
				System.out.println("Task type is not Influencer Claim Verification.");
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
	
	
	
	 @DataProvider(name = "claimVerificationData")
     public Object[][] claimVerificationDetails() {

	// call method to read & enter json data
	Object[][] dataArray = readJsonData(System.getProperty("user.dir")
			+ "\\src\\test\\java\\com\\jspl_automation\\data\\ClaimVerificationDetails.json");
	return dataArray;


};



}
