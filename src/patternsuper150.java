import java.util.*;
public class patternsuper150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int row = 1;
        int nst = 1;
        int nsp = n - 1;
        int nstt = 1;
//        int nr = n;
        int val = 1;
        while (row <= n) {
            for (int i = 1; i <= nsp; i++) {
                System.out.print(" ");
            }
            if (row <= n/2+1) {
                val = row;
            } else {
                val = n - row+1;
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print(val);
                val--;
            }
            for (int i = 2; i <= nstt; i++) {
                System.out.print(" ");
            }
            if(row==1||row==n){

            }
            else {
                val++;
                for (int i = 1; i <= nst; i++) {

                    System.out.print(val);
                    val++;

                }
            }

            System.out.println();
            if (row <= n / 2) {
                nsp = nsp - 2;
                nst = nst + 1;
                nstt = nstt + 2;
            } else {
                nsp = nsp + 2;
                nst = nst - 1;
                nstt = nstt - 2;
            }
            row = row + 1;


        }
    }
}






