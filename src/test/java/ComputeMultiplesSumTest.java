import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputeMultiplesSumTest {

    @Test
    void computeMultiplesSum_test_should_return_zero() {

        int result =   ComputeMultiplesSum.computeMultiplesSum(0);
        assertEquals(0,result);
    }


    @Test
    void computeMultiplesSum_test_should_return_Sum() {

        int result =   ComputeMultiplesSum.computeMultiplesSum(100);
        assertEquals(2738,result);
    }




}
