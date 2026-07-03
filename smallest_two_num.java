package pratice;

import java.util.Scanner;

public class pd27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num_1:");
        int num1=sc.nextInt();
        System.out.println("enter a num_2");
        int num2=sc.nextInt();
        if(num1<num2){
            System.out.println("num1 is smallest");
            
        }else if(num2<num1){
            System.out.println("num2 is smallest");
        }
        else{
            System.out.println("both are equal");
        }
    }
    
}
