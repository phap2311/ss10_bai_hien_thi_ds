package com.example.ss10_display_list;

public class Customer {
private String nameCustomer;
private String birthday;
private String addressCustomer;
private String imgCustomer;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, String addressCustomer, String imgCustomer) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.addressCustomer = addressCustomer;
        this.imgCustomer = imgCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getImgCustomer() {
        return imgCustomer;
    }

    public void setImgCustomer(String imgCustomer) {
        this.imgCustomer = imgCustomer;
    }
}
