package services.impl;

import models.SchoolStudent;
import services.StudentDataService;

public class SchoolStudentDataService implements StudentDataService {

    private final SchoolStudent student;
    public SchoolStudentDataService(SchoolStudent student) {
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
            student.setAge(Integer.parseInt(parts[4]));
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid data format");
        }
    }

    @Override
    public void printData() {
        student.printStudentData();
    }
}
