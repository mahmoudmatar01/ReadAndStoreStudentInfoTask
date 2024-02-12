package models;

public class SchoolStudent extends Student{
    @Override
    public void printStudentData() {
        super.printStudentData();
    }

    @Override
    public void readStudentData(String studentInfoString) {
        String[] parts = studentInfoString.split("\"");
        try {
            setId(Long.parseLong(parts[0]));
            setName(parts[1]);
            setAddress(parts[2]);
            setPhone(parts[3]);
            setAge(Integer.parseInt(parts[4]));
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid data format");
        }
    }
}
