import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

public class Manufacturer{
    public static void main(String[] args) {
        Wheel a = new Wheel();
        Engine b = new Engine();
        Frame c = new Frame();
        assemble();
    }

    public static void assemble() {
        System.out.println("An automobile has been assembled");
    }
}