package factory.impl;

import factory.StudentFactory;
import models.*;
import services.impl.CollageStudentDataService;
import services.impl.SchoolStudentDataService;
public class StudentFactoryImpl implements StudentFactory {
    private final StudentDataExecute studentDataExecute;

  public StudentFactoryImpl(){
      studentDataExecute=new StudentDataExecute();
  }
    @Override
    public Student createStudent(String studentInfoString) {
        // make factory decided which student class I will use
        String[] parts = studentInfoString.split("\"");
        if (parts.length >= 5) {
            // take an instance of Student abstract class
            Student student;
            if (parts.length == 7) {
                student =new CollageStudent();
                studentDataExecute.readData(studentInfoString,new CollageStudentDataService((CollageStudent) student));
                studentDataExecute.printData(new CollageStudentDataService((CollageStudent) student));
                return student;
            } else if (parts.length == 5) {
                student = new SchoolStudent();
                studentDataExecute.readData(studentInfoString,new SchoolStudentDataService((SchoolStudent) student));
                studentDataExecute.printData(new SchoolStudentDataService((SchoolStudent) student));

                return student;
            }
        }

        throw new IllegalArgumentException("Invalid Data");
    }
}
