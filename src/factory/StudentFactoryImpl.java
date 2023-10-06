package factory;

import models.*;

public class StudentFactoryImpl implements StudentFactory{
    // take an instance of Student abstract class
  private Student student;
  private StudentDataOperations studentDataOperations;
    @Override
    public Student createStudent(String studentInfoString) {

        // make factory decided which student class I will use
        String[] parts = studentInfoString.split("\"");
        if (parts.length >= 5) {
            if (parts.length == 7) {

                student=new CollageStudent();
                studentDataOperations= new CollageStudentDataOperation((CollageStudent) student);
                studentDataOperations.readData(studentInfoString);
                studentDataOperations.printData();

                return student;
            } else if (parts.length == 5) {
                student = new SchoolStudent();
                studentDataOperations= new SchoolStudentDataOperation((SchoolStudent) student);
                studentDataOperations.readData(studentInfoString);
                studentDataOperations.printData();
                return student;
            }
        }

        throw new IllegalArgumentException("Invalid Data");
    }
}
