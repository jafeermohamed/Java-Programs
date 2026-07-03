package pratice;

import java.util.Scanner;

public class pd21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("negative");
        }
        else if(num>0){
            System.out.println("pos");

        }
        else{
            System.out.println("zero");
        }
    }
    
}
