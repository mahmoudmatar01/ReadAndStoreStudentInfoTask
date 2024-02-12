package services.impl;

import models.CollageStudent;
import services.StudentDataService;

public class CollageStudentDataService implements StudentDataService {
    private final CollageStudent student;
    public CollageStudentDataService() {
        this.student = new CollageStudent();
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
