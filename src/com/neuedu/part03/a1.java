package com.neuedu.part03;

import java.util.Scanner;

/**
 * String.valuOf���ַ���
 * 
 * �ɱ��ַ���
 * StringBuffer��StringBuider
 * append(xxx)ƴ�ӵ��ַ�������
 * insert()
 * deleteCharAtɾ��ָ��λ���ַ���
 * 
 * 
 * ����StringBuffer ��StringBuider����
 * StringBuffer�̰߳�ȫ �ٶȽ���
 * StringBuider�̲߳���ȫ �ٶȽϿ�
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
