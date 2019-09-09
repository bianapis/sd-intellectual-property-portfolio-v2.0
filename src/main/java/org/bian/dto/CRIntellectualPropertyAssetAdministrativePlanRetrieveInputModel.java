package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModel   {
  private Object intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord = null;

  private String intellectualPropertyAssetAdministrativePlanRetrieveActionRequest = null;

  private CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord intellectualPropertyAssetAdministrativePlanInstanceReportRecord = null;

  private CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis intellectualPropertyAssetAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getIntellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord() {
    return intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord(Object intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord) {
    this.intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord = intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return intellectualPropertyAssetAdministrativePlanRetrieveActionRequest
  **/

  public String getIntellectualPropertyAssetAdministrativePlanRetrieveActionRequest() {
    return intellectualPropertyAssetAdministrativePlanRetrieveActionRequest;
  }

  public void setIntellectualPropertyAssetAdministrativePlanRetrieveActionRequest(String intellectualPropertyAssetAdministrativePlanRetrieveActionRequest) {
    this.intellectualPropertyAssetAdministrativePlanRetrieveActionRequest = intellectualPropertyAssetAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceReportRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportRecord
  **/

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord getIntellectualPropertyAssetAdministrativePlanInstanceReportRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportRecord(CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord intellectualPropertyAssetAdministrativePlanInstanceReportRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportRecord = intellectualPropertyAssetAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceAnalysis
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysis
  **/

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis getIntellectualPropertyAssetAdministrativePlanInstanceAnalysis() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysis;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysis(CRIntellectualPropertyAssetAdministrativePlanRetrieveInputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis intellectualPropertyAssetAdministrativePlanInstanceAnalysis) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysis = intellectualPropertyAssetAdministrativePlanInstanceAnalysis;
  }


}

