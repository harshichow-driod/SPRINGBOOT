package com.example.addressbook3.service;

import com.example.addressbook3.model.AddressBookModel;
import java.util.List;

public interface AddressBookService {
    List<AddressBookModel> getAllContacts();
    AddressBookModel getContactById(int id);
    AddressBookModel createContact(AddressBookModel contact);
    AddressBookModel updateContact(int id, AddressBookModel contact);
    void deleteContact(int id);
}

