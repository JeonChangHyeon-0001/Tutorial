import java.util.Calendar;
import java.util.TimeZone;

public class SetTimeZoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Calendar cal = Calendar.getInstance();
	    
	    System.out.println("Ÿ���� ������ : " + cal.get(Calendar.HOUR)+"��"
	    		+ cal.get(Calendar.MINUTE)+"��"+ cal.get(Calendar.SECOND)+"��");
	    
	    TimeZone zone = TimeZone.getTimeZone("Europe/London");
	    cal.setTimeZone(zone);
	    System.out.println("����/������ �ð� : " + cal.get(Calendar.HOUR)+"��"
	    		+ cal.get(Calendar.MINUTE)+"��"+ cal.get(Calendar.SECOND)+"��");
	    
	    //ps. ������ �ѱ��� ������ 9�ð� �Դϴ�. 
	    
	    //��� ������ ���� ����Ʈ
	    
	    String[] local = TimeZone.getAvailableIDs();
	    
	    for(int i = 0; i < local.length; i++) {
	    	System.out.println(local[i]);
	    }
	}

}
