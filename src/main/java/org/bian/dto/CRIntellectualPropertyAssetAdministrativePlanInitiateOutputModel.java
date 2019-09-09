package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModel   {
  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private String intellectualPropertyAssetAdministrativePlanInitiateActionReference = null;

  private Object intellectualPropertyAssetAdministrativePlanInitiateActionRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceStatus = null;

  private CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Intellectual Property Asset Administrative Plan instance 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReference() {
    return intellectualPropertyAssetAdministrativePlanInstanceReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReference(String intellectualPropertyAssetAdministrativePlanInstanceReference) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReference = intellectualPropertyAssetAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return intellectualPropertyAssetAdministrativePlanInitiateActionReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInitiateActionReference() {
    return intellectualPropertyAssetAdministrativePlanInitiateActionReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInitiateActionReference(String intellectualPropertyAssetAdministrativePlanInitiateActionReference) {
    this.intellectualPropertyAssetAdministrativePlanInitiateActionReference = intellectualPropertyAssetAdministrativePlanInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return intellectualPropertyAssetAdministrativePlanInitiateActionRecord
  **/

  public Object getIntellectualPropertyAssetAdministrativePlanInitiateActionRecord() {
    return intellectualPropertyAssetAdministrativePlanInitiateActionRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInitiateActionRecord(Object intellectualPropertyAssetAdministrativePlanInitiateActionRecord) {
    this.intellectualPropertyAssetAdministrativePlanInitiateActionRecord = intellectualPropertyAssetAdministrativePlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Intellectual Property Asset Administrative Plan instance (e.g. initialised, pending, active) 
   * @return intellectualPropertyAssetAdministrativePlanInstanceStatus
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceStatus() {
    return intellectualPropertyAssetAdministrativePlanInstanceStatus;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceStatus(String intellectualPropertyAssetAdministrativePlanInstanceStatus) {
    this.intellectualPropertyAssetAdministrativePlanInstanceStatus = intellectualPropertyAssetAdministrativePlanInstanceStatus;
  }


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(CRIntellectualPropertyAssetAdministrativePlanInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


}

