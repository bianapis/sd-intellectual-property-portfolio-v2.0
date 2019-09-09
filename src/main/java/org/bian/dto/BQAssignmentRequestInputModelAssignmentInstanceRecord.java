package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentRequestInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentRequestInputModelAssignmentInstanceRecord
 */
public class BQAssignmentRequestInputModelAssignmentInstanceRecord   {
  private String intellectualPropertyAssetAssignmentSchedule = null;

  private BQAssignmentRequestInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord intellectualPropertyAssetAssignmentRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule capturing assignments for use/deployment of the intellectual property asset. This can include internal use and external licensed agreements 
   * @return intellectualPropertyAssetAssignmentSchedule
  **/

  public String getIntellectualPropertyAssetAssignmentSchedule() {
    return intellectualPropertyAssetAssignmentSchedule;
  }

  public void setIntellectualPropertyAssetAssignmentSchedule(String intellectualPropertyAssetAssignmentSchedule) {
    this.intellectualPropertyAssetAssignmentSchedule = intellectualPropertyAssetAssignmentSchedule;
  }


  /**
   * Get intellectualPropertyAssetAssignmentRecord
   * @return intellectualPropertyAssetAssignmentRecord
  **/

  public BQAssignmentRequestInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord getIntellectualPropertyAssetAssignmentRecord() {
    return intellectualPropertyAssetAssignmentRecord;
  }

  public void setIntellectualPropertyAssetAssignmentRecord(BQAssignmentRequestInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord intellectualPropertyAssetAssignmentRecord) {
    this.intellectualPropertyAssetAssignmentRecord = intellectualPropertyAssetAssignmentRecord;
  }


}

