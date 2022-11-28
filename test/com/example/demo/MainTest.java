package com.example.demo;

import com.example.coding.Employee;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

    private List<Employee> employees = new ArrayList<>();

    @Before
    public void setup() {
        employees.add(new Employee(111L, "Test test", "Delivery"));
        employees.add(new Employee(222L, "Test", "Purchase"));
        employees.add(new Employee(333L, "John Doe", "Delivery"));

        employees.get(0).setSalary("5000");
        employees.get(1).setSalary("4000");
        employees.get(2).setSalary("3000");
    }

    @Test
//    @DisplayName("find all of the distinct values from sample order for path $.OrderLines[*].LineStatus")
    public void findAllOfTheDistinctValuesFromSampleOrderForPathOrderLinesLineStatus() {
        Map<String, List<Employee>> empData = employees.stream().collect(Collectors.groupingBy(Employee::getGroupId));

//        Collection<String> actual = null;
        assertEquals(2, empData.size());
    }

    @Test
//    @DisplayName("convert all of the string values of Salary to sum BigDecimal at path $.Employee.Salary")
    public void convertAllOfTheStringValuesToBigDecimal() {
        employees.stream().map(e1 -> (e1.getSalary())).reduce((s1, s2) -> s1 + s2);
        Collection<BigDecimal> actual = null; // assertEquals(4, actual.size());//
    }

    @Test
    public void convertEveryLineToTheStringLengthThenFindTheShortestStringLength() {
        Comparator<Employee> employeeComparator = (e1, e2) -> Integer.valueOf(e1.getEmployeeName().length()).compareTo(e2.getEmployeeName().length());
        Employee emp = employees.stream().sorted(employeeComparator).findFirst().get();

        assertEquals("Test", emp.getEmployeeName());
//        Function<String, Integer> stringLengthFunction = null; fail("test body not implemented");
    }

    @Test
    public void isBeautifulString() {
        assertTrue(Main.isBeautifulString("bbbaacafe"));
    }
}
