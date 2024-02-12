package models;

public class CollageStudent extends Student {
    private String university;
    private String level;

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public void printStudentData() {
        System.out.println("College student id: " + getId());
        System.out.println("College student name: " + getName());
        System.out.println("College student address: " + getAddress());
        System.out.println("College student phone: " + getPhone());
        System.out.println("College student university: " + getUniversity());
        System.out.println("College student level: " + getLevel());
        System.out.println("College student age: " + getAge());
        System.out.println("=============================================");
    }

    @Override
    public void readStudentData(String studentInfoString) {
        String[] parts = studentInfoString.split("\"");
        try {
            setId(Long.parseLong(parts[0]));
            setName(parts[1]);
            setAddress(parts[2]);
            setPhone(parts[3]);
            setUniversity(parts[4]);
            setLevel(parts[5]);
            setAge(Integer.parseInt(parts[6]));
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid data format");
        }
    }
}
