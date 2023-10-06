package factory;

import models.CollageStudent;
import models.SchoolStudent;
import models.Student;

public interface StudentFactory {
      Student createStudent(String studentInfoString) ;
}
