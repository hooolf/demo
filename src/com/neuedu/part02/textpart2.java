package com.neuedu.part02;
/**
 *java运算符
 *算术运算符
 *         +，-，*，/，%取余（被除数为证就为正） 
 *         ++自增，--自减， ++变量（先加后用），变量++（先用后加）
 *         +字符串连接	当操作数中只要有一个是String类型，系统会自动将另一个操作数转换成字符串类型，然后进行连接
 *         复制运算符 ：+= ，-=
 *         关系运算符：>,>=,<,<=,==,!= 关系运算结果是布尔型
 *         逻辑运算，针对两个布尔型的数进行的布尔运算
 *         &&逻辑与同真则真，有假则假
 *         ||逻辑或 有真则真
 *         
 *         
 */  
public class textpart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(-5%-2);
		int i=0;
		//扩展：i++ 是否是线程安全的？
		System.out.println(i++ + ++i);//变量在表达式运算过程中也会受影响
		
		int x1 = 3, y1 = 5;
	    int x2 = 3, y2 = 5;
	    int r1, r2;
	    r1 = x1++ + x1*y1;
	    r2 = ++x2 + x2*y2;
	    System.out.println("x1="+x1+" y1="+y1+" r1="+r1);
	    System.out.println("x2="+x2+" y2="+y2+" r2="+r2);
		
		System.out.println(5.0/2);
		x1=x1+3;//与    x1+=3;相等
		
		
	}

}
