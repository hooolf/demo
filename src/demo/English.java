package demo;

public class English extends Student {
	
		private int speech;
		
		public English(int qizhong, int qimo,int speech,int stuNo,String name,char sex,int age) {
			super(qizhong, qimo, stuNo, name, sex, age  );
			this.speech=speech; 
		}

		
		public int getSpeech() {
			return speech;
		}

		public void setSpeech(int speech) {
			this.speech = speech;
		}
		
		@Override
		public double allScore(){
			return this.speech*0.5+getQimo()*0.25+getQizhong()*0.25;
		}
		
}