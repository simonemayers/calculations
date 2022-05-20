import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    @DisplayName("Shows addition")
    void shouldAdd(){
        System.out.println("Addition passed");
        assertEquals("1 + 1 = 2", Calculations.add(1, 1));
    }
    @Test
    @DisplayName("Shows subtraction")
    void shouldSubtract(){
        System.out.println("Subtraction passed");
        assertEquals("1 - 1 = 0", Calculations.subtract(1, 1));
    }
    @Test
    @DisplayName("Shows multiplication")
    void shouldMultiply(){
        System.out.println("Multiplcation passed");
        assertEquals("1 * 1 = 1", Calculations.multiple(1, 1));
    }
    @Test
    @DisplayName("Shows division")
    void shouldDivide(){
        System.out.println("Division passed");
        assertEquals("1 / 1 = 1.0", Calculations.divide(1, 1));
    }
    @Test
    @DisplayName("Shows remainder")
    void shouldRemainder(){
        System.out.println("Remainder passed");
        assertEquals("1 % 1 = 0", Calculations.remainder(1, 1));
    }

    /*@BeforeAll
    static void beforeAll(){
        System.out.println("Before all test methods");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each test method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each test method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all test methods");
    }*/




}