package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord
 */
public class BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord   {
  private String intellectualPropertyAssetReference = null;

  private BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the intellectual property asset item 
   * @return intellectualPropertyAssetReference
  **/

  public String getIntellectualPropertyAssetReference() {
    return intellectualPropertyAssetReference;
  }

  public void setIntellectualPropertyAssetReference(String intellectualPropertyAssetReference) {
    this.intellectualPropertyAssetReference = intellectualPropertyAssetReference;
  }


  /**
   * Get intellectualPropertyAssetRecord
   * @return intellectualPropertyAssetRecord
  **/

  public BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord getIntellectualPropertyAssetRecord() {
    return intellectualPropertyAssetRecord;
  }

  public void setIntellectualPropertyAssetRecord(BQAssignmentInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord) {
    this.intellectualPropertyAssetRecord = intellectualPropertyAssetRecord;
  }


}

