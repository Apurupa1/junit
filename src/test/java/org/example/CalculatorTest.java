package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calcululate calc;

    @BeforeAll
    public static void setupAll() {
        // This runs once before all test methods.
        System.out.println("Before All: Initialization for all tests.");
    }

    @BeforeEach
    public void setup() {
        // This runs before each test method.
        calc = new Calcululate();
        System.out.println("Before Each: New Calcululate instance created.");
    }

    @Test
    public void testAddition() {
        int result = calc.add(6, 3);
        assertEquals(9, result, "6 + 3 should equal 9");
    }

    @Test
    public void testSubtraction() {
        int result = calc.sub(6, 3);
        assertEquals(3, result, "6 - 3 should equal 3");
    }

    @Test
    public void testMultiplication() {
        int result = calc.mul(6, 3);
        assertEquals(18, result, "6 * 3 should equal 18");
    }
    //@Tag("fast")
    @Test
    public void testDivision() {
        int result = calc.div(6, 3);
        assertEquals(2, result, "6 / 3 should equal 2");
    }

    @AfterEach
    public void tearDown() {
        // This runs after each test method.
        System.out.println("After Each: Test completed.");
    }

    @AfterAll
    public static void tearDownAll() {
        // This runs once after all test methods.
        System.out.println("After All: All tests are completed.");
    }
}
