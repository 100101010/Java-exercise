import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class a{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nFeet = in.nextInt();
        int x = nFeet/2, y = nFeet/4;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                if(i*2+j*4 == nFeet){
                    System.out.println("鸡："+i+"只 兔："+j+"只");
                }
            }
        }
        in.close();
    }
}