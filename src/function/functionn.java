package function;
import java.util.*;
public class functionn {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int snum=sc.nextInt();
        int sb=sc.nextInt();
       int res= decimaltobase(snum,sb);
        System.out.println(res);

    }
    public static int decimaltobase(int snum,int sb){
        int ans=0;
                int multiplier=1;
                while(snum!=0){
                    int rem=snum%5;
                     ans= ans+rem*multiplier;
                     multiplier=multiplier*sb;
                     snum=snum/5;
                }
                return ans;
    }
}