package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanUpdateInputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanUpdateInputModel   {
  private String intellectualPropertyPortfolioServicingSessionReference = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private CRIntellectualPropertyAssetAdministrativePlanUpdateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private Object intellectualPropertyAssetAdministrativePlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

