package sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListObjectSortUsingSalary {
    public static void main(String[] args) {

        List<Student> stu = Arrays.asList(
                new Student(1, "niraj", "MBA", 1000),
                new Student(2, "piraj", "BBA", 200),
                new Student(4, "miraj", "PHD", 800),
                new Student(3, "oiraj", "BCA", 1500)
        );
        Collections.sort(stu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for(Student s : stu){
            System.out.println(s);
        }
    }
}
class Student{
    private int rollno;
    private String name;
    private String education;
    private int salary;

    public Student(int rollno, String name, String education, int salary) {
        this.rollno = rollno;
        this.name = name;
        this.education = education;
        this.salary = salary;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", education='" + education + '\'' +
                ", salary=" + salary +
                '}';
    }
}
