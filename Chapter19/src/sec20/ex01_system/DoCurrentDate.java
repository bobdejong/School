package sec20.ex01_system;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DoCurrentDate {

	public static void main(String[] args) {
		int nYear;
		int nMonth;
		int nDay;
		
		Calendar calendar= new GregorianCalendar(Locale.KOREA);
		nYear= calendar.get(Calendar.YEAR);
		nMonth=calendar.get(Calendar.MONTH)+1;
		nDay=calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("GregorianCalendar="+nYear+"-"+nMonth+"-"+nDay);
		
		SimpleDateFormat fm1=new SimpleDateFormat("yyyy��MM��dd��");  //minute�� �����ϱ����� M�� �빮�ڷ� ��
		String date=fm1.format(new Date());
		System.out.println("����ð� ����� = "+date);
		
		SimpleDateFormat fm2= new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��");
		String date1 = fm2.format(new Date());
		System.out.println("����ð� �ú��� =" +date1);
		
		doYoil();
	}

	public static void doYoil(){
	    Calendar cal= Calendar.getInstance();
	    String strWeek = null;
	    System.out.println(cal.get ( Calendar.DAY_OF_WEEK ));
	    int nWeek = cal.get ( Calendar.DAY_OF_WEEK );
	    if ( nWeek == 1 ) strWeek="�Ͽ���";
	    else if ( nWeek == 2 ) strWeek="������";
	    else if ( nWeek == 3 ) strWeek="ȭ����";
	    else if ( nWeek == 4 ) strWeek="������";
	    else if ( nWeek == 5 ) strWeek="�����";
	    else if ( nWeek == 6 ) strWeek="�ݿ���";
	    else if ( nWeek == 7 ) strWeek="�����";
	     
	    System.out.println("������� = " + strWeek);
	}
	
}
