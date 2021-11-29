package com.beCMS.BackendCentralParam.model.LDAP;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.beCMS.BackendCentralParam.model.LDAP.Credentials;
import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties.Credential;

public class vwCredentials {

@JsonProperty("Credentials")
private Credentials Credentials ;

    public Credentials getCredentials() {
        return this.Credentials;
    }

    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    public vwCredentials() {
    }


}

