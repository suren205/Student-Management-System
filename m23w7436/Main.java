package twentyfour.fall.oop.group1.finalproject.m23w7436;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        FileHandler fileHandler = new FileHandler();
        fileHandler.loadStudentsFromFile(studentManager.getStudents());
        Menu menu = new Menu(studentManager, fileHandler);
        menu.displayMenu();
    }
}
