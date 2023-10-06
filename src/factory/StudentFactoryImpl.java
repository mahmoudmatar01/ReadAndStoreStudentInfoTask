package factory;

import models.*;

public class StudentFactoryImpl implements StudentFactory{
    // take an instance of Student abstract class
  private Student student;
  private StudentDataExecute studentDataExecute;

  public StudentFactoryImpl(){
      studentDataExecute=new StudentDataExecute();
  }
    @Override
    public Student createStudent(String studentInfoString) {

        // make factory decided which student class I will use
        String[] parts = studentInfoString.split("\"");
        if (parts.length >= 5) {
            if (parts.length == 7) {
                student=new CollageStudent();
                studentDataExecute.readData(studentInfoString,new CollageStudentDataOperation((CollageStudent) student));
                studentDataExecute.printData(new CollageStudentDataOperation((CollageStudent) student));

                return student;
            } else if (parts.length == 5) {
                student = new SchoolStudent();
                studentDataExecute.readData(studentInfoString,new SchoolStudentDataOperation((SchoolStudent) student));
                studentDataExecute.printData(new SchoolStudentDataOperation((SchoolStudent) student));

                return student;
            }
        }

        throw new IllegalArgumentException("Invalid Data");
    }
}
