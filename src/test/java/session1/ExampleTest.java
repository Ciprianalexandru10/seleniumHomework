package session1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    public static String catOrCats (int input) {
        return input != 1 ?  "cats" : "cat";
    }

    @Test
    public void exempleCheck () {
        Example newObj = new Example(2);

        assertEquals("public constant", newObj.publicConstant, 123456);
        assertEquals("publicField", newObj.publicField, 54);
        assertEquals("protectedField", newObj.protectedField, 5);
        assertEquals("privateField", newObj.getField(), 10);
        assertEquals("noAccessModifier", newObj.noAccessModifier, 99);
        assertEquals("publicInstance", Example.publicInstance, 546);
        assertEquals("getStaticInstance", Example.getStaticInstance(), 5);
    }


    @Test
    public void checkCats () {
        assertEquals(catOrCats(1), "cat");

    }

    @Test
    public void checkString () {
        String test = "hello";

        assertEquals("compareTo", test.compareTo("Hello"), 32);
        assertEquals("length", test.length(), 5);
        assertEquals("compareToIgnoreCase", test.compareToIgnoreCase("Hello"), 0);
        assertFalse("contains z", test.contains("z"));
        assertFalse("contains He", test.contains("He"));
        assertEquals("ignoreCase", test.equalsIgnoreCase("hello"), true);
        assertEquals("endsWith" ,test.endsWith("lo"), true);
        assertTrue("startsWith", test.startsWith("he"));
        assertFalse("isEmpty", test.isEmpty());
        assertEquals("indexOf" ,test.indexOf("l"), 2);
        assertEquals("lastIndexOf" ,test.lastIndexOf("l"), 3);
        assertEquals("toUpperCase" ,test.toUpperCase(), "HELLO");
        assertEquals("toLowerCase" ,test.toLowerCase(), "hello");

    }
}
