import java.util.*;
public class assignmetclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        int nst=n;
//        int row=1;
//        while(row<=n){
//            for(int i=1;i<=nst;i++){
//                System.out.print("*");
//            }
//            System.out.println();
//            nst=nst-1;
//            row=row+1;
//        }



//        int m =sc.nextInt();
//        int lcm=n>m?n:m;
//        while(true){
//            if(lcm%n==0&&lcm%m==0){
//                System.out.println(lcm);
//                break;
//            }
//            lcm=lcm+1;
//        }



        int n =sc.nextInt();
        int m= sc.nextInt();
        int t,p;
        t=n;
        p=n;
        while(t>0){
            int rem=t%10;
            p=p*rem;
            t=t/10;
        }
        if(p==m) {
            System.out.println(n + " is a seed of "+ m);
        }

        else{
            System.out.println(n + " is not a seed of "+ m);
        }




//        int n=sc.nextInt();
//        int t;
//        int sum=0;
//        t=n;
//        while(t>0){
//            int rem= t%10;
//            sum=sum+rem;
//            t=t/10;
//        }
//        if(n%sum==0){
//            System.out.println(n+" is divisible by sum of its digits");
//        }
//        else{
//            System.out.println(n+" is not divisible by sum of its digits");
//        }




//        int t,m;
//        t=n;
//        int sum=0;
//        while(t>0){
//            int rem= t%10;
//            sum=sum*10+rem;
//            t=t/10;
//        }
//        if(sum==n){
//            System.out.println(n+" is a palindrome");
//        }
//        else{
//            System.out.println(n+"is not a palindrome");
//        }



//        if(n%3==0&&n%5==0){
//            System.out.println("Zoom");
//        }
//        else if(n%3==0){
//            System.out.println("Zip");
//        }
//        else if(n%5==0){
//            System.out.println("Zap");
//        }
//        else{
//            System.out.println("invalid");
//        }

//        int accno=sc.nextInt();
//        int salary=sc.nextInt();
//        int accblc=sc.nextInt();
//        int ltype=sc.nextInt();
//        int lamtexpected=sc.nextInt();
//        int emisexpected=sc.nextInt();
//        char type=sc.next().charAt(0);
//        int quantity=sc.nextInt();
//        int dist=sc.nextInt();
//        int d=1;
//        int bill=0;
//        int fr=0;
//        int dr=0;
//        for(int i=1;i<=quantity;i++) {
//            if (type == 'V') {
//                fr += 12;
//            }
//            else{
//                fr+=15;
//        }}
//
//        for(int i=0;i<=dist;i++){
//            if(dist==0||dist==3){
//                dr=0;
//            }
//            else if(dist==6){
//                dr=1;
//            }
//            else{
//                dr=3;
//                dr=dr+2;
//            }}
//        bill=fr+dr;
//        System.out.println(bill);
        }
//        int a= sc.nextInt();
//        int b= sc.nextInt();
//        int c= sc.nextInt();
//        int p=1;
//        if (a == 7) {
//            p=b*c;
//            System.out.println(p);
//        }
//        else if(b==7){
//            p=c;
//            System.out.println(p);
//        }
//        else if(c==7){
//            p=-1;
//            System.out.println(p);
//        }
//        else{
//            p=a*b*c;
//            System.out.println(p);
//        }














//        double  a= sc.nextDouble();
//        double  b= sc.nextDouble();
//        double  c= sc.nextDouble();
//        double dsc= b*b-4*a*c;
//        double r1,r2;
//        if(dsc>0){
//            r1=(-b+dsc)/(2*a);
//            r2=(-b-dsc)/(2*a);
//            System.out.println(r1+" "+r2);
//        }
//        else if(dsc==0){
//            r1=-b/(2*a);
//            r2=-b/(2*a);
//            System.out.println(r1);
//        }
//        else{
//            System.out.println("The equation has no real roots");
//        }
    }

