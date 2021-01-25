package demo;

import java.util.Random;

public class TestStudent {

	public static void main(String[] args) {
		Student[] students=new Student[5];
		Random random =new Random();
		for(int i=0;i<students.length;i++){
			students[i]=getStudentInfo(random.nextInt(3));
		}
		for(Student item:students){
			System.out.println("学号："+item.getStuNo()+"姓名："+item.getName()+"性别："+item.getSex()+"年龄："+item.getAge()+"综合成绩："+item.getStuNo());
		}
			}
	
	public static Student getStudentInfo(int type){
		if(type ==0){
			return new English(100, 80, 90, 1001,"xxx",'男',18);
		}else if(type==1){
			return new Computer(100,90,100,90,1002, "xxx",'男',18);
		}else {
			return new Chinese(100, 80, 80, 40, 1003,"xxx",'男', 18);
		}
	
		
	}
	
	
	
	
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	

}
