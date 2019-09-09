package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceInitiateInputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord
 */
public class BQMaintenanceInitiateInputModelMaintenanceInstanceRecordIntellectualPropertyAssetMaintenanceTaskRecord   {
  private String intellectualPropertyAssetMaintenanceTaskType = null;

  private String documentDirectoryEntryInstanceReference = null;

  private String intellectualPropertyAssetMaintenanceTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of maintenance task (e.g. annual renewal) 
   * @return intellectualPropertyAssetMaintenanceTaskType
  **/

  public String getIntellectualPropertyAssetMaintenanceTaskType() {
    return intellectualPropertyAssetMaintenanceTaskType;
  }

  public void setIntellectualPropertyAssetMaintenanceTaskType(String intellectualPropertyAssetMaintenanceTaskType) {
    this.intellectualPropertyAssetMaintenanceTaskType = intellectualPropertyAssetMaintenanceTaskType;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of any payments made as part of maintenance 
   * @return intellectualPropertyAssetMaintenanceTransaction
  **/

  public String getIntellectualPropertyAssetMaintenanceTransaction() {
    return intellectualPropertyAssetMaintenanceTransaction;
  }

  public void setIntellectualPropertyAssetMaintenanceTransaction(String intellectualPropertyAssetMaintenanceTransaction) {
    this.intellectualPropertyAssetMaintenanceTransaction = intellectualPropertyAssetMaintenanceTransaction;
  }


}

