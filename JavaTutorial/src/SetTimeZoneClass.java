import java.util.Calendar;
import java.util.TimeZone;

public class SetTimeZoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Calendar cal = Calendar.getInstance();
	    
	    System.out.println("타인존 적용전 : " + cal.get(Calendar.HOUR)+"시"
	    		+ cal.get(Calendar.MINUTE)+"분"+ cal.get(Calendar.SECOND)+"초");
	    
	    TimeZone zone = TimeZone.getTimeZone("Europe/London");
	    cal.setTimeZone(zone);
	    System.out.println("유럽/런던의 시간 : " + cal.get(Calendar.HOUR)+"시"
	    		+ cal.get(Calendar.MINUTE)+"분"+ cal.get(Calendar.SECOND)+"초");
	    
	    //ps. 런던과 한국의 시차는 9시간 입니다. 
	    
	    //사용 가능한 지역 리스트
	    
	    String[] local = TimeZone.getAvailableIDs();
	    
	    for(int i = 0; i < local.length; i++) {
	    	System.out.println(local[i]);
	    }
	}

}
