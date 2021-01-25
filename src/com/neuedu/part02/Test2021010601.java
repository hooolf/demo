package com.neuedu.part02;

/**
 * JDK java 开发环境
 * JRE java 运行环境
 * 变量和运算符
 * 由{}确定代码块（程序快），其中可以写 数据类型，变量，运算符，条件流语句
 *
 * 1.标识符
 * 标识符规则:由字母，数字，美元符号，下划线组成
 * 		        由字母，数字，美元符号，下划线组成，不能以数字开头
 * 		        不能是关键字或者保留字
 * 		        不能有空格
 * 		        长度没有限制（不宜过长）
 * 规范:
 * 类名每个单词的首字母大写，其他字母小写
 * 包名每个单词都小写
 * 方法第一个单词的首字母小写，其他单词首字母大写
 * 变量和方法一样
 * 常量名建议都大写
 *
 * 2.变量 ：在程序运行过程中随时可能发生变化的
 * 同一个代码块中变量名不能重复
 * java的数据类型分为两大类： 1.基本数据类型 ：  
 * 							     字符型    char 由单引号修饰 只能写单个字符占用两个字节
 *                                  可以写Unicode字符常用的字符编码 A 65
 *                                                           a 97
 *                                                           0 48
 *                                                    转义字符
 *                                                          \b	表示一次退格
 *                                                          \t	表示一个Tab空格
 *                                                          \n	表示换行
 *                                                          \r	表示回车
 *                                                          \\	表示斜杠
 *                                                          \'	表示单引号
 *                                                          \"	表示双引号
 *                                                          
 *                                                                
 * 							     布尔型    boolean 只含有true，false判断真假都小写默认值是false
 * 							     数值型：整型（byte,short,int,long）
 * 								   byte 字节型 1字节 -128~127
 * 								   short 短整型 2字节 -32768~32767
 *                                 int 整型  4字节  -2147483648~2147483647
 *                                 long 长整型 8字节  定义时需要在后面加个L  -2^63~2^63-1
 * 						               浮点型（float,double）
 * 								   float 单精度浮点型 4个字节  值域为-3.403E38 ~ 3.403E38  定义时 在值的后面加F
 * 								   double 双精度浮点型 8个字节 值域为 -1.798E308 ~ 1.798E308
 * 					  2.引用数据类型
 *3.类型转换，显示类型转换，自动隐式类型转换
 *当小范围赋值转换给大范围的时候自动转
 *当大范围转换给小范围强制转换
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
		 * 二进制   不是0就是1  满2进1  用0B定义
		 * 八进制  用0开头 定义 
		 * 十六进制  用0X开头 1~9 A~F
		 */
		
		
		int two = 0B0001;
		//二进制转换为十进制 加权法   
		//自动转换为十进制
		System.out.println(two);
		//八进制转十进制 加权法 
		//十进制 转 八进制 短除
		
		int eight = 0140;
		
		System.out.println(eight);
		
		//十六进制
		int sixteen = 0X1F;
		System.out.println(sixteen);
		//八进制转换成二进制(每位拆3位)
		//十六进制转换成二进制(每位拆4位)
		
		float f = 10.0F;
		System.out.println(f);
		double d = 10.01;
		System.out.println(d);
		
		
		System.out.print(Integer.toBinaryString(10)); //转换二进制
		System.out.print(Integer.toOctalString(16));//转换八进制
		System.out.print(Integer.toHexString(100));//转换十六进制
		//自动补全返回值 ctrl+1(光标放在分号后)
		String hexString = Integer.toHexString(100);
		//布尔型
		//字符型
		//转义字符
		char c='a';
		char c1='A';
		System.out.print(c);
		System.out.print(c1);
		System.out.print('\n');
	    System.out.println("escape\\bchar");
	    System.out.println("escape\\tchar");
	    System.out.println("escape\\rchar");
	    System.out.println("escape\\nchar");
	    System.out.println("\\我在斜线里\\");
	    System.out.println("\'我在单引号里\'");
	    System.out.println("我没有单引号");
	    System.out.println("\"我在双引号里\"");
	    System.out.println("我没有双引号");
	    
		int icl=c1;
		int ic=c;
		
	}
	

}
