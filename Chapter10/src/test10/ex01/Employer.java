package test10.ex01;

public class Employer {
	private int myMoney;
	
	public Employer(int money) {
		myMoney=money;
		
	}
	
	public void payForWork(Employee emp,int money) {
		if(myMoney < money)
			return;
		emp.earnMoney(money);
		myMoney-=money;
		
	}
	
	public void showMyMoney() {
		System.out.println(myMoney);
	}
	
	public static void main(String[] args) {
		Employer emr=new Employer(10000000);
		Employee eme=new Employee(0);
		
		emr.payForWork(eme, 3000000);
		
		emr.showMyMoney(); //7000000
		eme.showMyMoney(); //3000000
		
	}
	
	
}
