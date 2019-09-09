package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRequestInputModelAssignmentInstanceRecord;
import org.bian.dto.BQAssignmentRequestInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQAssignmentRequestInputModel
 */
public class BQAssignmentRequestInputModel   {
  private BQAssignmentRequestInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private String assignmentInstanceReference = null;

  private BQAssignmentRequestInputModelAssignmentInstanceRecord assignmentInstanceRecord = null;

  private Object assignmentRequestActionTaskRecord = null;

  private BQMaintenanceRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public BQAssignmentRequestInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(BQAssignmentRequestInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
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
   * Get assignmentInstanceRecord
   * @return assignmentInstanceRecord
  **/

  public BQAssignmentRequestInputModelAssignmentInstanceRecord getAssignmentInstanceRecord() {
    return assignmentInstanceRecord;
  }

  public void setAssignmentInstanceRecord(BQAssignmentRequestInputModelAssignmentInstanceRecord assignmentInstanceRecord) {
    this.assignmentInstanceRecord = assignmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return assignmentRequestActionTaskRecord
  **/

  public Object getAssignmentRequestActionTaskRecord() {
    return assignmentRequestActionTaskRecord;
  }

  public void setAssignmentRequestActionTaskRecord(Object assignmentRequestActionTaskRecord) {
    this.assignmentRequestActionTaskRecord = assignmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQMaintenanceRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQMaintenanceRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

