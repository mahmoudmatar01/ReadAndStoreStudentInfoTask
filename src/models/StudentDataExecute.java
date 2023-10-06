package models;

public class StudentDataExecute {
   public void printData(StudentDataOperations studentDataOperations){
        studentDataOperations.printData();
    }

   public void readData(String studentInfoString,StudentDataOperations studentDataOperations){
        studentDataOperations.readData(studentInfoString);
    }
}
