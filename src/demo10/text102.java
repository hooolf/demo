package demo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * 泛型
 * 在使用集合定义时放任意类型的场景，可以用泛型定义
 * 使用集合时，由于如果不加限制什么类型都可以放
 *
 */
public class text102 {

	public static void main(String[] args) {
		
		ArrayList<Integer>a =new ArrayList<>();
	    a.add(1);
	    a.add(3);
	    a.add(10);
	    
	}
	

}
class Generic<T>{
	private final static int sucType=200;
	private final static String suc="success";
	private T t;
	
	

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
		
	public static Generic<?> succrss(){
		return null;
	}
	
	
	
	
	
	

}
