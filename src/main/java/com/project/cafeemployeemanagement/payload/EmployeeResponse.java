package com.project.cafeemployeemanagement.payload;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.project.cafeemployeemanagement.model.EmployeeType;
import com.project.cafeemployeemanagement.model.Role;
import com.project.cafeemployeemanagement.util.CustomDateDeserialize;

import java.util.Date;

public class EmployeeResponse {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private Long shopOwnerId;

    @JsonDeserialize(using= CustomDateDeserialize.class)
    private Date joinedDate;

    private String type;

    private String role;

    public EmployeeResponse(Long id, String firstName, String lastName, String email, Date joinedDate, String type, String role, Long shopOwnerId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.joinedDate = joinedDate;
        this.type = type;
        this.role = role;
        this.shopOwnerId = shopOwnerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Long getShopOwnerId() {
        return shopOwnerId;
    }

    public void setShopOwnerId(Long shopOwnerId) {
        this.shopOwnerId = shopOwnerId;
    }
}
