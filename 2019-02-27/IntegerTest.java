import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class IntegerTest{
    public static void main(String[] args) {
        short a = 203;
        System.out.println(a);

        long b = 1000000L;  // 定义long需要在数字后面加一个L，如果不加，则会发生int-> long的强制转换
        System.out.println(b);  // 输出1000000
    }
}