package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateOutputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord
 */
public class BQMaintenanceInitiateOutputModelMaintenanceInstanceRecord   {
  private String intellectualPropertyAssetMaintenanceSchedule = null;

  private String intellectualPropertyAssetProtectionReference = null;

  private String intellectualPropertyAssetRegistrationReference = null;

  private BQMaintenanceInitiateOutputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord intellectualPropertyAssetMaintenanceTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule for maintenance tasks performed and to be performed (e.g. patent renewals) 
   * @return intellectualPropertyAssetMaintenanceSchedule
  **/

  public String getIntellectualPropertyAssetMaintenanceSchedule() {
    return intellectualPropertyAssetMaintenanceSchedule;
  }

  public void setIntellectualPropertyAssetMaintenanceSchedule(String intellectualPropertyAssetMaintenanceSchedule) {
    this.intellectualPropertyAssetMaintenanceSchedule = intellectualPropertyAssetMaintenanceSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the intellectual property protection mechanism employed (e.g. copyright, trademark or patent reference number) 
   * @return intellectualPropertyAssetProtectionReference
  **/

  public String getIntellectualPropertyAssetProtectionReference() {
    return intellectualPropertyAssetProtectionReference;
  }

  public void setIntellectualPropertyAssetProtectionReference(String intellectualPropertyAssetProtectionReference) {
    this.intellectualPropertyAssetProtectionReference = intellectualPropertyAssetProtectionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the registration entity for the intellectual property protection mechanism (e.g. U.S. Patent Office) 
   * @return intellectualPropertyAssetRegistrationReference
  **/

  public String getIntellectualPropertyAssetRegistrationReference() {
    return intellectualPropertyAssetRegistrationReference;
  }

  public void setIntellectualPropertyAssetRegistrationReference(String intellectualPropertyAssetRegistrationReference) {
    this.intellectualPropertyAssetRegistrationReference = intellectualPropertyAssetRegistrationReference;
  }


  /**
   * Get intellectualPropertyAssetMaintenanceTaskRecord
   * @return intellectualPropertyAssetMaintenanceTaskRecord
  **/

  public BQMaintenanceInitiateOutputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord getIntellectualPropertyAssetMaintenanceTaskRecord() {
    return intellectualPropertyAssetMaintenanceTaskRecord;
  }

  public void setIntellectualPropertyAssetMaintenanceTaskRecord(BQMaintenanceInitiateOutputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord intellectualPropertyAssetMaintenanceTaskRecord) {
    this.intellectualPropertyAssetMaintenanceTaskRecord = intellectualPropertyAssetMaintenanceTaskRecord;
  }


}

