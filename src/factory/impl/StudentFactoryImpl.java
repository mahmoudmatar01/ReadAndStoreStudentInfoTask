package factory.impl;

import factory.StudentFactory;
import models.*;
import services.StudentDataService;
import services.impl.CollageStudentDataService;
import services.impl.SchoolStudentDataService;

public class StudentFactoryImpl implements StudentFactory {
    @Override
    public void createStudent(String studentInfoString) {
        try {
            StudentDataService studentDataService;
            String[] parts = studentInfoString.split("\"");
            if (parts.length == 7) {
                studentDataService = new CollageStudentDataService();
            } else if (parts.length == 5) {
                studentDataService = new SchoolStudentDataService();
            } else {
                throw new IllegalArgumentException("Invalid Data");
            }
            studentDataService.readData(studentInfoString);
            studentDataService.printData();
        } catch (Exception e) {
            // Handle the exception (print or log) and continue with the next student information
            System.out.println("Error creating student: " + e.getMessage());
        }
    }
}
