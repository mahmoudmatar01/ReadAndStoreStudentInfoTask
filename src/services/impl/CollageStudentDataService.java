package services.impl;

import models.CollageStudent;
import services.StudentDataService;

public class CollageStudentDataService implements StudentDataService {
    private final CollageStudent student;

    public CollageStudentDataService(CollageStudent student) {
        this.student = student;
    }

    @Override
    public void readData(String studentInfoString) {
        String[] parts = studentInfoString.split("\"");
        try {
            student.setId(Long.parseLong(parts[0]));
            student.setName(parts[1]);
            student.setAddress(parts[2]);
            student.setPhone(parts[3]);
            student.setUniversity(parts[4]);
            student.setLevel(parts[5]);
            student.setAge(Integer.parseInt(parts[6]));
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid data format");
        }
    }

    @Override
    public void printData() {
        System.out.println("ID: " +  student.getId());
        System.out.println("Name: " +   student.getName());
        System.out.println("Address: " +   student.getAddress());
        System.out.println("Phone: " +   student.getPhone());
        System.out.println("University: " +  student.getUniversity());
        System.out.println("Level: " +  student.getLevel());
        System.out.println("Age: " +   student.getAge());
        System.out.println("=============================================");
    }
}
