package homework4.task4;

import java.util.ArrayList;
import java.util.List;

/**
 * Задача 4
 * Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
 * оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
 * Написать метод, который удаляет студентов со средним баллом <3. Если средний
 * балл>=3, студент переводится на следующий курс. Дополнительно написать метод
 * printStudents(List<Student> students, int course), который получает список студентов и
 * номер курса. А также печатает на консоль имена тех студентов из списка, которые
 * обучаются на данном курсе.
 */

public class Task4 {

    public static void main(String[] args) {
        Student student1 = new Student("Иванов Иван", "Прикладная информатика", 2);
        Student student2 = new Student("Петров Сергей", "Информационная безопасность", 2);
        Student student3 = new Student("Магомедов Руслан", "Иинформационные системы и технологии", 3);
        Student student4 = new Student("Исаев Расул", "Программная инженерия", 2);

        student1.addGrade(Subject.MATHEMATICS, 4);
        student1.addGrade(Subject.INFORMATICS, 5);
        student1.addGrade(Subject.PROGRAMMING, 5);
        student1.addGrade(Subject.DATABASES, 4);

        student2.addGrade(Subject.MATHEMATICS, 3);
        student2.addGrade(Subject.INFORMATICS, 4);
        student2.addGrade(Subject.PROGRAMMING, 3);
        student2.addGrade(Subject.DATABASES, 4);

        student3.addGrade(Subject.MATHEMATICS, 5);
        student3.addGrade(Subject.INFORMATICS, 5);
        student3.addGrade(Subject.PROGRAMMING, 4);
        student3.addGrade(Subject.DATABASES, 4);

        student4.addGrade(Subject.MATHEMATICS, 3);
        student4.addGrade(Subject.INFORMATICS, 2);
        student4.addGrade(Subject.PROGRAMMING, 2);
        student4.addGrade(Subject.DATABASES, 2);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Student.printStudents(students, 2);

        Student.transferToTheNextCourseOrRemove(students);
        System.out.println();

        Student.printStudents(students);
    }
}