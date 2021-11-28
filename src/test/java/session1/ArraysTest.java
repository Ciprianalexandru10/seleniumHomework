package session1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraysTest {

    @Test
    public  void simpleArray(){

        String[] numbers0123 = {"zero","one","two","three"};

        assertEquals("zero", numbers0123[0]);

    }

    String[] workdays = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

    @Test
    public  void  iterateWithForEach(){
        String days = "";
        for(String workday : workdays){
            days = days + "|" + workday;
        }
        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);
    }

    @Test
    public  void iterateWithFor(){
        String  days = "";
        for (int i = 0;i<5;i++){
            days = days +"|"+workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);

    }

    @Test
    public  void  iterateWithBreak() {
        String days = "";

        for (int i = 0; i < 5; i++) {
            days = days + "|" + workdays[i];
            if (i == 2) {
                break;
            }

        }
        assertEquals("|Monday|Tuesday|Wednesday", days);
    }
}
