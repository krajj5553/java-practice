import java.util.Scanner;

import java.util.*;

public class Variables {
    public static void main(String[] args) {
        int a=10,p;
        int b=20,q,c,r;
        c=a+b;
        System.out.println("the value of c="+c);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter p value:  ");
        p = sc.nextInt();
        System.out.println("enter q value:  ");
        q = sc.nextInt();
        r = p+q;
        System.out.println("the value of r="+r);
    }
}
