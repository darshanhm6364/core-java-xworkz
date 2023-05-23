package com.xworkz.bankapp;

public class Bank {


    private int id;
    private long accountNo;
    private int branchNo;
    private String accountType;
    private String ifscCode;
    private  String location;


    public Bank(){
        System.out.println("no arg con----------");
    }

    public Bank(int id,long accountNo,int branchNo,String accountType,String ifscCode,String location){
        this.id=id;
        this.accountNo=accountNo;
        this.branchNo=branchNo;
        this.accountType=accountType;
        this.ifscCode=ifscCode;
        this.location=location;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setBranchNo(int branchNo) {
        this.branchNo = branchNo;
    }

    public int getBranchNo() {
        return branchNo;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setLocation(String location){
        this.location=location;
    }
    public String getLocation(){
        return location;
    }
}
