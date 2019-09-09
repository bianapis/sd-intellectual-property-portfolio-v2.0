package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQAssignmentExchangeInputModel
 */
public class BQAssignmentExchangeInputModel   {
  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private String assignmentInstanceReference = null;

  private Object assignmentExchangeActionTaskRecord = null;

  private BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest assignmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Intellectual Property Asset Administrative Plan instance 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReference() {
    return intellectualPropertyAssetAdministrativePlanInstanceReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReference(String intellectualPropertyAssetAdministrativePlanInstanceReference) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReference = intellectualPropertyAssetAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Assignment instance 
   * @return assignmentInstanceReference
  **/

  public String getAssignmentInstanceReference() {
    return assignmentInstanceReference;
  }

  public void setAssignmentInstanceReference(String assignmentInstanceReference) {
    this.assignmentInstanceReference = assignmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return assignmentExchangeActionTaskRecord
  **/

  public Object getAssignmentExchangeActionTaskRecord() {
    return assignmentExchangeActionTaskRecord;
  }

  public void setAssignmentExchangeActionTaskRecord(Object assignmentExchangeActionTaskRecord) {
    this.assignmentExchangeActionTaskRecord = assignmentExchangeActionTaskRecord;
  }


  /**
   * Get assignmentExchangeActionRequest
   * @return assignmentExchangeActionRequest
  **/

  public BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest getAssignmentExchangeActionRequest() {
    return assignmentExchangeActionRequest;
  }

  public void setAssignmentExchangeActionRequest(BQMaintenanceExchangeInputModelMaintenanceExchangeActionRequest assignmentExchangeActionRequest) {
    this.assignmentExchangeActionRequest = assignmentExchangeActionRequest;
  }


}

