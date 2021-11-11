package session1;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class AnnotationsTest {

    @Before
    public void testBefore() {
        System.out.println("Before Test");
    }

    @After
    public  void testAfter(){
        System.out.println("After Test");
    }

    @BeforeClass
    public static void testBeforeClass(){
        System.out.println("BeforeClass Test");
    }

    @AfterClass
    public static void testAfterClass(){
        System.out.println("AfterClass Test");
    }

    @Ignore
    public static void testIgnore() {
        System.out.println("Ingore Test");
    }

    @Test
    public void t () {}

}
