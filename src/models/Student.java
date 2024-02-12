package models;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Student  {
    private String name;
    private String address;
    private Long id;
    private String phone;
    private double age;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String regex = "^.{0,11}$";
        Pattern pattern = Pattern.compile(regex);
        // Match the input phone number against the pattern.
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches() || phone.isEmpty()) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Phone number must have at most 11 characters");
        }
    }

    public void printStudentData(){
        System.out.println("School student id: " + getId());
        System.out.println("School student name: " + getName());
        System.out.println("School student address: " + getAddress());
        System.out.println("School student phone: " + getPhone());
        System.out.println("School student age: " + getAge());
        System.out.println("=============================================");
    }
    public abstract void readStudentData(String studentInfoString);

}

