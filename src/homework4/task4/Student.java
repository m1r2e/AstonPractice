package homework4.task4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private String name;
    private String group;
    private int course;
    private HashMap<Subject, Integer> grades = new HashMap<>();

    public Student(String name, String group, int course) {
        this.name = name;
        this.group = group;
        this.course = course;
    }

    public Student(String name, String group, int course, HashMap<Subject, Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public HashMap<Subject, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Subject, Integer> grades) {
        this.grades = grades;
    }

    public static void transferToTheNextCourseOrRemove(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            int currentCourse = students.get(i).getCourse();
            int sumOfGrades = 0;

            for (Map.Entry<Subject, Integer> entry : students.get(i).getGrades().entrySet()) {
                sumOfGrades += entry.getValue();
            }

            double avgOfGrades = (double) sumOfGrades / students.get(i).getGrades().size();

            if (avgOfGrades < 3) {
                students.remove(i);
            } else {
                students.get(i).setCourse(++currentCourse);
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }

    }


    public void addGrade(Subject subject, int grade) {
        grades.put(subject, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                '}';
    }
}