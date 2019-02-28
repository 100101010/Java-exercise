import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class FactorialTest{
    public static void main(String[] args) {
        int a = 5;
        int b = factorial(a);
        System.out.print(b);
    }

    public static int factorial(int m){
        if(m>1)
            return m*factorial(m-1);
        else
            return 1;
    }
}