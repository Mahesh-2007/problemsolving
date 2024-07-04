//W3resource //
import java.util.*;

public class problems50{
    public static void main(String[] args) {
        printN();
        ten();
        thirteen();
        fifteen();
        NUMBERS();
        sixteen();
        seventeen();
        Yearleap();
        length();
        forteen();
        one();
        two();
        three();
        four();
        five();
        rem();
        six();
        seven();
        eight();
        nine();
        eleven();
        twelve();
        A();

}
public static void A(){

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a<b){
        System.out.println("A is begger than B");
    }else{
        System.out.println("B is begger than A");
    }
}
public static void printN(){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    System.out.println(N*(N-1)/2);
}
public static void length(){
    String A  = new Scanner(System.in).next();
    System.out.println(A.length());
}
   public static void rem() {
    int a,b; 
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE 1st NUMBER TO FIND REM : ");
    a = sc.nextInt();
    System.out.println("ENTER THE 2nd NUMBER TO FIND REM : ");
    b = sc.nextInt();
    System.out.println(a%b);
   }
    public static void one(){
       Scanner sc = new Scanner(System.in);
       System.out.println("ENTER WORD");
       String a = sc.nextLine();
        System.out.println("Hello !");
        System.out.println(a);
    }
    public static void two(){
     int a , b ;
     a = 10;
     b = 20;
     System.out.println(a+b);
    }
    public static void three(){
    int a , b;
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUMBER : ");
    a = sc.nextInt();
    System.out.println("ENTER THE SECOND NUMBER : ");
    b = sc.nextInt();
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
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt(); 
        System.out.println("add"+ a+b);
        System.out.println(a-b + " sub ");
        System.out.println("module" + a%b);
    }
    public static void seven() {
        //get a input and print the tables
        
        int a = new Scanner(System.in).nextInt();
        
        System.out.println("ENTER WHICH TABLES YOU WANT :");
        int b = new Scanner(System.in).nextInt();
        System.out.println("ENTER HOW MANY TIMES YOU WANT :");
        for(int i = 1;i<=b;i++)
        {
            System.out.println(a + " x "+ i +" = " + a*i);
        }
    }
    public static void eight(){
        //find area and primeter
        double width , height;
        Scanner sc = new Scanner(System.in);
        width = sc.next();
        height = sc.next();
        System.out.println("AREA = WIDTH : "+ width + " X HEIGHT : " + height +" = "+   width*height);
        System.out.println("perimeter : "+ 2*(height+width));
    }
public static void nine(){
       int a ;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
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
public static void eleven(){
for(int i=1;i<=5;i++){
    for(int j=1;j<=5;j++){
        System.out.print(i*j+" ");
} 
System.out.println();}
}
public static void twelve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print("enter num to check odd or even: ");
        if(n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
}
public static void thirteen(){
      boolean vowels = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character(Not a words or Number) : ");
        char ch=sc.next().charAt(0);

        switch (ch){
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                vowels=true;
        }
        if(vowels==true){
            System.out.println(ch + " is a vowels.");
        }else {
            System.out.println(ch + " is a consonant.");
 
        }
}
public static void Yearleap() {
    int year;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter any Year:");
    year = scan.nextInt();

    boolean isLeap = false;

    if(year % 4 ==0){
        if(year % 100 ==0){
            if (year % 400 == 0) {
            }else {
                isLeap =false;
            }
            }else {
            isLeap = true;}
        }else {isLeap = false;}

    if(isLeap == true){
        System.out.println(year + " is a Leap Year.");
    }else {
        System.out.println(year + " is a Not Leap Year.");
    }

    }

 public static void seventeen() {
        int a,b,sum;
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the First number (MULTIPLY) : ");
        a = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter the Second number (MULTIPLY) : ");
        b = num2.nextInt();
        sum = a * b;
        System.out.println("The answer is : " + sum);
    }
    public static void forteen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE WORD : ");
        String str = sc.nextLine();

        int vcount = 0, ccount = 0;


        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                ccount++;
            }
        }
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);

    }
              public static void fifteen(){
                   int N ;
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        N = sc.nextInt();
        if (N % 2 != 0 ){

        System.out.println(" PRIME NUMBER ");


    }else {
            System.out.println("NOT A PRIME NUMBER (Except 2) ");
        }

    }
    public static void NUMBERS(){
        int a = new Scanner(System.in).nextInt();
        for(int i=1;i<=a;i++){
            System.out.println(i);
        }
    }
  public static void sixteen(){

double a , b , ans;
 Scanner sc = new Scanner(System.in);
 a = sc.next();
 b = sc.next(); 
ans = a + b;
        System.out.println(ans);
    }
}
              
