package com.beCMS.BackendCentralParam.model.LDAP;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class vwJWTLDAP {

@JsonProperty("ResponseHeader")
private ResponseHeader responseHeader;


@JsonProperty("UserInfo")
private UserInfo userInfo ;


    public ResponseHeader getResponseHeader() {
        return this.responseHeader;
    }

    public void setResponseHeader(ResponseHeader responseHeader) {
        this.responseHeader = responseHeader;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public vwJWTLDAP() {
    }



    // public vwJWTLDAP(ResponseHeader responseHeader, UserInfo userInfo) {
    //     this.responseHeader = responseHeader;
    //     this.userInfo = userInfo;
    // }


}