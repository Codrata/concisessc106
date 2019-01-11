package com.codrata.concisessc_106.Model;

public class User {

    private String Name;
    private String Email;
    private String Phone;
    private String Pin;
    private String Department;

    public User() {
    }

    public User(String name, String email, String phone, String pin, String department) {
        Name = name;
        Email = email;
        Phone = phone;
        Pin = pin;
        Department = department;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String pin) {
        Pin = pin;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

}
