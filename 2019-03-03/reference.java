import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class reference{
    public static void main(String[] args) {
        int i = 10;
        int j = i;
        System.out.println("i = "+i+" j = "+j);
        j = 5;
        System.out.println("i = "+i+" j = "+j);

        objectTest obj1 = new objectTest();
        objectTest obj2 = new objectTest();
        System.out.println("obj1 = "+obj1.a+" obj2 = "+obj2.a);

        obj2 = obj1;
        obj2.a = 10;
        System.out.println("obj1 = "+obj1.a+" obj2 = "+obj2.a);
    }
}