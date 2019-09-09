/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class IntellectualPropertyPortfolioApiController {

	@Autowired
	IntellectualPropertyPortfolioApiService service;
	
	@Administer.Activate
	public BianResponse<SDIntellectualPropertyPortfolioActivateOutputModel> activate(@RequestBody BianRequest<SDIntellectualPropertyPortfolioActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDIntellectualPropertyPortfolioConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIntellectualPropertyPortfolioConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Exchange
	public BianResponse<BQAssignmentExchangeOutputModel> exchangeAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Exchange
	public BianResponse<BQMaintenanceExchangeOutputModel> exchangeMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDIntellectualPropertyPortfolioFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDIntellectualPropertyPortfolioFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Grant
	public BianResponse<BQAssignmentGrantOutputModel> grantAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRIntellectualPropertyAssetAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Initiate
	public BianResponse<BQAssignmentInitiateOutputModel> initiateAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQAssignmentInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateAssignment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Initiate
	public BianResponse<BQMaintenanceInitiateOutputModel> initiateMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQMaintenanceInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateMaintenance(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Request
	public BianResponse<BQAssignmentRequestOutputModel> requestAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Request
	public BianResponse<BQMaintenanceRequestOutputModel> requestMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Retrieve
	public BianResponse<BQAssignmentRetrieveOutputModel> retrieveAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("maintenance")
	@Administer.Retrieve
	public BianResponse<BQMaintenanceRetrieveOutputModel> retrieveMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMaintenance(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDIntellectualPropertyPortfolioRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRIntellectualPropertyAssetAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("assignment")
	@Administer.Update
	public BianResponse<BQAssignmentUpdateOutputModel> updateAssignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateAssignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("maintenance")
	@Administer.Update
	public BianResponse<BQMaintenanceUpdateOutputModel> updateMaintenance(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMaintenanceUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMaintenance(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
