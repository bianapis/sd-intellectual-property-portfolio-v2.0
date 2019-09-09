package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord
 */
public class CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord   {
  private String intellectualPropertyAssetType = null;

  private String intellectualPropertyAssetDescription = null;

  private String intellectualPropertyAssetTitle = null;

  private String intellectualPropertyAssetJurisdiction = null;

  private String intellectualPropertyAssetCreator = null;

  private String intellectualPropertyAssetValuation = null;

  private String documentDirectoryEntryInstanceReference = null;

  private CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of asset (i.e. trade secrets, trademarks, copyrights, and patents.) 
   * @return intellectualPropertyAssetType
  **/

  public String getIntellectualPropertyAssetType() {
    return intellectualPropertyAssetType;
  }

  public void setIntellectualPropertyAssetType(String intellectualPropertyAssetType) {
    this.intellectualPropertyAssetType = intellectualPropertyAssetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of significant details and properties of the intellectual property asset 
   * @return intellectualPropertyAssetDescription
  **/

  public String getIntellectualPropertyAssetDescription() {
    return intellectualPropertyAssetDescription;
  }

  public void setIntellectualPropertyAssetDescription(String intellectualPropertyAssetDescription) {
    this.intellectualPropertyAssetDescription = intellectualPropertyAssetDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of title ownership, including assigned usage rights 
   * @return intellectualPropertyAssetTitle
  **/

  public String getIntellectualPropertyAssetTitle() {
    return intellectualPropertyAssetTitle;
  }

  public void setIntellectualPropertyAssetTitle(String intellectualPropertyAssetTitle) {
    this.intellectualPropertyAssetTitle = intellectualPropertyAssetTitle;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of scope of coverage of the intellectual property asset (e.g. geographic coverage, allowed usage type coverage) 
   * @return intellectualPropertyAssetJurisdiction
  **/

  public String getIntellectualPropertyAssetJurisdiction() {
    return intellectualPropertyAssetJurisdiction;
  }

  public void setIntellectualPropertyAssetJurisdiction(String intellectualPropertyAssetJurisdiction) {
    this.intellectualPropertyAssetJurisdiction = intellectualPropertyAssetJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the original source of the intellectual property 
   * @return intellectualPropertyAssetCreator
  **/

  public String getIntellectualPropertyAssetCreator() {
    return intellectualPropertyAssetCreator;
  }

  public void setIntellectualPropertyAssetCreator(String intellectualPropertyAssetCreator) {
    this.intellectualPropertyAssetCreator = intellectualPropertyAssetCreator;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An indication or description of the commercial value of the intellectual property asset. This can combine a 'replacement' valuation and an licensing/assignment income assessment. The value can be an estimate and include actual realized income 
   * @return intellectualPropertyAssetValuation
  **/

  public String getIntellectualPropertyAssetValuation() {
    return intellectualPropertyAssetValuation;
  }

  public void setIntellectualPropertyAssetValuation(String intellectualPropertyAssetValuation) {
    this.intellectualPropertyAssetValuation = intellectualPropertyAssetValuation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated specification documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType dateType) {
    this.dateType = dateType;
  }


}

