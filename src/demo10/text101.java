package demo10;

import java.applet.Applet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

/**
 * 集合
 * 集合是变长的，只能放引用数据类型的数据集
 * list集合
 * ArrayList：线性结构 底层是个数组，默认长度是10
 * 
 * 集合取长度  调用size()方法
 * 集合添加数据add()
 * 获取数据用get(index)
 * addAll将另一个集合的所有元素添加过来
 * clear清空集合数据
 * remove指定位置删除
 * isEmpty 判断集合是否有元素
 *
 * 迭代器
 * 继承了collection 接口的集合类都存在的方法
 * 通过对应集合引用调用iterator()方法返回一个迭代器对象
 * 迭代器对象的方法
 * hasNext()判断有没有一个元素
 * .next()返回一个元素
 * 
 * LinkedList 内部数据存储结构和ArrayList不同
 * 是一个链表可以针对首位数据进行处理
 * 
 * ArrayList和 LinkedList的区别？
 * 结构不同
 * 频繁操作集合数据时，有查询操作较多时，建议使用 ArrayList
 * 对数据插入或者删除操作较多时，建议使用 LinkedList
 * 
 * Collections.sort(arrayList4);排序
 * 
 * 
 */
public class text101 {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<>();//创建新的集合   底层就是个数组
		//赋值
		arrayList.add(new Integer(1));
		
		arrayList.add(2);//集合支持自动装箱和拆箱
		
		arrayList.add("string");
		System.out.println(arrayList.get(1));
		ArrayList arrayList2=new ArrayList<>();
		arrayList2.add(10);
		//arrayList2.addAll(0,arrayList);
		
		arrayList2.addAll(arrayList);
		arrayList2.clear();//清空数据
		//arrayList2.remove(0);
		
		System.out.println(arrayList2.isEmpty());
		
		
		//集合的长度
		int size=arrayList.size();
		System.out.println(arrayList);
		System.out.println(arrayList2);
		//集合的遍历
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		//获取一个当前集合的迭代器对象
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		LinkedList linkedList=new LinkedList<>();
		
		//35个数随机抽取7个放入集合中  不能重复
		HashSet hashSet=new HashSet<>();
		Random random = new Random();
		while (true) {
			hashSet.add(random.nextInt(35)+1);
			if(hashSet.size()==7){
				break;
			}
		}
		System.out.println(hashSet); 
		
		
		
		ArrayList arrayList4=new ArrayList<>();
		arrayList4.add(1);
		arrayList4.add(2);
		arrayList4.add(3);
		arrayList4.add(4);
		arrayList4.add(5);
		
		ArrayList arrayList3=new ArrayList<>();
		
		arrayList3.add("apple");
		arrayList3.add("grape");
		arrayList3.add("banana");
		arrayList3.add("pear");
		
		Collections.sort(arrayList4);
		System.out.println(arrayList4);
		
		
		//输入学生信息 name，score 输入exit退出，存放在集合中，获取平均分
		
//		ArrayList arrayList3=new ArrayList<>();
//		Scanner scanner=new Scanner(System.in);
//		
//		while (true) {
//			String string=scanner.nextLine();
//			
//			
//			
//			
//		}
//		
		
		
		
	}

}
//class Student{
//	private String name;
//	private int score;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getScore() {
//		return score;
//	}
//	public void setScore(int score) {
//		this.score = score;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//		
//	
//	
//	
//	
//	
//	
//	
//}