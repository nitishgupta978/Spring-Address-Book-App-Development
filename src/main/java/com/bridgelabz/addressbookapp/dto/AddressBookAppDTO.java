package com.bridgelabz.addressbookapp.dto;

/**
 * @author Nitish kumar gupta
 * date 05/06/2022
 * call constructor getter&setter, to String Method
 */
public class AddressBookAppDTO {
    private String firstname;
    private String lastname;
    private long zipcode;
    private String state;
    private String city;
    private String phonenumber;

    public AddressBookAppDTO(String firstname, String lastname, long zipcode, String state, String city, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;
        this.phonenumber = phonenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "AddressBookAppDTO{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", zipcode=" + zipcode +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
