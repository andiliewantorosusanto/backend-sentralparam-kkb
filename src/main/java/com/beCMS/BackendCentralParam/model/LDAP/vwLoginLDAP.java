package com.beCMS.BackendCentralParam.model.LDAP;


public class vwLoginLDAP {
    private Integer id;
    private String firstName;
    private String lastName;
    private String role;
    private String succeed;
    private String username;
    private String token;

    public vwLoginLDAP(Integer id, String firstName, String lastName, String role, String succeed, String username, String token) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.succeed = succeed;
        this.username = username;
        this.token = token;
    }



    public vwLoginLDAP() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSucceed() {
        return this.succeed;
    }

    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
   