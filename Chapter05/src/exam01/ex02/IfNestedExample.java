package exam01.ex02;

public class IfNestedExample {

	public static void main(String[] args) {
		int score=(int)(Math.random()*20)+81; //0.0<=number<1.0
		System.out.println("����:"+score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
			
		}else {
			if(score>=85) {
				grade="B+";			
			}		
			else {
				grade="B";
			}
				
			
		}
		System.out.println("����:"+grade);

	}

}
