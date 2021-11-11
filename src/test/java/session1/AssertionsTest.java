package session1;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertionsTest {
    private String cars = "BMW";
    private String bikes = "BMW";

    @Test
    public void checkNull() {
        assertNull(null);
        assertNull(null);

        assertNotNull(this.cars);
        assertNotNull(this.bikes);

        assertSame(this.cars, "BMW");
        assertSame(this.bikes, "BMW");
//
        assertNotSame(this.cars,"BMW1");
        assertNotSame(this.bikes,"BMW1");
    }
}
