package com.example.addressbook.model;

public class AddressBookModel {
    private int id;
    private String name;
    private String address;

    public AddressBookModel() {}

    public AddressBookModel(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}
