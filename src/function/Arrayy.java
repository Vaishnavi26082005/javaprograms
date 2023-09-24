package function;
import java.util.*;
public class Arrayy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = takinginput();
//        String[] array = takinginputt();
//        System.out.println(maxinarray(array));
//        System.out.println(linearsearch(array));
//        System.out.println(binarysearch(array));
//        bubblesort(array);
//        selectionsort(array);
//        insert(array);
//        delete(array);
//        duplicate(array);
//        duplicatesorted(array);
//        stringshortbybs(array);
//        insertionsorty(array);
//          display(array);
//        Stringsortinsertion(array);
//        display(array);
    }

    public static int[] takinginput() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static String[] takinginputt(){
        int n =sc.nextInt();
        String[] arr= new String[n];
        for (int i=0;i<arr.length;i++){
            arr[i]= sc.next();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int maxinarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int linearsearch(int[] arr) {
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }


    public static int binarysearch(int[] arr) {
        int item = sc.nextInt();
        int hi = arr.length - 1;
        int lo = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < item) {
                lo = mid + 1;
            } else if (arr[mid] > item) {
                hi = hi - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    public static void selectionsort(int[] arr) {
        for (int c = 0; c < arr.length - 1; c++) {
            int min = c;
            for (int j = c + 1; j < arr.length ; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[c];
            arr[c] = temp;
        }
    }


    public static void insertionsort(int [] arr){
        for(int c=1;c<arr.length;c++){
            int val=arr[c];
            int j=c-1;
            while(j>=0&&arr[j]>val){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }

    }
    public static void delete(int[] arr) {
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("not found");
        } else {
            System.out.println(" found");

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    public static void insert(int[] arr) {
        int n = sc.nextInt();
        int p = sc.nextInt();
        p = p - 1;
        for (int i = arr.length - 1; i > p; i--) {
            arr[i] = arr[i - 1];
        }
        arr[p] = n;


    }


    public static void duplicatesorted(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(temp[i] + " ");
        }
    }



    public static void stringshortbybs(String[] a){
        String temp;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
            if(a[j].compareTo(a[j+1])>0){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }

            }
        }
    }

    public static void duplicate(int[] arr) {
//        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length - 1];

        for (int i = 0; i < j+1; i++) {
            System.out.println(arr[i] + " ");
        }
    }


  public static void Stringsortinsertion(String[] arr){
        for(int  i=1;i<arr.length;i++){
          String val=arr[i];
            int j =i-1;
            while((j >= 0) && (arr[j].compareTo(val)>0)){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }

  }






    public static void bubblesort ( int[] arr){
        for (int counter = 0; counter < arr.length - 1; counter++) {
            for (int j = 0; j < arr.length - 1 - counter; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
}

