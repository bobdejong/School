package test11.ex02;

class ToStringOverride{
	
	public String toString() {
		return "toString()�޼ҵ� ������";
	}
	
}
public class TostringOverrideTest_03 {
	
	public static void main(String[] args) {
		ToStringOverride to= new ToStringOverride();
		System.out.println("��ü ���="+to); //toString() �޼ҵ� ������!!

	}

}
