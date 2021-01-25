package demo;

public class Student {
	private int qizhong;
	private int qimo;
	private int stuNo;
	private String name;
	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private char sex;
	private int age;
	
	public Student(int qizhong,int qimo,int stuNo,String name,char sex,int age){
		this.qizhong=qizhong;
		this.stuNo=stuNo;
		this.name=name;
		this.sex=sex;
		this.age=age;
		
	}
	
	public int getQizhong() {
		return qizhong;
	}
	public void setQizhong(int qizhong) {
		this.qizhong = qizhong;
	}
	
	public int getQimo() {
		return qimo;
	}
	public void setQimo(int qimo) {
		this.qimo = qimo;
	}
	
	public double allScore(){
		return this.qimo*0.5+this.qizhong*0.5;
	}
	

	

	
	









}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


