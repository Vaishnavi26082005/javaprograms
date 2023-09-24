import java.util.*;
public class arrayyyy {
    static Scanner sc  = new Scanner (System.in);
    public static void main (String [] args){
//         int [] a= takinginput();



        // number closest to 0
//        int [] a={1,2,3,4,5};
//        int sum= Integer.MAX_VALUE,x=0,y=0;
//        for(int i=0 ;i<a.length-1;i++ ){
//            for(int j= i+1;j<a.length;j++){
//                if (Math.abs(a[i]+a[j])<Math.abs(sum)){
//                    sum=a[i]+a[j];
//                    x=i;
//                    y= j;
//                }
//            }
//
//        }
//        System.out.println(sum);





    }

    public static int[] takinginput() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }







    public static void  combination(int [] arr){
        int count=0;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(i+""+j);
                count++;
            }
        }
        System.out.println(count);
    }
}
