package factory.impl;

import services.StudentDataService;

public class StudentDataExecute {
   public void printData(StudentDataService studentDataOperations){
        studentDataOperations.printData();
    }

   public void readData(String studentInfoString, StudentDataService studentDataOperations){
        studentDataOperations.readData(studentInfoString);
    }
}
