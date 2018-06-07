package exam01.ex02;

public class CircleArea_12 {

	public static void main(String[] args) {
		final  double PI=3.14; //상수화 final 상수화된 변수는 대문자로쓰자 (규칙은아님)
		double radius=10; //원의 반지름
		double circleArea=0; //원의 면적
		
		circleArea= radius*radius*PI;
		
		System.out.print("원의 면적=");
		System.out.println(circleArea);
		

	}

}
