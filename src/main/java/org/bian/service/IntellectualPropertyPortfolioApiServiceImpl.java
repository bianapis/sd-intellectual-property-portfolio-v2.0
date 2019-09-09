/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class IntellectualPropertyPortfolioApiServiceImpl implements IntellectualPropertyPortfolioApiService {

	public SDIntellectualPropertyPortfolioActivateOutputModel activate(SDIntellectualPropertyPortfolioActivateInputModel request){
		return JsonReader.read("activate-SDIntellectualPropertyPortfolioActivateOutputModel.json",new TypeReference<SDIntellectualPropertyPortfolioActivateOutputModel>(){});
	}
	
	public SDIntellectualPropertyPortfolioConfigureOutputModel configure(String sdReferenceId, SDIntellectualPropertyPortfolioConfigureInputModel request){
		return JsonReader.read("configure-SDIntellectualPropertyPortfolioConfigureOutputModel.json",new TypeReference<SDIntellectualPropertyPortfolioConfigureOutputModel>(){});
	}
	
	public BQAssignmentExchangeOutputModel exchangeAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentExchangeInputModel request){
		return JsonReader.read("exchange-BQAssignmentExchangeOutputModel.json",new TypeReference<BQAssignmentExchangeOutputModel>(){});
	}
	
	public BQMaintenanceExchangeOutputModel exchangeMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceExchangeInputModel request){
		return JsonReader.read("exchange-BQMaintenanceExchangeOutputModel.json",new TypeReference<BQMaintenanceExchangeOutputModel>(){});
	}
	
	public SDIntellectualPropertyPortfolioFeedbackOutputModel feedback(String sdReferenceId, SDIntellectualPropertyPortfolioFeedbackInputModel request){
		return JsonReader.read("feedback-SDIntellectualPropertyPortfolioFeedbackOutputModel.json",new TypeReference<SDIntellectualPropertyPortfolioFeedbackOutputModel>(){});
	}
	
	public BQAssignmentGrantOutputModel grantAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentGrantInputModel request){
		return JsonReader.read("grant-BQAssignmentGrantOutputModel.json",new TypeReference<BQAssignmentGrantOutputModel>(){});
	}
	
	public CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel initiate(String sdReferenceId, CRIntellectualPropertyAssetAdministrativePlanInitiateInputModel request){
		return JsonReader.read("initiate-CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel.json",new TypeReference<CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel>(){});
	}
	
	public BQAssignmentInitiateOutputModel initiateAssignment(String sdReferenceId, String crReferenceId, BQAssignmentInitiateInputModel request){
		return JsonReader.read("initiate-BQAssignmentInitiateOutputModel.json",new TypeReference<BQAssignmentInitiateOutputModel>(){});
	}
	
	public BQMaintenanceInitiateOutputModel initiateMaintenance(String sdReferenceId, String crReferenceId, BQMaintenanceInitiateInputModel request){
		return JsonReader.read("initiate-BQMaintenanceInitiateOutputModel.json",new TypeReference<BQMaintenanceInitiateOutputModel>(){});
	}
	
	public BQAssignmentRequestOutputModel requestAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentRequestInputModel request){
		return JsonReader.read("request-BQAssignmentRequestOutputModel.json",new TypeReference<BQAssignmentRequestOutputModel>(){});
	}
	
	public BQMaintenanceRequestOutputModel requestMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceRequestOutputModel.json",new TypeReference<BQMaintenanceRequestOutputModel>(){});
	}
	
	public BQAssignmentRetrieveOutputModel retrieveAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAssignmentRetrieveOutputModel.json",new TypeReference<BQAssignmentRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceRetrieveOutputModel retrieveMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceRetrieveOutputModel.json",new TypeReference<BQMaintenanceRetrieveOutputModel>(){});
	}
	
	public CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel.json",new TypeReference<CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDIntellectualPropertyPortfolioRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDIntellectualPropertyPortfolioRetrieveOutputModel.json",new TypeReference<SDIntellectualPropertyPortfolioRetrieveOutputModel>(){});
	}
	
	public CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRIntellectualPropertyAssetAdministrativePlanUpdateInputModel request){
		return JsonReader.read("update-CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel.json",new TypeReference<CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel>(){});
	}
	
	public BQAssignmentUpdateOutputModel updateAssignment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAssignmentUpdateInputModel request){
		return JsonReader.read("update-BQAssignmentUpdateOutputModel.json",new TypeReference<BQAssignmentUpdateOutputModel>(){});
	}
	
	public BQMaintenanceUpdateOutputModel updateMaintenance(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceUpdateInputModel request){
		return JsonReader.read("update-BQMaintenanceUpdateOutputModel.json",new TypeReference<BQMaintenanceUpdateOutputModel>(){});
	}
	
}
