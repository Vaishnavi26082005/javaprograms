import java.util.Scanner;

public class cwh_literal{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter byte Number: ");
//        byte a = sc.nextByte();
//        System.out.println("Number is : " + a);
        int n= sc.nextInt();
            for (int i=0;i<n;i++){
                for (int j=1;j<=i;j++){
                    System.out.print(" ");
                }
                for (int k=1;k<=n-i;k++){
                    System.out.print("*");
                }    System.out.println();
            }

        }}

//        int m= sc.nextInt();
//
////while(n%m!=0){
////    int d=n%m;
////    n=m;
////    m=d;
////
////        }
////        System.out.println(m);
////
////        for (int i=0;i<=n;i++){
////            for (int j=n;j>=0;j--){
////                System.out.print("*");
////            }
////            System.out.println();}
//int a=n-1;
//int c=1;
//int row=1;
//while (row<=n){
//    int b=1;
//
//    while (b<=a){
//        System.out.print("");
//    }
//    while (b<=c){
//        System.out.print("*");
//    }
//    a=a-1;
//    c=c+1;
//}
//        System.out.println();
//    }

