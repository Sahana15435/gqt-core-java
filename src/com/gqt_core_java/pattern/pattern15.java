package com.gqt_core_java.pattern;
import java.util.Scanner;
public class pattern15 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of units");
int n=sc.nextInt();
for(int i=1; i<=5; i++) {
for(int j=1; j<=i; j++) {
System.out.print(i+" ");
}
System.out.println();
}

}
}


