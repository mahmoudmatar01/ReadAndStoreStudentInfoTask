package models;

public class SchoolStudent extends Student{
    public SchoolStudent() {}

    @Override
    public void readData(String studentInfoString) {
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

    @Override
    public void printData() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getPhone());
        System.out.println("Age: " + getAge());
        System.out.println("=============================================");
    }
}
