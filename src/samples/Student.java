/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samples;

/**
 *
 * @author hmohamme
 */
public class Student implements Comparable<Student>{
    private int id; 
    private String firstName;
    private String lastName;
    private double GPA;
    private int year;
    
    public Student(int id, String firstName, String lastName, double GPA, int year) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
        this.year = year;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Student other) {
        return this.id - other.id;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{");
        sb.append("id=").append(id);
        sb.append(", firstName=").append(firstName);
        sb.append(", lastName=").append(lastName);
        sb.append(", GPA=").append(GPA);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
    
         
}
