import java.util.Calendar;
import java.util.Date;

public class CalendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar cal = Calendar.getInstance();
		
		System.out.println("�� : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : " + cal.get(Calendar.DATE));
		System.out.println("����/���� : " + cal.get(Calendar.AM_PM));
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		System.out.println("�и��� : " + cal.get(Calendar.MILLISECOND));
		
		System.out.println("�� �и��� : " + cal.getTimeInMillis());
		
		//���Ƿ� �ð� �Էµ� �����ϴ�
		Date date1 = new Date(5000);
		
		cal.setTime(date1);
		
		System.out.println("�� : " + cal.get(Calendar.YEAR));
		System.out.println("�� : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : " + cal.get(Calendar.DATE));
		System.out.println("����/���� : " + cal.get(Calendar.AM_PM));
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		System.out.println("�и��� : " + cal.get(Calendar.MILLISECOND));
		
		System.out.println("�� �и��� : " + cal.getTimeInMillis());
	}

}
