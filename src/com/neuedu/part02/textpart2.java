package com.neuedu.part02;
/**
 *java�����
 *���������
 *         +��-��*��/��%ȡ�ࣨ������Ϊ֤��Ϊ���� 
 *         ++������--�Լ��� ++�������ȼӺ��ã�������++�����ú�ӣ�
 *         +�ַ�������	����������ֻҪ��һ����String���ͣ�ϵͳ���Զ�����һ��������ת�����ַ������ͣ�Ȼ���������
 *         ��������� ��+= ��-=
 *         ��ϵ�������>,>=,<,<=,==,!= ��ϵ�������ǲ�����
 *         �߼����㣬������������͵������еĲ�������
 *         &&�߼���ͬ�����棬�м����
 *         ||�߼��� ��������
 *         
 *         
 */  
public class textpart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(-5%-2);
		int i=0;
		//��չ��i++ �Ƿ����̰߳�ȫ�ģ�
		System.out.println(i++ + ++i);//�����ڱ��ʽ���������Ҳ����Ӱ��
		
		int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++ + x1*y1;
	    r2 = ++x2 + x2*y2;
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
		
		System.out.println(5.0/2);
		x1=x1+3;//��    x1+=3;���
		
		
	}

}
