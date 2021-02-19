import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println(date.toString());
		
		@SuppressWarnings("deprecation")
		Date date1 = new Date("Wed, 02 Apr 2008 03:45:32 +0900");
		//Date클래스의 기능들이 Calendar 클래스로 이동이되어 Date를 권장하지 않는모습
		//하지만 기능들은 수행이 가능하다
		
		System.out.println(date1.toString());
		System.out.println(date1.getTime()); //date1의 날짜/시간정보를 밀리세컨드로 변환하여 출력
		System.out.println(date1.after(date)); // date1이 date보다 이후인가
		System.out.println(date1.before(date)); // date1이 date보다 이전인가
		
		date1.setTime(5000000); // 밀리세컨트 데이터를 입력해주는 메소드
		System.out.println(date1);
	}

}
