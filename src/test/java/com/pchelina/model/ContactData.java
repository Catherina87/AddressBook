package com.pchelina.model;

public class ContactData {
    private String firstName;
    private String lastName;
    private String nickName;
    private String title;
    private String company;
    private String address;
    private int phoneId;
    private String email;
    private String group;

    public ContactData(String firstName, String lastname, String nickName, String title, String company, String address,
                       int phoneId, String email, String group) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.phoneId = phoneId;
        this.email = email;
        this.group = group;
    }

    public ContactData(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getEmail() {
        return email;
    }

    public String getGroup() {
        return group;
    }

}
