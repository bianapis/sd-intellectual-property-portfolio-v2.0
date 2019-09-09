package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord
 */
public class BQMaintenanceInitiateOutputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecord   {
  private CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRIntellectualPropertyAssetAdministrativePlanInitiateInputModelIntellectualPropertyAssetAdministrativePlanInstanceRecordIntellectualPropertyAssetRecordDateType dateType) {
    this.dateType = dateType;
  }


}

