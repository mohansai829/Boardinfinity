package Assignment1;

import java.util.Scanner;

public class Fibonaciseries {
public static void main(String[] args) {
	System.out.println("Enter a number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Fibonaci(n-2);
}

private static void Fibonaci(int n) {
	int a=0,b=1,c=0;
	System.out.println(0);
	System.out.println(1);
	while(n>0) {
	c=a+b;
	a=b;
	b=c;
	System.out.println(c);
	n--;
	}
	}
}
