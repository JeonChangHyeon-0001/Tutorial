import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDataFormatClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat d_format = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		
		String str = d_format.format(cal.getTime());
		System.out.println(str);

	}

}
