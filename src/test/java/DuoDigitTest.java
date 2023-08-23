import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuoDigitTest {


    @Test
    void duo_digit_should_return_true() {
        String result =   DuoDigit.isDuoDigit(112);
        assertEquals("y",result);
    }

    @Test
    void duo_digit_should_return_false() {
        String result =   DuoDigit.isDuoDigit(102);
        assertEquals("n",result);
    }


}
