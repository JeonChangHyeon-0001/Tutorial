import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDataFormatClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat d_format = new SimpleDateFormat("yyyy�� MM�� dd�� aa hh�� mm�� ss��");
		
		String str = d_format.format(cal.getTime());
		System.out.println(str);

	}

}
