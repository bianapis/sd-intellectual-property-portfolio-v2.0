package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis   {
  private String intellectualPropertyAssetAdministrativePlanInstanceAnalysisData = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceAnalysisReportType = null;

  private Object intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysisData
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceAnalysisData() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysisData;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysisData(String intellectualPropertyAssetAdministrativePlanInstanceAnalysisData) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysisData = intellectualPropertyAssetAdministrativePlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport
  **/

  public Object getIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReport() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysisReport(Object intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport = intellectualPropertyAssetAdministrativePlanInstanceAnalysisReport;
  }


}

