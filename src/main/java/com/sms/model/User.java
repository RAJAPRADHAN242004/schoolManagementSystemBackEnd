package com.sms.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "registration")
@Table

public class User {
    @Id
    @Column(name = "userid")
    private String userid;

    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

    @Column(name = "email")
    private String email;
    @Column(name = "pwd")
    private String pwd;

    @Column(name = "rptpwd")
    private String rptPwd;

    @Column(name = "gender")
    private String gender;

    @Column(name = "occupation")
    private String occupation;

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", pwd='" + pwd + '\'' +
                ", rptPwd='" + rptPwd + '\'' +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRptPwd() {
        return rptPwd;
    }

    public void setRptPwd(String rptPwd) {
        this.rptPwd = rptPwd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
