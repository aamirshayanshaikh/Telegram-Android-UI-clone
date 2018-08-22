package com.shorka.telegramclone_ui.models;

/**
 * Created by Kyrylo Avramenko on 7/18/2018.
 */
public class ContactPhoneBook {

    private String phoneNumber;
    private String name;

    public ContactPhoneBook(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
