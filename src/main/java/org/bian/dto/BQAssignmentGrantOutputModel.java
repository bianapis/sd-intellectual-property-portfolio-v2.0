package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAssignmentGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * BQAssignmentGrantOutputModel
 */
public class BQAssignmentGrantOutputModel   {
  private String assignmentGrantActionTaskReference = null;

  private Object assignmentGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private BQAssignmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Assignment instance grant service call 
   * @return assignmentGrantActionTaskReference
  **/

  public String getAssignmentGrantActionTaskReference() {
    return assignmentGrantActionTaskReference;
  }

  public void setAssignmentGrantActionTaskReference(String assignmentGrantActionTaskReference) {
    this.assignmentGrantActionTaskReference = assignmentGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return assignmentGrantActionTaskRecord
  **/

  public Object getAssignmentGrantActionTaskRecord() {
    return assignmentGrantActionTaskRecord;
  }

  public void setAssignmentGrantActionTaskRecord(Object assignmentGrantActionTaskRecord) {
    this.assignmentGrantActionTaskRecord = assignmentGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public BQAssignmentGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(BQAssignmentGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

