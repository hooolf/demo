package com.neuedu.part02;

/**
 * JDK java ��������
 * JRE java ���л���
 * �����������
 * ��{}ȷ������飨����죩�����п���д �������ͣ�����������������������
 *
 * 1.��ʶ��
 * ��ʶ������:����ĸ�����֣���Ԫ���ţ��»������
 * 		        ����ĸ�����֣���Ԫ���ţ��»�����ɣ����������ֿ�ͷ
 * 		        �����ǹؼ��ֻ��߱�����
 * 		        �����пո�
 * 		        ����û�����ƣ����˹�����
 * �淶:
 * ����ÿ�����ʵ�����ĸ��д��������ĸСд
 * ����ÿ�����ʶ�Сд
 * ������һ�����ʵ�����ĸСд��������������ĸ��д
 * �����ͷ���һ��
 * ���������鶼��д
 *
 * 2.���� ���ڳ������й�������ʱ���ܷ����仯��
 * ͬһ��������б����������ظ�
 * java���������ͷ�Ϊ�����ࣺ 1.������������ ��  
 * 							     �ַ���    char �ɵ��������� ֻ��д�����ַ�ռ�������ֽ�
 *                                  ����дUnicode�ַ����õ��ַ����� A 65
 *                                                           a 97
 *                                                           0 48
 *                                                    ת���ַ�
 *                                                          \b	��ʾһ���˸�
 *                                                          \t	��ʾһ��Tab�ո�
 *                                                          \n	��ʾ����
 *                                                          \r	��ʾ�س�
 *                                                          \\	��ʾб��
 *                                                          \'	��ʾ������
 *                                                          \"	��ʾ˫����
 *                                                          
 *                                                                
 * 							     ������    boolean ֻ����true��false�ж���ٶ�СдĬ��ֵ��false
 * 							     ��ֵ�ͣ����ͣ�byte,short,int,long��
 * 								   byte �ֽ��� 1�ֽ� -128~127
 * 								   short ������ 2�ֽ� -32768~32767
 *                                 int ����  4�ֽ�  -2147483648~2147483647
 *                                 long ������ 8�ֽ�  ����ʱ��Ҫ�ں���Ӹ�L  -2^63~2^63-1
 * 						               �����ͣ�float,double��
 * 								   float �����ȸ����� 4���ֽ�  ֵ��Ϊ-3.403E38 ~ 3.403E38  ����ʱ ��ֵ�ĺ����F
 * 								   double ˫���ȸ����� 8���ֽ� ֵ��Ϊ -1.798E308 ~ 1.798E308
 * 					  2.������������
 *3.����ת������ʾ����ת�����Զ���ʽ����ת��
 *��С��Χ��ֵת������Χ��ʱ���Զ�ת
 *����Χת����С��Χǿ��ת��
 *
 *
 *
 *
 */
public class Test2021010601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte i = 127;//
		System.out.println(i);
		i = 1;
		System.out.println(i);
		short j = 32767;
		
		int k = 2147483647;
		
		long l = 2147483648L;
		
		/*
		 * ������   ����0����1  ��2��1  ��0B����
		 * �˽���  ��0��ͷ ���� 
		 * ʮ������  ��0X��ͷ 1~9 A~F
		 */
		
		
		int two = 0B0001;
		//������ת��Ϊʮ���� ��Ȩ��   
		//�Զ�ת��Ϊʮ����
		System.out.println(two);
		//�˽���תʮ���� ��Ȩ�� 
		//ʮ���� ת �˽��� �̳�
		
		int eight = 0140;
		
		System.out.println(eight);
		
		//ʮ������
		int sixteen = 0X1F;
		System.out.println(sixteen);
		//�˽���ת���ɶ�����(ÿλ��3λ)
		//ʮ������ת���ɶ�����(ÿλ��4λ)
		
		float f = 10.0F;
		System.out.println(f);
		double d = 10.01;
		System.out.println(d);
		
		
		System.out.print(Integer.toBinaryString(10)); //ת��������
		System.out.print(Integer.toOctalString(16));//ת���˽���
		System.out.print(Integer.toHexString(100));//ת��ʮ������
		//�Զ���ȫ����ֵ ctrl+1(�����ڷֺź�)
		String hexString = Integer.toHexString(100);
		//������
		//�ַ���
		//ת���ַ�
		char c='a';
		char c1='A';
		System.out.print(c);
		System.out.print(c1);
		System.out.print('\n');
	    System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\����б����\\");
	    System.out.println("\'���ڵ�������\'");
	    System.out.println("��û�е�����");
	    System.out.println("\"����˫������\"");
	    System.out.println("��û��˫����");
	    
		int icl=c1;
		int ic=c;
		
	}
	

}
