import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindSmallestIntervalTest {

    @Test
    void findSmallestInterval_test_should_return_exception() {

        int result = FindSmallestInterval.findSmallestInterval(new int[] {1});
        assertEquals(0,result);
    }


    @Test
    void findSmallestInterva_test_should_return_smallest_value() {

        int result =   FindSmallestInterval.findSmallestInterval(new int[] {1,2,3});
        assertEquals(1,result);
    }




}
