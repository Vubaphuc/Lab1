package model;

public class Student {
    private static int id = 0;
    private String name;
    private String address;


    public Student() {
    }

    public Student(String name, String address) {
        id++;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
