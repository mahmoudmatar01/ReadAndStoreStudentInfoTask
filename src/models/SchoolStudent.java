package models;

public class SchoolStudent extends Student{
    @Override
    public void printStudentData() {
        System.out.println("School student id: " + getId());
        System.out.println("School student name: " + getName());
        System.out.println("School student address: " + getAddress());
        System.out.println("School student phone: " + getPhone());
        System.out.println("School student age: " + getAge());
        System.out.println("=============================================");
    }
}
