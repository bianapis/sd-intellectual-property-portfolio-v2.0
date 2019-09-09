package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord   {
  private String intellectualPropertyAssetReference = null;

  private CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord = null;


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

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord getIntellectualPropertyAssetRecord() {
    return intellectualPropertyAssetRecord;
  }

  public void setIntellectualPropertyAssetRecord(CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord) {
    this.intellectualPropertyAssetRecord = intellectualPropertyAssetRecord;
  }


}

