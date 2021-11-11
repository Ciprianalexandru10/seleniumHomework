package session1;

import org.junit.Test;

import javax.management.StandardMBean;
import java.util.function.DoubleToLongFunction;

import static org.junit.Assert.*;

public class DataTypeTest {

    public  void booleanTest(){

        boolean truthy = true;
        boolean falsey =false;

        assertTrue(truthy);
        assertFalse(falsey);



        truthy = Boolean.TRUE;
        falsey =Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);
    }

    public void integerTest(){

        byte aByte;
        short aShort;
        int aInt;
        long aLong;


        System.out.println("Byte " + Byte.MIN_VALUE + " TO "+ Byte.MAX_VALUE);
        System.out.println("sHORT " + Short.MIN_VALUE + " TO "+ Short.MAX_VALUE);
        System.out.println("int " + Integer.MIN_VALUE + " TO "+ Integer.MAX_VALUE);
        System.out.println("Byte " + Long.MIN_VALUE + " TO "+ Long.MAX_VALUE);

    }

    public void floatingPointType (){

        float singlePrecision32 = 10.0F;
        double doublePrecision64 = 20.0;
        System.out.println("Float " + Float.MIN_VALUE + " TO "+ Float.MAX_VALUE);
        System.out.println("Double " + Double.MIN_VALUE + " TO "+ Double.MAX_VALUE);

        assertEquals(10F, singlePrecision32,0);
        assertEquals(20D, doublePrecision64,0);


    }

    public  void charType(){

        char aChar ='\u0026';
        assertEquals(aChar,'&');

        char anotherChar ='a';
        assertEquals('a', anotherChar);

        /*
        \t - tab
        \b -backslash
        \n - newline
        ..


         */


    }
    @Test
    public  void operatorsTest (){

        assertEquals(4,2+2);
        assertEquals(25.0F, 12.5F * 2F, 0);
        assertEquals(4, 8-4);
        assertEquals(30.20,120.8D /4D,0);
        assertEquals("abcd","ab"+"cd");
        assertEquals(1,9%2);



    }


}




