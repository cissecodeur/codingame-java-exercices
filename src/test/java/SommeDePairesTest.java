import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SommeDePairesTest {

    @Test
    void findSumPair_test_should_return_empty_array() {

        int[] result = SommeDepaires.findSumPair(new int[] {1,2,3} ,13);
        assertArrayEquals(new int[]{0,0},result);
    }


    @Test
    void computeMultiplesSum_test_should_return_Sum() {

        int result =   ComputeMultiplesSum.computeMultiplesSum(100);
        assertEquals(2738,result);
    }




}
