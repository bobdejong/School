package sec12.ex01_reference;

enum City{
	SEOUL(200),BUSAN(100),JEJU(50);
	
	City(int popu){
		population=popu;
	}
	int population;
	
	public int getPopulation() {
		return population;
	}
	
}

public class EnumInstMember {

	public static void main(String[] args) {
		
			System.out.println("������ �α�:"+City.SEOUL.getPopulation());
			System.out.println("�λ��� �α�:"+City.BUSAN.getPopulation());
			System.out.println("������ �α�:"+City.JEJU.getPopulation());
			
	}

}
