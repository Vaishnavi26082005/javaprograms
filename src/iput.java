import java.util.*;
public class iput {
    public static void main(String [] args)
    {
     Scanner sc= new Scanner (System.in);
        System.out.println("enter marks in maths");
      int a = sc.nextInt();
        System.out.println("enter marks in physic ");
      int b = sc.nextInt();
        System.out.println("enter marks in chemistry");
      int c = sc.nextInt();
      int avg= (a+b+c)/3;
      if (avg>40&& a>=33 && b>=33 && c>33) {
          System.out.println("congrats");
      }else{
          System.out.println("sorry bro");

      }

////       int d = sc.nextInt();
////        int e = sc.nextInt();
////        int sum = a+b+c+d+e;
////        System.out.println(sum);
////        int percentage= sum /5;
////        System.out.println(percentage+"%");



    }
}
