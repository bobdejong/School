package exam01.ex01;

public class Ex03_12 {

	public static void main(String[] args) {
		char a,b,c,d,e; //문자 (음수저장 불가),char(2byte)
						//0~65535
		a='A'; // 65 (아스키코드)
		System.out.printf("%c\t",a);
		
		System.out.printf("%d\n",(int)a); //(음수저장 불가)
		
		
		//a=-1; (음수저장 불가)
		
		b='a';  //97
		c=(char) (b+1); //4byte 연산된값은 char타입에 대입 불가 형변환 후 대입
		
		System.out.printf("%c\t",b);
		
		System.out.printf("%d\n",(int)c);
		
		d=90;
		//System.out.printf("%d \n",d);
		System.out.printf("%c \n",d);
		System.out.printf("%d \n",(int)d);
		
		d='가'; //java unicode
		System.out.printf("%c\n",d);
		System.out.printf("%d\n",(int)d);  //44032
		
		e=(char) (d+1);
		System.out.printf("%d\n",(int)e);
		System.out.printf("%c\n",e);
		
		
		
		
	}

}
