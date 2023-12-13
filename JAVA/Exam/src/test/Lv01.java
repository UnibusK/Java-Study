package test;

import java.util.Scanner;

public class Lv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        if(i%2==1||1<=n||n<=100) {
            System.out.println(n+" is odd");
        } else if (i%2==0||1<=n||n<=100) {
            System.out.println(n+" is even");
        }
    }
}