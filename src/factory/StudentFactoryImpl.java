package factory;

import models.CollageStudent;
import models.SchoolStudent;
import models.Student;

public class StudentFactoryImpl implements StudentFactory{

    // take an instance of Student abstract class
  private Student student;
    @Override
    public Student createStudent(String studentInfoString) {

        // make factory decided which student class I will use
        String[] parts = studentInfoString.split("\"");
        if (parts.length >= 5) {
            if (parts.length == 7) {
                student = new CollageStudent();
                student.readData(studentInfoString);
                student.printData();
                return student;
            } else if (parts.length == 5) {
                student = new SchoolStudent();
                student.readData(studentInfoString);
                student.printData();
                return student;
            }
        }

        throw new IllegalArgumentException("Invalid Data");
    }
}
