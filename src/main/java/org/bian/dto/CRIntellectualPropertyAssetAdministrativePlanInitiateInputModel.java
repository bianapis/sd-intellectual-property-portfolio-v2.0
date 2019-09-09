package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanInitiateInputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanInitiateInputModel   {
  private String intellectualPropertyPortfolioServicingSessionReference = null;

  private Object intellectualPropertyAssetAdministrativePlanInitiateActionRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceStatus = null;

  private CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return intellectualPropertyPortfolioServicingSessionReference
  **/

  public String getIntellectualPropertyPortfolioServicingSessionReference() {
    return intellectualPropertyPortfolioServicingSessionReference;
  }

  public void setIntellectualPropertyPortfolioServicingSessionReference(String intellectualPropertyPortfolioServicingSessionReference) {
    this.intellectualPropertyPortfolioServicingSessionReference = intellectualPropertyPortfolioServicingSessionReference;
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

  public CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


}

