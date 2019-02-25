import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Car{
    int speed;
    public void speedDown(){
        if(speed>0)
            speed--;
    }
    public void speedUp(){
        speed++;
    }
    public void showSpeed(){
        System.out.print(speed);
    }
}