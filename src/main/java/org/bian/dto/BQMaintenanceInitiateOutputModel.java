package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateOutputModel
 */
public class BQMaintenanceInitiateOutputModel   {
  private BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String maintenanceInstanceReference = null;

  private String maintenanceInitiateActionReference = null;

  private Object maintenanceInitiateActionRecord = null;

  private String maintenanceInstanceStatus = null;

  private BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
    this.intellectualPropertyAssetAdministrativePlanInstanceRecord = intellectualPropertyAssetAdministrativePlanInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return maintenanceInitiateActionReference
  **/

  public String getMaintenanceInitiateActionReference() {
    return maintenanceInitiateActionReference;
  }

  public void setMaintenanceInitiateActionReference(String maintenanceInitiateActionReference) {
    this.maintenanceInitiateActionReference = maintenanceInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return maintenanceInitiateActionRecord
  **/

  public Object getMaintenanceInitiateActionRecord() {
    return maintenanceInitiateActionRecord;
  }

  public void setMaintenanceInitiateActionRecord(Object maintenanceInitiateActionRecord) {
    this.maintenanceInitiateActionRecord = maintenanceInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Maintenance instance (e.g. initialised, pending, active) 
   * @return maintenanceInstanceStatus
  **/

  public String getMaintenanceInstanceStatus() {
    return maintenanceInstanceStatus;
  }

  public void setMaintenanceInstanceStatus(String maintenanceInstanceStatus) {
    this.maintenanceInstanceStatus = maintenanceInstanceStatus;
  }


  /**
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


}

