package demo10;

import java.util.LinkedList;

public class text002 {

	public static void main(String[] args) {
		duilie<String> dl=new duilie<>();
		dl.put("1");
		dl.put("2");
		dl.put("3");
		dl.put("4");
		while(!dl.isEmpty()){
			System.out.println(dl.get());
		}

	}

}
class duilie<T>{
	LinkedList<T>list;
	private int size;
	public duilie(){
		list=new LinkedList<>();
	}
	
	public void put(T t){
		list.addLast(t);
	}
	public T get() {
		T first = list.getFirst();
		list.removeFirst();
		return first;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int size(){
		return size();
	}
	
}