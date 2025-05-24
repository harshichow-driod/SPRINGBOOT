package com.example.addressbook3.service;

import com.example.addressbook3.model.AddressBookModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AddressBookServiceImpl implements AddressBookService {
    private final List<AddressBookModel> contacts = new ArrayList<>();

    @Override
    public List<AddressBookModel> getAllContacts() {
        log.info("Fetching all contacts");
        return contacts;
    }

    @Override
    public AddressBookModel getContactById(int id) {
        log.info("Fetching contact with ID: {}", id);
        return contacts.stream()
                .filter(contact -> contact.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public AddressBookModel createContact(AddressBookModel contact) {
        contacts.add(contact);
        log.info("Created contact: {}", contact);
        return contact;
    }

    @Override
    public AddressBookModel updateContact(int id, AddressBookModel updatedContact) {
        log.info("Updating contact with ID: {}", id);
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getId() == id) {
                contacts.set(i, updatedContact);
                log.info("Contact updated: {}", updatedContact);
                return updatedContact;
            }
        }
        log.warn("No contact found with ID: {}", id);
        return null;
    }

    @Override
    public void deleteContact(int id) {
        log.info("Deleting contact with ID: {}", id);
        contacts.removeIf(contact -> contact.getId() == id);
    }
}
