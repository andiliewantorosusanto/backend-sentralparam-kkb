package com.beCMS.BackendCentralParam.model.LDAP;


import com.fasterxml.jackson.annotation.JsonProperty;




import javax.persistence.Column;


public class UserInfo {

@JsonProperty("UserId")
@Column(name = "UserId")
private String UserId;

@JsonProperty("FullName")
@Column(name = "FullName")
private String FullName;

public UserInfo() {
}

}
