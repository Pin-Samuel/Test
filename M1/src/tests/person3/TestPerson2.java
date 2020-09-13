package tests.person2;

import main.Person2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPerson2 {
    Person2 person2 = new Person2("Pin Lyu");

    @Test
    public void testAdd() {
        long result = 2;
        assertEquals(result, person2.add(1, 1));
    }

    @Test
    public void testSubtract() {
        long result = 2;
        assertEquals(result, person2.subtract(3, 1));
    }

    @Test
    public void testMultiply() {
        long result = 2;
        assertEquals(result, person2.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        long result = 2;
        assertEquals(result, person2.divide(4, 2));
    }
}
