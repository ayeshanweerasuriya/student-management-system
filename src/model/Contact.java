package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Contact {
    private static ObservableList<Contact> contactObservableList = FXCollections.observableArrayList();

    private int id;
    private String name;
    private int age;
    private String address;
    private Double salary;

    public Contact(int id, String name, int age, String address, Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public static void setContactObservableList(Contact contact) {
        contactObservableList.add(contact);
    }

    public static ObservableList<Contact> getContactObservableList() {
        return contactObservableList;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
