
public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is String";
		String tmpstr1, tmpstr2;
		
		//substring�� ���ڿ����� Ư����ġ�� �ִ� ���ڿ��� �������� �޼ҵ� �Դϴ�.
		tmpstr1 = str.substring(7);
		tmpstr2 = str.substring(3, 9); //substring�� 2���� �ֽ��ϴ�. (�����ε�)
		
		System.out.println("tmpstr1 : " + tmpstr1);
		System.out.println("tmpstr2 : " + tmpstr2);
	}

}
