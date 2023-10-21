import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeDanseurTest {


  @Test
  @DisplayName("This test should return the dancer last position")
   void  should_return_dancer_last_position () {
    int result1 = LeDanseur.getPositionAt(3);
    int result2 = LeDanseur.getPositionAt(100000);
   // int result3 = LeDanseur.getPositionAt(2147483647);

    assertEquals(-4,result1,"incorrect The expected result is -4");
    assertEquals(-5,result2,"incorrect The expected result is -5");
    //assertEquals(1,result3,"incorrect The expected result is 1");

  }

}
