package exercises.ch03.ex14;

import exercises.ch03.ex01.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Chris Kimberley
 */
public class SalaryNameSort {

    public static List<String> salaryNameSort(Employee... employees) {
        //ArrayLists.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed());
        return Arrays.stream(employees).map(Employee::getName).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Employee bill = new Employee("Bill", 23000);
        Employee fred = new Employee("Fred", 10000);
        Employee sid = new Employee("Sid", 23000);
        Employee trevor = new Employee("Trevor", 28000);

        System.out.println(salaryNameSort(fred, bill, trevor, sid));
    }
}