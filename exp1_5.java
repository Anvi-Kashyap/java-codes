Q5.  WAP to print all the default values and size (in bytes) of different primitive datatypes 
in java. 

public class exp1_5 {
    static byte bytevar;
    static short shortvar;
    static int intvar;
    static long longvar;
    static float floatvar;
    static double doublevar;
    static char charvar;
    static boolean booleanvar;
    public static void main(String[] args) {
        System.out.println("Default values and sizes of primitive datatypes:");
        System.out.println("byte: Default= "+ bytevar +", Size=" + Byte.BYTES + "bytes");
        System.out.println("short: Default= "+ shortvar +", Size=" + Short.BYTES + "bytes");
        System.out.println("int: Default= "+ intvar +", Size=" + Integer.BYTES + "bytes");
        System.out.println("long: Default= "+ longvar +", Size=" + Long.BYTES + "bytes");
        System.out.println("float: Default= "+ floatvar +", Size=" + Float.BYTES + "bytes");
        System.out.println("double: Default= "+ doublevar +", Size=" + Double.BYTES + "bytes");
        System.out.println("char: Default= "+ charvar +", Size=" + Character.BYTES + "bytes");
        System.out.println("boolean: Default= "+ booleanvar +", Size=JVM Department");
    }
}