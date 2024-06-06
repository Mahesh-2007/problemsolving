//W3resource //
import java.util.*;

public class problems50{
    public static void main(String[] args) {
        ten();
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        
    }
    public static void one(){
       
        System.out.println("Hello");
        System.out.println("World");
    }
    public static void two(){
     int a , b ;
     a = 10;
     b = 20;
     System.out.println(a+b);
    }
    public static void three(){
    int a , b;
    a = 10;
    b = 2;
    System.out.println(a/b);
    }
    public static void four() {
        //multiple values
        System.out.println(-5+(8*6));
    }
    public static void five() {
        //muliply and show the multiply values
        int  a,b;
        a = 5;
        b = 10;
        System.out.println(a +"x"+b +"="+a*b);
    }
    public static void six(){
        // arithmetic operators
        int a = 5;
        int b = 10;
        System.out.println("add"+ a+b);
        System.out.println(a-b + " sub ");
        System.out.println("module" + a%b);
    }
    public static void seven() {
        //get a input and print the tables
        
        int a = new Scanner(System.in).nextInt();
        
        for(int i = 1;i<=10;i++)
        {
            System.out.println(a + " x "+ i +" = " + a*i);
        }
    }
    public static void eight(){
        //find area and primeter
        double width = 5.5;
        double height = 8.5;
        System.out.println("AREA = WIDTH : "+ width + " X HEIGHT : " + height +" = "+   width*height);
        System.out.println("perimeter : "+ 2*(height+width));
    }
public static void nine(){
       int a = 5;
       for(int i=1;i<=a;i++){
            for(int x=1;x<=i;x++){
                System.out.print("* ");
            }
            System.out.println();
       }



}
public static void ten(){
    int rows , columns;
    int N= 5;
    for (rows = 1; rows <= N; rows++) {
        for (columns = 1; columns <= N - rows +1; columns++) {

            System.out.print("  " + columns);
        }
        System.out.println();
        }   
}

}