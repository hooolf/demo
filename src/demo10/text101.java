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
 * ����
 * �����Ǳ䳤�ģ�ֻ�ܷ������������͵����ݼ�
 * list����
 * ArrayList�����Խṹ �ײ��Ǹ����飬Ĭ�ϳ�����10
 * 
 * ����ȡ����  ����size()����
 * �����������add()
 * ��ȡ������get(index)
 * addAll����һ�����ϵ�����Ԫ����ӹ���
 * clear��ռ�������
 * removeָ��λ��ɾ��
 * isEmpty �жϼ����Ƿ���Ԫ��
 *
 * ������
 * �̳���collection �ӿڵļ����඼���ڵķ���
 * ͨ����Ӧ�������õ���iterator()��������һ������������
 * ����������ķ���
 * hasNext()�ж���û��һ��Ԫ��
 * .next()����һ��Ԫ��
 * 
 * LinkedList �ڲ����ݴ洢�ṹ��ArrayList��ͬ
 * ��һ��������������λ���ݽ��д���
 * 
 * ArrayList�� LinkedList������
 * �ṹ��ͬ
 * Ƶ��������������ʱ���в�ѯ�����϶�ʱ������ʹ�� ArrayList
 * �����ݲ������ɾ�������϶�ʱ������ʹ�� LinkedList
 * 
 * Collections.sort(arrayList4);����
 * 
 * 
 */
public class text101 {

	public static void main(String[] args) {
		ArrayList arrayList=new ArrayList<>();//�����µļ���   �ײ���Ǹ�����
		//��ֵ
		arrayList.add(new Integer(1));
		
		arrayList.add(2);//����֧���Զ�װ��Ͳ���
		
		arrayList.add("string");
		System.out.println(arrayList.get(1));
		ArrayList arrayList2=new ArrayList<>();
		arrayList2.add(10);
		//arrayList2.addAll(0,arrayList);
		
		arrayList2.addAll(arrayList);
		arrayList2.clear();//�������
		//arrayList2.remove(0);
		
		System.out.println(arrayList2.isEmpty());
		
		
		//���ϵĳ���
		int size=arrayList.size();
		System.out.println(arrayList);
		System.out.println(arrayList2);
		//���ϵı���
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		//��ȡһ����ǰ���ϵĵ���������
		Iterator iterator=arrayList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		LinkedList linkedList=new LinkedList<>();
		
		//35���������ȡ7�����뼯����  �����ظ�
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
		
		
		//����ѧ����Ϣ name��score ����exit�˳�������ڼ����У���ȡƽ����
		
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