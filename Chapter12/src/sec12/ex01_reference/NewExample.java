package sec12.ex01_reference;

enum Season{  //열거 클래스
	SPRING,SUMMER,FALL,WINTER  //열거 상수
}

class ClothingInfo{
	String code;
	String name;
	String material;
	Season season;
	
	ClothingInfo(String code, String name, String material, Season season){
		this.code=code;
		this.name=name;
		this.material=material;
		this.season=season;
		
	}
	
}

public class NewExample {

	public static void main(String[] args) {
		ClothingInfo obj=new ClothingInfo("32919","반팔티셔츠","면100%",Season.SUMMER);
		//Season se=new Season(); 열거클래스는 객체생성 못함
		
		System.out.println("상품코드:"+obj.code);
		System.out.println("상품평"+obj.name);
		System.out.println("소재:"+obj.material);
		System.out.println("계절구분:"+obj.season);
	}

}
