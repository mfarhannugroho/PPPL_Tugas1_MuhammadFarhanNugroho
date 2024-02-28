import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

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
        Calculator calc = new Calculator(5,7);

        Assertions.assertAll(
                () -> Assertions.assertEquals(5, calc.a),
                () -> Assertions.assertEquals(7, calc.b),
                () -> Assertions.assertNotNull(calc.kali())
        );
    }
}
