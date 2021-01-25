package com.neuedu.part03;

import java.util.Scanner;

/**
 * String.valuOf变字符串
 * 
 * 可变字符串
 * StringBuffer和StringBuider
 * append(xxx)拼接到字符串后面
 * insert()
 * deleteCharAt删除指定位置字符串
 * 
 * 
 * 面试StringBuffer 和StringBuider区别
 * StringBuffer线程安全 速度较慢
 * StringBuider线程不安全 速度较快
 * 
 *
 */

public class a1 {

	public static void main(String[] args) {
//		
//		StringBuffer stringBuffer=new StringBuffer("aaaa");
//		
//		System.out.println(stringBuffer);
//		
		Scanner scanner=new Scanner(System.in);
		
		StringBuffer stringBuffer2=new StringBuffer();
		for(int i=0;i<10;i++){
		String input =scanner.nextLine();
		stringBuffer2.append(input);
		}
		System.out.println(stringBuffer2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
