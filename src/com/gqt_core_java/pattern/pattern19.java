package com.gqt_core_java.pattern;

import java.util.Scanner;

public class pattern19 {

public static void main(String[] args) {
// TODO Auto-generated method stub
// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.print("enter the count: ");
int n=sc.nextInt();
int num=1;
for(int i=n;i>=1;i--)
			{
for(int j=n;j>=1;j--)
				{
System.out.print(num+"\t");
num++;
				}
n--;
				
System.out.println();
			}
sc.close();
	}

}
