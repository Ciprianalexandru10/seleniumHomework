package session1;

import org.junit.Test;

import java.net.Inet4Address;

import static org.junit.Assert.assertEquals;

public class IntegersTest {
    @Test
    public void integersExempLes(){

        Integer four = new Integer(4);

        assertEquals("intValue returns 4" ,4 ,four.intValue());

        Integer five = new Integer("5");
        assertEquals("intValue returns int 5" ,5 ,five.intValue());

        Integer six =6;
        assertEquals("intValue returns int 6" ,6 ,six.intValue());
    }

    public void chechMinMax (){

        assertEquals(214836672,Integer.MAX_VALUE);
        assertEquals(-24836672,Integer.MIN_VALUE);

    }

}
