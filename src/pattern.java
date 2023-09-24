import java.util.*;
public class pattern {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;

        int row = 1;
        while (row <= n) {
            int val = 1;
            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print(val+"\t");
                if (i <= nst / 2) {

                    val++;

                } else {
                    val--;

                }}
                System.out.println();
                nsp = nsp - 1;
                nst = nst + 2;
                row = row + 1;

        }}
    }
//        int nr =2*n;
//        int nst=1;
//        int nsp=2*n-2;
//        int row=1;
//        while(row<=nr){
//            for (int i=1;i<=nst;i++){
//                System.out.print("*");
//            }
//            for (int i=1;i<=nsp;i++){
//                System.out.print(" ");
//            }
//            for(int i=1;i<=nst;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//            if(row<nr/2){
//                nst=nst+1;nsp=nsp-2;
//            }
//            else if(row==nr/2)
//            {
//            }
//            else {
//                nst=nst-1;nsp=nsp+2;
//            }
//
//            row =row+1;
//
//        }
//        int nsp=n-1;
//        int nst=1;
//        int val=1;
//        int row=1;
//        while(row<=n){
//            for(int i=1;i<=nsp;i++){
//                System.out.print("\t");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print(val+"\t");
//                val+=1;
//            }
//            System.out.println();
////            val=val+1;
//            nsp=nsp-1;
//            nst=nst+2;
//            row=row+1;
//        }
//        int nsp=n-1;
//        int nst=1;
//        int val=1;
//        int row=1;
//        while(row<=n){
//            for(int i=1;i<=nsp;i++){
//                System.out.print("   ");
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print(" "+val+" ");
//            }
//            System.out.println();
//            val=val+1;
//            nsp=nsp-1;
//            nst=nst+2;
//            row=row+1;
//        }
//        1
//        2  2  2
//        3  3  3  3  3
//        4  4  4  4  4  4  4
//        5  5  5  5  5  5  5  5  5





        //        int nsp=n-1;
//        int nst=1;
//        int row=1;
//        while(row<=n){
//            for (int i=1;i<=nsp;i++){
//                System.out.print(" ");
//            }
//            for (int i=1;i<=nst;i++){
//                System.out.print("1");
//            }
//            System.out.println();
//            nsp=nsp-1;
//            nst=nst+2;
//            row=row+1;
//        }
//         1
//        111
//       11111
//      1111111
//     111111111


//        int nst=1;
//        int nsp=2*n-3;
//        int row=1;
////        while(row<=n){
//            for (int i=1;i<=nst;i++) {
//                System.out.print("*");
//            }
//            for (int j=1;j<=nsp;j++){
//                System.out.print(" ");
//            }
//            int c=1;
//            if(row==n){
//                c=2;
//            }
//            for (;c<=nst;c++){
//                System.out.print("*");
//            }
//            System.out.println();
//            nsp=nsp-2;
//            nst=nst+1;
//            row=row+1;
//
//        }
//*       *
//**     **
//***   ***
//**** ****
//*********

//        int s=n/2;
//        int r=1;
//        int i=1;
//        while (i<=n){
//      for (int j=1;j<=s;j++){
//          System.out.print(" ");
//      }
//      for (int j=1;j<=r;j++){
//          System.out.print("*");
//      }
//            System.out.println();
//      if (i<=n/2){
//          s=s-1;
//          r=r+2;
//      }
//      else{
//          s=s+1;
//          r=r-2;
//      }
//      i=i+1;
//        }


//        int s=1;
//        int i=1;
//        int r=n/2;
//        while(i<=n){
//
//        for(int j=1;j<=r;j++){
//            System.out.print("*");
//        }
//            for(int j=1;j<=s;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=r;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//            if (i<=n/2){
//                r=r-1;
//                s=s+2;
//            }
//            else{
//                r=r+1;
//                s=s-2;
//            }
//            i=i+1;
//        }



