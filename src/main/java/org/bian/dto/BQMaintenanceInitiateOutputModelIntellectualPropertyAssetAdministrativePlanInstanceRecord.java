package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord
 */
public class BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecord   {
  private BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord = null;


  /**
   * Get intellectualPropertyAssetRecord
   * @return intellectualPropertyAssetRecord
  **/

  public BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord getIntellectualPropertyAssetRecord() {
    return intellectualPropertyAssetRecord;
  }

  public void setIntellectualPropertyAssetRecord(BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord intellectualPropertyAssetRecord) {
    this.intellectualPropertyAssetRecord = intellectualPropertyAssetRecord;
  }


}

