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
			System.out.println("ѧ�ţ�"+item.getStuNo()+"������"+item.getName()+"�Ա�"+item.getSex()+"���䣺"+item.getAge()+"�ۺϳɼ���"+item.getStuNo());
		}
			}
	
	public static Student getStudentInfo(int type){
		if(type ==0){
			return new English(100, 80, 90, 1001,"xxx",'��',18);
		}else if(type==1){
			return new Computer(100,90,100,90,1002, "xxx",'��',18);
		}else {
			return new Chinese(100, 80, 80, 40, 1003,"xxx",'��', 18);
		}
	
		
	}
	
	
	
	
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	

}