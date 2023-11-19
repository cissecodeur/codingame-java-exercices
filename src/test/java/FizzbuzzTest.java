import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzbuzzTest {

    private Fizzbuzz fizzBuzz ;

    @BeforeEach
    void setUp(){
        fizzBuzz = new Fizzbuzz();
    }

    @Test
    public void shouldReturnOne(){
        Assertions.assertEquals("1",fizzBuzz.check(1));
    }

    @Test
    public void shouldReturnTwo(){
        Assertions.assertEquals("2",fizzBuzz.check(2));
    }

    @Test
    public void shouldReturnThree(){
        Assertions.assertEquals("Fizz",fizzBuzz.check(3));
    }

    @Test
    public void shouldReturnFive(){
        Assertions.assertEquals("Buzz",fizzBuzz.check(5));
    }

    @Test
    public void testAllElement(){
        for(int i=1;i < 100;i++){
           System.out.println(fizzBuzz.check(i));
        }
    }
}
