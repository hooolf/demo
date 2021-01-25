package demo10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class text001 {

	public static void main(String[] args) {
	HashMap<Integer, yinhang>map=new HashMap<>();
	map.put(1, new yinhang(1, "tom", 100.00));
	map.put(2, new yinhang(2, "mark", 200.00));
	map.put(3, new yinhang(3, "smith", 300.00));
	Scanner scanner= new Scanner(System.in);
	String type=scanner.next();
	if ("1".equals(type)) {
		Iterator<Entry<Integer,BankerInfo>>iterator3=map.entrySet().iterator();
		while()
	}

	}

}
class yinhang{
	
	private String name;
	private double sal;
	private int ID;
	
	public yinhang(int ID, String name, double sal){
		this.ID=ID;
		this.name=name;
		this.sal=sal;
	}
	
}