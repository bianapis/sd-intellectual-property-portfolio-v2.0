package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord   {
  private String intellectualPropertyAssetAdministrativePlanInstanceReportReference = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReportType = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReportReference() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportReference(String intellectualPropertyAssetAdministrativePlanInstanceReportReference) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportReference = intellectualPropertyAssetAdministrativePlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportType
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReportType() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportType;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportType(String intellectualPropertyAssetAdministrativePlanInstanceReportType) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportType = intellectualPropertyAssetAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportParameters
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReportParameters() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportParameters;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportParameters(String intellectualPropertyAssetAdministrativePlanInstanceReportParameters) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportParameters = intellectualPropertyAssetAdministrativePlanInstanceReportParameters;
  }


}

