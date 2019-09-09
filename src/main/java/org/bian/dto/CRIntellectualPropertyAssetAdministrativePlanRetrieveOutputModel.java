package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel
 */
public class CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModel   {
  private CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference = null;

  private Object intellectualPropertyAssetAdministrativePlanRetrieveActionTaskRecord = null;

  private String intellectualPropertyAssetAdministrativePlanRetrieveActionResponse = null;

  private CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord intellectualPropertyAssetAdministrativePlanInstanceReportRecord = null;

  private CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis intellectualPropertyAssetAdministrativePlanInstanceAnalysis = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Intellectual Property Asset Administrative Plan instance retrieve service call 
   * @return intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference() {
    return intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference(String intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference) {
    this.intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference = intellectualPropertyAssetAdministrativePlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return intellectualPropertyAssetAdministrativePlanRetrieveActionResponse
  **/

  public String getIntellectualPropertyAssetAdministrativePlanRetrieveActionResponse() {
    return intellectualPropertyAssetAdministrativePlanRetrieveActionResponse;
  }

  public void setIntellectualPropertyAssetAdministrativePlanRetrieveActionResponse(String intellectualPropertyAssetAdministrativePlanRetrieveActionResponse) {
    this.intellectualPropertyAssetAdministrativePlanRetrieveActionResponse = intellectualPropertyAssetAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceReportRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceReportRecord
  **/

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord getIntellectualPropertyAssetAdministrativePlanInstanceReportRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceReportRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReportRecord(CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceReportRecord intellectualPropertyAssetAdministrativePlanInstanceReportRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReportRecord = intellectualPropertyAssetAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceAnalysis
   * @return intellectualPropertyAssetAdministrativePlanInstanceAnalysis
  **/

  public CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis getIntellectualPropertyAssetAdministrativePlanInstanceAnalysis() {
    return intellectualPropertyAssetAdministrativePlanInstanceAnalysis;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceAnalysis(CRIntellectualPropertyAssetAdministrativePlanRetrieveOutputModelIntellectualPropertyAssetAdministrativePlanInstanceAnalysis intellectualPropertyAssetAdministrativePlanInstanceAnalysis) {
    this.intellectualPropertyAssetAdministrativePlanInstanceAnalysis = intellectualPropertyAssetAdministrativePlanInstanceAnalysis;
  }


}

