package com.diploma.domain;

public class Group {

    private String numberGroup;
    private String phoneNumber;
    private String direction;

    public Group(String numberGroup, String phoneNumber){
        this.numberGroup=numberGroup;
        this.phoneNumber=phoneNumber;
    }

    public String getNumberGroup(){
        return numberGroup;
    }

    public void setNumberGroup(String numberGroup){
        this.numberGroup=numberGroup;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
}
