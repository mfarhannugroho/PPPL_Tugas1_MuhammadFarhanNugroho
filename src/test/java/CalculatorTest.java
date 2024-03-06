import org.example.Calculator;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    @BeforeAll
    void setupClass() {
        System.out.println("Before all is called");
    }

    @BeforeEach
    void setupMethod() {
        System.out.println("Before each is called");
    }

    @AfterEach
    void cleanMethod() {
        System.out.println("After each is called");
    }

    @AfterAll
    void cleanClaas() {
        System.out.println("After all is called");
    }

    @Test
    void testTambah() {
        //create obj calculator, assign a dan b

        Calculator calc = new Calculator();
        calc.a = 5;
        calc.b = 10;

        Assertions.assertEquals(15, calc.tambah());
    }

    @Test
    void testKurang() {
        //create obj calculator, assign a dan b

        Calculator calc = new Calculator();
        calc.a = 5;
        calc.b = 10;

        Assertions.assertEquals(-5, calc.kurang());
    }

    @Test
    void testKali() {
        //create obj calculator, assign a dan b

        Calculator calc = new Calculator();
        calc.a = 5;
        calc.b = 10;

        Assertions.assertEquals(50, calc.kali());
    }

    @Test
    void testBagi() {
        //create obj calculator, assign a dan b

        Calculator calc = new Calculator();
        calc.a = 10;
        calc.b = 5;

        Assertions.assertEquals(2, calc.bagi());
    }

    @Test
    void testKalii() {
        Calculator calc = new Calculator(5, 7);

        Assertions.assertAll(
                () -> Assertions.assertEquals(5, calc.a),
                () -> Assertions.assertEquals(7, calc.b),
                () -> Assertions.assertNotNull(calc.kali())
        );
    }

    private int result = 0;

    @Test
    @Order(1)
    void testTambah2() {
        int a = 10;
        int b = 7;

        System.out.println("method 1 is called");
        Calculator calculator = new Calculator(a, b);
        result = calculator.tambah();

        Assertions.assertEquals(17, result);
    }

    @Test
    @Order(2)
    void testKurang2() {
        int b = 5;
        System.out.println("method 2 is called");
        Calculator calculator = new Calculator(result, b);
        result = calculator.kurang();

        Assertions.assertEquals(12, result);
    }
}
