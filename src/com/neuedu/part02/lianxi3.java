package com.neuedu.part02;

import java.util.Scanner;

public class lianxi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
		System.out.println("������a��");
		int a = sc.nextInt();
		System.out.println("������b��");
		int b = sc.nextInt();
		System.out.println(""+a+""+b);
		int c;
		c=b;
		b=a;
		a=c;
	    System.out.println(""+a+""+b);
		

	}
       
}
