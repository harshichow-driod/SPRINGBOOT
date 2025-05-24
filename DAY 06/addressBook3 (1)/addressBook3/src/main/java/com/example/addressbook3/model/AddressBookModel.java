package com.example.addressbook3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookModel {
    private int id;
    private String name;
    private String email;
    private String phone;
}

