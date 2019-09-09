package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord;
import org.bian.dto.BQMaintenanceUpdateInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceUpdateOutputModel
 */
public class BQMaintenanceUpdateOutputModel   {
  private BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private BQMaintenanceUpdateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;

  private String maintenanceUpdateActionTaskReference = null;

  private Object maintenanceUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return maintenanceUpdateActionTaskReference
  **/

  public String getMaintenanceUpdateActionTaskReference() {
    return maintenanceUpdateActionTaskReference;
  }

  public void setMaintenanceUpdateActionTaskReference(String maintenanceUpdateActionTaskReference) {
    this.maintenanceUpdateActionTaskReference = maintenanceUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

