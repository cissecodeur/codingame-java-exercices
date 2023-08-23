import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassificationDePaquetsRobotiseesTest {

    @Test
    void solve_test_should_return_error() {

        String result = ClassificationDePaquetsRobotisees.solve(300,400,500,25);
        assertEquals("Les dimensions doivent etre entre 20 et 200 cm",result);
    }


    @Test
    void solve_test_should_return_rejected() {
        String result =  ClassificationDePaquetsRobotisees.solve(100,150,186,25);
        assertEquals("REJECTED",result);
    }

    @Test
    void solve_test_should_return_special() {

        String result =  ClassificationDePaquetsRobotisees.solve(21,25,25,25);
        assertEquals("SPECIAL",result);
    }

    @Test
    void solve_test_should_return_standard() {

        String result =  ClassificationDePaquetsRobotisees.solve(21,25,25,15);
        assertEquals("STANDARD",result);
    }





}
