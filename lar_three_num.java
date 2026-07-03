package pratice;

import java.util.Scanner;

public class pd23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter A number:");
        int a=sc.nextInt();
        System.out.println("enter B number:");
        int b=sc.nextInt();
        System.out.println("enter C number:");
        int c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println("a is greater:"+a);
        }else if(b>=a&&b>=c){
            System.out.println("b is greater:"+b);
        }
        else{
            System.out.println("c is greater:"+c);
        }
    }    
}
