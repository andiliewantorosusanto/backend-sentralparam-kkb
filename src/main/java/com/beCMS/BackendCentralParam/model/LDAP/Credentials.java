package com.beCMS.BackendCentralParam.model.LDAP;

import com.fasterxml.jackson.annotation.JsonProperty;




import javax.persistence.Column;



public class Credentials {

@JsonProperty("UserId")
@Column(name = "UserId")
private String UserId;

@JsonProperty("UserName")
@Column(name = "UserName")
private String UserName;

@JsonProperty("Password")
@Column(name = "Password")
private String Password;


    public Credentials(){
        
    }

    public Credentials(String UserId, String UserName, String Password) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.Password = Password;
    }

    public Credentials(String UserId,String Password) {
        this.UserId = UserId;
        this.Password = Password;
    }

    public String getUserId() {
        return this.UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
