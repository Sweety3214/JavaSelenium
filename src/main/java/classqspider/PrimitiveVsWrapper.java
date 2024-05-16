package classqspider;

import java.util.List;

public class PrimitiveVsWrapper {

    private String memberVariable;
    private String instanceVariable;

    public static void main(String[] args) {

        //primitive -> int, float, char, double, long, byte, short ..... - predefined data types
        //wrapper -> Integer, Float, Long, Double, Character, Byte, Short - They are classes that encapsulate primitive types.
        //non-primitive -> all classes in java

        int a = 10; // Primitive Types: They represent basic data types like int, float, char, etc. They hold raw data values.
        Integer b = 10; // Wrapper Classes: They are classes that encapsulate primitive types.
        // For example, Integer wraps int, Float wraps float, Character wraps char, etc. They provide a way to treat primitive types as objects.


        //Null Values:
        // Primitive Types: They cannot hold null values. For instance, you can't assign null to an int or float variable.
        //Wrapper Classes: They can hold null values. Since they are objects, you can assign null to instances of wrapper classes.

        //int s = null; (Error)
        Integer s1 = null;


        // Usage in Collections:
        //Primitive Types: Java collections like ArrayList, HashMap, etc., cannot directly hold primitive types. They can only hold objects, so you would need wrapper classes when storing primitive types in collections.
        //Wrapper Classes: They are often used in collections to allow the storage of primitive types. For example, an ArrayList can hold Integer objects to represent integer values.

        // List<int> list; (Error)
        List<Integer> list2;


    }

}
