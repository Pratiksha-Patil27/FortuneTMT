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







public class CallMeTask extends BaseClass{
	 
	
	private DialerLoginPage dialerPage;
	private OutboundTelecallingPage telePage;
	private OutBoundTaskPage outboundPage;
	private int i = 1;
	private String generatedClaimID;
	private String backButtonTaskNo;
	private String hangUpTaskNo;
	private String callMeWrongTaskNo;
	private String callMeNotInterestedTakNo;
	private String callMeRingNotReceivedTaskNo;
	private String callMeCallBackLaterTaskNo;
	private int expectedRedemptionPoints;
	private int oldLockedPoints;
	private int oldReedemablePoints;
	private int oldTotalPoints;
	private int newTotalPoints ;
	private int newLockedPoints;
	private int newReedemablePoints;
	private String addedRedemptionNumber;
	
	
	
	ExtentTest test;
	
	 public CallMeTask(WebDriver driver, ExtentTest test) {
	        this.driver = driver;
	        this.test = test;
	    }
	 
		public int callmeMethodsCount()
		{
			Class<?> clazz = CallMeTask.class;
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
	
	
	
	public void runTests(TaskTypeManager manager) throws IOException, InterruptedException  {

		try
		{
	
		if (!TestCaseTracker.isExecuted("callCloseTaskbuttonclickable")) {

			callCloseTaskbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskSubmitbuttonclickable")) {
			callCloseTaskSubmitbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskCancelbuttonclickable")) {
			callCloseTaskCancelbuttonclickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callCloseTaskSubmitBreakbuttonclickable")) {
			callCloseTaskSubmitBreakbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCloseTaskCrossIconclickable")) {
			callCloseTaskCrossIconclickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callRescheduledbuttonclickable")) {
			callRescheduledbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRescheduledSubmitbuttonclickable")) {
			callRescheduledSubmitbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRescheduledSubmitBreakbuttonclickable")) {
			callRescheduledSubmitBreakbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRescheduledCancelbuttonclickable")) {
			callRescheduledCancelbuttonclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRescheduledCrossIconclickable")) {
			callRescheduledCrossIconclickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCatalogClickable")) {
			callCatalogClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCatalogProductClickable")) {
			callCatalogProductClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callCatalogProductCrossIconClickable")) {
			callCatalogProductCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callPointsClickable")) {
			callPointsClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callPointsOptionClickable")) {
			callPointsOptionClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callPointsOptionCrossIconClickable")) {
			callPointsOptionCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callEscalationClickable")) {
			callEscalationClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callEscalationListClickable")) {
			callEscalationListClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callEscalationListCrossIconClickable")) {
			callEscalationListCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationClickable")) {
			callAddEscalationClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationSubmitClickable")) {
			callAddEscalationSubmitClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationCancelClickable")) {
			callAddEscalationCancelClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddEscalationCrossIconClickable")) {
			callAddEscalationCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionClickable")) {
			callRedemptionClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callRedemptionHistoryClickable")) {
			callRedemptionHistoryClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionHistoryCrossIconClickable")) {
			callRedemptionHistoryCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionClickable")) {
			callAddRedemptionClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionSubmitClickable")) {
			callAddRedemptionSubmitClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionCancelClickable")) {
			callAddRedemptionCancelClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddRedemptionCrossIconClickable")) {
			callAddRedemptionCrossIconClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("CallClaimAddButtonClickable")) {
			CallClaimAddButtonClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("CallAddClaimButtonClickable")) {
			CallAddClaimButtonClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimSubmitButtonClickable")) {
			callAddClaimSubmitButtonClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCancelButtonClickable")) {
			callAddClaimCancelButtonClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCrossButtonClickable")) {
			callAddClaimCrossButtonClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusClickable")) {
			callClaimStatusClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusCrossClickable")) {
			callClaimStatusCrossClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callVerifyClaimClickable")) {
			callVerifyClaimClickable(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddEscalation")) {
			callAddEscalation(manager);
		}

		if (!TestCaseTracker.isExecuted("callSubmitEscalationVerifyNavigation")) {
			callSubmitEscalationVerifyNavigation(manager);
		}

		if (!TestCaseTracker.isExecuted("VerifyCallEscaListNameFilter")) {
			VerifyCallEscaListNameFilter(manager);
		}


		if (!TestCaseTracker.isExecuted("callAddClaimDealFieldMandotory")) {
			callAddClaimDealFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCustNameFieldMandotory")) {
			callAddClaimCustNameFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimCustContactFieldMandotory")) {
			callAddClaimCustContactFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimAddressFieldMandotory")) {
			callAddClaimAddressFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimProductFieldMandotory")) {
			callAddClaimProductFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimPointsFieldMandotory")) {
			callAddClaimPointsFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimQtyFieldMandotory")) {
			callAddClaimQtyFieldMandotory(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimNotSelectProductClickAddButton")) {
			callAddClaimNotSelectProductClickAddButton(manager);
		}

		if (!TestCaseTracker.isExecuted("callAddClaimNotSelectProductClickDeleteButton")) {
			callAddClaimNotSelectProductClickDeleteButton(manager);
		}
		

		if (!TestCaseTracker.isExecuted("callEnterClaimData")) {
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

				callEnterClaimData(manager,dealerCode, invNo, invoiceDate, customerName, customerContact, customerAddress,
						filePath);
			}

		}

		if (!TestCaseTracker.isExecuted("callAddClaimProducts")) {
			// Fetch data from DataProvider
			Object[][] data = productData();

			for (Object[] dataSet : data) {
				// Assuming the first HashMap has the keys "productCode" and "productQty"
				HashMap<String, String> productData = (HashMap<String, String>) dataSet[0];

				String productCodeValue = productData.get("productCode"); // Use the key to access the value
				String productQty = productData.get("productQty"); // Use the key to access the value
				callAddClaimProducts(manager,productCodeValue, productQty);
			}
		}

		if (!TestCaseTracker.isExecuted("verifyCallClaimTotalPoints")) {
			verifyCallClaimTotalPoints(manager);
		}
		
	
		if (!TestCaseTracker.isExecuted("callSubmitClaim")) {
			callSubmitClaim(manager);
		}

		if (!TestCaseTracker.isExecuted("verifyCallClaimSubmitNavigateToClaimStatus")) {
			verifyCallClaimSubmitNavigateToClaimStatus(manager);
		}

		if (!TestCaseTracker.isExecuted("verifyCallAddedClaim")) {
			verifyCallAddedClaim(manager);
		}

		if (!TestCaseTracker.isExecuted("openCallClaimStatusPDF")) {
			openCallClaimStatusPDF(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusPDFCrossClick")) {
			callClaimStatusPDFCrossClick(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusNameFilter")) {
			callClaimStatusNameFilter(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusFilterIconClick")) {
			callClaimStatusFilterIconClick(manager);
		}

		if (!TestCaseTracker.isExecuted("callClaimStatusFilterCrossClick")) {
			callClaimStatusFilterCrossClick(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callRedemptionGiftMandatoryField")) {
			callRedemptionGiftMandatoryField(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionQtyMandatoryField")) {
			callRedemptionQtyMandatoryField(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionPoints")) {
			// Fetch data from DataProvider
			Object[][] data = redemptionDetails();

			for (Object[] dataSet : data) {

				HashMap<String, String> redemptionData = (HashMap<String, String>) dataSet[0];

				String rewardCode = redemptionData.get("GiftName"); // Use the key to access the value
				String rewardQty = redemptionData.get("RewardQty"); // Use the key to access the value

				callRedemptionPoints(manager,rewardCode, rewardQty);
			}
		}

		if (!TestCaseTracker.isExecuted("callSubmitRedemption")) {
			callSubmitRedemption(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionSubmitNavigation")) {
			callRedemptionSubmitNavigation(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyAddedRemptionInRedemptionHistory")) {
			callMeVerifyAddedRemptionInRedemptionHistory(manager);
		}
		if (!TestCaseTracker.isExecuted("callMeVerifyNameFilterOfRedemptionHistory")) {
			callMeVerifyNameFilterOfRedemptionHistory(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryViewDetailsClickable")) {
			callMeVerifyRedemptionHistoryViewDetailsClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable")) {
			callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryViewPDFClickable")) {
			callMeVerifyRedemptionHistoryViewPDFClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryViewPDFCrossIconClickable")) {
			callMeVerifyRedemptionHistoryViewPDFCrossIconClickable(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryDateFilterClickable")) {
			callMeVerifyRedemptionHistoryDateFilterClickable(manager);
		}
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryDateFilterCrossIconClickable")) {
			callMeVerifyRedemptionHistoryDateFilterCrossIconClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyRedemptionHistoryStatusFilter")) {
			callMeVerifyRedemptionHistoryStatusFilter(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callRedemptionLockedPoints")) {
			callRedemptionLockedPoints(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionRedeemablePoints")) {
			callRedemptionRedeemablePoints(manager);
		}

		if (!TestCaseTracker.isExecuted("callRedemptionTotalPoints")) {
			callRedemptionTotalPoints(manager);
		}
		
//		if (!TestCaseTracker.isExecuted("callMeVerifyEarnPointsOfPointsMenu")) {
//			callMeVerifyEarnPointsOfPointsMenu(manager);
//		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClosingPointsOfPointsMenu")) {
			callMeVerifyClosingPointsOfPointsMenu(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyLockPointsOfPointsMenu")) {
			callMeVerifyLockPointsOfPointsMenu(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyRedeemablePointsOfPointsMenu")) {
			callMeVerifyRedeemablePointsOfPointsMenu(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyMilestoneOptionClickable")) {
			callMeVerifyMilestoneOptionClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyAchivementsMenuClickable")) {
			callMeVerifyAchivementsMenuClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyAchivementsMenuCrossIconClickable")) {
			callMeVerifyAchivementsMenuCrossIconClickable(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeVerifyMilestoneCatalogMenuClickable")) {
			callMeVerifyMilestoneCatalogMenuClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyMilestoneCatalogMenuCrossIconClickable")) {
			callMeVerifyMilestoneCatalogMenuCrossIconClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRedial")) {
			callMeRedial(manager);
		}
	
		if (!TestCaseTracker.isExecuted("callMeBack")) {
			callMeBack(manager);
		}

		if (!TestCaseTracker.isExecuted("callMeBackTaskStatus")) {
			callMeBackTaskStatus(manager);
		}

		if (!TestCaseTracker.isExecuted("verifyCallBackButtonDialNext")) {
			verifyCallBackButtonDialNext(manager);
		}

		if (!TestCaseTracker.isExecuted("callMeHangUp")) {
			callMeHangUp(manager);
		}

		if (!TestCaseTracker.isExecuted("callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending")) {
			callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending")) {
			callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyCountOfPendingClaim")) {
			callMeVerifyCountOfPendingClaim(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimVerifyBtnClickable")) {
			callMeVerifyClaimVerifyBtnClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimVerificationSubmitBtnClickable")) {
			callMeVerifyClaimVerificationSubmitBtnClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimCancelBtnClickable")) {
			callMeVerifyClaimCancelBtnClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimCrossIconClickable")) {
			callMeVerifyClaimCrossIconClickable(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimedPointsOfClaimVerification")) {
			callMeVerifyClaimedPointsOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty")) {
			callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef")) {
			callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf")) {
			callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus")) {
			callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus(manager);
		}	
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimWithoutSelectClaimVefRejectReason")) {
			callMeVerifyClaimWithoutSelectClaimVefRejectReason(manager);
		}	
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimIdAndTaskNoOfClaimVerification")) {
			callMeVerifyClaimIdAndTaskNoOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimDateOfClaimVerification")) {
			callMeVerifyClaimDateOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyCustomerNameOfClaimVerification")) {
			callMeVerifyCustomerNameOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyStatusOfClaimVerification")) {
			callMeVerifyStatusOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyInfluencerNameOfClaimVerification")) {
			callMeVerifyInfluencerNameOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyInfluencerMobileNoOfClaimVerification")) {
			callMeVerifyInfluencerMobileNoOfClaimVerification(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyTotalRecordsOfClaimVerification")) {
			callMeVerifyTotalRecordsOfClaimVerification(manager);
		}
		
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimWithoutSelectClaimVefRejectReason")) {
			callMeVerifyClaimWithoutSelectClaimVefRejectReason(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimByEqualQtyRejectStatus")) {
			callMeVerifyClaimByEqualQtyRejectStatus(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimByApproveAndRejectStatus")) {
			callMeVerifyClaimByApproveAndRejectStatus(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimByLessQtyApproveStatus")) {
			callMeVerifyClaimByLessQtyApproveStatus(manager);
		}
		
				
		if (!TestCaseTracker.isExecuted("callMeVerifyClaimByEqualQtyApproveStatus")) {
			callMeVerifyClaimByEqualQtyApproveStatus(manager);
		}
	
		if (!TestCaseTracker.isExecuted("callMecloseTaskSubmitBreak")) {
			callMecloseTaskSubmitBreak(manager);
		}

		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedSubmitBreak")) {
			callMeRescheduleNotInterestedSubmitBreak(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedTaskStatus")) {
			callMeRescheduleNotInterestedTaskStatus(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeRescheduleNotInterestedSubmit")) {
			callMeRescheduleNotInterestedSubmit(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedSubmitBreak")) {
			callMeRescheduleRingNotReceivedSubmitBreak(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedTaskStatus")) {
			callMeRescheduleRingNotReceivedTaskStatus(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleRingNotReceivedSubmit")) {
			callMeRescheduleRingNotReceivedSubmit(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterSubmitBreak")) {
			callMeRescheduleCallBackLaterSubmitBreak(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterTaskStatus")) {
			callMeRescheduleCallBackLaterTaskStatus(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeRescheduleCallBackLaterSubmit")) {
			callMeRescheduleCallBackLaterSubmit(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoSubmitBreak")) {
			callMeRescheduleWrongNoSubmitBreak(manager);
		}
		
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoTaskStatus")) {
			callMeRescheduleWrongNoTaskStatus(manager);
		}
			
		if (!TestCaseTracker.isExecuted("callMeRescheduleWrongNoSubmit")) {
			callMeRescheduleWrongNoSubmit(manager);
		}
		 				
	}catch (Exception e) {
        System.err.println("Exception during test execution: " + e.getMessage());
	}
    }
	         
	
	@Test(priority = 1, retryAnalyzer=Retry.class)
	public void callCloseTaskbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callCloseTaskbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Close Task");
		softAssert.assertTrue(telePage.verifyCloseTaskLableDisplay(),"Close Task Button not clickable");
		softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callCloseTaskbuttonclickable");
	}
	
	@Test(priority = 2)
	public void callCloseTaskSubmitbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskSubmitbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callCloseTaskSubmitbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCloseTasksubmitButton();
		softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),"Close Task Submit button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callCloseTaskSubmitbuttonclickable");
		
	}
	
	@Test(priority = 3)
	public void callCloseTaskCancelbuttonclickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callCloseTaskCancelbuttonclickable");
		logTestMethod(driver, methodTest,manager, "callCloseTaskCancelbuttonclickable", () -> {
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
		TestCaseTracker.markAsExecuted("callCloseTaskCancelbuttonclickable");
	}
	
	@Test(priority = 4)
	public void callCloseTaskSubmitBreakbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callCloseTaskSubmitBreakbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Close Task");
		telePage.clickOnCloseTasksubmitBreakButton();
		softAssert.assertTrue(telePage.verifyCloseTaskRemarkWarningMsgDisplay(),"Close Task Submit Break button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callCloseTaskSubmitBreakbuttonclickable");
		
		
	}
	
	
	@Test(priority = 5)
	public void callCloseTaskCrossIconclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCloseTaskCrossIconclickable");
        logTestMethod(driver,methodTest,manager, "callCloseTaskCrossIconclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		boolean status = true;
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCloseTaskCrossIcon();
		try
		{
		By closeTaskLableLocator=By.xpath("//h6[@class=\"my-0\"]/label");
		WebElement closeTaskLableElementElement=driver.findElement(closeTaskLableLocator);
		if(closeTaskLableElementElement.isDisplayed())
		{
			status=false;
		}
		}catch(Exception e)
		{
			
		}
		 if(!status)
		 {
			 softAssert.fail("Close Task Cross button not clickable");
		 }
        softAssert.assertAll();
       
        });
        TestCaseTracker.markAsExecuted("callCloseTaskCrossIconclickable");
	}
	
	
	@Test(priority = 6)
	public void callRescheduledbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callRescheduledbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnCallActionButton("Reschedule Call");
		softAssert.assertTrue(telePage.verifyRescheduleLableDisplay(),"Reschedule Button not clickable");
		softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callRescheduledbuttonclickable");
		
	}

	@Test(priority = 7)
	public void callRescheduledSubmitbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledSubmitbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callRescheduledSubmitbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRescheduleCallSubmitButton();
	
		softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),"Reschedule Submit button not clickable");
		
        softAssert.assertAll();
        	
        });
        TestCaseTracker.markAsExecuted("callRescheduledSubmitbuttonclickable");
	}
	
	@Test(priority = 8)
	public void callRescheduledSubmitBreakbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledSubmitBreakbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callRescheduledSubmitBreakbuttonclickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRescheduleCallSubmitBreakButton();
		softAssert.assertTrue(telePage.verifyRescheduleCallStatusWarningMsgDisplay(),"Reschedule Submit & Break button not clickable");
		
        softAssert.assertAll();
       
		
        });
        TestCaseTracker.markAsExecuted("callRescheduledSubmitBreakbuttonclickable");
	}
	
	@Test(priority = 9)
	public void callRescheduledCancelbuttonclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledCancelbuttonclickable");
        logTestMethod(driver,methodTest,manager, "callRescheduledCancelbuttonclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledCancelbuttonclickable");
		
	}
	
	@Test(priority = 10)
	public void callRescheduledCrossIconclickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRescheduledCrossIconclickable");
        logTestMethod(driver,methodTest,manager, "callRescheduledCrossIconclickable", () -> {
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
        TestCaseTracker.markAsExecuted("callRescheduledCrossIconclickable");
	}
	
	@Test(priority = 11)
	public void callCatalogClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogClickable");
        logTestMethod(driver,methodTest,manager, "callCatalogClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Catalog");
		softAssert.assertTrue(telePage.verifyCatalogOptionsDisplay(),"Catalogue button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callCatalogClickable");
		
	}
	
	@Test(priority = 12)
	public void callCatalogProductClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogProductClickable");
        logTestMethod(driver,methodTest,manager, "callCatalogProductClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnProductCatalog();	
		softAssert.assertTrue(telePage.verifyProductCatalogLableDisplay(),"Catalogue Products button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("callCatalogProductClickable");
		
	}
	
	@Test(priority = 13)
	public void callCatalogProductCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callCatalogProductCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callCatalogProductCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("callCatalogProductCrossIconClickable");

	}
	
	@Test(priority = 14)
	public void callPointsClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsClickable");
        logTestMethod(driver,methodTest,manager, "callPointsClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		softAssert.assertTrue(telePage.verifyPointsOptionsDisplay(),"Points button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("callPointsClickable");
	}
	
	@Test(priority = 15)
	public void callPointsOptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsOptionClickable");
        logTestMethod(driver,methodTest,manager, "callPointsOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnPointsOption();
		softAssert.assertTrue(telePage.verifyPointsLableDisplay(),"Points Drodown option button not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("callPointsOptionClickable");
	}
	
	@Test(priority = 16)
	public void callPointsOptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callPointsOptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callPointsOptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callPointsOptionCrossIconClickable");
	}
	
	@Test(priority = 17)
	public void callEscalationClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationClickable");
        logTestMethod(driver,methodTest,manager, "callEscalationClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");	
		softAssert.assertTrue(telePage.verifyEscalationListMenuDisplay(),"Escalation button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callEscalationClickable");
		
	}
	
	@Test(priority = 18)
	public void callEscalationListClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationListClickable");
        logTestMethod(driver,methodTest,manager, "callEscalationListClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnEscalationListMenu();
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(),"Escalation list button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callEscalationListClickable");
	}
	
	@Test(priority = 19)
	public void callEscalationListCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callEscalationListCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callEscalationListCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callEscalationListCrossIconClickable");
		
	}
	@Test(priority = 20)
	public void callAddEscalationClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationClickable");
        logTestMethod(driver,methodTest,manager, "callAddEscalationClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnAddEscalationMenu();
		softAssert.assertTrue(telePage.verifyAddEscalationMenuLableDisplay(),"Add Escalation button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callAddEscalationClickable");
		
		
	}
	
	@Test(priority = 21)
	public void callAddEscalationSubmitClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationSubmitClickable");
        logTestMethod(driver,methodTest, manager,"callAddEscalationSubmitClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddEscalationMenuSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddEscalationSelectTagWarningMsgDisplay(),"Add Escalation Submit button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("callAddEscalationSubmitClickable");
		

		
	}
	
	@Test(priority = 22)
	public void callAddEscalationCancelClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationCancelClickable");
        logTestMethod(driver,methodTest,manager, "callAddEscalationCancelClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("callAddEscalationCancelClickable");
	}
	
	@Test(priority = 23)
	public void callAddEscalationCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddEscalationCrossIconClickable");
        logTestMethod(driver,methodTest, manager,"callAddEscalationCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callAddEscalationCrossIconClickable");
	}
	
	@Test(priority = 24)
	public void callRedemptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionClickable");
        logTestMethod(driver,methodTest,manager, "callRedemptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuDisplay(),"Redemption button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callRedemptionClickable");
	}
	
	@Test(priority = 25)
	public void callRedemptionHistoryClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionHistoryClickable");
        logTestMethod(driver,methodTest,manager, "callRedemptionHistoryClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedemptionHistoryMenu();
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"Redemption History button not clickable");
	    softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callRedemptionHistoryClickable");
	}
	
	@Test(priority = 26)
	public void callRedemptionHistoryCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionHistoryCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callRedemptionHistoryCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callRedemptionHistoryCrossIconClickable");
		
	}
	
	@Test(priority = 27)
	public void callAddRedemptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionClickable");
        logTestMethod(driver,methodTest,manager, "callAddRedemptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		softAssert.assertTrue(telePage.verifyAddRedemptionMenuLableDisplay(),"Add Redemption button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callAddRedemptionClickable");
		
	}
	
	@Test(priority = 28)
	public void callAddRedemptionSubmitClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionSubmitClickable");
        logTestMethod(driver,methodTest,manager, "callAddRedemptionSubmitClickable", () -> {		
        SoftAssert softAssert = new SoftAssert();
        telePage = new OutboundTelecallingPage(driver);
        telePage.clickOnAddRedemptionSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Add Redemption Submit button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callAddRedemptionSubmitClickable");
		
	}
	
	@Test(priority = 29)
	public void callAddRedemptionCancelClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionCancelClickable");
        logTestMethod(driver,methodTest,manager, "callAddRedemptionCancelClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("callAddRedemptionCancelClickable");
		
	}
	
	@Test(priority = 30)
	public void callAddRedemptionCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddRedemptionCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callAddRedemptionCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callAddRedemptionCrossIconClickable");
		
	}

	@Test(priority = 31)
	public void CallClaimAddButtonClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("CallClaimAddButtonClickable");
        logTestMethod(driver,methodTest,manager, "CallClaimAddButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		softAssert.assertTrue(telePage.verifyAddClaimMenuDisplay(),"Claim Add button not clickable");
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("CallClaimAddButtonClickable");
	}

	@Test(priority = 32)
	public void CallAddClaimButtonClickable(TaskTypeManager manager) throws InterruptedException, IOException {
		
		ExtentTest methodTest = test.createNode("CallAddClaimButtonClickable");
        logTestMethod(driver,methodTest,manager, "CallAddClaimButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimMenu();
		softAssert.assertTrue(telePage.verifyAddClaimMenuLableDisplay(),"Add Claim button not clickable");	
        softAssert.assertAll();
        });	
		TestCaseTracker.markAsExecuted("CallAddClaimButtonClickable");

	}
	
	@Test(priority = 33)
	public void callAddClaimSubmitButtonClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimSubmitButtonClickable");
        logTestMethod(driver,methodTest,manager, "callAddClaimSubmitButtonClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealerFieldWarningMsgDisplay(),"Add Claim Submit button not clickable");
        softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("callAddClaimSubmitButtonClickable");
		
	}
	
	@Test(priority = 34)
	public void callAddClaimCancelButtonClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCancelButtonClickable");
        logTestMethod(driver,methodTest,manager, "callAddClaimCancelButtonClickable", () -> {
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
		
		TestCaseTracker.markAsExecuted("callAddClaimCancelButtonClickable");
	}
	
	@Test(priority = 35)
	public void callAddClaimCrossButtonClickable(TaskTypeManager manager) throws IOException 
	{
		ExtentTest methodTest = test.createNode("callAddClaimCrossButtonClickable");
        logTestMethod(driver,methodTest,manager, "callAddClaimCrossButtonClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callAddClaimCrossButtonClickable");
	}
	
	@Test(priority = 36)
	public void callClaimStatusClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusClickable");
        logTestMethod(driver,methodTest,manager, "callClaimStatusClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(),"Claim Status button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callClaimStatusClickable");
	}
	
	@Test(priority = 37)
	public void callClaimStatusCrossClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusCrossClickable");
        logTestMethod(driver,methodTest,manager, "callClaimStatusCrossClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callClaimStatusCrossClickable");
	
	}
	
	@Test(priority = 38)
	public void callVerifyClaimClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callVerifyClaimClickable");
        logTestMethod(driver,methodTest,manager, "callVerifyClaimClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnVerifyClaimMenu();
		softAssert.assertTrue(telePage.verifyVerifyClaimMenuLableDisplay(),"Verify Claim button not clickable");	
        softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callVerifyClaimClickable");
	}
	
  
	@Test(priority = 39)
	public void callAddEscalation(TaskTypeManager manager) throws IOException   
	{
		ExtentTest methodTest = test.createNode("callAddEscalation");
        logTestMethod(driver,methodTest,manager, "callAddEscalation", () -> {
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
		TestCaseTracker.markAsExecuted("callAddEscalation");
		
	}
	
	@Test(priority = 40)
	public void callSubmitEscalationVerifyNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callSubmitEscalationVerifyNavigation");
        logTestMethod(driver,methodTest,manager, "callSubmitEscalationVerifyNavigation", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyEscalationListMenuLableDisplay(), "Not navigate to Escalation List page");
		softAssert.assertAll();	
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("callSubmitEscalationVerifyNavigation");
		
	} 
	
	
	@Test(priority = 41)
	public void VerifyCallEscaListNameFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("VerifyCallEscaListNameFilter");
        logTestMethod(driver,methodTest,manager, "VerifyCallEscaListNameFilter", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Escalation");
		telePage.clickOnEscalationListMenu();
		telePage.enterTextInEscalationSerachFilter("Escalation");		
		softAssert.assertTrue(telePage.verifyEscalationListNoRecordsLableDisplay(),"Escalation Filter Name not working");	
		softAssert.assertAll();
        });
        telePage.clickOnEscalationListCrossIcon();
		TestCaseTracker.markAsExecuted("VerifyCallEscaListNameFilter");
		
	}
	
	
	
	
	@Test(priority = 42)
	public void callAddClaimDealFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimDealFieldMandotory");
        logTestMethod(driver,methodTest,manager, "callAddClaimDealFieldMandotory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();			
		softAssert.assertTrue(telePage.verifyAddClaimDealFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("callAddClaimDealFieldMandotory");
		
		
	}
	
	@Test(priority = 43)
	public void callAddClaimCustNameFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCustNameFieldMandotory");
        logTestMethod(driver,methodTest, manager,"callAddClaimCustNameFieldMandotory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNameFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("callAddClaimCustNameFieldMandotory");
	}
	
	@Test(priority = 44)
	public void callAddClaimCustContactFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimCustContactFieldMandotory");
        logTestMethod(driver,methodTest,manager, "callAddClaimCustContactFieldMandotory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();	
		softAssert.assertTrue(telePage.verifyAddClaimCustNumberFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();
		TestCaseTracker.markAsExecuted("callAddClaimCustContactFieldMandotory");
	}
	
	@Test(priority = 45)
	public void callAddClaimAddressFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimAddressFieldMandotory");
        logTestMethod(driver,methodTest,manager, "callAddClaimAddressFieldMandotory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimCustAddressFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("callAddClaimAddressFieldMandotory");
		
	}
	
	@Test(priority = 46)
	public void callAddClaimProductFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimProductFieldMandotory");
        logTestMethod(driver,methodTest,manager, "callAddClaimProductFieldMandotory", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnAddClaimMenu();
		telePage.clickOnAddClaimSubmitBtn();
		softAssert.assertTrue(telePage.verifyAddClaimProductFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
        
        });
        telePage.clickOnAddClaimCrossIcon();	
		TestCaseTracker.markAsExecuted("callAddClaimProductFieldMandotory");
		
	}
	
	@Test(priority = 47)
	public void callAddClaimPointsFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimPointsFieldMandotory");
        logTestMethod(driver,methodTest,manager, "callAddClaimPointsFieldMandotory", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Claim/Add");
	telePage.clickOnAddClaimMenu();
	telePage.clickOnAddClaimSubmitBtn()	;	
	softAssert.assertTrue(telePage.verifyAddClaimPointsFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");	
    softAssert.assertAll();
     });
        telePage.clickOnAddClaimCrossIcon();
	TestCaseTracker.markAsExecuted("callAddClaimPointsFieldMandotory");
		
	}
	
	@Test(priority = 48)
	public void callAddClaimQtyFieldMandotory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimQtyFieldMandotory");
       logTestMethod(driver,methodTest, manager,"callAddClaimQtyFieldMandotory", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Claim/Add");
	telePage.clickOnAddClaimMenu();
	telePage.clickOnAddClaimSubmitBtn();		
	softAssert.assertTrue(telePage.verifyAddClaimQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
    softAssert.assertAll();
        });
       telePage.clickOnAddClaimCrossIcon();
	TestCaseTracker.markAsExecuted("callAddClaimQtyFieldMandotory");
		
	}
	
	
	
	@Test(priority = 49)
	public void callAddClaimNotSelectProductClickAddButton(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimNotSelectProductClickAddButton");
        logTestMethod(driver,methodTest,manager, "callAddClaimNotSelectProductClickAddButton", () -> {
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
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickAddButton");
		
	}
	
	@Test(priority = 50)
	public void callAddClaimNotSelectProductClickDeleteButton(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callAddClaimNotSelectProductClickDeleteButton");
        logTestMethod(driver,methodTest,manager, "callAddClaimNotSelectProductClickDeleteButton", () -> {
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
		TestCaseTracker.markAsExecuted("callAddClaimNotSelectProductClickDeleteButton");
		
	}
	
	
	
	
	@Test(priority = 51, dataProvider = "customerData")
	public void callEnterClaimData(TaskTypeManager manager,String dealerCode, String invNo, String invoiceDate, String customerName,
			String customerContact, String customerAddress, String filePath) throws InterruptedException, IOException 

	{
		ExtentTest methodTest = test.createNode("callEnterClaimData");
        logTestMethod(driver,methodTest,manager, "callEnterClaimData", () -> {
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
		TestCaseTracker.markAsExecuted("callEnterClaimData");

	}
	
	@Test(priority = 52, dataProvider = "productData")
	public void callAddClaimProducts(TaskTypeManager manager,String productCodeValue, String productQty) throws InterruptedException, IOException   {

		ExtentTest methodTest = test.createNode("callAddClaimProducts");
        logTestMethod(driver,methodTest,manager, "callAddClaimProducts", () -> {
        	 SoftAssert softAssert = new SoftAssert();
        	telePage = new OutboundTelecallingPage(driver);
		try {
			telePage.selectAddClaimProducts(productCodeValue, productQty);
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			softAssert.fail("Customer Details not getting added successfully");
			//e.printStackTrace();
		}
		// Click on + button to add another product
		if (i < productData().length) {
			telePage.clickOnAddClaimPlusBtn();
			i++;
		}
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callAddClaimProducts");
	}
	
	

	@Test(priority = 53)
	public void verifyCallClaimTotalPoints(TaskTypeManager manager) throws IOException 
	{ 
		ExtentTest methodTest = test.createNode("verifyCallClaimTotalPoints");
        logTestMethod(driver,methodTest,manager, "verifyCallClaimTotalPoints", () -> {
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
		TestCaseTracker.markAsExecuted("verifyCallClaimTotalPoints");
		
	}
	

	@Test(priority = 54)
	public void callSubmitClaim(TaskTypeManager manager) throws IOException

	{
		ExtentTest methodTest = test.createNode("callSubmitClaim");
        logTestMethod(driver,methodTest,manager, "callSubmitClaim", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddClaimSubmitBtn();
		generatedClaimID =telePage.getClaimIDOfAddedClaim();
		System.out.println("generatedClaimID :"+ generatedClaimID);
		softAssert.assertTrue(telePage.verifyAddedClaimSuccessDialogBoxDisplay(),"Test Failed : Claim Not getting Submit");
		telePage.clickOnAddClaimSuccessDialogOkBtn();
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callSubmitClaim");

	}
	
	
	@Test(priority = 55)
	public void verifyCallClaimSubmitNavigateToClaimStatus(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("verifyCallClaimSubmitNavigateToClaimStatus");
        logTestMethod(driver,methodTest, manager,"verifyCallClaimSubmitNavigateToClaimStatus", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyClaimStatusMenuLableDisplay(), "Not Navigate to Claim Status Page");
		softAssert.assertAll();	
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("verifyCallClaimSubmitNavigateToClaimStatus");	
	}
	

	@Test(priority = 56, alwaysRun = true)
	public void verifyCallAddedClaim(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("verifyCallAddedClaim");
        logTestMethod(driver,methodTest,manager, "verifyCallAddedClaim", () -> {
		// Verify added claim in claim Status Details
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		softAssert.assertTrue(telePage.verifyAddClaimIdDisplayOnClaimStatusPage(generatedClaimID),
					"Test Failed : verifyAddedClaim - Added claim not showing on claim status");
		
		softAssert.assertAll();
		
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("verifyCallAddedClaim");
	}
	
	
	
	
	@Test(priority = 57, alwaysRun = true)
	public void openCallClaimStatusPDF(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("openCallClaimStatusPDF");
        logTestMethod(driver,methodTest,manager, "openCallClaimStatusPDF", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusViewPDF();
		softAssert.assertTrue(telePage.verifyClaimStatusPDFLableDisplay(),"View Claim Status PDF not Geeting Open");	
		softAssert.assertAll();
        });
		
		TestCaseTracker.markAsExecuted("openCallClaimStatusPDF");
		
		
	}
	
	@Test(priority = 58, alwaysRun = true)
	public void callClaimStatusPDFCrossClick(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusPDFCrossClick");
        logTestMethod(driver,methodTest, manager,"callClaimStatusPDFCrossClick", () ->{ 
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
		TestCaseTracker.markAsExecuted("callClaimStatusPDFCrossClick");
				
	}
	
	
	@Test(priority = 59, alwaysRun = true)
	public void callClaimStatusNameFilter(TaskTypeManager manager) throws IOException
	{	
		
		ExtentTest methodTest = test.createNode("callClaimStatusNameFilter");
        logTestMethod(driver,methodTest,manager, "callClaimStatusNameFilter", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.enterTextInEscalationSerachFilter("Claim Status");
		softAssert.assertTrue(telePage.verifyClaimStatusNoRecordsLableDisplay(),"Claim Status Filter Name not working");
		softAssert.assertAll();
        });
        telePage.clickOnClaimStatusCrossIcon();
		TestCaseTracker.markAsExecuted("callClaimStatusNameFilter");
		
	}
	
	@Test(priority = 60, alwaysRun = true)
	public void callClaimStatusFilterIconClick(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusFilterIconClick");
        logTestMethod(driver,methodTest,manager, "callClaimStatusFilterIconClick", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");
		telePage.clickOnClaimStatusMenu();
		telePage.clickOnClaimStatusDateFilterIcon();
		softAssert.assertTrue(telePage.verifyClaimStatusDateFilterLableDisplay()," Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callClaimStatusFilterIconClick");
		
	}
	
	@Test(priority = 61, alwaysRun = true)
	public void callClaimStatusFilterCrossClick(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callClaimStatusFilterCrossClick");
        logTestMethod(driver,methodTest,manager, "callClaimStatusFilterCrossClick", () ->{ 
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
		TestCaseTracker.markAsExecuted("callClaimStatusFilterCrossClick");
		
	}

	
	@Test(priority = 62, alwaysRun = true)
	public void callRedemptionGiftMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionGiftMandatoryField");
        logTestMethod(driver,methodTest, manager,"callRedemptionGiftMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionGiftFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
		
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("callRedemptionGiftMandatoryField");
		
	}
	
	@Test(priority = 63, alwaysRun = true)
	public void callRedemptionQtyMandatoryField(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionQtyMandatoryField");
        logTestMethod(driver,methodTest, manager,"callRedemptionQtyMandatoryField", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		telePage.clickOnAddRedemptionSubmitBtn();		
		softAssert.assertTrue(telePage.verifyAddRedemptionQtyFieldWarningMsgDisplay(),"Error message should be displayed for mandatory field.");
        softAssert.assertAll();
       
        });
        telePage.clickOnAddRedemptionCrossIcon();
		TestCaseTracker.markAsExecuted("callRedemptionQtyMandatoryField");
	}	
	
	
	
	
	@Test(priority = 64, dataProvider="redemptionData", alwaysRun = true)
	public void callRedemptionPoints(TaskTypeManager manager,String rewardCode, String rewardQty) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionPoints");
        logTestMethod(driver,methodTest,manager, "callRedemptionPoints", () ->{ 
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
		
		softAssert.assertEquals(actualRedemptionPoints,expectedRedemptionPoints,"Redemption Points showing Incorrect.");
         
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

		TestCaseTracker.markAsExecuted("callRedemptionPoints");
		
	}
	
	
	@Test(priority = 65, alwaysRun = true)
	public void callSubmitRedemption(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callSubmitRedemption");
        logTestMethod(driver,methodTest,manager, "callSubmitRedemption", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAddRedemptionSubmitBtn();
	    addedRedemptionNumber=telePage.getAddedRedemptionCode();
	    System.out.println("Submitted Redemption Number : "+ addedRedemptionNumber);
        softAssert.assertTrue(telePage.verifyAddRedemptionSuccessPopUpDisplay(),"Redemption Not getting submit.");
        softAssert.assertAll();
        telePage.clickOnAddRedemptionSuccessPopUpOkBtn();
        });		
        TestCaseTracker.markAsExecuted("callSubmitRedemption");
		
		
	}
	
	
	@Test(priority = 66, alwaysRun = true)
	public void callRedemptionSubmitNavigation(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionSubmitNavigation");
        logTestMethod(driver,methodTest,manager, "callRedemptionSubmitNavigation", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyRedemptionHistoryMenuLableDisplay(),"After Submit Redemption navigate to history page");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("callRedemptionSubmitNavigation");
	}
	
	@Test(priority = 67, alwaysRun = true)
	public void callMeVerifyAddedRemptionInRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyAddedRemptionInRedemptionHistory");
        logTestMethod(driver,methodTest,manager, "callMeVerifyAddedRemptionInRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		softAssert.assertTrue(telePage.verifyAddedRedemptionNoDisplayOnRedemptionHistory(addedRedemptionNumber),"Added Redemption not showing in Redemption History");
		softAssert.assertAll();		
        });
	      TestCaseTracker.markAsExecuted("callMeVerifyAddedRemptionInRedemptionHistory");
	}
	
	@Test(priority = 68, alwaysRun = true)
	public void callMeVerifyNameFilterOfRedemptionHistory(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyNameFilterOfRedemptionHistory");
        logTestMethod(driver,methodTest, manager,"callMeVerifyNameFilterOfRedemptionHistory", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.enterTextInRedHistorySerachFilter("Redemption History");
		softAssert.assertTrue(telePage.verifyRedHistoryNoRecordsLableDisplay(),"Redemption History Name Filter  not working");
		softAssert.assertAll();
        });
        telePage.clickOnRedemptionHistoryCrossIcon();
		TestCaseTracker.markAsExecuted("callMeVerifyNameFilterOfRedemptionHistory");
	}
	
	@Test(priority = 69, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryViewDetailsClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryViewDetailsClickable");
        logTestMethod(driver,methodTest,manager, "callMeVerifyRedemptionHistoryViewDetailsClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnRedemptionHistoryMenu();
		telePage.clickOnRedHistoryViewDetailsIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDetailsLableDisplay(),"Redemption History View Details Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryViewDetailsClickable");
		
	}

	@Test(priority = 70, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryViewDetailsCrossIconClickable");

	}
	
	@Test(priority = 71, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryViewPDFClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryViewPDFClickable");
        logTestMethod(driver,methodTest,manager, "callMeVerifyRedemptionHistoryViewPDFClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryViewPdfIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryPdfLableDisplay(),"Redemption History PDF Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryViewPDFClickable");
		
	}
	
	@Test(priority = 72, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryViewPDFCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryViewPDFCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "callMeVerifyRedemptionHistoryViewPDFCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryViewPDFCrossIconClickable");

	}

	@Test(priority = 73, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryDateFilterClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryDateFilterClickable");
        logTestMethod(driver,methodTest, manager,"callMeVerifyRedemptionHistoryDateFilterClickable", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnRedHistoryDateFilterIcon();
		softAssert.assertTrue(telePage.verifyRedHistoryDateFilterLableDisplay()," Date Filter Icon not working");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryDateFilterClickable");
	}
	
	@Test(priority = 74, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryDateFilterCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryDateFilterCrossIconClickable");
		logTestMethod(driver, methodTest, manager,"callMeVerifyRedemptionHistoryDateFilterCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryDateFilterCrossIconClickable");

	}
	
	@Test(priority = 75, alwaysRun = true)
	public void callMeVerifyRedemptionHistoryStatusFilter(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyRedemptionHistoryStatusFilter");
        logTestMethod(driver,methodTest, manager,"callMeVerifyRedemptionHistoryStatusFilter", () ->{ 
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
		TestCaseTracker.markAsExecuted("callMeVerifyRedemptionHistoryStatusFilter");
		
	}
	
	@Test(priority = 76, alwaysRun = true)
	public void callRedemptionLockedPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionLockedPoints");
        logTestMethod(driver,methodTest,manager, "callRedemptionLockedPoints", () ->{ 
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
	    TestCaseTracker.markAsExecuted("callRedemptionLockedPoints");	
	}
	
	@Test(priority = 77, alwaysRun = true)
	public void callRedemptionRedeemablePoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionRedeemablePoints");
        logTestMethod(driver,methodTest,manager, "callRedemptionRedeemablePoints", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Redemption");
		telePage.clickOnAddRedemptionMenu();
		int newExpectedReedemablePoints=oldReedemablePoints-expectedRedemptionPoints;
		System.out.println("Expected Reedemable Points : " +newExpectedReedemablePoints);
		//get Reedemable points 
		newReedemablePoints =telePage.getRedemptionReedemablePoints();
		System.out.println("New Reedemable Points : " + newReedemablePoints);
		softAssert.assertEquals(newReedemablePoints,newExpectedReedemablePoints,"Reedamable Points are incorrect.");
	    softAssert.assertAll();   
        });
        telePage.clickOnAddRedemptionCrossIcon();
	    TestCaseTracker.markAsExecuted("callRedemptionRedeemablePoints");
		
	}
	
	@Test(priority = 78, alwaysRun = true)
	public void callRedemptionTotalPoints(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callRedemptionTotalPoints");
        logTestMethod(driver,methodTest,manager, "callRedemptionTotalPoints", () ->{ 
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
	 	TestCaseTracker.markAsExecuted("callRedemptionTotalPoints");
		
	}	
	
	
	//@Test(priority = 79, alwaysRun = true)
	public void callMeVerifyEarnPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyEarnPointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "callMeVerifyEarnPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Points");
		telePage.clickOnPointsOption();
		String stringEarnPoints=telePage.getPointsMenuEarnPoints();
		int actualEarnPoints = Integer.parseInt(stringEarnPoints);
		int closingPoints =telePage.getPointsMenuClosingPoints();
		
		int lockPoints=telePage.getPointsMenuLockPoints();
		int expectedEarnPoints=closingPoints+lockPoints;
		
		System.out.println("Expected Earn Points : " + expectedEarnPoints);
		softAssert.assertEquals(actualEarnPoints,expectedEarnPoints,"Earn points are incorrect.");
        softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("callMeVerifyEarnPointsOfPointsMenu");
	}
	
	
	@Test(priority = 80, alwaysRun = true)
	public void callMeVerifyClosingPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
	ExtentTest methodTest = test.createNode("callMeVerifyClosingPointsOfPointsMenu");
    logTestMethod(driver,methodTest, manager,"callMeVerifyClosingPointsOfPointsMenu", () -> {
	SoftAssert softAssert = new SoftAssert();
	telePage = new OutboundTelecallingPage(driver);
	telePage.clickOnTransactionButton("Points");
	telePage.clickOnPointsOption();
	int actualClosingPoints=telePage.getPointsMenuClosingPoints();
	int expectedClosingPoints=newTotalPoints;
	System.out.println("Expected Closing Points : " + expectedClosingPoints);
	softAssert.assertEquals(actualClosingPoints,expectedClosingPoints,"Closing points are incorrect.");
    softAssert.assertAll();
    });
    TestCaseTracker.markAsExecuted("callMeVerifyClosingPointsOfPointsMenu");
		
	}
	
	@Test(priority = 81, alwaysRun = true)
	public void callMeVerifyLockPointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyLockPointsOfPointsMenu");
        logTestMethod(driver,methodTest,manager, "callMeVerifyLockPointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualLockPoints=telePage.getPointsMenuLockPoints();
		int expectedLockPoints=newLockedPoints;
		System.out.println("Expected Lock Points : " + expectedLockPoints);
		softAssert.assertEquals(actualLockPoints,expectedLockPoints,"Lock points are incorrect.");
	    softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callMeVerifyLockPointsOfPointsMenu");
	}
	
	@Test(priority = 82, alwaysRun = true)
	public void callMeVerifyRedeemablePointsOfPointsMenu(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyRedeemablePointsOfPointsMenu");
        logTestMethod(driver,methodTest, manager,"callMeVerifyRedeemablePointsOfPointsMenu", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		int actualRedeemablePoints=telePage.getPointsMenuRedeemablePoints();
		int expectedRedeemablePoints=newReedemablePoints;
		System.out.println("Expected Redeemable Points : " + expectedRedeemablePoints);
		softAssert.assertEquals(actualRedeemablePoints,expectedRedeemablePoints,"Redeemable points are incorrect.");
	    softAssert.assertAll();
        });
        telePage.clickOnPointsMenuCrossIcon();
        TestCaseTracker.markAsExecuted("callMeVerifyRedeemablePointsOfPointsMenu");
	}
	
	
	@Test(priority = 83, alwaysRun = true)
	public void callMeVerifyMilestoneOptionClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyMilestoneOptionClickable");
        logTestMethod(driver,methodTest, manager,"callMeVerifyMilestoneOptionClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		softAssert.assertTrue(telePage.verifyMilestoneOptionsDisplay(),"Milestone button not clickable");
        softAssert.assertAll();
        });
        TestCaseTracker.markAsExecuted("callMeVerifyMilestoneOptionClickable");
	}
	
	
	@Test(priority = 84, alwaysRun = true)
	public void callMeVerifyAchivementsMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyAchivementsMenuClickable");
        logTestMethod(driver,methodTest,manager, "callMeVerifyAchivementsMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnAchivementsMenu();	
		softAssert.assertTrue(telePage.verifyAchivementsLableDisplay(),"Achivement Menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("callMeVerifyAchivementsMenuClickable");
	}
	
	@Test(priority = 85, alwaysRun = true)
	public void callMeVerifyAchivementsMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyAchivementsMenuCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callMeVerifyAchivementsMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("callMeVerifyAchivementsMenuCrossIconClickable");

	}
	
	@Test(priority = 86, alwaysRun = true)
	public void callMeVerifyMilestoneCatalogMenuClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyMilestoneCatalogMenuClickable");
        logTestMethod(driver,methodTest, manager,"callMeVerifyMilestoneCatalogMenuClickable", () -> {
		SoftAssert softAssert = new SoftAssert();
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Milestone");
		telePage.clickOnMilestoneCatalogMenu();	
		softAssert.assertTrue(telePage.verifyMilestoneCatalogLableDisplay(),"Milestone catalog menu not clickable");
        softAssert.assertAll();	
        });
        TestCaseTracker.markAsExecuted("callMeVerifyMilestoneCatalogMenuClickable");
	}
	
	@Test(priority = 87, alwaysRun = true)
	public void callMeVerifyMilestoneCatalogMenuCrossIconClickable(TaskTypeManager manager) throws IOException
	{
		ExtentTest methodTest = test.createNode("callMeVerifyMilestoneCatalogMenuCrossIconClickable");
        logTestMethod(driver,methodTest,manager, "callMeVerifyMilestoneCatalogMenuCrossIconClickable", () -> {
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
        TestCaseTracker.markAsExecuted("callMeVerifyMilestoneCatalogMenuCrossIconClickable");

	}
	
	
	
	@Test(priority = 88, alwaysRun = true)
	public void callMeRedial(TaskTypeManager manager) throws InterruptedException, IOException
	{ 
		ExtentTest methodTest = test.createNode("callMeRedial");
        logTestMethod(driver,methodTest,manager, "callMeRedial", () ->{ 
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
		TestCaseTracker.markAsExecuted("callMeRedial");
	}
	
	
	
	@Test(priority = 89, alwaysRun = true)
	public void callMeBack(TaskTypeManager manager) throws IOException  
	{
		ExtentTest methodTest = test.createNode("callMeBack");
        logTestMethod(driver,methodTest,manager, "callMeBack", () ->{ 
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
		softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),"Test Failed :callMeBack- Back Button Not working proper");
		softAssert.assertAll();
        });
		TestCaseTracker.markAsExecuted("callMeBack");
		 
	}
	
	@Test(priority = 90, alwaysRun = true)
	public void callMeBackTaskStatus(TaskTypeManager manager) throws IOException 
	{
		
		ExtentTest methodTest = test.createNode("callMeBackTaskStatus");
        logTestMethod(driver,methodTest, manager,"callMeBackTaskStatus", () ->{ 
		SoftAssert softAssert = new SoftAssert();
		outboundPage=new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		String taskStatus=outboundPage.getOutboundPageTaskStatus(backButtonTaskNo);
		System.out.println("Back Button taskStatus "+ taskStatus);
		System.out.println("Dashboard Task status CallMe-BackButton : "+taskStatus);
		softAssert.assertEquals(taskStatus, "Pending", " Test Failed : callMeBackTaskStatus");
		softAssert.assertAll();
        });
		 TestCaseTracker.markAsExecuted("callMeBackTaskStatus");
		
		}
		
		
   
	
	@Test(priority = 91, alwaysRun = true)
	public void verifyCallBackButtonDialNext(TaskTypeManager manager) throws InterruptedException, IOException
	{  
		ExtentTest methodTest = test.createNode("verifyCallBackButtonDialNext");
        logTestMethod(driver,methodTest,manager, "verifyCallBackButtonDialNext", () ->{ 
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
		softAssert.assertEquals(newTaskNo, backButtonTaskNo,"Test Failed : verifyCallBackButtonDialNext -incorrect call connect");
		
		softAssert.assertAll();
        });
	   TestCaseTracker.markAsExecuted("verifyCallBackButtonDialNext");
		
	}
	
	
	
	@Test(priority = 92, alwaysRun = true)
	public void callMeHangUp(TaskTypeManager manager) throws InterruptedException, IOException
	{
		ExtentTest methodTest = test.createNode("callMeHangUp");
        logTestMethod(driver,methodTest, manager,"callMeHangUp", () ->{ 
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
		softAssert.assertNotEquals(loaderMsg,"New Call Connecting", "Test Faild : callMeHangUp");
		telePage.waitInVisibilityOfLoader();
		softAssert.assertAll();
        });
        try
        {
        	outboundPage.clickOnDialNextButton();
        }catch(Exception e)
        {
        	
        }
		 TestCaseTracker.markAsExecuted("callMeHangUp");
				
	}
	
	@Test(priority = 93, alwaysRun = true)
	public void callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest,manager, "callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyCloseTaskBySubmitBtnWhenClaimStatusPending");

	}

	@Test(priority = 94, alwaysRun = true)
	public void callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending(TaskTypeManager manager) throws IOException {

		ExtentTest methodTest = test.createNode("callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");
		logTestMethod(driver, methodTest,manager, "callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyCloseTaskBySubmitBreakBtnWhenClaimStatusPending");

	}

	@Test(priority = 95, alwaysRun = true)
	public void callMeVerifyCountOfPendingClaim(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyCountOfPendingClaim");
		logTestMethod(driver, methodTest,manager, "callMeVerifyCountOfPendingClaim", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyCountOfPendingClaim");

	}

	@Test(priority = 96, alwaysRun = true)
	public void callMeVerifyClaimVerifyBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimVerifyBtnClickable");
		logTestMethod(driver, methodTest, manager,"callMeVerifyClaimVerifyBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnFristRowVerifyBtnOfClaimVerification();

			softAssert.assertTrue(telePage.verifyClaimVerificationLabelDisplay(), "Claim Verify button not clickable");

			softAssert.assertAll();
		});
		TestCaseTracker.markAsExecuted("callMeVerifyClaimVerifyBtnClickable");

	}

	@Test(priority = 97, alwaysRun = true)
	public void callMeVerifyClaimVerificationSubmitBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimVerificationSubmitBtnClickable");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimVerificationSubmitBtnClickable", () -> {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			telePage.clickOnClaimVerificationSubmitBtn();
			softAssert.assertTrue(telePage.verifyClaimVerificationErrorToastForClaimStatusFieldDisplay(),
					"Claim Verification Submit button not clickable");
			softAssert.assertAll();
			telePage.waitInvisibilityOfErrorToastMsgForClaimVefClaimStatusField();
		});
		TestCaseTracker.markAsExecuted("callMeVerifyClaimVerificationSubmitBtnClickable");
	}

	@Test(priority = 98, alwaysRun = true)
	public void callMeVerifyClaimCancelBtnClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimCancelBtnClickable");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimCancelBtnClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimCancelBtnClickable");

	}

	@Test(priority = 99, alwaysRun = true)
	public void callMeVerifyClaimCrossIconClickable(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimCrossIconClickable");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimCrossIconClickable", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimCrossIconClickable");
	}

	@Test(priority = 100, alwaysRun = true)
	public void callMeVerifyClaimedPointsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimedPointsOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimedPointsOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimedPointsOfClaimVerification");

	}

	@Test(priority = 101, alwaysRun = true)
	public void callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty");
		logTestMethod(driver, methodTest,manager, "callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyQtyFieldOfClaimVerificationByEnterMaxQty");

	}

	@Test(priority = 102, alwaysRun = true)
	public void callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef(TaskTypeManager manager) throws InterruptedException, IOException {
		// If we select claim status approve then Rejected Reason field should not be show
		ExtentTest methodTest = test.createNode("callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef");
		logTestMethod(driver, methodTest,manager, "callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyReasonFieldNotDisplayForOkStatusForClaimVef");

	}

	@Test(priority = 103, alwaysRun = true)
	public void callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf(TaskTypeManager manager)throws InterruptedException, IOException {
		// If we select claim status Reject then Rejected Reason field should be show
		ExtentTest methodTest = test.createNode("callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");
		logTestMethod(driver, methodTest,manager, "callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyReasonFieldShouldDisplayForNotOkStatusForClaimVerf");

	}

	@Test(priority = 104, alwaysRun = true)
	public void callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus(TaskTypeManager manager) throws InterruptedException, IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus");
		logTestMethod(driver, methodTest, manager,"callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyQtyAndPointsForClaimVerificationNotOkStatus");

	}

	@Test(priority = 105, alwaysRun = true)
	public void callMeVerifyClaimWithoutSelectClaimVefRejectReason(TaskTypeManager manager) throws IOException {
       // If we select Claim Status Reject & if Reason field Blank then Error pop-up should be display
		ExtentTest methodTest = test.createNode("callMeVerifyClaimWithoutSelectClaimVefRejectReason");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimWithoutSelectClaimVefRejectReason", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimWithoutSelectClaimVefRejectReason");

	}

	@Test(priority = 106, alwaysRun = true)
	public void callMeVerifyClaimIdAndTaskNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimIdAndTaskNoOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimIdAndTaskNoOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimIdAndTaskNoOfClaimVerification");
	}

	@Test(priority = 107, alwaysRun = true)
	public void callMeVerifyClaimDateOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyClaimDateOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyClaimDateOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyClaimDateOfClaimVerification");
	}

	@Test(priority = 108, alwaysRun = true)
	public void callMeVerifyCustomerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyCustomerNameOfClaimVerification");
		logTestMethod(driver, methodTest, manager,"callMeVerifyCustomerNameOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyCustomerNameOfClaimVerification");
	}

	@Test(priority = 109, alwaysRun = true)
	public void callMeVerifyStatusOfClaimVerification(TaskTypeManager manager) throws IOException {
        //Claim Status Should be show Pending
		ExtentTest methodTest = test.createNode("callMeVerifyStatusOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyStatusOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyStatusOfClaimVerification");

	}

	@Test(priority = 110, alwaysRun = true)
	public void callMeVerifyInfluencerNameOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyInfluencerNameOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyInfluencerNameOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyInfluencerNameOfClaimVerification");
	}

	@Test(priority = 111, alwaysRun = true)
	public void callMeVerifyInfluencerMobileNoOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyInfluencerMobileNoOfClaimVerification");
		logTestMethod(driver, methodTest, manager,"callMeVerifyInfluencerMobileNoOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyInfluencerMobileNoOfClaimVerification");
	}

	@Test(priority = 112, alwaysRun = true)
	public void callMeVerifyTotalRecordsOfClaimVerification(TaskTypeManager manager) throws IOException {
		ExtentTest methodTest = test.createNode("callMeVerifyTotalRecordsOfClaimVerification");
		logTestMethod(driver, methodTest,manager, "callMeVerifyTotalRecordsOfClaimVerification", () -> {
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
		TestCaseTracker.markAsExecuted("callMeVerifyTotalRecordsOfClaimVerification");
	}

	@Test(priority = 113, alwaysRun = true)
	public void callMeVerifyClaimByEqualQtyRejectStatus(TaskTypeManager manager) throws IOException {
		telePage = new OutboundTelecallingPage(driver);
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("callMeVerifyClaimByEqualQtyRejectStatus");
			logTestMethod(driver, methodTest,manager, "callMeVerifyClaimByEqualQtyRejectStatus", () -> {
				telePage.clickOnFristRowVerifyBtnOfClaimVerification();
				for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

					telePage.getTotalVerifyPointsOfClaimVerification(i);
					try {
						telePage.selectClaimVerificationStatus(i, "Not ok");
						telePage.selectRejectReasonofClaimVerification(i, "Site/Product Picture not clear");
					} catch (InterruptedException e) {
						//e.printStackTrace();
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
			TestCaseTracker.markAsExecuted("callMeVerifyClaimByEqualQtyRejectStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}
	}

	@Test(priority = 114, alwaysRun = true)
	public void callMeVerifyClaimByApproveAndRejectStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("callMeVerifyClaimByApproveAndRejectStatus");
			logTestMethod(driver, methodTest,manager, "callMeVerifyClaimByApproveAndRejectStatus", () -> {
				
				List<String> statuses = Arrays.asList("Not ok", "Ok");
				telePage.clickOnFristRowVerifyBtnOfClaimVerification();
				for (int i = 1; i <= telePage.getRowsCountOfSpecificClaim(); i++) {

					try {
						String status = statuses.get(i % statuses.size()); // Alternates between "Approve" and "Reject

                       // Set the status for the claim
						telePage.selectClaimVerificationStatus(i, status);
					} catch (InterruptedException e) {
						//e.printStackTrace();
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
			TestCaseTracker.markAsExecuted("callMeVerifyClaimByApproveAndRejectStatus");
		} else {
			System.out.println("Records not available for Claim verification");
		}
	}

	@Test(priority = 115, alwaysRun = true)
	public void callMeVerifyClaimByLessQtyApproveStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {
			ExtentTest methodTest = test.createNode("callMeVerifyClaimByLessQtyApproveStatus");
			logTestMethod(driver, methodTest, manager,"callMeVerifyClaimByLessQtyApproveStatus", () -> {
				
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
						//e.printStackTrace();
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
			TestCaseTracker.markAsExecuted("callMeVerifyClaimByLessQtyApproveStatus");
			telePage.clickOnClaimVerificationCancelBtn();
		} else {
			System.out.println("Records not available for Claim verification");
		}

	}

	@Test(priority = 116, alwaysRun = true)
	public void callMeVerifyClaimByEqualQtyApproveStatus(TaskTypeManager manager) throws IOException {
		SoftAssert softAssert = new SoftAssert();
		outboundPage = new OutBoundTaskPage(driver);
		telePage = new OutboundTelecallingPage(driver);
		telePage.clickOnTransactionButton("Claim/Add");	
		telePage.clickOnVerifyClaimMenu();
		int rowsCount=telePage.getTextOfPendingClaimCountInInteger();
		System.out.println(rowsCount);
		if (rowsCount >= 1) {

			ExtentTest methodTest = test.createNode("callMeVerifyClaimByEqualQtyApproveStatus");
			logTestMethod(driver, methodTest,manager, "callMeVerifyClaimByEqualQtyApproveStatus", () -> {
				
				for (int i = rowsCount; i >=1; i--) {
					telePage.clickOnVerifyButtonOfClaimVerification(i);

					for (int j = 1; j <= telePage.getRowsCountOfSpecificClaim(); j++) {

						telePage.getTotalVerifyPointsOfClaimVerification(j);
						try {
							telePage.selectClaimVerificationStatus(j, "Ok");
						} catch (InterruptedException e) {
							//e.printStackTrace();
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
			TestCaseTracker.markAsExecuted("callMeVerifyClaimByEqualQtyApproveStatus");
			telePage.clickOnClaimVerificationCancelBtn();
		} else {
			System.out.println("Records not available for Claim verification");
		}

}
	
	    @Test(priority = 117, alwaysRun = true)
		public void callMecloseTaskSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			telePage = new OutboundTelecallingPage(driver);
			outboundPage=new OutBoundTaskPage(driver);
				ExtentTest methodTest = test.createNode("callMecloseTaskSubmitBreak");
				logTestMethod(driver, methodTest,manager, "callMecloseTaskSubmitBreak", () -> {
					String callMeTaskNo = telePage.getTelePageTaskNo();
					System.out.println("CallMe Task No For Close Task By Submit & Break Button  : " + callMeTaskNo);
					telePage.clickOnCallActionButton("Close Task");
					telePage.enterCloseTaskRemark("Close Call Me Task");
					// click on submit & break button
					telePage.clickOnCloseTasksubmitBreakButton();
					// click on "Ok" button
					telePage.clickOnCloseTaskDialogBoxOkBtn();
					telePage.waitInVisibilityOfLoader();
					String taskStatus = outboundPage.getOutboundPageTaskStatus(callMeTaskNo);
					System.out.println("Dashboard Task Status CallMe-Close Task :" + taskStatus);
					softAssert.assertEquals(taskStatus, "Closed", " Test Failed : callMecloseTaskSubmitBreak");
					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("callMecloseTaskSubmitBreak");
		}
	    	
		@Test(priority = 118, alwaysRun = true)
		public void callMeRescheduleNotInterestedSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedSubmitBreak");
				logTestMethod(driver, methodTest, manager,"callMeRescheduleNotInterestedSubmitBreak", () -> {
					callMeNotInterestedTakNo = telePage.getTelePageTaskNo();
					System.out.println("Task No-Call Me- Reschedule-Not Interested -Submit & break button : "
							+ callMeNotInterestedTakNo);
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
					// Call assertAll to aggregate the results
					softAssert.assertAll();
				});
				TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedSubmitBreak");
			}

			else {
				System.out.println("Task type is not  Call Me");
				manager.executeTask();
			}

		}

		@Test(priority = 119, alwaysRun = true)
		public void callMeRescheduleNotInterestedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedTaskStatus");
			logTestMethod(driver, methodTest,manager, "callMeRescheduleNotInterestedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
				String taskStatus = outboundPage.getOutboundPageTaskStatus(callMeNotInterestedTakNo);
				System.out.println("Dashboard Task status Call Me -Rechedule- Not Interested : "
						+ callMeNotInterestedTakNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Not Interested then task should be closed.");

				softAssert.assertAll();
			});

			TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedTaskStatus");

		}
		
		
		@Test(priority = 120, alwaysRun = true)
		public void callMeRescheduleNotInterestedSubmit(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleNotInterestedSubmit");
				logTestMethod(driver, methodTest,manager, "callMeRescheduleNotInterestedSubmit", () -> {
					String taskNoNotInterestedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Call Me -Reschedule-Not Interested-Submit button : "
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

				TestCaseTracker.markAsExecuted("callMeRescheduleNotInterestedSubmit");
			} else {
				System.out.println("Task type is not Call Me");
				manager.executeTask();
			}

		}

		@Test(priority = 121, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedSubmitBreak");
				logTestMethod(driver, methodTest, manager,"callMeRescheduleRingNotReceivedSubmitBreak", () -> {
					callMeRingNotReceivedTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No-Call Me - Reschedule-Ringing Not Received -Submit & break button : "
							+ callMeRingNotReceivedTaskNo);
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

				TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedSubmitBreak");
			}

			else {
				System.out.println("Task type is not Call Me.");
				manager.executeTask();
			}

		}
		
		
		@Test(priority = 122, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			manager = new TaskTypeManager(driver, test);
			ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedTaskStatus");
			logTestMethod(driver, methodTest,manager, "callMeRescheduleRingNotReceivedTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
		
				String taskStatus = outboundPage.getOutboundPageTaskStatus(callMeRingNotReceivedTaskNo);
				System.out.println("Dashboard Task status Call Me -Rechedule- Ringing Not Received : "
						+ callMeRingNotReceivedTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Ringing Not Received then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedTaskStatus");

		}
		
		
		@Test(priority = 123, alwaysRun = true)
		public void callMeRescheduleRingNotReceivedSubmit(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleRingNotReceivedSubmit");
				logTestMethod(driver, methodTest,manager, "callMeRescheduleRingNotReceivedSubmit", () -> {
					String taskNoRigNotReceivedSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Call Me -Reschedule-Ring Not Received -Submit button : "
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

				TestCaseTracker.markAsExecuted("callMeRescheduleRingNotReceivedSubmit");
			} else {
				System.out.println("Task type is not Call Me.");
				manager.executeTask();
			}

		}
	 		
		
		@Test(priority = 124, alwaysRun = true)
		public void callMeRescheduleCallBackLaterSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterSubmitBreak");
				logTestMethod(driver, methodTest,manager, "callMeRescheduleCallBackLaterSubmitBreak", () -> {

					callMeCallBackLaterTaskNo = telePage.getTelePageTaskNo();
					System.out.println("Task No-Call Me- Reschedule-Call Back Later -Submit & break button : "
							+ callMeCallBackLaterTaskNo);

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
				TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterSubmitBreak");
			}

			else {
				System.out.println("Task type is not Call Me");
				manager.executeTask();
			}

		}
		
		@Test(priority = 125, alwaysRun = true)
		public void callMeRescheduleCallBackLaterTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			manager = new TaskTypeManager(driver, test);

			ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterTaskStatus");
			logTestMethod(driver, methodTest,manager, "callMeRescheduleCallBackLaterTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
				
				String taskStatus = outboundPage.getOutboundPageTaskStatus(callMeCallBackLaterTaskNo);

				System.out.println("Dashboard Task status Call Me -Rechedule- Call Back Later : "
						+ callMeCallBackLaterTaskNo + " - " + taskStatus);
				softAssert.assertEquals(taskStatus, "Pending",
						" If Select Reschedule status Call Back Later then task should be Pending.");

				softAssert.assertAll();
			});
			TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterTaskStatus");

		}
		
		
		@Test(priority = 126, alwaysRun = true)
		public void callMeRescheduleCallBackLaterSubmit(TaskTypeManager manager) throws InterruptedException, IOException {

			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleCallBackLaterSubmit");
				logTestMethod(driver, methodTest,manager, "callMeRescheduleCallBackLaterSubmit", () -> {
					
					String taskNoCallBackLaterSubmit = telePage.getTelePageTaskNo();
					System.out.println("Task no. of Call Me -Reschedule  -Call Back Later -Submit button : "
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
				TestCaseTracker.markAsExecuted("callMeRescheduleCallBackLaterSubmit");
			}

			else {
				System.out.println("Task type is not Call Me.");
				manager.executeTask();
			}

		}
		
		
		
		@Test(priority = 127, alwaysRun = true)
		public void callMeRescheduleWrongNoSubmitBreak(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoSubmitBreak");
				logTestMethod(driver, methodTest,manager,"callMeRescheduleWrongNoSubmitBreak", () -> {
					callMeWrongTaskNo = telePage.getTelePageTaskNo();
					System.out.println(
							"Task No-Call Me - Reschedule- Wrong no-Submit & break button : " + callMeWrongTaskNo);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number\"");
					telePage.clickOnRescheduleCallSubmitBreakButton();
					telePage.clickOnRescheduleSuccessDialogOkBtn();
					telePage.waitInVisibilityOfLoader();

					softAssert.assertTrue(outboundPage.verifyOutboundTaskPageDisplay(),
							"If We Reshedule call by submit & break button then call should be paused.");

					softAssert.assertAll();
				});

				TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoSubmitBreak");
			}

			else {
				System.out.println("Task type is not Call Me.");
				manager.executeTask();
			}

		}
		
		@Test(priority = 128, alwaysRun = true)
		public void callMeRescheduleWrongNoTaskStatus(TaskTypeManager manager) throws InterruptedException, IOException {
			manager = new TaskTypeManager(driver, test);
			ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoTaskStatus");
			logTestMethod(driver, methodTest,manager, "callMeRescheduleWrongNoTaskStatus", () -> {
				SoftAssert softAssert = new SoftAssert();
				outboundPage = new OutBoundTaskPage(driver);
				telePage = new OutboundTelecallingPage(driver);
				String taskStatus = outboundPage.getOutboundPageTaskStatus(callMeWrongTaskNo);

				System.out.println(
						"Dashboard Task status Call Me -Rechedule-Wrong No : " + callMeWrongTaskNo + "- " + taskStatus);
				softAssert.assertEquals(taskStatus, "Closed",
						" If Select Reschedule status Wrong then task should be closed.");

				softAssert.assertAll();

			});

			TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoTaskStatus");

		}
		
		
		@Test(priority = 129, alwaysRun = true)
		public void callMeRescheduleWrongNoSubmit(TaskTypeManager manager) throws InterruptedException, IOException {
			SoftAssert softAssert = new SoftAssert();
			outboundPage = new OutBoundTaskPage(driver);
			telePage = new OutboundTelecallingPage(driver);
			String taskType = telePage.getTaskTypeFromApplication();
			if (taskType.equals("Call Me - Customer Request for TC to Call.")) {
				ExtentTest methodTest = test.createNode("callMeRescheduleWrongNoSubmit");
				logTestMethod(driver, methodTest, manager,"callMeRescheduleWrongNoSubmit", () -> {
					String taskNoWrongNoSubmit = telePage.getTelePageTaskNo();
					System.out
							.println("Task no. of Call Me -Reschedule-Wrong no-Submit button : " + taskNoWrongNoSubmit);

					telePage.clickOnCallActionButton("Reschedule Call");
					try {
						telePage.selectRescheduleStatus("Wrong Number");
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
					telePage.enterRescheduleRemark("Remark : Wrong Number\"");
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

				// TestCaseTracker.markAsExecuted("callMeRescheduleWrongNoSubmit");
			} else {
				System.out.println("Task type is not Call Me.");
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
