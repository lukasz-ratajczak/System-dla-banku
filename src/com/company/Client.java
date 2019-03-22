package com.company;

public class Client {
    private String pesel;
    private String firstName;
    private String lastName;
    private String birthday;

    public Client(String pesel, String firstName, String lastName, String birthday) {
        this.pesel = pesel;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
