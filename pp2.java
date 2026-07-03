package pratice;


import java.util.Scanner;

public class pp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n_1=sc.nextInt();
        int n_2=sc.nextInt();
        sc.nextLine();
        String oper=sc.nextLine();
        System.out.println("addition"+(n_1 + n_2));
        System.out.println("subrac"+(n_1 - n_2));
        System.out.println("multiplication"+(n_1 * n_2));
        System.out.println("operation" +oper);

    }
}    

