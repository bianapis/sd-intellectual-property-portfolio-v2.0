package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord;
import org.bian.dto.BQMaintenanceUpdateInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceUpdateInputModel
 */
public class BQMaintenanceUpdateInputModel   {
  private BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private String maintenanceInstanceReference = null;

  private BQMaintenanceUpdateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private Object maintenanceUpdateActionTaskRecord = null;

  private String maintenanceUpdateActionRequest = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Intellectual Property Asset Administrative Plan instance 
   * @return intellectualPropertyAssetAdministrativePlanInstanceReference
  **/

  public String getIntellectualPropertyAssetAdministrativePlanInstanceReference() {
    return intellectualPropertyAssetAdministrativePlanInstanceReference;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceReference(String intellectualPropertyAssetAdministrativePlanInstanceReference) {
    this.intellectualPropertyAssetAdministrativePlanInstanceReference = intellectualPropertyAssetAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance instance 
   * @return maintenanceInstanceReference
  **/

  public String getMaintenanceInstanceReference() {
    return maintenanceInstanceReference;
  }

  public void setMaintenanceInstanceReference(String maintenanceInstanceReference) {
    this.maintenanceInstanceReference = maintenanceInstanceReference;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceUpdateInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceUpdateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceUpdateActionTaskRecord
  **/

  public Object getMaintenanceUpdateActionTaskRecord() {
    return maintenanceUpdateActionTaskRecord;
  }

  public void setMaintenanceUpdateActionTaskRecord(Object maintenanceUpdateActionTaskRecord) {
    this.maintenanceUpdateActionTaskRecord = maintenanceUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return maintenanceUpdateActionRequest
  **/

  public String getMaintenanceUpdateActionRequest() {
    return maintenanceUpdateActionRequest;
  }

  public void setMaintenanceUpdateActionRequest(String maintenanceUpdateActionRequest) {
    this.maintenanceUpdateActionRequest = maintenanceUpdateActionRequest;
  }


}

