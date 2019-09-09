package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAssignmentUpdateInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord
 */
public class BQAssignmentUpdateInputModelAssignmentInstanceRecordIntellectualPropertyAssetAssignmentRecord   {
  private String intellectualPropertyAssetAssignmentType = null;

  private String intellectualPropertyAssetAssignmentDescription = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String intellectualPropertyAssetAssignmentTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of assignment (e.g. internal, external license) 
   * @return intellectualPropertyAssetAssignmentType
  **/

  public String getIntellectualPropertyAssetAssignmentType() {
    return intellectualPropertyAssetAssignmentType;
  }

  public void setIntellectualPropertyAssetAssignmentType(String intellectualPropertyAssetAssignmentType) {
    this.intellectualPropertyAssetAssignmentType = intellectualPropertyAssetAssignmentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the assignment (e.g. allowed use, terms) 
   * @return intellectualPropertyAssetAssignmentDescription
  **/

  public String getIntellectualPropertyAssetAssignmentDescription() {
    return intellectualPropertyAssetAssignmentDescription;
  }

  public void setIntellectualPropertyAssetAssignmentDescription(String intellectualPropertyAssetAssignmentDescription) {
    this.intellectualPropertyAssetAssignmentDescription = intellectualPropertyAssetAssignmentDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated documents 
   * @return documentDirectoryEntryInstanceReference
  **/

  public String getDocumentDirectoryEntryInstanceReference() {
    return documentDirectoryEntryInstanceReference;
  }

  public void setDocumentDirectoryEntryInstanceReference(String documentDirectoryEntryInstanceReference) {
    this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of any charges levied and payments received made from licensing 
   * @return intellectualPropertyAssetAssignmentTransaction
  **/

  public String getIntellectualPropertyAssetAssignmentTransaction() {
    return intellectualPropertyAssetAssignmentTransaction;
  }

  public void setIntellectualPropertyAssetAssignmentTransaction(String intellectualPropertyAssetAssignmentTransaction) {
    this.intellectualPropertyAssetAssignmentTransaction = intellectualPropertyAssetAssignmentTransaction;
  }


}

