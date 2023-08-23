import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressionBooleenneSimpleTest {

    @Test
    void a_should_return_true() {
        boolean result =   ExpressionBooleenneSimple.a(1, 5);
        assertEquals(true,result);
    }



}
