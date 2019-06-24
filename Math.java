package Assignment1;

import java.util.Scanner;

public class Math {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Hcf is :"+hcf(a,b));
	System.out.println("Lcm is :"+Lcm(a,b));
}

private static int Lcm(int a, int b) {
	
	return (a*b)/hcf(a,b);
}

private static int hcf(int a, int b) {
	if(a==0) {
	return a;
	}
	if(b==0) {
		return b;
	}
	if(a==b) {
	return a;
	}
	if(a>b) {
		return hcf(a-b,b);
	}
	return hcf(a,b-a);
}
}
