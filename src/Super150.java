import java .util.*;
public class Super150 {
        public static int pow(int base,int p){
        int r=1;
        for (int i=0;i<p;i++){
            r=r*base;
        }

        return r;


    }
    public static void main(String[] args){
        // Your Code Here

//                Scanner scanner = new Scanner(System.in);
//                int n = scanner.nextInt();
//                int p=1;
//                int re=0;
//                while(n>0){
//                    int d=n%10;
//                    int m=pow(10,d-1);
//                    re=re+p*m;
//                    n=n/10;
//                    p++;
//                }
//                System.out.println(re);
        int aee[]={1,1,2,3,44,44,3,8,9};
        Arrays.sort(aee);
        

    }
}





//        clecius to fahrenheit
//        double minn=sc.nextDouble();
//        double maxx=sc.nextDouble();
//        double step=sc.nextDouble();
//        for(double i=minn;i<=maxx;i+=step){
//            double c=(5.0/9.0) *(i-32);
//            System.out.println((int)i + "\t" +(int)c);
//
//        }
//
//
//
//
//        que-fibonacci
//        int n= sc.nextInt();
//        int a=0;
//        int b=1;
//        int i=0;
//        while(i<n){
////          System.out.println(a);
//            int sum =a+b;
//            a=b;
//            b=sum;
//            i++;
//        }
//        System.out.println(a);
//
//
//
//
//
//        //ques-lcm
//        int m =sc.nextInt();
//        int lcm=n>m?n:m;
//        while(true){
//            if(lcm%n==0&&lcm%m==0){
//                System.out.println(lcm);
//                break;
//            }
//            lcm=lcm+1;
////        }
//
//        int sum=0;
//        int rem =0;
//
//        int pow2=1;
//        while(n>0){
//            rem=n%10;
//            sum=sum+rem*pow2;
//            n=n/10;
//
//            pow2*=2;
//
//
//        }
//        System.out.println(sum);
////
//
//
//ques-4 reverse number
//        while(n>0){
//rem=n%10;
//sum=sum*10+rem%10;
//n=n/10;
//
//        }
//        System.out.println(sum);
//
//
//        ques 2 freqyency of a number
//        int n = sc.nextInt();
//        int m =sc.nextInt();
//        int count =0;
//
//        for(int i=n;i>0;i=i/10){
//            int rem =i%10;
//            if(rem==m){
//                count++;
//            }
//
//        }
//        System.out.println(count);
//
//
//
////
////        question 1; print oddd position and even position;
////       int odd=0;
////        int even =0;
////        int copy =n;
////        int flag=0;
////        while(n>0){
////            int k=n%10;
////            if(flag%2==0)
////            even =even +k;
////            else odd=odd+k;
////            n=n/10;
////            flag++;
////        }System.out.println(even);
////        System.out.println(odd);
//



//