import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		System.out.println("년 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("오전/오후 : " + cal.get(Calendar.AM_PM));
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.MILLISECOND));
		
		System.out.println("총 밀리초 : " + cal.getTimeInMillis());
		
		//임의로 시간 입력도 가능하다
		Date date1 = new Date(5000);
		
		cal.setTime(date1);
		
		System.out.println("년 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		System.out.println("오전/오후 : " + cal.get(Calendar.AM_PM));
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.MILLISECOND));
		
		System.out.println("총 밀리초 : " + cal.getTimeInMillis());
	}

}
