import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println(date.toString());
		
		@SuppressWarnings("deprecation")
		Date date1 = new Date("Wed, 02 Apr 2008 03:45:32 +0900");
		//DateŬ������ ��ɵ��� Calendar Ŭ������ �̵��̵Ǿ� Date�� �������� �ʴ¸��
		//������ ��ɵ��� ������ �����ϴ�
		
		System.out.println(date1.toString());
		System.out.println(date1.getTime()); //date1�� ��¥/�ð������� �и�������� ��ȯ�Ͽ� ���
		System.out.println(date1.after(date)); // date1�� date���� �����ΰ�
		System.out.println(date1.before(date)); // date1�� date���� �����ΰ�
		
		date1.setTime(5000000); // �и�����Ʈ �����͸� �Է����ִ� �޼ҵ�
		System.out.println(date1);
	}

}
