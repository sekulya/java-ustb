package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long assign = 1;
        for(int i = 1;i<n;i++){
            assign = assign * 2;
        }
        System.out.println(n*100000);
        System.out.println(assign/100);
    }
}


