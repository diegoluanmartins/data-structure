package com.capiroto.datastructure.vector.util;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Contact(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.name.equals(((Contact)obj).getName())){
            return false;
        }
        if(!this.phoneNumber.equals(((Contact)obj).getPhoneNumber())){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }
    
}
