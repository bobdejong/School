package sec12.ex01_reference;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo, String ownerName, int balance){
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
		
	}
	
	void deposit(int amount) {  //예금
		balance=amount;
	}
	
	int withdraw(int amount)throws Exception{
		if(balance < amount)
		throw new Exception("잔액이 부족합니다.");  //내가 만든 예외 처리
		balance-=amount;
		return amount;
	}
	
	
	
}
