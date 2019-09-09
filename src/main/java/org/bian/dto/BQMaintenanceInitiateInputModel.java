package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord;
import org.bian.dto.BQMaintenanceInitiateInputModelMaintenanceInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateInputModel
 */
public class BQMaintenanceInitiateInputModel   {
  private BQMaintenanceInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord = null;

  private String intellectualPropertyAssetAdministrativePlanInstanceReference = null;

  private Object maintenanceInitiateActionRecord = null;

  private BQMaintenanceInitiateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord = null;


  /**
   * Get intellectualPropertyAssetAdministrativePlanInstanceRecord
   * @return intellectualPropertyAssetAdministrativePlanInstanceRecord
  **/

  public BQMaintenanceInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord getIntellectualPropertyAssetAdministrativePlanInstanceRecord() {
    return intellectualPropertyAssetAdministrativePlanInstanceRecord;
  }

  public void setIntellectualPropertyAssetAdministrativePlanInstanceRecord(BQMaintenanceInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord intellectualPropertyAssetAdministrativePlanInstanceRecord) {
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
   * Get maintenanceInstanceRecord
   * @return maintenanceInstanceRecord
  **/

  public BQMaintenanceInitiateInputModelMaintenanceInstanceRecord getMaintenanceInstanceRecord() {
    return maintenanceInstanceRecord;
  }

  public void setMaintenanceInstanceRecord(BQMaintenanceInitiateInputModelMaintenanceInstanceRecord maintenanceInstanceRecord) {
    this.maintenanceInstanceRecord = maintenanceInstanceRecord;
  }


}

