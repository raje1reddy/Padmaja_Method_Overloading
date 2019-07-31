import org.junit.Test;

import static org.junit.Assert.*;
import com.padmaja.inheritance.*;
public class ATest {

    @Test
    public void foo_padmaja() {

        A a = new A();
        int result = a.foo(5);
        int expResult = 10;
        assertEquals(expResult, result);
    }


    @Test
    public void foo_padmajachar() {
        A b = new A();
        char result = b.foo(20,30);
        char expResult = 'a';
        assertEquals(expResult, result);
    }
}