package com.beCMS.BackendCentralParam.model.LDAP;

import com.fasterxml.jackson.annotation.JsonProperty;




import javax.persistence.Column;



public class ResponseHeader {

@JsonProperty("ErrorCode")
@Column(name = "ErrorCode")
private String ErrorCode;

@JsonProperty("ErrorDescription")
@Column(name = "ErrorDescription")
private String ErrorDescription;

@JsonProperty("TrxId")
@Column(name = "TrxId")
private String TrxId;


    public ResponseHeader() {
    }


    public ResponseHeader(String ErrorCode, String ErrorDescription, String TrxId) {
        this.ErrorCode = ErrorCode;
        this.ErrorDescription = ErrorDescription;
        this.TrxId = TrxId;
    }



    public String getErrorCode() {
        return this.ErrorCode;
    }

    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public String getErrorDescription() {
        return this.ErrorDescription;
    }

    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    public String getTrxId() {
        return this.TrxId;
    }

    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
    }
  

}
