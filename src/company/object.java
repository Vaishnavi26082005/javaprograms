package company;
// class Student {
//
//    String name;
//    int age;
//    float cpi;
//
//}
//
//public class object{
//
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        s1.age = 22;
//        s1.name = "Abhishek";
//        s1.cpi = 9.0f;
//
//        System.out.println("name: "+s1.name);
//        System.out.println("age: "+s1.age);
//        System.out.println("cpi: "+s1.cpi);
//
//    }
//
//}

//class cellphone{
//     public void calling(){
//         System.out.println("calling lappu");
//     }
//    public void ringing(){
//        System.out.println("ringing lappu");
//    }
//    public void vibrate(){
//        System.out.println("vibrate lappu");
//    }
//
//}
//public class object {
//    public static void main(String[] args) {
//        cellphone redmi = new cellphone();
//        redmi.vibrate();
//        redmi.ringing();
//        redmi.calling();
//
//
//    }
//}
//class rectangle{
//    int length;
//    int breadth ;
//    public int area(){
//        return length*breadth;
//    }
//    public int perimeter(){
//        return 2*(length+breadth);
//    }
//}
//class tommy{
//    public void firing(){
//        System.out.println("firing the enemy");
//    }
//    public void running(){
//        System.out.println("running to enemy");
//
//}}
//public class object {
//    public static void main(String[] args) {
////        rectangle billu = new rectangle();
////        billu.length=2;
////        billu.breadth=4;
////        System.out.println(billu.area());
////        System.out.println(billu.perimeter());
//tommy doggy= new tommy();
//doggy.firing();
//doggy.running();
//
//    }
//}
// class Customer {
//    byte varByte;
//    short varShort;
//    int varInt;
//    long varLong;
//    float varFloat;
//    double varDouble;
//    char varChar;
//    boolean varBoolean;
//    String varString;
//}
//
//public class object {
//    public static void main(String[] args) {
//        Customer c1 = new Customer();
//        System.out.println("byte : " + c1.varByte);
//        System.out.println("short : " + c1.varShort);
//        System.out.println("int : " + c1.varInt);
//        System.out.println("long : " + c1.varLong);
//        System.out.println("float : " + c1.varFloat);
//        System.out.println("double : " + c1.varDouble);
//        System.out.println("char : " + c1.varChar);
//        System.out.println("boolean : " + c1.varBoolean);
//        System.out.println("String : " + c1.varString);
//    }
//
//
//
//class Employee {
//
//    String empName;
//    String empId;
//
//}
//
//public class object{
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Employee();
//        System.out.println(e1);
//
//    }
//}
//class Employee {
//
//    String empName;
//    String empId;
//
//    public String toString(){
//        return empName + " " + empId;
//    }
//
//}
//
//public class object {
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Employee();
//        System.out.println(e1);
//
//    }
//}


// class Employee {
//
//    String empName;
//    String empId;
//
//    public String toString(){
//        return empName + " " + empId;
//    }
//
//}
//
//public class object {
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Employee();
//        e1.empName = "your name here";
//        e1.empId = "1001";
//        System.out.println(e1);
//
//    }
//}
//
//
//class Student{
//    static String collegeNmae;
//}
//
//public class object
//{
//
//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//        System.out.println(s1.collegeNmae);
//
//    }
//
//}
//public class object{
//
//    static float var_1 = 23.90f;   // static variable
//    double var_2 = 555.00;    // non static variable
//
//    public static void main(String[] args) {
//
//        System.out.println(var_1);  // 23.90
//        System.out.println(var_2); // error
//    }
//}

//class bank{
//    private double balance ;
//     void  deposit(double amount){
//         balance = balance+amount;
//
//     }
//    void    withdrawl(double amount){
//         if (balance>=amount){
//             balance=balance-amount;
//
//         }
//         else{
//             System.out.println("insufficient amount");
//         }
//
//    }
//
//    double getBalance() {
//        return balance;
//    }
//}
//public class object{
//    public static void main(String[]args){
//        bank b1=new bank();
//        bank b2= new bank();
//
//       b1.deposit(1000);
//       b2.withdrawl(100);
//        System.out.println(b1.getBalance());
//        System.out.println(b2.getBalance());
//
//
//    }
//}
//class product {
//    int id;
//    static int count;
//
//product() {
//    count++;
//    id++;
//}
//}
//public class object{
//    public static void main(String[]args){
////    product p1=new product();
////    product p2=new product();
////    product p3=new product();
////        System.out.println(p1.id+","+p1.count);
////        System.out.println(p2.id+","+p2.count);
//////        System.out.println(p3.id+","+p3.count)
////        product p1;
////        product p2;
////        product p3;
////        p1= new product();
////        System.out.println(p1.id+","+p1.count);
////        p2=new product();
////        System.out.println(p2.id+","+p2.count);
////
//    }
//}
import java.util.Scanner;



public class object {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int [n];
        for (int i=0; i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for (int i =0; i<n;i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);

    }
}
