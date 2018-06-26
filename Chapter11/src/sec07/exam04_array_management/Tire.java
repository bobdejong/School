package sec07.exam04_array_management;

public class Tire {
	public int maxRotaition; //최대 회전수(최대 수명)
	public int accumulatedRotaition; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire(String location, int maxRotaition) {
		this.location=location;
		this.maxRotaition=maxRotaition;
		
	}
	
	public boolean roll() {
		++accumulatedRotaition;
		if(accumulatedRotaition < maxRotaition) {
			System.out.println(location+"Tire 수명:"+(maxRotaition-accumulatedRotaition)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크***");
			return false;
			
		}
		
	}
	
	


}
