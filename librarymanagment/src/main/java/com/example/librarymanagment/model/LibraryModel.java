package com.example.librarymanagment.model;

public class LibraryModel {
    private String name;
    private String address;
    private String number;
    private boolean facilities;


    
    public LibraryModel(String name, String address, String number, boolean facilities) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public boolean getFacilities() {
        return facilities;
    }
    public void setFacilities(boolean facilities) {
        this.facilities = facilities;
    }

}
