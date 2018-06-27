package test11.ex02;

class ToStringOverride{
	
	public String toString() {
		return "toString()메소드 재정의";
	}
	
}
public class TostringOverrideTest_03 {
	
	public static void main(String[] args) {
		ToStringOverride to= new ToStringOverride();
		System.out.println("객체 출력="+to); //toString() 메소드 재정의!!

	}

}
