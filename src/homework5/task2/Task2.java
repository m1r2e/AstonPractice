package homework5.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Задача 2:
 * Создать класс Employee с полями name, age, department, salary
 * Вам нужно выполнить следующие задачи, используя стримы (каждый пункт в отдельном методе):
 * 1)  Создать список сотрудников.
 * 2)  Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.
 * 3)  Посчитать общее количество сотрудников в отделе "IT".
 * 4)  Найти сотрудника с максимальной зарплатой.
 * 5)  Получить список имен всех сотрудников, работающих в отделе "HR", и отсортировать их по имени.
 * 6)  Рассчитать среднюю зарплату всех сотрудников.
 */

public class Task2 {

    public static void main(String[] args) {

        List<Employee> employeesList = createEmployeesList();

        System.out.println("Cписок всех сотрудников:");
        System.out.println(employeesList);

        System.out.println("Найти всех сотрудников старше 30 лет и отсортировать их по возрасту:");
        System.out.println(findOver30AndSort(employeesList));

        System.out.println("Посчитать общее количество сотрудников в отделе \"IT\":");
        System.out.println(getCountEpmInIT(employeesList));

        System.out.println("Найти сотрудника с максимальной зарплатой:");
        System.out.println(findEmpWithMaxSalary(employeesList));

        System.out.println("Получить список имен всех сотрудников, работающих в отделе \"HR\", и отсортировать их по имени:");
        System.out.println(getNamesEmpInHRAndSort(employeesList));

        System.out.println("Рассчитать среднюю зарплату всех сотрудников:");
        System.out.format("%.2f",getAverageSalary(employeesList));

    }

    private static List<Employee> createEmployeesList() {

        return Stream.of(
                new Employee("Andrey", 30, Department.LAW, 70000),
                new Employee("Sergey", 25, Department.IT, 60000),
                new Employee("Elena", 27, Department.HR, 55000),
                new Employee("Alexandr", 35, Department.ACCOUNTING, 50000),
                new Employee("Mihail", 40, Department.IT, 100000),
                new Employee("Maria", 22, Department.HR, 50000),
                new Employee("Olga", 31, Department.HR, 60000),
                new Employee("Ivan", 45, Department.IT, 150000),
                new Employee("Vladislav", 33, Department.SALES, 66000),
                new Employee("Marina", 27, Department.PR, 57000),
                new Employee("Vladimir", 34, Department.SUPPLY, 65000),
                new Employee("Maxim", 27, Department.IT, 80000),
                new Employee("Anastasiya", 32, Department.IT, 75000)
        ).toList();
    }

    private static List<Employee> findOver30AndSort(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getAge() >= 30)
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();
    }

    private static int getCountEpmInIT(List<Employee> employees) {
        return (int) employees.stream()
                .filter(e -> e.getDepartment().equals(Department.IT))
                .count();
    }

    private static Employee findEmpWithMaxSalary(List<Employee> employees) {
        return employees.stream()
                .max(Comparator.comparingInt(Employee::getSalary))
                .orElseGet(() -> new Employee("Unknown", 0, Department.IT, 0));
    }

    private static List<String> getNamesEmpInHRAndSort(List<Employee> employees) {
        return employees.stream()
                .filter(e -> e.getDepartment().equals(Department.HR))
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    private static double getAverageSalary(List<Employee> employees) {
        return employees.stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }
}
