package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateInputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentInitiateInputModel
 */
public class BQAssignmentInitiateInputModel   {
  private BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private Object assignmentInitiateActionRecord = null;

  private BQAssignmentInitiateInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assignmentInitiateActionRecord
  **/

  public Object getAssignmentInitiateActionRecord() {
    return assignmentInitiateActionRecord;
  }

  public void setAssignmentInitiateActionRecord(Object assignmentInitiateActionRecord) {
    this.assignmentInitiateActionRecord = assignmentInitiateActionRecord;
  }


  /**
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentInitiateInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentInitiateInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


}

