import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FonctionPolynomialeTest {


    @Test
    void applyFunction_test_should_return_positive_value_1() {

        int result =   FonctionPolynomiale.applyFunction("3x^2+4x+5" , 2);
        assertEquals(25,result);
    }

    @Test
    void applyFunction_test_should_return_positive_value_2() {

        int result =   FonctionPolynomiale.applyFunction("8x^2+x+1" , 4);
        assertEquals(133,result);
    }


    @Test
    void applyFunction_test_should_return_positive_value_3() {

        int result =   FonctionPolynomiale.applyFunction("5x^2-8" , 10);
        assertEquals(14196,result);
    }

    @Test
    void applyFunction_test_should_return_positive_value() {

        int result =   FonctionPolynomiale.applyFunction("1x^2" , 10);
        assertEquals(100,result);
    }

    @Test
    void applyFunction_test_should_return_negative_value() {

        int result =   FonctionPolynomiale.applyFunction("-48x^2-27x+12" , 10);
        assertEquals(14196,result);
    }

    @Test
    void applyFunction_test_should_return_constant() {

        int result =   FonctionPolynomiale.applyFunction("4" , 10);
        assertEquals(14196,result);
    }





}
