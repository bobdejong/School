package sec07.exam04_array_management;

public class Tire {
	public int maxRotaition; //�ִ� ȸ����(�ִ� ����)
	public int accumulatedRotaition; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	public Tire(String location, int maxRotaition) {
		this.location=location;
		this.maxRotaition=maxRotaition;
		
	}
	
	public boolean roll() {
		++accumulatedRotaition;
		if(accumulatedRotaition < maxRotaition) {
			System.out.println(location+"Tire ����:"+(maxRotaition-accumulatedRotaition)+"ȸ");
			return true;
		}else {
			System.out.println("***"+location+"Tire ��ũ***");
			return false;
			
		}
		
	}
	
	


}
