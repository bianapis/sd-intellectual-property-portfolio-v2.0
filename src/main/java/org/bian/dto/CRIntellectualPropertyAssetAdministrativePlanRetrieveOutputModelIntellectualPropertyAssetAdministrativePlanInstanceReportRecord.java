package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord   {
  private String intellectualPropertyAssetAdministrativePlanInstanceReportData = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReportType = null;

  private Object intellectualPropertyAssetAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportData
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReportData() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportData;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportData(String intellectualPropertyAssetAdministrativePlanInstanceReportData) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportData = intellectualPropertyAssetAdministrativePlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReport
  **/

  public Object getIntellectualPropertyAssetAdministrativePlanInstanceReport() {
    return intellectualPropertyAssetAdministrativePlanInstanceReport;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReport(Object intellectualPropertyAssetAdministrativePlanInstanceReport) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReport = intellectualPropertyAssetAdministrativePlanInstanceReport;
  }


}

