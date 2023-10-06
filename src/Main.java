import exception.GlobalExceptionHandler;
import factory.StudentFactory;
import factory.impl.StudentFactoryImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // to handle any uncaught future exception and print reason
        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());

        // take an instance from student factory class to use its method
        StudentFactory studentFactory=new StudentFactoryImpl();

        //list of students files
        List<String> studentsInformation=List.of(
                "1\"mahmoud\"Tanta City\"01128673348\"Tanta_University\"fourth_level\"22",
                "2\"ziad\"Tanta City\"01227007298\"18",
                "3\"omar\"Alexandria City\"01111614941\"19",
                "4\"Ahmed\"Cairo City\"01000671232\"Cairo_University\"third_level\"21",
                "5\"Mustafa\"Aswan City\"01227007299\"16"
                );

        for(String studentInfo : studentsInformation){
          studentFactory.createStudent(studentInfo);
        }

    }
}