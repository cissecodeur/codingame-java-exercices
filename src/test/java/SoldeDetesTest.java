import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoldeDetesTest {

    @Test
    void calculateTotalPrice_test_should_return_zero() {

        int result = SoldeDetes.calculateTotalPrice(new int[] {},10);
        assertEquals(0,result);
    }


    @Test
    void calculateTotalPrice_test_should_return_sum_with_discount() {

        int result = SoldeDetes.calculateTotalPrice(new int[] {10,20,100},10);
        assertEquals(0,result);
    }




}
