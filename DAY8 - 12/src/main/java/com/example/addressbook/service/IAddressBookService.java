package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookModel;

import java.util.List;

public interface IAddressBookService {
    AddressBookModel addEntry(AddressBookDTO dto);
    AddressBookModel getEntryById(int id);
    List<AddressBookModel> getAllEntries();
    AddressBookModel updateEntry(int id, AddressBookDTO dto);
    void deleteEntry(int id);
}
