package services.impl;

import models.SchoolStudent;
import services.StudentDataService;

public class SchoolStudentDataService implements StudentDataService {
    private final SchoolStudent student;
    public SchoolStudentDataService() {
        this.student = new SchoolStudent();
    }
    @Override
    public void readData(String studentInfoString) {
        student.readStudentData(studentInfoString);
    }

    @Override
    public void printData() {
        student.printStudentData();
    }
}
