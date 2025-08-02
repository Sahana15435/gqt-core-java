package com.gqt_core_java.pattern;

import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int n = sc.nextInt();

        for (int i = 0; i <=n; i++) {
        	int k=1;
        	
            // Print dashes
            for (int j = 0; j <=i; j++) {
                System.out.print(k+"");
                k=1-k;
            }
            
            System.out.println();
        }

        sc.close();
    }
}