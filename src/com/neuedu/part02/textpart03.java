package com.neuedu.part02;

public class textpart03 {

	public static void main(String[] args) {
		/**
		 * 循环
		 * 1.while（表达式）{代码块}如果表达式结果为真就执行代码块
		 * 不满足表达式条件时循环停止
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
//		int a=1;
//		int b=2;
//		while(a<b){
//			System.out.println("执行了循环");
//			a++;
//		}
		
//		int i=1;
//		int x=0;
//		while(i<=100){
//			x=x+i;
//			i++;
//			System.out.println(x);
		
//		}
//		int y=1000000;
//		for(;;)
//		double l=1;
//		//
//		for(double g=1;g<100;g++){
//			l=l+1/(g+1);//l打成1
//			
//		}
//		
//		System.out.println(l);
//		
		
		
		int a,b,c;
		for(int r=100;r<1000;r++){
			a=r/100%10;
			b=r/10%10;
			c=r/1%10;
		if(a*a*a+b*b*b+c*c*c==r){
		
		System.out.println(r);
		}
	}
}

}
