
package function;
import java.util.*;
public class arraymore {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr1 = takinginput();
//        int[] arr2 = takinginput();
//        duplicacies(array);
//
//        merge(arr1,arr2);
//        display(arr1);
      int[] b= inverse(arr1);
        display(b);
    }

    //     public static int [] takinginput();
    public static int[] takinginput() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void duplicacies(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (int no : hs)
            System.out.print(no + " ");
    }
    public static void display(int[] arr ){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void

    public static int[] inverse (int [] arr){
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int v= arr[i];
            if (v >= 0 && v < arr.length) {
                temp[v] = i;
            } else {
                System.out.println("Value " + v + " is out of range.");
            }
        }
        return temp;
        }





    public static void merge(int[] arr1,int [] arr2){
        int clen=arr1.length+arr2.length;
        int[] arrc=new int[clen];
//        for(int i=0;i<arr1.length+arr2.length;i++){
            for(int j=0;j< arr1.length;j++){
                arrc[j]=arr1[j];
            }
            for(int k=0;k< arr2.length;k++){
                arrc[arr1.length+k]=arr2[k];
            }
//        }
        for(int i=0;i<clen;i++){
            System.out.println(arrc[i]);
        }
    }


    public static void leftrotation(int[] arr) {
        int k=sc.nextInt();
        k=k%arr.length;
        for(int i =0;i<k;i++){
            int temp= arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1]=arr[j];
            }
            arr[arr.length-1]=temp;

        }





//    public static void rightrotation(int[] arr) {
//        int k=sc.nextInt();
//        k=k%arr.length;
//        for(int i =0;i<k;i++){
//            int temp= arr[arr.length-1];
//            for(int j=arr.length-2;j>=0;j--){
//                arr[j+1]=arr[j];
//            }
//            arr[0]=temp;
//
//        }

    }
}