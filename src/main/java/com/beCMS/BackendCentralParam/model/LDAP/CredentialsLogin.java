package com.beCMS.BackendCentralParam.model.LDAP;

import com.fasterxml.jackson.annotation.JsonProperty;




import javax.persistence.Column;



public class CredentialsLogin {

@JsonProperty("username")
@Column(name = "username")
private String username;

@JsonProperty("password")
@Column(name = "password")
private String password;


    public CredentialsLogin(){
        
    }


    public CredentialsLogin(String username,String password) {
        this.username = username;
        this.password = password;
    }

   
    public String getusername() {
        return this.username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return this.password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

}
