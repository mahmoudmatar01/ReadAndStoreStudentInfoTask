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
        student.printStudentData();
    }
}
