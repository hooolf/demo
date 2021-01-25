package demo;

public class Computer extends Student {
	
		private int enWrite;
		private int operation;
		public Computer(int qizhong, int qimo,int enWrite,int operation,int stuNo,String name,char sex,int age) {
			super(qizhong, qimo, stuNo, name, sex, age);
			this.operation=operation;
			this.enWrite=enWrite;
		}
		public int getEnWrite() {
			return enWrite;
		}
		public void setEnWrite(int enWrite) {
			this.enWrite = enWrite;
		}
		public int getOperation() {
			return operation;
		}
		public void setOperation(int operation) {
			this.operation = operation;
		}
		
		@Override
		public double allScore(){
			return this.operation*0.4+this.enWrite*0.2+getQimo()*0.2+getQizhong()*0.2;
		}
		
		
		
		
		
	
}



