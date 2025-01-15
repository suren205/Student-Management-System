package twentyfour.fall.oop.group1.finalproject.m23w7436;

public class Student {
    private String name;
    private String rollNumber;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade;
    }

    public String toFileString() {
        return name + "," + rollNumber + "," + grade;
    }

    public static Student fromFileString(String line) {
        String[] data = line.split(",");
        return new Student(data[0], data[1], data[2]);
    }
}
