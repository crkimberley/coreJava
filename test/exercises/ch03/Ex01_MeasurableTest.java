package exercises.ch03;

import exercises.ch03.ex01.Employee;
import exercises.ch03.ex01.MeasurableUtilities;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Chris Kimberley
 */
public class Ex01_MeasurableTest {

    Employee bill = new Employee("Bill", 23000);
    Employee fred = new Employee("Fred", 10000);
    Employee sid = new Employee("Sid", 18000);
    Employee trevor = new Employee("Sid", 28000);


    @Test
    void measurableAverageEmployeeSalaryTest() {
        assertEquals(MeasurableUtilities.average
                (new Employee[] {bill, fred, sid}), 17000);
    }

    @Test
    void measurableLargestEmployeeSalaryTest() {
        assert(MeasurableUtilities.largest
                (new Employee[] { bill, trevor, fred, sid }).equals(trevor));
    }
}
