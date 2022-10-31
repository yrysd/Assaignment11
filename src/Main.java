import java.util.Enumeration;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
   public static void main(String[] args){


       Triangle triangle = new Triangle();
       triangle.a = 4;
       triangle.b = 7;
       triangle.c = 3;


       System.out.println(triangle.a+"\n"+triangle.b+"\n"+triangle.c+"\n");
       triangle.area();






    }
}