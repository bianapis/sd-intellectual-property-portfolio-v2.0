package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanUpdateOutputModel   {
  private CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference = null;

  private Object intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanUpdateActionTaskReference() {
    return intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanUpdateActionTaskReference(String intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference) {
    this.intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference = intellectualPropertyAssetAdministrativePlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord
  **/

  public Object getIntellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord() {
    return intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord(Object intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord) {
    this.intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord = intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

