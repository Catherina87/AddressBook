package com.pchelina;

public class ContactData {
    private String firstName;
    private String lastName;
    private String nickName;
    private String title;
    private String company;
    private String address;
    private String phone;
    private String email;

    public ContactData(String firstName, String lastname, String nickName, String title, String company, String address,
                       String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.email = email;
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

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

}
