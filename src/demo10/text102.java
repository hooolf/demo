package demo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ����
 * ��ʹ�ü��϶���ʱ���������͵ĳ����������÷��Ͷ���
 * ʹ�ü���ʱ�����������������ʲô���Ͷ����Է�
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
