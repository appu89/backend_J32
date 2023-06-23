package iterable;
import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        // Create Student objects
        Student student1 = new Student("John", "Doe", 3.8);
        Student student2 = new Student("Alice", "Smith", 3.5);
        Student student3 = new Student("Bob", "Johnson", 3.2);
        Student student4 = new Student("Emily", "Williams", 3.9);
        Student student5 = new Student("Michael", "Brown", 3.6);
        Student student6 = new Student("Olivia", "Davis", 3.4);
        Student student7 = new Student("William", "Miller", 3.7);
        Student student8 = new Student("Sophia", "Wilson", 3.1);

        // Create HashMap and add students
        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put(student1.getFirstName(), student1);
        studentMap.put(student2.getFirstName(), student2);
        studentMap.put(student3.getFirstName(), student3);
        studentMap.put(student4.getFirstName(), student4);
        studentMap.put(student5.getFirstName(), student5);
        studentMap.put(student6.getFirstName(), student6);
        studentMap.put(student7.getFirstName(), student7);
        studentMap.put(student8.getFirstName(), student8);

        // Print using Entry set
        System.out.println("Printing HashMap using Entry Set:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        System.out.println();

        // Print using map's forEach method
        System.out.println("Printing HashMap using map's forEach method:");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        System.out.println();

        // Print using keySet and Iterator
        System.out.println("Printing HashMap using keySet and Iterator:");
        Set<String> keySet = studentMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
         //   System.out.println("Key: " + key + ", Value: " + studentMap.get(key));
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getGPA() {
        return gpa;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}
