package com.bridgelabz.greetingApp.model;

public class UserInfo {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String fullName = "";
        if (firstName != null && !firstName.trim().isEmpty()) {
            fullName += firstName.trim();
        }
        if (lastName != null && !lastName.trim().isEmpty()) {
            if (!fullName.isEmpty()) {
                fullName += " ";
            }
            fullName += lastName.trim();
        }
        return fullName.isEmpty() ? "World" : fullName;
    }


}
