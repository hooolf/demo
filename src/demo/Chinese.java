package demo;

public class Chinese extends Student {
	
		private int speech;
		private int works;
		
		public Chinese(int qizhong, int qimo,int speech ,int works,int stuNo,String name,char sex,int age) {
			super(qizhong, qimo, stuNo, name, sex, age);
			this.speech=speech;
			this.works=works;
		}
		public int getSpeech() {
			return speech;
		}
		public void setSpeech(int speech) {
			this.speech = speech;
		}
		public int getWorks() {
			return works;
		}
		public void setWorks(int works) {
			this.works = works;
		}
		@Override
		public double allScore() {
			return this.speech*0.35+this.works*0.35+getQimo()*0.15+getQizhong()*0.15;
		}
		
	


}
