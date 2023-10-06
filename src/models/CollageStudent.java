package models;

public class CollageStudent extends Student {
    public CollageStudent() {}
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
    public void readData(String studentInfoString) {
        String[] parts = studentInfoString.split("\"");
        try {
            setId(Long.parseLong(parts[0]));
            setName(parts[1]);
            setAddress(parts[2]);
            setPhone(parts[3]);
            setUniversity(parts[4]);
            setLevel(parts[5]);
            setAge(Integer.parseInt(parts[6]));
        } catch (Exception e){
            throw new IllegalArgumentException("Invalid data format");
        }
    }

    @Override
    public void printData() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("University: " +getUniversity());
        System.out.println("Level: " +getLevel());
        System.out.println("Age: " + getAge());
        System.out.println("=============================================");
    }
}
