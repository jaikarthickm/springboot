package com.example.myfirstproject.employeeentity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {

    @Id
    private int accountNumber;
    private String accountName;
    private String bankName;
    private String phoneNumber;
    private String mail;
    private int age;
    private String address;
    private double accountBalance;

    public EmployeeEntity(int accountNumber, String accountName, String bankName, String phoneNumber, String mail, int age, String address, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.bankName = bankName;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.age = age;
        this.address = address;
        this.accountBalance = accountBalance;
    }

    public EmployeeEntity() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
