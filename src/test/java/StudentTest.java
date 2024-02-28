import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void testIsDoingMBKM() {
        Student student1 = new Student("Farhan",7,true);
        Student student2 = new Student("Nugroho", 4,false);

        Assertions.assertAll(
                () -> Assertions.assertTrue(student1.isDoingMBKM(), student1.getName() + "sedang melakukan MBKM"),
                () -> Assertions.assertFalse(student2.isDoingMBKM(),student2.getName() + "tidak sedang melakukan MBKM")
        );
    }
}
