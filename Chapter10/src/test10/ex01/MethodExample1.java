package test10.ex01;

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
		
	}
	
	void deposit(int amount) {
		balance=amount;
		
	}
	
	int withdraw(int amount) {
		if(balance<amount)
			return 0;
		balance-=amount;
		return balance;
	}
	
}


public class MethodExample1 {

	public static void main(String[] args) {
		Account obj1=new Account("111-222-3333333","�迵��",200000);
		Account obj2=new Account("555-666-7777777","������",1000000);
		
		obj1.deposit(1000000);
		obj2.deposit(200000);
		
		printAccount(obj1);
		printAccount(obj2);
		
				
		
	}
	
	static void printAccount(Account obj){
		System.out.println("���¹�ȣ:"+obj.accountNo);
		System.out.println("������ �̸�:"+obj.ownerName);
		System.out.println("�����ݾ�:"+obj.balance);
		System.out.println();
	}
	
	
}
