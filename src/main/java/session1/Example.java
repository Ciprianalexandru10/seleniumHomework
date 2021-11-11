package session1;

public class Example {

    public final int publicConstant = 123456;
    public int publicField = 54;
    protected int protectedField = 5;
    private int privateField = 10;
    public static int publicInstance = 546;
    private static int privateInstance = 5;
    int noAccessModifier = 99 ;

    public Example(int field) {
//        this.privateField = field;
    }

    public int getField() { return privateField; }

    public static int getStaticInstance() { return privateInstance; }


}
