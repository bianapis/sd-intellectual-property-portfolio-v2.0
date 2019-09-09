package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis   {
  private String intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReference() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReference(String intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference = intellectualPropertyAssetAdministrativePlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType(String intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType = intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters(String intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters = intellectualPropertyAssetAdministrativePlanInstanceAnalysisParameters;
  }


}

