package com.example.addressbook.service;

import com.example.addressbook.dto.AddressBookDTO;
import com.example.addressbook.model.AddressBookModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookModel> addressBookList = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @Override
    public AddressBookModel addEntry(AddressBookDTO dto) {
        AddressBookModel model = new AddressBookModel(idCounter.incrementAndGet(), dto.getName(), dto.getAddress());
        addressBookList.add(model);
        return model;
    }

    @Override
    public AddressBookModel getEntryById(int id) {
        return addressBookList.stream().filter(entry -> entry.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<AddressBookModel> getAllEntries() {
        return addressBookList;
    }

    @Override
    public AddressBookModel updateEntry(int id, AddressBookDTO dto) {
        AddressBookModel entry = getEntryById(id);
        if (entry != null) {
            entry.setName(dto.getName());
            entry.setAddress(dto.getAddress());
        }
        return entry;
    }

    @Override
    public void deleteEntry(int id) {
        addressBookList.removeIf(entry -> entry.getId() == id);
    }
}
