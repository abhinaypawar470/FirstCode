import java.util.Scanner;

public class Fibonaaci_Search{

    public static void main(String args[]){
        System.out.println("Enter the Number to check it is Fibonaaci No. or Not ???");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int fib0=0;
        int fib1=1;
        int fib;
        
        for(int i=0;i<=a;i++){
            fib=fib0+fib1;
            if (fib0==a||fib1==a||fib==a){
                System.out.println(a+" is a Fibonaaci No.!!!");
                break;
            }
            else{
            	if(i==a)
                System.out.println(a+" is Not a Fibonaaci No.!!!");
            }
            fib0=fib1;
            fib1=fib;
        }
    }
}