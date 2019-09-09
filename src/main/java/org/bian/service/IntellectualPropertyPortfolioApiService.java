/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface IntellectualPropertyPortfolioApiService {

	SDIntellectualPropertyPortfolioActivateOutputModel activate(SDIntellectualPropertyPortfolioActivateInputModel request);
	
	SDIntellectualPropertyPortfolioConfigureOutputModel configure(String sdReferenceId, SDIntellectualPropertyPortfolioConfigureInputModel request);
	
	BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request);
	
	BQMaintenanceExchangeOutputModel exchangeMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceExchangeInputModel request);
	
	SDIntellectualPropertyPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDIntellectualPropertyPortfolioFeedbackInputModel request);
	
	BQAssignmentGrantOutputModel grantAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentGrantInputModel request);
	
	CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRIntellectualPropertyAssetAdministrativePlanInitiateInputModel request);
	
	BQAssignmentInitiateOutputModel initiateAssignment(String sdReferenceId, String crReferenceId, BQAssignmentInitiateInputModel request);
	
	BQMaintenanceInitiateOutputModel initiateMaintenance(String sdReferenceId, String crReferenceId, BQMaintenanceInitiateInputModel request);
	
	BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request);
	
	BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request);
	
	BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDIntellectualPropertyPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIntellectualPropertyAssetAdministrativePlanUpdateInputModel request);
	
	BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request);
	
	BQMaintenanceUpdateOutputModel updateMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceUpdateInputModel request);
	
}
