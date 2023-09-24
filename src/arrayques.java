import java.util.*;
public class arrayques {
//    public static int sumOfarray(int[] input){
//        int sum=0;
//        for(int i:input){
//            sum= sum+i;
//        }
//        return sum;
//    }
//
//    public static int largestelement(int[]input){
//        int max=Integer.MIN_VALUE;
//        for(int i :input){
//            if(max<i){
//                max=i;
//            }
//        }
//        return max;
//    }

//copy in 2nd array
//    public static void copyof(int[] src,int[] dest){
//        for(int i=0;i<src.length;i++){
//            dest[i]= src[i];
//        }
//
//    }
//
//    public static void print (int[] arr){
//        System.out.println();
//        for(int i:arr)
//        {
//            System.out.print(i+" ");
//        }
//    }
    public static void evenodd (int[] arr){
        int odd=0;
        int even =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }


    public static void reversearray(int[] arr){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main (String[] args){

        int [] a={1,2,3,4,5,};
        reversearray(a);
//        evenodd(a);
//        int [] b=new int [a.length];
//        print(a);
//        copyof(a,b);
//        print(b);
    }
}
