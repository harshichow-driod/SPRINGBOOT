package com.example.addressbook3;

import com.example.addressbook3.model.AddressBookModel;
import com.example.addressbook3.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class AddressBookController3 {

    @Autowired
    private AddressBookService addressBookService;

    @GetMapping
    public ResponseEntity<List<AddressBookModel>> getAllContacts() {
        return ResponseEntity.ok(addressBookService.getAllContacts());
    }

    @PostMapping
    public ResponseEntity<AddressBookModel> createContact(@RequestBody AddressBookModel contact) {
        return ResponseEntity.ok(addressBookService.createContact(contact));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressBookModel> getContactById(@PathVariable int id) {
        return ResponseEntity.ok(addressBookService.getContactById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<AddressBookModel> updateContact(@PathVariable int id, @RequestBody AddressBookModel contact) {
        return ResponseEntity.ok(addressBookService.updateContact(id, contact));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteContact(@PathVariable int id) {
        addressBookService.deleteContact(id);
        return ResponseEntity.ok("Deleted contact with ID: " + id);
    }
}
