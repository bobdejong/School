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
		
		SimpleDateFormat fm1=new SimpleDateFormat("yyyy년MM월dd일");  //minute와 구분하기위해 M은 대문자로 씀
		String date=fm1.format(new Date());
		System.out.println("현재시간 년월일 = "+date);
		
		SimpleDateFormat fm2= new SimpleDateFormat("yyyy년MM월dd일HH시mm분ss초");
		String date1 = fm2.format(new Date());
		System.out.println("현재시간 시분초 =" +date1);
		
		doYoil();
	}

	public static void doYoil(){
	    Calendar cal= Calendar.getInstance();
	    String strWeek = null;
	    System.out.println(cal.get ( Calendar.DAY_OF_WEEK ));
	    int nWeek = cal.get ( Calendar.DAY_OF_WEEK );
	    if ( nWeek == 1 ) strWeek="일요일";
	    else if ( nWeek == 2 ) strWeek="월요일";
	    else if ( nWeek == 3 ) strWeek="화요일";
	    else if ( nWeek == 4 ) strWeek="수요일";
	    else if ( nWeek == 5 ) strWeek="목요일";
	    else if ( nWeek == 6 ) strWeek="금요일";
	    else if ( nWeek == 7 ) strWeek="토요일";
	     
	    System.out.println("현재요일 = " + strWeek);
	}
	
}
